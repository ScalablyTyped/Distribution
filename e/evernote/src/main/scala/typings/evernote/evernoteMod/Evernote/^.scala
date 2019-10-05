package typings.evernote.evernoteMod.Evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Evernote")
@js.native
object ^ extends js.Object {
  /**
    * A value for the "recipe" key in the "classifications" map in NoteAttributes
    * that indicates the Evernote service has classified a note as being a recipe.
    */
  var CLASSIFICATION_RECIPE_SERVICE_RECIPE: String = js.native
  /**
    * A value for the "recipe" key in the "classifications" map in NoteAttributes
    * that indicates the user has classified a note as being a non-recipe.
    */
  var CLASSIFICATION_RECIPE_USER_NON_RECIPE: String = js.native
  /**
    * A value for the "recipe" key in the "classifications" map in NoteAttributes
    * that indicates the user has classified a note as being a recipe.
    */
  var CLASSIFICATION_RECIPE_USER_RECIPE: String = js.native
  /**
    * The total length of an entry in an applicationData LazyMap, which
    * is the sum of the length of the key and the value for the entry.
    */
  var EDAM_APPLICATIONDATA_ENTRY_LEN_MAX: Double = js.native
  /**
    * Maximum length of an application name, which is the key in an
    * applicationData LazyMap found in entities such as Resources and
    * Notes.
    */
  var EDAM_APPLICATIONDATA_NAME_LEN_MAX: Double = js.native
  /**
    * Minimum length of an application name, which is the key in an
    * applicationData LazyMap found in entities such as Resources and
    * Notes.
    */
  var EDAM_APPLICATIONDATA_NAME_LEN_MIN: Double = js.native
  /**
    * An application name must match this regex.    An application
    * name is the key portion of an entry in an applicationData
    * map as found in entities such as Resources and Notes.
    * Note that even if both the name and value regexes match,
    * it is still necessary to check the sum of the lengths
    * against EDAM_APPLICATIONDATA_ENTRY_LEN_MAX.
    */
  var EDAM_APPLICATIONDATA_NAME_REGEX: String = js.native
  /**
    * Maximum length of an applicationData value in a LazyMap, found
    * in entities such as Resources and Notes.    Note, however, that
    * the sum of the size of hte key and value is constrained by
    * EDAM_APPLICATIONDATA_ENTRY_LEN_MAX, so the maximum length, in
    * practice, depends upon the key value being used.
    */
  var EDAM_APPLICATIONDATA_VALUE_LEN_MAX: Double = js.native
  /**
    * Minimum length of an applicationData value in a LazyMap, found
    * in entities such as Resources and Notes.
    */
  var EDAM_APPLICATIONDATA_VALUE_LEN_MIN: Double = js.native
  /**
    * An applicationData map value must match this regex.
    * Note that even if both the name and value regexes match,
    * it is still necessary to check the sum of the lengths
    * against EDAM_APPLICATIONDATA_ENTRY_LEN_MAX.
    */
  var EDAM_APPLICATIONDATA_VALUE_REGEX: String = js.native
  /**
    * Maximum length of any string-based attribute, in Unicode chars
    */
  var EDAM_ATTRIBUTE_LEN_MAX: Double = js.native
  /**
    * Minimum length of any string-based attribute, in Unicode chars
    */
  var EDAM_ATTRIBUTE_LEN_MIN: Double = js.native
  /**
    * The maximum number of values that can be stored in a list-based attribute
    * (e.g. see UserAttributes.recentMailedAddresses)
    */
  var EDAM_ATTRIBUTE_LIST_MAX: Double = js.native
  /**
    * The maximum number of entries that can be stored in a map-based attribute
    * such as applicationData fields in Resources and Notes.
    */
  var EDAM_ATTRIBUTE_MAP_MAX: Double = js.native
  /**
    * Any string-based attribute must match the provided regular expression.
    * This excludes all Unicode line endings and control characters.
    */
  var EDAM_ATTRIBUTE_REGEX: String = js.native
  /**
    * Maximum number of Notebooks in a business account
    */
  var EDAM_BUSINESS_NOTEBOOKS_MAX: Double = js.native
  /**
    * The maximum length, in Unicode characters, of a description for a business
    * notebook.
    */
  var EDAM_BUSINESS_NOTEBOOK_DESCRIPTION_LEN_MAX: Double = js.native
  /**
    * The minimum length, in Unicode characters, of a description for a business
    * notebook.
    */
  var EDAM_BUSINESS_NOTEBOOK_DESCRIPTION_LEN_MIN: Double = js.native
  /**
    * All business notebook descriptions must match this pattern.
    * This excludes control chars or line/paragraph separators.
    * The string may not begin or end with whitespace.
    */
  var EDAM_BUSINESS_NOTEBOOK_DESCRIPTION_REGEX: String = js.native
  /**
    * Maximum number of Notes per business account
    */
  var EDAM_BUSINESS_NOTES_MAX: Double = js.native
  /**
    * The maximum length of a business phone number.
    */
  var EDAM_BUSINESS_PHONE_NUMBER_LEN_MAX: Double = js.native
  /**
    * Maximum number of Tags per business account.
    */
  var EDAM_BUSINESS_TAGS_MAX: Double = js.native
  /**
    * The maximum length of an Evernote Business URI
    */
  var EDAM_BUSINESS_URI_LEN_MAX: Double = js.native
  /**
    * The content class prefix used for structured notes created by
    * Evernote Food that captures the experience of a particular meal.
    * When performing a wildcard search via filtered sync chunks or search
    * strings, the * character must be appended to this constant.
    */
  var EDAM_CONTENT_CLASS_FOOD_MEAL: String = js.native
  /**
    * The content class prefix used for structured notes created by Evernote
    * Hello that represents an encounter with a person. When performing a
    * wildcard search via filtered sync chunks or search strings, the *
    * character must be appended to this constant.
    */
  var EDAM_CONTENT_CLASS_HELLO_ENCOUNTER: String = js.native
  /**
    * The content class prefix used for structured notes created by Evernote
    * Hello that represents the user's profile. When performing a
    * wildcard search via filtered sync chunks or search strings, the *
    * character must be appended to this constant.
    */
  var EDAM_CONTENT_CLASS_HELLO_PROFILE: String = js.native
  /**
    * The content class value used for structured notes created by Evernote
    * Penultimate that represents a Penultimate notebook.
    */
  var EDAM_CONTENT_CLASS_PENULTIMATE_NOTEBOOK: String = js.native
  /**
    * The content class prefix used for structured notes created by Evernote
    * Penultimate. When performing a wildcard search via filtered sync chunks
    * or search strings, the * character must be appended to this constant.
    */
  var EDAM_CONTENT_CLASS_PENULTIMATE_PREFIX: String = js.native
  /**
    * The content class value used for structured image notes created by Evernote
    * Skitch.
    */
  var EDAM_CONTENT_CLASS_SKITCH: String = js.native
  /**
    * The content class value used for structured PDF notes created by Evernote
    * Skitch.
    */
  var EDAM_CONTENT_CLASS_SKITCH_PDF: String = js.native
  /**
    * The content class prefix used for structured notes created by Evernote
    * Skitch. When performing a wildcard search via filtered sync chunks
    * or search strings, the * character must be appended to this constant.
    */
  var EDAM_CONTENT_CLASS_SKITCH_PREFIX: String = js.native
  /**
    * Maximum length of the device description string associated with long sessions.
    */
  var EDAM_DEVICE_DESCRIPTION_LEN_MAX: Double = js.native
  /**
    * Regular expression for device description strings associated with long sessions.
    */
  var EDAM_DEVICE_DESCRIPTION_REGEX: String = js.native
  /**
    * Maximum length of the device identifier string associated with long sessions.
    */
  var EDAM_DEVICE_ID_LEN_MAX: Double = js.native
  /**
    * Regular expression for device identifier strings associated with long sessions.
    */
  var EDAM_DEVICE_ID_REGEX: String = js.native
  /**
    * A regular expression that matches the part of an email address after
    * the '@' symbol.
    */
  var EDAM_EMAIL_DOMAIN_REGEX: String = js.native
  /**
    * The maximum length of any email address
    */
  var EDAM_EMAIL_LEN_MAX: Double = js.native
  /**
    * The minimum length of any email address
    */
  var EDAM_EMAIL_LEN_MIN: Double = js.native
  /**
    * A regular expression that matches the part of an email address before
    * the '@' symbol.
    */
  var EDAM_EMAIL_LOCAL_REGEX: String = js.native
  /**
    * A regular expression that must match any email address given to Evernote.
    * Email addresses must comply with RFC 2821 and 2822.
    */
  var EDAM_EMAIL_REGEX: String = js.native
  /**
    * The content class prefix used for all notes created by Evernote Food.
    * This prefix can be used to assemble individual content class strings,
    * or can be used to create a wildcard search to get all notes created by
    * Food. When performing a wildcard search via filtered sync chunks or
    * search strings, the * character must be appended to this constant.
    */
  var EDAM_FOOD_APP_CONTENT_CLASS_PREFIX: String = js.native
  /**
    * The maximum length of a GUID generated by the Evernote service
    */
  var EDAM_GUID_LEN_MAX: Double = js.native
  /**
    * The minimum length of a GUID generated by the Evernote service
    */
  var EDAM_GUID_LEN_MIN: Double = js.native
  /**
    * GUIDs generated by the Evernote service will match the provided pattern
    */
  var EDAM_GUID_REGEX: String = js.native
  /**
    * The exact length of a MD5 hash checksum, in binary bytes.
    * This is the exact length that must be matched for any binary hash
    * value.
    */
  var EDAM_HASH_LEN: Double = js.native
  /**
    * The content class prefix used for all notes created by Evernote Hello.
    * This prefix can be used to assemble individual content class strings,
    * or can be used to create a wildcard search to get all notes created by
    * Hello. When performing a wildcard search via filtered sync chunks or
    * search strings, the * character must be appended to this constant.
    */
  var EDAM_HELLO_APP_CONTENT_CLASS_PREFIX: String = js.native
  /**
    * The set of MIME types that Evernote will parse and index for
    * searching. With exception of images, and PDFs, which are
    * handled in a different way.
    */
  var EDAM_INDEXABLE_RESOURCE_MIME_TYPES: js.Array[String] = js.native
  /**
    * Maximum number of name/value pairs allowed
    */
  var EDAM_MAX_PREFERENCES: Double = js.native
  /**
    * Maximum number of values per preference name
    */
  var EDAM_MAX_VALUES_PER_PREFERENCE: Double = js.native
  /**
    * The maximum length of any MIME type string given to Evernote
    */
  var EDAM_MIME_LEN_MAX: Double = js.native
  /**
    * The minimum length of any MIME type string given to Evernote
    */
  var EDAM_MIME_LEN_MIN: Double = js.native
  /**
    * Any MIME type string given to Evernote must match the provided pattern.
    * E.g.:    image/gif
    */
  var EDAM_MIME_REGEX: String = js.native
  /**
    * The set of resource MIME types that are expected to be handled
    * correctly by all of the major Evernote client applications.
    */
  var EDAM_MIME_TYPES: js.Array[String] = js.native
  /**
    * Canonical MIME type string for AAC audio resources
    */
  var EDAM_MIME_TYPE_AAC: String = js.native
  /**
    * Canonical MIME type string for AMR audio resources
    */
  var EDAM_MIME_TYPE_AMR: String = js.native
  /**
    * MIME type used for attachments of an unspecified type
    */
  var EDAM_MIME_TYPE_DEFAULT: String = js.native
  /**
    * Canonical MIME type string for GIF image resources
    */
  var EDAM_MIME_TYPE_GIF: String = js.native
  /**
    * Canonical MIME type string for Evernote Ink resources
    */
  var EDAM_MIME_TYPE_INK: String = js.native
  /**
    * Canonical MIME type string for JPEG image resources
    */
  var EDAM_MIME_TYPE_JPEG: String = js.native
  /**
    * Canonical MIME type string for MP4 audio resources
    */
  var EDAM_MIME_TYPE_M4A: String = js.native
  /**
    * Canonical MIME type string for MP3 audio resources
    */
  var EDAM_MIME_TYPE_MP3: String = js.native
  /**
    * Canonical MIME type string for MP4 video resources
    */
  var EDAM_MIME_TYPE_MP4_VIDEO: String = js.native
  /**
    * Canonical MIME type string for PDF resources
    */
  var EDAM_MIME_TYPE_PDF: String = js.native
  /**
    * Canonical MIME type string for PNG image resources
    */
  var EDAM_MIME_TYPE_PNG: String = js.native
  /**
    * Canonical MIME type string for WAV audio resources
    */
  var EDAM_MIME_TYPE_WAV: String = js.native
  /**
    * The maximum length of a Notebook.name, in Unicode characters
    */
  var EDAM_NOTEBOOK_NAME_LEN_MAX: Double = js.native
  /**
    * The minimum length of a Notebook.name, in Unicode characters
    */
  var EDAM_NOTEBOOK_NAME_LEN_MIN: Double = js.native
  /**
    * All Notebook.name fields must match this pattern.
    * This excludes control chars or line/paragraph separators.
    * The string may not begin or end with whitespace.
    */
  var EDAM_NOTEBOOK_NAME_REGEX: String = js.native
  /**
    * Maximum number of shared notebooks per notebook
    */
  var EDAM_NOTEBOOK_SHARED_NOTEBOOK_MAX: Double = js.native
  /**
    * The maximum length of a Notebook.stack, in Unicode characters
    */
  var EDAM_NOTEBOOK_STACK_LEN_MAX: Double = js.native
  /**
    * The minimum length of a Notebook.stack, in Unicode characters
    */
  var EDAM_NOTEBOOK_STACK_LEN_MIN: Double = js.native
  /**
    * All Notebook.stack fields must match this pattern.
    * This excludes control chars or line/paragraph separators.
    * The string may not begin or end with whitespace.
    */
  var EDAM_NOTEBOOK_STACK_REGEX: String = js.native
  /**
    * The maximum length of the content class attribute of a note.
    */
  var EDAM_NOTE_CONTENT_CLASS_LEN_MAX: Double = js.native
  /**
    * The minimum length of the content class attribute of a note.
    */
  var EDAM_NOTE_CONTENT_CLASS_LEN_MIN: Double = js.native
  /**
    * The regular expression that the content class of a note must match
    * to be valid.
    */
  var EDAM_NOTE_CONTENT_CLASS_REGEX: String = js.native
  /**
    * Maximum length of a Note.content field
    * Note.content fields must comply with the ENML DTD.
    */
  var EDAM_NOTE_CONTENT_LEN_MAX: Double = js.native
  /**
    * Minimum length of a Note.content field.
    * Note.content fields must comply with the ENML DTD.
    */
  var EDAM_NOTE_CONTENT_LEN_MIN: Double = js.native
  /**
    * The maximum number of Resources per Note
    */
  var EDAM_NOTE_RESOURCES_MAX: Double = js.native
  /**
    * Maximum total size of a Note that can be added to a Free account.
    * The size of a note is calculated as:
    * ENML content length (in Unicode characters) plus the sum of all resource
    * sizes (in bytes).
    */
  var EDAM_NOTE_SIZE_MAX_FREE: Double = js.native
  /**
    * Maximum total size of a Note that can be added to a Premium account.
    * The size of a note is calculated as:
    * ENML content length (in Unicode characters) plus the sum of all resource
    * sizes (in bytes).
    */
  var EDAM_NOTE_SIZE_MAX_PREMIUM: Double = js.native
  /**
    * Standardized value for the 'source' NoteAttribute for notes that
    * were clipped from an email message.
    */
  var EDAM_NOTE_SOURCE_MAIL_CLIP: String = js.native
  /**
    * Standardized value for the 'source' NoteAttribute for notes that
    * were created via email sent to Evernote's email interface.
    */
  var EDAM_NOTE_SOURCE_MAIL_SMTP_GATEWAY: String = js.native
  /**
    * Standardized value for the 'source' NoteAttribute for notes that
    * were clipped from the web in some manner.
    */
  var EDAM_NOTE_SOURCE_WEB_CLIP: String = js.native
  /**
    * The maximum number of Tags per Note
    */
  var EDAM_NOTE_TAGS_MAX: Double = js.native
  /**
    * The maximum length of a Note.title, in Unicode characters
    */
  var EDAM_NOTE_TITLE_LEN_MAX: Double = js.native
  /**
    * The minimum length of a Note.title, in Unicode characters
    */
  var EDAM_NOTE_TITLE_LEN_MIN: Double = js.native
  /**
    * All Note.title fields must match this pattern.
    * This excludes control chars or line/paragraph separators.
    * The string may not begin or end with whitespace.
    */
  var EDAM_NOTE_TITLE_REGEX: String = js.native
  /**
    * Maximum length of a preference name
    */
  var EDAM_PREFERENCE_NAME_LEN_MAX: Double = js.native
  /**
    * Minimum length of a preference name
    */
  var EDAM_PREFERENCE_NAME_LEN_MIN: Double = js.native
  /**
    * A preference name must match this regex.
    */
  var EDAM_PREFERENCE_NAME_REGEX: String = js.native
  /**
    * The name of the preferences entry that contains shortcuts.
    */
  var EDAM_PREFERENCE_SHORTCUTS: String = js.native
  /**
    * The maximum number of shortcuts that a user may have.
    */
  var EDAM_PREFERENCE_SHORTCUTS_MAX_VALUES: Double = js.native
  /**
    * Maximum length of a preference value
    */
  var EDAM_PREFERENCE_VALUE_LEN_MAX: Double = js.native
  /**
    * Minimum length of a preference value
    */
  var EDAM_PREFERENCE_VALUE_LEN_MIN: Double = js.native
  /**
    * A preference value must match this regex.
    */
  var EDAM_PREFERENCE_VALUE_REGEX: String = js.native
  /**
    * The maximum length of a Publishing.publicDescription field.
    */
  var EDAM_PUBLISHING_DESCRIPTION_LEN_MAX: Double = js.native
  /**
    * The minimum length of a Publishing.publicDescription field.
    */
  var EDAM_PUBLISHING_DESCRIPTION_LEN_MIN: Double = js.native
  /**
    * Any public notebook's Publishing.publicDescription field must match
    * this pattern.
    * No control chars or line/paragraph separators, and can't start or
    * end with whitespace.
    */
  var EDAM_PUBLISHING_DESCRIPTION_REGEX: String = js.native
  /**
    * The maximum length of a public notebook URI component
    */
  var EDAM_PUBLISHING_URI_LEN_MAX: Double = js.native
  /**
    * The minimum length of a public notebook URI component
    */
  var EDAM_PUBLISHING_URI_LEN_MIN: Double = js.native
  /**
    * The set of strings that may not be used as a publishing URI
    */
  var EDAM_PUBLISHING_URI_PROHIBITED: js.Array[String] = js.native
  /**
    * A public notebook URI component must match the provided pattern
    */
  var EDAM_PUBLISHING_URI_REGEX: String = js.native
  /**
    * The maximum number of notebooks that will be returned from a findRelated()
    * query.
    */
  var EDAM_RELATED_MAX_NOTEBOOKS: Double = js.native
  /**
    * The maximum number of notes that will be returned from a findRelated()
    * query.
    */
  var EDAM_RELATED_MAX_NOTES: Double = js.native
  /**
    * The maximum number of tags that will be returned from a findRelated() query.
    */
  var EDAM_RELATED_MAX_TAGS: Double = js.native
  /**
    * The maximum length of the plain text in a findRelated query, assuming that
    * plaintext is being provided.
    */
  var EDAM_RELATED_PLAINTEXT_LEN_MAX: Double = js.native
  /**
    * The minimum length of the plain text in a findRelated query, assuming that
    * plaintext is being provided.
    */
  var EDAM_RELATED_PLAINTEXT_LEN_MIN: Double = js.native
  /**
    * Maximum size of a resource, in bytes, for Free accounts
    */
  var EDAM_RESOURCE_SIZE_MAX_FREE: Double = js.native
  /**
    * Maximum size of a resource, in bytes, for Premium accounts
    */
  var EDAM_RESOURCE_SIZE_MAX_PREMIUM: Double = js.native
  /**
    * The maximum length of a SavedSearch.name field
    */
  var EDAM_SAVED_SEARCH_NAME_LEN_MAX: Double = js.native
  /**
    * The minimum length of a SavedSearch.name field
    */
  var EDAM_SAVED_SEARCH_NAME_LEN_MIN: Double = js.native
  /**
    * SavedSearch.name fields must match this pattern.
    * No control chars or line/paragraph separators, and can't start or
    * end with whitespace.
    */
  var EDAM_SAVED_SEARCH_NAME_REGEX: String = js.native
  /**
    * The maximum length of a user search query string in Unicode chars
    */
  var EDAM_SEARCH_QUERY_LEN_MAX: Double = js.native
  /**
    * The minimum length of a user search query string in Unicode chars
    */
  var EDAM_SEARCH_QUERY_LEN_MIN: Double = js.native
  /**
    * Search queries must match the provided pattern.    This is used for
    * both ad-hoc queries and SavedSearch.query fields.
    * This excludes all control characters and line/paragraph separators.
    */
  var EDAM_SEARCH_QUERY_REGEX: String = js.native
  /**
    * Maximum number of search suggestions that can be returned
    */
  var EDAM_SEARCH_SUGGESTIONS_MAX: Double = js.native
  /**
    * Maximum length of the search suggestion prefix
    */
  var EDAM_SEARCH_SUGGESTIONS_PREFIX_LEN_MAX: Double = js.native
  /**
    * Minimum length of the search suggestion prefix
    */
  var EDAM_SEARCH_SUGGESTIONS_PREFIX_LEN_MIN: Double = js.native
  /**
    * The maximum length of a Tag.name, in Unicode characters
    */
  var EDAM_TAG_NAME_LEN_MAX: Double = js.native
  /**
    * The minimum length of a Tag.name, in Unicode characters
    */
  var EDAM_TAG_NAME_LEN_MIN: Double = js.native
  /**
    * All Tag.name fields must match this pattern.
    * This excludes control chars, commas or line/paragraph separators.
    * The string may not begin or end with whitespace.
    */
  var EDAM_TAG_NAME_REGEX: String = js.native
  /**
    * The maximum length of a timezone specification string
    */
  var EDAM_TIMEZONE_LEN_MAX: Double = js.native
  /**
    * The minimum length of a timezone specification string
    */
  var EDAM_TIMEZONE_LEN_MIN: Double = js.native
  /**
    * Any timezone string given to Evernote must match the provided pattern.
    * This permits either a locale-based standard timezone or a GMT offset.
    * E.g.:<ul>
    *        <li>America/Los_Angeles</li>
    *        <li>GMT+08:00</li>
    * </ul>
    */
  var EDAM_TIMEZONE_REGEX: String = js.native
  /**
    * Maximum number of linked notebooks per account, for a free
    * account.
    */
  var EDAM_USER_LINKED_NOTEBOOK_MAX: Double = js.native
  /**
    * Maximum number of linked notebooks per account, for a premium
    * account.    Users who are part of an active business are also
    * covered under "premium".
    */
  var EDAM_USER_LINKED_NOTEBOOK_MAX_PREMIUM: Double = js.native
  /**
    * The number of emails of any type that can be sent by a user with a Free
    * account from the service per day.    If an email is sent to two different
    * recipients, this counts as two emails.
    */
  var EDAM_USER_MAIL_LIMIT_DAILY_FREE: Double = js.native
  /**
    * The number of emails of any type that can be sent by a user with a Premium
    * account from the service per day.    If an email is sent to two different
    * recipients, this counts as two emails.
    */
  var EDAM_USER_MAIL_LIMIT_DAILY_PREMIUM: Double = js.native
  /**
    * Maximum length of the User.name field
    */
  var EDAM_USER_NAME_LEN_MAX: Double = js.native
  /**
    * Minimum length of the User.name field
    */
  var EDAM_USER_NAME_LEN_MIN: Double = js.native
  /**
    * The User.name field must match this pattern, which excludes line
    * endings and control characters.
    */
  var EDAM_USER_NAME_REGEX: String = js.native
  /**
    * Maximum number of Notebooks per user
    */
  var EDAM_USER_NOTEBOOKS_MAX: Double = js.native
  /**
    * Maximum number of Notes per user
    */
  var EDAM_USER_NOTES_MAX: Double = js.native
  /**
    * The maximum length of an Evernote user password
    */
  var EDAM_USER_PASSWORD_LEN_MAX: Double = js.native
  /**
    * The minimum length of an Evernote user password
    */
  var EDAM_USER_PASSWORD_LEN_MIN: Double = js.native
  /**
    * Evernote user passwords must match this regular expression
    */
  var EDAM_USER_PASSWORD_REGEX: String = js.native
  /**
    * Maximum number of recent email addresses that are maintained
    * (see UserAttributes.recentMailedAddresses)
    */
  var EDAM_USER_RECENT_MAILED_ADDRESSES_MAX: Double = js.native
  /**
    * Maximum number of SavedSearches per account
    */
  var EDAM_USER_SAVED_SEARCHES_MAX: Double = js.native
  /**
    * Maximum number of Tags per account
    */
  var EDAM_USER_TAGS_MAX: Double = js.native
  /**
    * The number of bytes of new data that may be uploaded to a Business user's
    * personal account each month. Note that content uploaded into the Business
    * notebooks by the user does not count against this limit.
    */
  var EDAM_USER_UPLOAD_LIMIT_BUSINESS: Double = js.native
  /**
    * The number of bytes of new data that may be uploaded to a Free user's
    * account each month.
    */
  var EDAM_USER_UPLOAD_LIMIT_FREE: Double = js.native
  /**
    * The number of bytes of new data that may be uploaded to a Premium user's
    * account each month.
    */
  var EDAM_USER_UPLOAD_LIMIT_PREMIUM: Double = js.native
  /**
    * The maximum length of an Evernote username
    */
  var EDAM_USER_USERNAME_LEN_MAX: Double = js.native
  /**
    * The minimum length of an Evernote username
    */
  var EDAM_USER_USERNAME_LEN_MIN: Double = js.native
  /**
    * Any Evernote User.username field must match this pattern.    This
    * restricts usernames to a format that could permit use as a domain
    * name component.    E.g. "username.whatever.evernote.com"
    */
  var EDAM_USER_USERNAME_REGEX: String = js.native
  /**
    * A regular expression that must match any VAT ID given to Evernote.
    * ref http://en.wikipedia.org/wiki/VAT_identification_number
    * ref http://my.safaribooksonline.com/book/programming/regular-expressions/9780596802837/4dot-validation-and-formatting/id2995136
    */
  var EDAM_VAT_REGEX: String = js.native
  /**
    * The major version number for the current revision of the EDAM protocol.
    * Clients pass this to the service using UserStore.checkVersion at the
    * beginning of a session to confirm that they are not out of date.
    */
  var EDAM_VERSION_MAJOR: Double = js.native
  /**
    * The minor version number for the current revision of the EDAM protocol.
    * Clients pass this to the service using UserStore.checkVersion at the
    * beginning of a session to confirm that they are not out of date.
    */
  var EDAM_VERSION_MINOR: Double = js.native
}

