package typings.evernote.mod.Evernote

import typings.evernote.AnonBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    In several places, EDAM exchanges blocks of bytes of data for a component
  *    which may be relatively large.    For example:    the contents of a clipped
  *    HTML note, the bytes of an embedded image, or the recognition XML for
  *    a large image.    This structure is used in the protocol to represent
  *    any of those large blocks of data when they are transmitted or when
  *    they are only referenced their metadata.
  *
  * <dl>
  *    <dt>bodyHash</dt>
  *        <dd>This field carries a one-way hash of the contents of the
  *        data body, in binary form.    The hash function is MD5<br/>
  *        Length:    EDAM_HASH_LEN (exactly)
  *        </dd>
  *
  *    <dt>size</dt>
  *        <dd>The length, in bytes, of the data body.
  *        </dd>
  *
  *    <dt>body</dt>
  *        <dd>This field is set to contain the binary contents of the data
  *        whenever the resource is being transferred.    If only metadata is
  *        being exchanged, this field will be empty.    For example, a client could
  *        notify the service about the change to an attribute for a resource
  *        without transmitting the binary resource contents.
  *        </dd>
  *    </dl>
  */
@JSImport("evernote", "Evernote.Data")
@js.native
class Data () extends js.Object {
  def this(args: AnonBody) = this()
  var body: String = js.native
  var bodyHash: String = js.native
  var size: Double = js.native
}

