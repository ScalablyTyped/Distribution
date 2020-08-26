package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If this describes a specific package/container of the substance
  */
@js.native
trait SubstanceInstance extends BackboneElement {
  /**
    * Contains extended information for property 'expiry'.
    */
  var _expiry: js.UndefOr[Element] = js.native
  /**
    * When no longer valid to use
    */
  var expiry: js.UndefOr[dateTime] = js.native
  /**
    * Identifier of the package/container
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Amount of substance in the package
    */
  var quantity: js.UndefOr[Quantity] = js.native
}

object SubstanceInstance {
  @scala.inline
  def apply(): SubstanceInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceInstance]
  }
  @scala.inline
  implicit class SubstanceInstanceOps[Self <: SubstanceInstance] (val x: Self) extends AnyVal {
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
    def set_expiry(value: Element): Self = this.set("_expiry", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_expiry: Self = this.set("_expiry", js.undefined)
    @scala.inline
    def setExpiry(value: dateTime): Self = this.set("expiry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiry: Self = this.set("expiry", js.undefined)
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setQuantity(value: Quantity): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
  }
  
}

