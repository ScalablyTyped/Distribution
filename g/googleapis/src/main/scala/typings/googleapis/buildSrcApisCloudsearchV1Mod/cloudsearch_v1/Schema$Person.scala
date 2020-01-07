package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object to represent a person.
  */
@js.native
trait Schema$Person extends js.Object {
  /**
    * The person&#39;s email addresses
    */
  var emailAddresses: js.UndefOr[js.Array[Schema$EmailAddress]] = js.native
  /**
    * The resource name of the person to provide information about. See &lt;a
    * href=&quot;https://developers.google.com/people/api/rest/v1/people/get&quot;&gt;
    * People.get&lt;/a&gt; from Google People API.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Obfuscated ID of a person.
    */
  var obfuscatedId: js.UndefOr[String] = js.native
  /**
    * The person&#39;s name
    */
  var personNames: js.UndefOr[js.Array[Schema$Name]] = js.native
  /**
    * A person&#39;s read-only photo. A picture shown next to the person&#39;s
    * name to help others recognize the person in search results.
    */
  var photos: js.UndefOr[js.Array[Schema$Photo]] = js.native
}

object Schema$Person {
  @scala.inline
  def apply(
    emailAddresses: js.Array[Schema$EmailAddress] = null,
    name: String = null,
    obfuscatedId: String = null,
    personNames: js.Array[Schema$Name] = null,
    photos: js.Array[Schema$Photo] = null
  ): Schema$Person = {
    val __obj = js.Dynamic.literal()
    if (emailAddresses != null) __obj.updateDynamic("emailAddresses")(emailAddresses.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (obfuscatedId != null) __obj.updateDynamic("obfuscatedId")(obfuscatedId.asInstanceOf[js.Any])
    if (personNames != null) __obj.updateDynamic("personNames")(personNames.asInstanceOf[js.Any])
    if (photos != null) __obj.updateDynamic("photos")(photos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Person]
  }
}

