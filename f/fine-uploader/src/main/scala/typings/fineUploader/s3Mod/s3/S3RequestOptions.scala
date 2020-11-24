package typings.fineUploader.s3Mod.s3

import typings.fineUploader.coreMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3RequestOptions extends RequestOptions {
  
  /**
    * Your AWS public key. NOT YOUR SECRET KEY. Ignored if `credentials` have been set
    *
    * @default `null`
    */
  var accessKey: js.UndefOr[String] = js.native
  
  /**
    * Number of milliseconds to add to the `x-amz-date` header and the policy expiration date to account for clock drift on the browser/client machine
    *
    * @default `0`
    */
  var clockDrift: js.UndefOr[Double] = js.native
}
object S3RequestOptions {
  
  @scala.inline
  def apply(): S3RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3RequestOptions]
  }
  
  @scala.inline
  implicit class S3RequestOptionsOps[Self <: S3RequestOptions] (val x: Self) extends AnyVal {
    
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
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    
    @scala.inline
    def setClockDrift(value: Double): Self = this.set("clockDrift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClockDrift: Self = this.set("clockDrift", js.undefined)
  }
}
