package typings.epcis2Js

import typings.epcis2Js.anon.Errors
import typings.epcis2Js.anon.Explicit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaValidatorMod {
  
  @JSImport("epcis2.js/schema/validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkIfExtensionsAreDefinedInTheContext(extensions: Any, authorizedExtensions: Any): Errors = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIfExtensionsAreDefinedInTheContext")(extensions.asInstanceOf[js.Any], authorizedExtensions.asInstanceOf[js.Any])).asInstanceOf[Errors]
  
  inline def ensureFieldSet(data: js.Object, fieldSet: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureFieldSet")(data.asInstanceOf[js.Any], fieldSet.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def errorIsExplicit(error: js.Object): Explicit = ^.asInstanceOf[js.Dynamic].applyDynamic("errorIsExplicit")(error.asInstanceOf[js.Any]).asInstanceOf[Explicit]
  
  inline def getAuthorizedExtensions(epcisDocument: js.Object): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthorizedExtensions")(epcisDocument.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def loadSchema(schema: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def validateAgainstSchema(data: js.Object, schemaName: String): ValidatorResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validateAgainstSchema")(data.asInstanceOf[js.Any], schemaName.asInstanceOf[js.Any])).asInstanceOf[ValidatorResult]
  
  inline def validateEpcisDocument(epcisDocument: js.Object): ValidatorResult = ^.asInstanceOf[js.Dynamic].applyDynamic("validateEpcisDocument")(epcisDocument.asInstanceOf[js.Any]).asInstanceOf[ValidatorResult]
  inline def validateEpcisDocument(epcisDocument: js.Object, throwError: Boolean): ValidatorResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validateEpcisDocument")(epcisDocument.asInstanceOf[js.Any], throwError.asInstanceOf[js.Any])).asInstanceOf[ValidatorResult]
  
  trait ValidatorResult extends StObject {
    
    /**
      * - List of errors.
      */
    var errors: js.Array[String]
    
    /**
      * - true if the validator found no errors.
      */
    var success: Boolean
  }
  object ValidatorResult {
    
    inline def apply(errors: js.Array[String], success: Boolean): ValidatorResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidatorResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidatorResult] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
}
