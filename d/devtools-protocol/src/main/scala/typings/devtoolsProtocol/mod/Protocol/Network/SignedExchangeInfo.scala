package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignedExchangeInfo extends js.Object {
  /**
    * Errors occurred while handling the signed exchagne.
    */
  var errors: js.UndefOr[js.Array[SignedExchangeError]] = js.native
  /**
    * Information about the signed exchange header.
    */
  var header: js.UndefOr[SignedExchangeHeader] = js.native
  /**
    * The outer response of signed HTTP exchange which was received from network.
    */
  var outerResponse: Response = js.native
  /**
    * Security details for the signed exchange header.
    */
  var securityDetails: js.UndefOr[SecurityDetails] = js.native
}

object SignedExchangeInfo {
  @scala.inline
  def apply(outerResponse: Response): SignedExchangeInfo = {
    val __obj = js.Dynamic.literal(outerResponse = outerResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedExchangeInfo]
  }
  @scala.inline
  implicit class SignedExchangeInfoOps[Self <: SignedExchangeInfo] (val x: Self) extends AnyVal {
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
    def setOuterResponse(value: Response): Self = this.set("outerResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorsVarargs(value: SignedExchangeError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[SignedExchangeError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setHeader(value: SignedExchangeHeader): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setSecurityDetails(value: SecurityDetails): Self = this.set("securityDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityDetails: Self = this.set("securityDetails", js.undefined)
  }
  
}

