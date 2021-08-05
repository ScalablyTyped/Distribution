package typings.egg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def start(): js.Promise[typings.egg.mod.Application] = typings.egg.mod.^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[js.Promise[typings.egg.mod.Application]]
inline def start(options: typings.egg.mod.StartOptions): js.Promise[typings.egg.mod.Application] = typings.egg.mod.^.asInstanceOf[js.Dynamic].applyDynamic("start")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.egg.mod.Application]]

inline def startCluster(options: typings.egg.mod.ClusterOptions, callback: js.Function1[/* repeated */ js.Any, js.Any]): scala.Unit = (typings.egg.mod.^.asInstanceOf[js.Dynamic].applyDynamic("startCluster")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

type EggContextHttpClient = typings.urllib.mod.HttpClient[typings.urllib.mod.RequestOptions2]

/* Rewritten from type alias, can be one of: 
  - typings.egg.eggStrings.local
  - typings.egg.eggStrings.unittest
  - typings.egg.eggStrings.prod
  - java.lang.String
*/
type EggEnvType = typings.egg.mod._EggEnvType | java.lang.String

type EggHttpClient = typings.urllib.mod.HttpClient[typings.urllib.mod.RequestOptions2]

type EggLoader = typings.eggCore.mod.EggLoader[
typings.eggCore.mod.EggCore[typings.eggCore.mod.PlainObject[js.Any]], 
js.Any, 
typings.eggCore.mod.EggLoaderOptions]

type EggLoaderOptions = typings.eggCore.mod.EggLoaderOptions

type EggLogger = typings.eggLogger.mod.EggLogger

type EggPluginItem = typings.egg.mod.IEggPluginItem | scala.Boolean

type IApplicationLocals = typings.egg.mod.PlainObject[js.Any]

type IContextLocals = typings.egg.mod.PlainObject[js.Any]

type IController = typings.egg.mod.PlainObject[js.Any]

type IMiddleware = typings.egg.mod.PlainObject[js.Any]

type IService = typings.egg.mod.PlainObject[js.Any]

type IgnoreItem = java.lang.String | typings.std.RegExp | (js.Function1[/* ctx */ typings.egg.mod.Context, scala.Boolean])

type IgnoreOrMatch = typings.egg.mod.IgnoreItem | js.Array[typings.egg.mod.IgnoreItem]

type LoggerLevel = typings.eggLogger.mod.LoggerLevel

// plain object
type PlainObject[T] = org.scalablytyped.runtime.StringDictionary[T]

type PowerPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ U in keyof T ]:? T[U] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias egg.egg.PowerPartial<T[U]> * / object : T[U]}
  */ typings.egg.eggStrings.PowerPartial & org.scalablytyped.runtime.TopLevel[js.Any]

// Remove specific property from the specific class
type RemoveSpecProp[T, P] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, P]]

type RequestArrayBody = js.Array[js.Any]

type RequestObjectBody = typings.egg.mod.PlainObject[js.Any]

type RouterPath = java.lang.String | typings.std.RegExp
