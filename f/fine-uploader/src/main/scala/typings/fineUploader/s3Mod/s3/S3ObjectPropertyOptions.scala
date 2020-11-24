package typings.fineUploader.s3Mod.s3

import typings.fineUploader.coreMod.PromiseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3ObjectPropertyOptions extends js.Object {
  
  /**
    * This value corresponds to a canned ACL
    *
    * @default `'private'`
    */
  var acl: js.UndefOr[String] = js.native
  
  /**
    * Describes the name of the bucket used to house the file in S3.
    *
    * This is required if the bucket cannot be determined by examining the endpoint (such as if you are using a CDN as an endpoint).
    * Possible values are a string representing the bucket name, or a function.
    *
    * If the value is a function, Fine Uploader S3 will pass the associated file ID as a parameter when invoking your function.
    * If the value is a function it may return a `promise` or a `String`
    *
    * @default `(assumes the bucket can be determined by parsing the endpoint string)`
    */
  var bucket: js.UndefOr[String | BucketFunction] = js.native
  
  /**
    * The hostname of your S3 bucket.
    *
    * This is required if you are using version 4 signatures and sending files through a CDN.
    * Possible values are a string representing the host name, or a function.
    *
    * If the value is a function, Fine Uploader S3 will pass the associated file ID as a parameter when invoking your function.
    * If the value is a function it may return a `promise` or a `String`.
    *
    * @default `(uses the request endpoint to determine the hostname)`
    */
  var host: js.UndefOr[String | HostFunction] = js.native
  
  /**
    * Describes the object key used to identify the file in your S3 bucket.
    *
    * Possible values are 'uuid', 'filename' or a function.
    *
    * If the value is a function, Fine Uploader S3 will pass the associated file ID as a parameter when invoking your function.
    * If the value is a function it may return one of a `promise` or a `String`.
    *
    * @default `'uuid'`
    */
  var key: js.UndefOr[String | KeyFunction] = js.native
  
  /**
    * Set this to true if you would like to use the reduced redundancy storage class for all objects uploaded to S3
    *
    * @default `false`
    */
  var reducedRedundancy: js.UndefOr[Boolean] = js.native
  
  /**
    * Version 4 signatures only: The S3 region identifier for the target bucket
    *
    * @default `'us-east-1'`
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * Set this to true if you would like all uploaded files to be encrypted by AWS
    *
    * @default `false`
    */
  var serverSideEncryption: js.UndefOr[Boolean] = js.native
}
object S3ObjectPropertyOptions {
  
  @scala.inline
  def apply(): S3ObjectPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ObjectPropertyOptions]
  }
  
  @scala.inline
  implicit class S3ObjectPropertyOptionsOps[Self <: S3ObjectPropertyOptions] (val x: Self) extends AnyVal {
    
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
    def setAcl(value: String): Self = this.set("acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcl: Self = this.set("acl", js.undefined)
    
    @scala.inline
    def setBucketFunction1(value: /* id */ Double => PromiseOptions | String): Self = this.set("bucket", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBucket(value: String | BucketFunction): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    
    @scala.inline
    def setHostFunction1(value: /* id */ Double => PromiseOptions | String): Self = this.set("host", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHost(value: String | HostFunction): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setKeyFunction1(value: /* id */ Double => PromiseOptions | String): Self = this.set("key", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKey(value: String | KeyFunction): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setReducedRedundancy(value: Boolean): Self = this.set("reducedRedundancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReducedRedundancy: Self = this.set("reducedRedundancy", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setServerSideEncryption(value: Boolean): Self = this.set("serverSideEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerSideEncryption: Self = this.set("serverSideEncryption", js.undefined)
  }
}
