package typings
package eggLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eggMod {
  type EggContextHttpClient = urllibLib.urllibMod.HttpClient[urllibLib.urllibMod.RequestOptions2]
  /* Rewritten from type alias, can be one of: 
    - eggLib.eggLibStrings.local
    - eggLib.eggLibStrings.unittest
    - eggLib.eggLibStrings.prod
    - java.lang.String
  */
  type EggEnvType = _EggEnvType | java.lang.String
  type EggHttpClient = urllibLib.urllibMod.HttpClient[urllibLib.urllibMod.RequestOptions2]
  type EggLoader = eggDashCoreLib.eggDashCoreMod.EggLoader[
    eggDashCoreLib.eggDashCoreMod.EggCore[eggDashCoreLib.eggDashCoreMod.PlainObject[js.Any]], 
    js.Any
  ]
  type EggLoaderOptions = eggDashCoreLib.eggDashCoreMod.EggLoaderOptions
  type EggPluginItem = IEggPluginItem | scala.Boolean
  type IApplicationLocals = PlainObject[js.Any]
  type IContextLocals = PlainObject[js.Any]
  type IController = PlainObject[js.Any]
  type IMiddleware = PlainObject[js.Any]
  type IService = PlainObject[js.Any]
  type IgnoreItem = java.lang.String | stdLib.RegExp | (js.Function1[/* ctx */ eggDashViewLib.eggMod.Context, scala.Boolean])
  type IgnoreOrMatch = IgnoreItem | js.Array[IgnoreItem]
  type LoggerLevel = eggDashLoggerLib.eggDashLoggerMod.LoggerLevel
  // plain object
  type PlainObject[T] = org.scalablytyped.runtime.StringDictionary[T]
  type PowerPartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ U in keyof T ]:? T[U] extends object? object : T[U]}
    */ eggLib.eggLibStrings.PowerPartial with js.Any
  // Remove specific property from the specific class
  type RemoveSpecProp[T, P] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, P]]
  type RequestArrayBody = js.Array[js.Any]
  type RequestObjectBody = PlainObject[js.Any]
  type RouterPath = java.lang.String | stdLib.RegExp
}
