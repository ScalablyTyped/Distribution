package typings.esfxTypeModel

import typings.esfxTypeModel.anon.Pass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.anon.ActualExpected[Expected, Actual]
    - typings.esfxTypeModel.anon.Pass
  */
  trait ExpectType[Actual, Expected] extends StObject
  object ExpectType {
    
    inline def ActualExpected[Actual, Expected](Actual: Actual, Expected: Expected): typings.esfxTypeModel.anon.ActualExpected[Actual, Expected] = {
      val __obj = js.Dynamic.literal(Actual = Actual.asInstanceOf[js.Any], Expected = Expected.asInstanceOf[js.Any], pass = false)
      __obj.asInstanceOf[typings.esfxTypeModel.anon.ActualExpected[Actual, Expected]]
    }
    
    inline def Pass(): typings.esfxTypeModel.anon.Pass = {
      val __obj = js.Dynamic.literal(pass = true)
      __obj.asInstanceOf[typings.esfxTypeModel.anon.Pass]
    }
  }
  
  type Test[T /* <: Pass */] = T
}
