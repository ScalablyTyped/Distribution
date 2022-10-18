package typings.expressValidator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsMod {
  
  @JSImport("express-validator/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bindAll[T](`object`: T): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K]} */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K]} */ js.Any]
  
  inline def toString_(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toString_(value: Any, deep: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(value.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[String]
}
