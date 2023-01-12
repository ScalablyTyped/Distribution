package typings.dmgLicense

import typings.dmgLicense.anon.Data
import typings.dmgLicense.mod.LicenseSpec
import typings.dmgLicense.mod.Options
import typings.node.bufferMod.global.Buffer
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAssembleLicensesMod {
  
  @JSImport("dmg-license/lib/assembleLicenses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(spec: LicenseSpec, optionsOrContext: typings.dmgLicense.libContextMod.default): js.Promise[AssembledLicenseSet] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(spec.asInstanceOf[js.Any], optionsOrContext.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssembledLicenseSet]]
  inline def default(spec: LicenseSpec, optionsOrContext: Options): js.Promise[AssembledLicenseSet] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(spec.asInstanceOf[js.Any], optionsOrContext.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssembledLicenseSet]]
  
  trait AssembledLicense extends StObject {
    
    var body: Data
    
    var labels: Buffer
    
    var languageIDs: js.Array[Double]
  }
  object AssembledLicense {
    
    inline def apply(body: Data, labels: Buffer, languageIDs: js.Array[Double]): AssembledLicense = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], languageIDs = languageIDs.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssembledLicense]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssembledLicense] (val x: Self) extends AnyVal {
      
      inline def setBody(value: Data): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setLabels(value: Buffer): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLanguageIDs(value: js.Array[Double]): Self = StObject.set(x, "languageIDs", value.asInstanceOf[js.Any])
      
      inline def setLanguageIDsVarargs(value: Double*): Self = StObject.set(x, "languageIDs", js.Array(value*))
    }
  }
  
  trait AssembledLicenseSet extends StObject {
    
    var byLanguageID: Map[Double, AssembledLicense]
    
    var defaultLanguageID: Double
    
    var inOrder: js.Array[AssembledLicense]
  }
  object AssembledLicenseSet {
    
    inline def apply(
      byLanguageID: Map[Double, AssembledLicense],
      defaultLanguageID: Double,
      inOrder: js.Array[AssembledLicense]
    ): AssembledLicenseSet = {
      val __obj = js.Dynamic.literal(byLanguageID = byLanguageID.asInstanceOf[js.Any], defaultLanguageID = defaultLanguageID.asInstanceOf[js.Any], inOrder = inOrder.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssembledLicenseSet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssembledLicenseSet] (val x: Self) extends AnyVal {
      
      inline def setByLanguageID(value: Map[Double, AssembledLicense]): Self = StObject.set(x, "byLanguageID", value.asInstanceOf[js.Any])
      
      inline def setDefaultLanguageID(value: Double): Self = StObject.set(x, "defaultLanguageID", value.asInstanceOf[js.Any])
      
      inline def setInOrder(value: js.Array[AssembledLicense]): Self = StObject.set(x, "inOrder", value.asInstanceOf[js.Any])
      
      inline def setInOrderVarargs(value: AssembledLicense*): Self = StObject.set(x, "inOrder", js.Array(value*))
    }
  }
}
