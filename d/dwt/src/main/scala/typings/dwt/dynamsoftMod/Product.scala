package typings.dwt.dynamsoftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Product extends js.Object {
  var bActiveXEdition: Boolean = js.native
  var bChromeEdition: Boolean = js.native
  var bHTML5Edition: Boolean = js.native
  var bPluginEdition: Boolean = js.native
  var host: String = js.native
  var name: String = js.native
}

object Product {
  @scala.inline
  def apply(
    bActiveXEdition: Boolean,
    bChromeEdition: Boolean,
    bHTML5Edition: Boolean,
    bPluginEdition: Boolean,
    host: String,
    name: String
  ): Product = {
    val __obj = js.Dynamic.literal(bActiveXEdition = bActiveXEdition.asInstanceOf[js.Any], bChromeEdition = bChromeEdition.asInstanceOf[js.Any], bHTML5Edition = bHTML5Edition.asInstanceOf[js.Any], bPluginEdition = bPluginEdition.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
  @scala.inline
  implicit class ProductOps[Self <: Product] (val x: Self) extends AnyVal {
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
    def setBActiveXEdition(value: Boolean): Self = this.set("bActiveXEdition", value.asInstanceOf[js.Any])
    @scala.inline
    def setBChromeEdition(value: Boolean): Self = this.set("bChromeEdition", value.asInstanceOf[js.Any])
    @scala.inline
    def setBHTML5Edition(value: Boolean): Self = this.set("bHTML5Edition", value.asInstanceOf[js.Any])
    @scala.inline
    def setBPluginEdition(value: Boolean): Self = this.set("bPluginEdition", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

