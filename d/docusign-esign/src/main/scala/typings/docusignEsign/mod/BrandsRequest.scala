package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrandsRequest extends js.Object {
  
  /**
    * A list of brands.
    */
  var brands: js.UndefOr[
    js.Array[
      /* This request object contains information about a specific brand. */ BrandRequest
    ]
  ] = js.native
}
object BrandsRequest {
  
  @scala.inline
  def apply(): BrandsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrandsRequest]
  }
  
  @scala.inline
  implicit class BrandsRequestOps[Self <: BrandsRequest] (val x: Self) extends AnyVal {
    
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
    def setBrandsVarargs(value: (/* This request object contains information about a specific brand. */ BrandRequest)*): Self = this.set("brands", js.Array(value :_*))
    
    @scala.inline
    def setBrands(
      value: js.Array[
          /* This request object contains information about a specific brand. */ BrandRequest
        ]
    ): Self = this.set("brands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrands: Self = this.set("brands", js.undefined)
  }
}
