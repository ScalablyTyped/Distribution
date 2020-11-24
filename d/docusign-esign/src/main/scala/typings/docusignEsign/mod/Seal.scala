package typings.docusignEsign.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Seal extends js.Object {
  
  /**
    * Electronic seal configuration  properties
    */
  var configuration: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Electronic Seal identifier
    */
  var sealIdentifier: js.UndefOr[String] = js.native
}
object Seal {
  
  @scala.inline
  def apply(): Seal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Seal]
  }
  
  @scala.inline
  implicit class SealOps[Self <: Seal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfiguration(value: StringDictionary[String]): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    
    @scala.inline
    def setSealIdentifier(value: String): Self = this.set("sealIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSealIdentifier: Self = this.set("sealIdentifier", js.undefined)
  }
}
