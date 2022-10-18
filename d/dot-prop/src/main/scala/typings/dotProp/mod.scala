package typings.dotProp

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dot-prop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deepKeys(`object`: Any): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepKeys")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def deleteProperty(`object`: Record[String, Any], path: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteProperty")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def escapePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getProperty[ObjectType, PathType /* <: String */, DefaultValue](`object`: ObjectType, path: PathType): /* import warning: importer.ImportType#apply Failed type conversion: ObjectType extends std.Record<string, unknown> | std.Array<unknown> ? unknown extends type-fest.type-fest/source/get.Get<ObjectType, PathType, {}> ? DefaultValue : type-fest.type-fest/source/get.Get<ObjectType, PathType, {}> : undefined */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getProperty")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: ObjectType extends std.Record<string, unknown> | std.Array<unknown> ? unknown extends type-fest.type-fest/source/get.Get<ObjectType, PathType, {}> ? DefaultValue : type-fest.type-fest/source/get.Get<ObjectType, PathType, {}> : undefined */ js.Any]
  inline def getProperty[ObjectType, PathType /* <: String */, DefaultValue](`object`: ObjectType, path: PathType, defaultValue: DefaultValue): /* import warning: importer.ImportType#apply Failed type conversion: ObjectType extends std.Record<string, unknown> | std.Array<unknown> ? unknown extends type-fest.type-fest/source/get.Get<ObjectType, PathType, {}> ? DefaultValue : type-fest.type-fest/source/get.Get<ObjectType, PathType, {}> : undefined */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getProperty")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: ObjectType extends std.Record<string, unknown> | std.Array<unknown> ? unknown extends type-fest.type-fest/source/get.Get<ObjectType, PathType, {}> ? DefaultValue : type-fest.type-fest/source/get.Get<ObjectType, PathType, {}> : undefined */ js.Any]
  
  inline def hasProperty(`object`: Unit, path: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProperty")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasProperty(`object`: Record[String, Any], path: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProperty")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setProperty[ObjectType /* <: Record[String, Any] */](`object`: ObjectType, path: String, value: Any): ObjectType = (^.asInstanceOf[js.Dynamic].applyDynamic("setProperty")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ObjectType]
}
