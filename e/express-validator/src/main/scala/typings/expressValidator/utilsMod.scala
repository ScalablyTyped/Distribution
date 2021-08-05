package typings.expressValidator

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("express-validator/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bindAll[T](`object`: T): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typings.expressValidator.expressValidatorStrings.bindAll & TopLevel[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typings.expressValidator.expressValidatorStrings.bindAll & TopLevel[T]]
  
  inline def toString_(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toString_(value: js.Any, deep: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(value.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[String]
}
