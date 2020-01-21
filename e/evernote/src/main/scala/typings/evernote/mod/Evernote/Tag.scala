package typings.evernote.mod.Evernote

import typings.evernote.AnonGuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    A tag within a user's account is a unique name which may be organized
  *    a simple hierarchy.
  * <dl>
  *    <dt>guid</dt>
  *        <dd>The unique identifier of this tag. Will be set by the service,
  *        so may be omitted by the client when creating the Tag.
  *        <br/>
  *        Length:    EDAM_GUID_LEN_MIN - EDAM_GUID_LEN_MAX
  *        <br/>
  *        Regex:    EDAM_GUID_REGEX
  *        </dd>
  *
  *    <dt>name</dt>
  *        <dd>A sequence of characters representing the tag's identifier.
  *        Case is preserved, but is ignored for comparisons.
  *        This means that an account may only have one tag with a given name, via
  *        case-insensitive comparison, so an account may not have both "food" and
  *        "Food" tags.
  *        May not contain a comma (','), and may not begin or end with a space.
  *        <br/>
  *        Length:    EDAM_TAG_NAME_LEN_MIN - EDAM_TAG_NAME_LEN_MAX
  *        <br/>
  *        Regex:    EDAM_TAG_NAME_REGEX
  *        </dd>
  *
  *    <dt>parentGuid</dt>
  *        <dd>If this is set, then this is the GUID of the tag that
  *        holds this tag within the tag organizational hierarchy.    If this is
  *        not set, then the tag has no parent and it is a "top level" tag.
  *        Cycles are not allowed (e.g. a->parent->parent == a) and will be
  *        rejected by the service.
  *        <br/>
  *        Length:    EDAM_GUID_LEN_MIN - EDAM_GUID_LEN_MAX
  *        <br/>
  *        Regex:    EDAM_GUID_REGEX
  *        </dd>
  *
  *    <dt>updateSequenceNum</dt>
  *        <dd>A number identifying the last transaction to
  *        modify the state of this object.    The USN values are sequential within an
  *        account, and can be used to compare the order of modifications within the
  *        service.
  *        </dd>
  *    </dl>
  */
@JSImport("evernote", "Evernote.Tag")
@js.native
class Tag () extends js.Object {
  def this(args: AnonGuid) = this()
  var guid: String = js.native
  var name: String = js.native
  var parentGuid: String = js.native
  var updateSequenceNum: Double = js.native
}

