package typings.embroiderMacros

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("@embroider/macros/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dependencySatisfies(packageName: String, semverRange: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dependencySatisfies")(packageName.asInstanceOf[js.Any], semverRange.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def each[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def failBuild(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("failBuild")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getConfig[T](packageName: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(packageName.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def getGlobalConfig[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalConfig")().asInstanceOf[T]
  
  inline def getOwnConfig[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnConfig")().asInstanceOf[T]
  
  inline def importSync(specifier: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("importSync")(specifier.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isDevelopingApp(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDevelopingApp")().asInstanceOf[Boolean]
  
  inline def isTesting(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTesting")().asInstanceOf[Boolean]
  
  inline def macroCondition(predicate: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("macroCondition")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def moduleExists(packageName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("moduleExists")(packageName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
