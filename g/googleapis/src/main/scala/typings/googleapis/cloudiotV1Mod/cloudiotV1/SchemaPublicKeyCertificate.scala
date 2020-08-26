package typings.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A public key certificate format and data.
  */
@js.native
trait SchemaPublicKeyCertificate extends js.Object {
  /**
    * The certificate data.
    */
  var certificate: js.UndefOr[String] = js.native
  /**
    * The certificate format.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * [Output only] The certificate details. Used only for X.509 certificates.
    */
  var x509Details: js.UndefOr[SchemaX509CertificateDetails] = js.native
}

object SchemaPublicKeyCertificate {
  @scala.inline
  def apply(): SchemaPublicKeyCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublicKeyCertificate]
  }
  @scala.inline
  implicit class SchemaPublicKeyCertificateOps[Self <: SchemaPublicKeyCertificate] (val x: Self) extends AnyVal {
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
    def setCertificate(value: String): Self = this.set("certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificate: Self = this.set("certificate", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setX509Details(value: SchemaX509CertificateDetails): Self = this.set("x509Details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX509Details: Self = this.set("x509Details", js.undefined)
  }
  
}

