package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderMerchantProvidedAnnotation extends js.Object {
  var key: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
}

object OrderMerchantProvidedAnnotation {
  @scala.inline
  def apply(): OrderMerchantProvidedAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderMerchantProvidedAnnotation]
  }
  @scala.inline
  implicit class OrderMerchantProvidedAnnotationOps[Self <: OrderMerchantProvidedAnnotation] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

