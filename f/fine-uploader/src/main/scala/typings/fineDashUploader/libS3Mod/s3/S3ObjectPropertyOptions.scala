package typings.fineDashUploader.libS3Mod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3ObjectPropertyOptions extends js.Object {
  /**
    * This value corresponds to a canned ACL
    *
    * @default `'private'`
    */
  var acl: js.UndefOr[String] = js.undefined
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
  var bucket: js.UndefOr[String | BucketFunction] = js.undefined
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
  var host: js.UndefOr[String | HostFunction] = js.undefined
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
  var key: js.UndefOr[String | KeyFunction] = js.undefined
  /**
    * Set this to true if you would like to use the reduced redundancy storage class for all objects uploaded to S3
    *
    * @default `false`
    */
  var reducedRedundancy: js.UndefOr[Boolean] = js.undefined
  /**
    * Version 4 signatures only: The S3 region identifier for the target bucket
    *
    * @default `'us-east-1'`
    */
  var region: js.UndefOr[String] = js.undefined
  /**
    * Set this to true if you would like all uploaded files to be encrypted by AWS
    *
    * @default `false`
    */
  var serverSideEncryption: js.UndefOr[Boolean] = js.undefined
}

object S3ObjectPropertyOptions {
  @scala.inline
  def apply(
    acl: String = null,
    bucket: String | BucketFunction = null,
    host: String | HostFunction = null,
    key: String | KeyFunction = null,
    reducedRedundancy: js.UndefOr[Boolean] = js.undefined,
    region: String = null,
    serverSideEncryption: js.UndefOr[Boolean] = js.undefined
  ): S3ObjectPropertyOptions = {
    val __obj = js.Dynamic.literal()
    if (acl != null) __obj.updateDynamic("acl")(acl)
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(reducedRedundancy)) __obj.updateDynamic("reducedRedundancy")(reducedRedundancy)
    if (region != null) __obj.updateDynamic("region")(region)
    if (!js.isUndefined(serverSideEncryption)) __obj.updateDynamic("serverSideEncryption")(serverSideEncryption)
    __obj.asInstanceOf[S3ObjectPropertyOptions]
  }
}

