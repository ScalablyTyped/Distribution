package typings.devcert.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDomainData extends js.Object {
  var cert: Buffer
  var key: Buffer
}

object IDomainData {
  @scala.inline
  def apply(cert: Buffer, key: Buffer): IDomainData = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDomainData]
  }
}

