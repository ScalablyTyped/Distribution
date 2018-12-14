package typings
package evernoteLib.evernoteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Evernote")
@js.native
object EvernoteNs extends js.Object {
  /**
       *    This represents the bookkeeping information for the user's subscription.
       *
       * <dl>
       *    <dt>uploadLimit</dt>
       *        <dd>The number of bytes that can be uploaded to the account
       *        in the current month.    For new notes that are created, this is the length
       *        of the note content (in Unicode characters) plus the size of each resource
       *        (in bytes).    For edited notes, this is the the difference between the old
       *        length and the new length (if this is greater than 0) plus the size of
       *        each new resource.
       *        </dd>
       *    <dt>uploadLimitEnd</dt>
       *        <dd>The date and time when the current upload limit
       *        expires.    At this time, the monthly upload count reverts to 0 and a new
       *        limit is imposed.    This date and time is exclusive, so this is effectively
       *        the start of the new month.
       *        </dd>
       *    <dt>uploadLimitNextMonth</dt>
       *        <dd> When uploadLimitEnd is reached, the service
       *        will change uploadLimit to uploadLimitNextMonth. If a premium account is
       *        canceled, this mechanism will reset the quota appropriately.
       *        </dd>
       *    <dt>premiumServiceStatus</dt>
       *        <dd>Indicates the phases of a premium account
       *        during the billing process.
       *        </dd>
       *    <dt>premiumOrderNumber</dt>
       *        <dd>The order number used by the commerce system to
       *        process recurring payments
       *        </dd>
       *    <dt>premiumServiceStart</dt>
       *        <dd>The start date when this premium promotion
       *        began (this number will get overwritten if a premium service is canceled
       *        and then re-activated).
       *        </dd>
       *    <dt>premiumCommerceService</dt>
       *        <dd>The commerce system used (paypal, Google
       *        checkout, etc)
       *        </dd>
       *    <dt>premiumServiceSKU</dt>
       *        <dd>The code associated with the purchase eg. monthly
       *        or annual purchase. Clients should interpret this value and localize it.
       *        </dd>
       *    <dt>lastSuccessfulCharge</dt>
       *        <dd>Date the last time the user was charged.
       *        Null if never charged.
       *        </dd>
       *    <dt>lastFailedCharge</dt>
       *        <dd>Date the last time a charge was attempted and
       *        failed.
       *        </dd>
       *    <dt>lastFailedChargeReason</dt>
       *        <dd>Reason provided for the charge failure
       *        </dd>
       *    <dt>nextPaymentDue</dt>
       *        <dd>The end of the billing cycle. This could be in the
       *        past if there are failed charges.
       *        </dd>
       *    <dt>premiumLockUntil</dt>
       *        <dd>An internal variable to manage locking operations
       *        on the commerce variables.
       *        </dd>
       *    <dt>updated</dt>
       *        <dd>The date any modification where made to this record.
       *        </dd>
       *    <dt>premiumSubscriptionNumber</dt>
       *        <dd>The number number identifying the
       *        recurring subscription used to make the recurring charges.
       *        </dd>
       *    <dt>lastRequestedCharge</dt>
       *        <dd>Date charge last attempted</dd>
       *    <dt>currency</dt>
       *        <dd>ISO 4217 currency code</dd>
       *    <dt>unitPrice</dt>
       *        <dd>charge in the smallest unit of the currency (e.g. cents for USD)</dd>
       *    <dt>businessId</dt>
       *        <dd><i>DEPRECATED:</i>See BusinessUserInfo.</dd>
       *    <dt>businessName</dt>
       *        <dd><i>DEPRECATED:</i>See BusinessUserInfo.</dd>
       *    <dt>businessRole</dt>
       *        <dd><i>DEPRECATED:</i>See BusinessUserInfo.</dd>
       *    <dt>unitDiscount</dt>
       *        <dd>discount per seat in negative amount and smallest unit of the currency (e.g. cents for USD)</dd>
       *    <dt>nextChargeDate</dt>
       *        <dd>The next time the user will be charged, may or may not be the same as nextPaymentDue</dd>
       *    </dl>
       */
  @js.native
  class Accounting () extends js.Object {
    def this(args: evernoteLib.Anon_PremiumServiceSKU) = this()
    var businessId: scala.Double = js.native
    var businessName: java.lang.String = js.native
    var businessRole: BusinessUserRole = js.native
    var currency: java.lang.String = js.native
    var lastFailedCharge: scala.Double = js.native
    var lastFailedChargeReason: java.lang.String = js.native
    var lastRequestedCharge: scala.Double = js.native
    var lastSuccessfulCharge: scala.Double = js.native
    var nextChargeDate: scala.Double = js.native
    var nextPaymentDue: scala.Double = js.native
    var premiumCommerceService: java.lang.String = js.native
    var premiumLockUntil: scala.Double = js.native
    var premiumOrderNumber: java.lang.String = js.native
    var premiumServiceSKU: java.lang.String = js.native
    var premiumServiceStart: scala.Double = js.native
    var premiumServiceStatus: PremiumOrderStatus = js.native
    var premiumSubscriptionNumber: java.lang.String = js.native
    var unitDiscount: scala.Double = js.native
    var unitPrice: scala.Double = js.native
    var updated: scala.Double = js.native
    var uploadLimit: scala.Double = js.native
    var uploadLimitEnd: scala.Double = js.native
    var uploadLimitNextMonth: scala.Double = js.native
  }
  
  /**
       *    When an authentication (or re-authentication) is performed, this structure
       *    provides the result to the client.
       * <dl>
       *    <dt>currentTime:</dt>
       *        <dd>
       *        The server-side date and time when this result was
       *        generated.
       *        </dd>
       *    <dt>authenticationToken:</dt>
       *        <dd>
       *        Holds an opaque, ASCII-encoded token that can be
       *        used by the client to perform actions on a NoteStore.
       *        </dd>
       *    <dt>expiration:</dt>
       *        <dd>
       *        Holds the server-side date and time when the
       *        authentication token will expire.
       *        This time can be compared to "currentTime" to produce an expiration
       *        time that can be reconciled with the client's local clock.
       *        </dd>
       *    <dt>user:</dt>
       *        <dd>
       *        Holds the information about the account which was
       *        authenticated if this was a full authentication.    May be absent if this
       *        particular authentication did not require user information.
       *        </dd>
       *    <dt>publicUserInfo:</dt>
       *        <dd>
       *        If this authentication result was achieved without full permissions to
       *        access the full User structure, this field may be set to give back
       *        a more limited public set of data.
       *        </dd>
       *    <dt>noteStoreUrl:</dt>
       *        <dd>
       *        This field will contain the full URL that clients should use to make
       *        NoteStore requests to the server shard that contains that user's data.
       *        I.e. this is the URL that should be used to create the Thrift HTTP client
       *        transport to send messages to the NoteStore service for the account.
       *        </dd>
       *    <dt>webApiUrlPrefix:</dt>
       *        <dd>
       *        This field will contain the initial part of the URLs that should be used
       *        to make requests to Evernote's thin client "web API", which provide
       *        optimized operations for clients that aren't capable of manipulating
       *        the full contents of accounts via the full Thrift data model. Clients
       *        should concatenate the relative path for the various servlets onto the
       *        end of this string to construct the full URL, as documented on our
       *        developer web site.
       *        </dd>
       *    <dt>secondFactorRequired:</dt>
       *        <dd>
       *        If set to true, this field indicates that the user has enabled two-factor
       *        authentication and must enter their second factor in order to complete
       *        authentication. In this case the value of authenticationResult will be
       *        a short-lived authentication token that may only be used to make a
       *        subsequent call to completeTwoFactorAuthentication.
       *        </dd>
       *    <dt>secondFactorDeliveryHint:</dt>
       *        <dd>
       *        When secondFactorRequired is set to true, this field may contain a string
       *        describing the second factor delivery method that the user has configured.
       *        This will typically be an obfuscated mobile device number, such as
       *        "(xxx) xxx-x095". This string can be displayed to the user to remind them
       *        how to obtain the required second factor.
       *        TODO do we need to differentiate between SMS and voice delivery?
       *        </dd>
       *    </dl>
       */
  @js.native
  class AuthenticationResult () extends js.Object {
    def this(args: evernoteLib.Anon_SecondFactorRequired) = this()
    var authenticationToken: java.lang.String = js.native
    var currentTime: scala.Double = js.native
    var expiration: scala.Double = js.native
    var noteStoreUrl: java.lang.String = js.native
    var publicUserInfo: PublicUserInfo = js.native
    var secondFactorDeliveryHint: java.lang.String = js.native
    var secondFactorRequired: scala.Boolean = js.native
    var user: User = js.native
    var webApiUrlPrefix: java.lang.String = js.native
  }
  
  /**
       *    This structure describes a collection of bootstrap profiles.
       * <dl>
       *    <dt>profiles:</dt>
       *        <dd>
       *        List of one or more bootstrap profiles, in descending
       *        preference order.
       *        </dd>
       *    </dl>
       */
  @js.native
  class BootstrapInfo () extends js.Object {
    def this(args: evernoteLib.Anon_Profiles) = this()
    var profiles: js.Array[BootstrapProfile] = js.native
  }
  
  /**
       *    This structure describes a collection of bootstrap settings.
       * <dl>
       *    <dt>name:</dt>
       *        <dd>
       *        The unique name of the profile, which is guaranteed to remain consistent across
       *        calls to getBootstrapInfo.
       *        </dd>
       *    <dt>settings:</dt>
       *        <dd>
       *        The settings for this profile.
       *        </dd>
       *    </dl>
       */
  @js.native
  class BootstrapProfile () extends js.Object {
    def this(args: evernoteLib.Anon_Name) = this()
    var name: java.lang.String = js.native
    var settings: BootstrapSettings = js.native
  }
  
  /**
       *    This structure describes a collection of bootstrap settings.
       * <dl>
       *    <dt>serviceHost:</dt>
       *        <dd>
       *        The hostname and optional port for composing Evernote web service URLs.
       *        This URL can be used to access the UserStore and related services,
       *        but must not be used to compose the NoteStore URL. Client applications
       *        must handle serviceHost values that include only the hostname
       *        (e.g. www.evernote.com) or both the hostname and port (e.g. www.evernote.com:8080).
       *        If no port is specified, or if port 443 is specified, client applications must
       *        use the scheme "https" when composing URLs. Otherwise, a client must use the
       *        scheme "http".
       *    </dd>
       *    <dt>marketingUrl:</dt>
       *        <dd>
       *        The URL stem for the Evernote corporate marketing website, e.g. http://www.evernote.com.
       *        This stem can be used to compose website URLs. For example, the URL of the Evernote
       *        Trunk is composed by appending "/about/trunk/" to the value of marketingUrl.
       *        </dd>
       *    <dt>supportUrl:</dt>
       *        <dd>
       *        The full URL for the Evernote customer support website, e.g. https://support.evernote.com.
       *        </dd>
       *    <dt>accountEmailDomain:</dt>
       *        <dd>
       *        The domain used for an Evernote user's incoming email address, which allows notes to
       *        be emailed into an account. E.g. m.evernote.com.
       *        </dd>
       *    <dt>enableFacebookSharing:</dt>
       *        <dd>
       *        Whether the client application should enable sharing of notes on Facebook.
       *        </dd>
       *    <dt>enableGiftSubscriptions:</dt>
       *        <dd>
       *        Whether the client application should enable gift subscriptions.
       *        </dd>
       *    <dt>enableSupportTickets:</dt>
       *        <dd>
       *        Whether the client application should enable in-client creation of support tickets.
       *        </dd>
       *    <dt>enableSharedNotebooks:</dt>
       *        <dd>
       *        Whether the client application should enable shared notebooks.
       *        </dd>
       *    <dt>enableSingleNoteSharing:</dt>
       *        <dd>
       *        Whether the client application should enable single note sharing.
       *        </dd>
       *    <dt>enableSponsoredAccounts:</dt>
       *        <dd>
       *        Whether the client application should enable sponsored accounts.
       *        </dd>
       *    <dt>enableTwitterSharing:</dt>
       *        <dd>
       *        Whether the client application should enable sharing of notes on Twitter.
       *        </dd>
       *    </dl>
       */
  @js.native
  class BootstrapSettings () extends js.Object {
    def this(args: evernoteLib.Anon_SupportUrl) = this()
    var accountEmailDomain: java.lang.String = js.native
    var enableFacebookSharing: scala.Boolean = js.native
    var enableGiftSubscriptions: scala.Boolean = js.native
    var enableLinkedInSharing: scala.Boolean = js.native
    var enablePublicNotebooks: scala.Boolean = js.native
    var enableSharedNotebooks: scala.Boolean = js.native
    var enableSingleNoteSharing: scala.Boolean = js.native
    var enableSponsoredAccounts: scala.Boolean = js.native
    var enableSupportTickets: scala.Boolean = js.native
    var enableTwitterSharing: scala.Boolean = js.native
    var marketingUrl: java.lang.String = js.native
    var serviceHost: java.lang.String = js.native
    var supportUrl: java.lang.String = js.native
  }
  
  /**
       * If a Notebook contained in an Evernote Business account has been published
       * the to business library, the Notebook will have a reference to one of these
       * structures, which specifies how the Notebook will be represented in the
       * library.
       *
       * <dl>
       * <dt>notebookDescription</dt>
       *     <dd>A short description of the notebook's content that will be displayed
       *             in the business library user interface. The description may not begin
       *             or end with whitespace.
       *     <br/>
       *     Length: EDAM_BUSINESS_NOTEBOOK_DESCRIPTION_LEN_MIN -
       *                     EDAM_BUSINESS_NOTEBOOK_DESCRIPTION_LEN_MAX
       *     <br/>
       *     Regex:    EDAM_BUSINESS_NOTEBOOK_DESCRIPTION_REGEX
       *     </dd>
       *
       * <dt>privilege</dt>
       *     <dd>The privileges that will be granted to users who join the notebook through
       *             the business library.
       *     </dd>
       *
       * <dt>recommended</dt>
       *     <dd>Whether the notebook should be "recommended" when displayed in the business
       *             library user interface.
       *     </dd>
       * </dl>
       */
  @js.native
  class BusinessNotebook () extends js.Object {
    def this(args: evernoteLib.Anon_Recommended) = this()
    var notebookDescription: java.lang.String = js.native
    var privilege: SharedNotebookPrivilegeLevel = js.native
    var recommended: scala.Boolean = js.native
  }
  
  /**
       * This structure is used to provide information about an Evernote Business
       * membership, for members who are part of a business.
       *
       * <dl>
       * <dt>businessId</dt>
       *     <dd>The ID of the Evernote Business account that the user is a member of.
       * <dt>businessName</dt>
       *     <dd>The human-readable name of the Evernote Business account that the user
       *             is a member of.</dd>
       * <dt>role</dt>
       *     <dd>The role of the user within the Evernote Business account that
       *             they are a member of.</dd>
       * <dt>email</dt>
       *     <dd>An e-mail address that will be used by the service in the context of your
       *             Evernote Business activities.    For example, this e-mail address will be used
       *             when you e-mail a business note, when you update notes in the account of
       *             your business, etc.    The business e-mail cannot be used for identification
       *             purposes such as for logging into the service.
       *     </dd>
       * </dl>
       */
  @js.native
  class BusinessUserInfo () extends js.Object {
    def this(args: evernoteLib.Anon_Role) = this()
    var businessId: scala.Double = js.native
    var businessName: java.lang.String = js.native
    var email: java.lang.String = js.native
    var role: BusinessUserRole = js.native
  }
  
  @js.native
  sealed trait BusinessUserRole extends js.Object
  
  @js.native
  class Client protected () extends js.Object {
    def this(config: ClientConfig) = this()
    def getNoteStore(): NoteStoreClient = js.native
    def getUserStore(): UserStoreClient = js.native
  }
  
  
  trait ClientConfig extends js.Object {
    var additionalHeaders: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
    var consumerKey: js.UndefOr[java.lang.String] = js.undefined
    var consumerSecret: js.UndefOr[java.lang.String] = js.undefined
    var sandbox: js.UndefOr[scala.Boolean] = js.undefined
    var secret: js.UndefOr[java.lang.String] = js.undefined
    var serviceHost: js.UndefOr[java.lang.String] = js.undefined
    var token: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /**
       * This structure is passed from clients to the Evernote service when they wish
       * to relay coarse-grained usage metrics to the service to help improve
       * products.
       *
       * <dl>
       *    <dt>sessions</dt>
       *    <dd>
       *        This field contains a count of the number of usage "sessions" that have
       *        occurred with this client which have not previously been reported to
       *        the service.
       *        A "session" is defined as one of the 96 fifteen-minute intervals of the
       *        day when someone used Evernote's interface at least once.
       *        So if a user interacts with an Evernote client at 12:18, 12:24, and 12:36,
       *        and then the client synchronizes at 12:39, it would report that there were
       *        two previously-unreported sessions (one session for the 12:15-12:30 time
       *        period, and one for the 12:30-12:45 period).
       *        If the user used Evernote again at 12:41 and synchronized at 12:43, it
       *        would not report any new sessions, because the 12:30-12:45 session had
       *        already been reported.
       *    </dd>
       * </dl>
       */
  @js.native
  class ClientUsageMetrics () extends js.Object {
    def this(args: evernoteLib.Anon_Sessions) = this()
    var sessions: scala.Double = js.native
  }
  
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
  @js.native
  class Data () extends js.Object {
    def this(args: evernoteLib.Anon_Size) = this()
    var body: java.lang.String = js.native
    var bodyHash: java.lang.String = js.native
    var size: scala.Double = js.native
  }
  
  @js.native
  sealed trait EDAMErrorCode extends js.Object
  
  /**
       * This exception is thrown by EDAM procedures when a caller asks to perform
       * an operation on an object that does not exist.    This may be thrown based on an invalid
       * primary identifier (e.g. a bad GUID), or when the caller refers to an object
       * by another unique identifier (e.g. a User's email address).
       *
       * identifier:    A description of the object that was not found on the server.
       *     For example, "Note.notebookGuid" when a caller attempts to create a note in a
       *     notebook that does not exist in the user's account.
       *
       * key:    The value passed from the client in the identifier, which was not
       *     found. For example, the GUID that was not found.
       */
  @js.native
  class EDAMNotFoundException ()
    extends thriftLib.thriftMod.ThriftNs.TException {
    def this(args: evernoteLib.Anon_Key) = this()
    var identifier: java.lang.String = js.native
    var key: java.lang.String = js.native
  }
  
  /**
       * This exception is thrown by EDAM procedures when a call fails as a result of
       * a problem in the service that could not be changed through caller action.
       *
       * errorCode:    The numeric code indicating the type of error that occurred.
       *     must be one of the values of EDAMErrorCode.
       *
       * message:    This may contain additional information about the error
       *
       * rateLimitDuration:    Indicates the minimum number of seconds that an application should
       *     expect subsequent API calls for this user to fail. The application should not retry
       *     API requests for the user until at least this many seconds have passed. Present only
       *     when errorCode is RATE_LIMIT_REACHED,
       */
  @js.native
  class EDAMSystemException ()
    extends thriftLib.thriftMod.ThriftNs.TException {
    def this(args: evernoteLib.Anon_ErrorCode) = this()
    var errorCode: EDAMErrorCode = js.native
    var rateLimitDuration: scala.Double = js.native
  }
  
  /**
       * This exception is thrown by EDAM procedures when a call fails as a result of
       * a problem that a caller may be able to resolve.    For example, if the user
       * attempts to add a note to their account which would exceed their storage
       * quota, this type of exception may be thrown to indicate the source of the
       * error so that they can choose an alternate action.
       *
       * This exception would not be used for internal system errors that do not
       * reflect user actions, but rather reflect a problem within the service that
       * the user cannot resolve.
       *
       * errorCode:    The numeric code indicating the type of error that occurred.
       *     must be one of the values of EDAMErrorCode.
       *
       * parameter:    If the error applied to a particular input parameter, this will
       *     indicate which parameter.
       */
  @js.native
  class EDAMUserException ()
    extends thriftLib.thriftMod.ThriftNs.TException {
    def this(args: evernoteLib.Anon_ErrorCodeParameter) = this()
    var errorCode: EDAMErrorCode = js.native
    var parameter: java.lang.String = js.native
  }
  
  /**
       * A structure that wraps a map of name/value pairs whose values are not
       * always present in the structure in order to reduce space when obtaining
       * batches of entities that contain the map.
       *
       * When the server provides the client with a LazyMap, it will fill in either
       * the keysOnly field or the fullMap field, but never both, based on the API
       * and parameters.
       *
       * When a client provides a LazyMap to the server as part of an update to
       * an object, the server will only update the LazyMap if the fullMap field is
       * set. If the fullMap field is not set, the server will not make any changes
       * to the map.
       *
       * Check the API documentation of the individual calls involving the LazyMap
       * for full details including the constraints of the names and values of the
       * map.
       *
       * <dl>
       * <dt>keysOnly</dt>
       *     <dd>The set of keys for the map.    This field is ignored by the
       *             server when set.
       *     </dd>
       *
       * <dt>fullMap</dt>
       *     <dd>The complete map, including all keys and values.
       *     </dd>
       * </dl>
       */
  @js.native
  class LazyMap () extends js.Object {
    def this(args: evernoteLib.Anon_FullMap) = this()
    var fullMap: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
    var keysOnly: js.Array[java.lang.String] = js.native
  }
  
  /**
       * A link in an users account that refers them to a public or individual share in
       * another user's account.
       *
       * <dl>
       * <dt>shareName</dt>
       * <dd>the display name of the shared notebook.
       *     The link owner can change this.</dd>
       *
       * <dt>username</dt>
       * <dd>the username of the user who owns the shared or public notebook</dd>
       *
       * <dt>shardId</dt>
       * <dd>the shard ID of the notebook if the notebook is not public</dt>
       *
       * <dt>shareKey</dt>
       * <dd>the secret key that provides access to the shared notebook</dd>
       *
       * <dt>uri</dt>
       * <dd>the identifier of the public notebook</dd>
       *
       * <dt>guid</dt>
       *     <dd>The unique identifier of this linked notebook.    Will be set whenever
       *     a linked notebook is retrieved from the service, but may be null when a client
       *     is creating a linked notebook.
       *     <br/>
       *     Length:    EDAM_GUID_LEN_MIN - EDAM_GUID_LEN_MAX
       *     <br/>
       *     Regex:    EDAM_GUID_REGEX
       *     </dd>
       *
       * <dt>updateSequenceNum</dt>
       *     <dd>A number identifying the last transaction to
       *     modify the state of this object.    The USN values are sequential within an
       *     account, and can be used to compare the order of modifications within the
       *     service.
       *     </dd>
       *
       * <dt>noteStoreUrl</dt>
       *     <dd>
       *     This field will contain the full URL that clients should use to make
       *     NoteStore requests to the server shard that contains that notebook's data.
       *     I.e. this is the URL that should be used to create the Thrift HTTP client
       *     transport to send messages to the NoteStore service for the account.
       *     </dd>
       *
       * <dt>webApiUrlPrefix:</dt>
       *     <dd>
       *     This field will contain the initial part of the URLs that should be used
       *     to make requests to Evernote's thin client "web API", which provide
       *     optimized operations for clients that aren't capable of manipulating
       *     the full contents of accounts via the full Thrift data model. Clients
       *     should concatenate the relative path for the various servlets onto the
       *     end of this string to construct the full URL, as documented on our
       *     developer web site.
       *     </dd>
       *
       * <dt>stack</dt>
       *     <dd>If this is set, then the notebook is visually contained within a stack
       *     of notebooks with this name.    All notebooks in the same account with the
       *     same 'stack' field are considered to be in the same stack.
       *     Notebooks with no stack set are "top level" and not contained within a
       *     stack.    The link owner can change this and this field is for the benefit
       *     of the link owner.
       *     </dd>
       *
       * <dt>businessId</dt>
       *     <dd>If set, this will be the unique identifier for the business that owns
       *     the notebook to which the linked notebook refers.
       *
       * </dl>
       */
  @js.native
  class LinkedNotebook () extends js.Object {
    def this(args: evernoteLib.Anon_GuidUsername) = this()
    var businessId: scala.Double = js.native
    var guid: java.lang.String = js.native
    var noteStoreUrl: java.lang.String = js.native
    var shardId: java.lang.String = js.native
    var shareKey: java.lang.String = js.native
    var shareName: java.lang.String = js.native
    var stack: java.lang.String = js.native
    var updateSequenceNum: scala.Double = js.native
    var uri: java.lang.String = js.native
    var username: java.lang.String = js.native
    var webApiUrlPrefix: java.lang.String = js.native
  }
  
  /**
       * Represents a single note in the user's account.
       *
       * <dl>
       * <dt>guid</dt>
       *     <dd>The unique identifier of this note.    Will be set by the
       *     server, but will be omitted by clients calling NoteStore.createNote()
       *     <br/>
       *     Length:    EDAM_GUID_LEN_MIN - EDAM_GUID_LEN_MAX
       *     <br/>
       *     Regex:    EDAM_GUID_REGEX
       *     </dd>
       *
       * <dt>title</dt>
       *     <dd>The subject of the note.    Can't begin or end with a space.
       *     <br/>
       *     Length:    EDAM_NOTE_TITLE_LEN_MIN - EDAM_NOTE_TITLE_LEN_MAX
       *     <br/>
       *     Regex:    EDAM_NOTE_TITLE_REGEX
       *     </dd>
       *
       * <dt>content</dt>
       *     <dd>The XHTML block that makes up the note.    This is
       *     the canonical form of the note's contents, so will include abstract
       *     Evernote tags for internal resource references.    A client may create
       *     a separate transformed version of this content for internal presentation,
       *     but the same canonical bytes should be used for transmission and
       *     comparison unless the user chooses to modify their content.
       *     <br/>
       *     Length:    EDAM_NOTE_CONTENT_LEN_MIN - EDAM_NOTE_CONTENT_LEN_MAX
       *     </dd>
       *
       * <dt>contentHash</dt>
       *     <dd>The binary MD5 checksum of the UTF-8 encoded content
       *     body. This will always be set by the server, but clients may choose to omit
       *     this when they submit a note with content.
       *     <br/>
       *     Length:    EDAM_HASH_LEN (exactly)
       *     </dd>
       *
       * <dt>contentLength</dt>
       *     <dd>The number of Unicode characters in the content of
       *     the note.    This will always be set by the service, but clients may choose
       *     to omit this value when they submit a Note.
       *     </dd>
       *
       * <dt>created</dt>
       *     <dd>The date and time when the note was created in one of the
       *     clients.    In most cases, this will match the user's sense of when
       *     the note was created, and ordering between notes will be based on
       *     ordering of this field.    However, this is not a "reliable" timestamp
       *     if a client has an incorrect clock, so it cannot provide a true absolute
       *     ordering between notes.    Notes created directly through the service
       *     (e.g. via the web GUI) will have an absolutely ordered "created" value.
       *     </dd>
       *
       * <dt>updated</dt>
       *     <dd>The date and time when the note was last modified in one of
       *     the clients.    In most cases, this will match the user's sense of when
       *     the note was modified, but this field may not be absolutely reliable
       *     due to the possibility of client clock errors.
       *     </dd>
       *
       * <dt>deleted</dt>
       *     <dd>If present, the note is considered "deleted", and this
       *     stores the date and time when the note was deleted by one of the clients.
       *     In most cases, this will match the user's sense of when the note was
       *     deleted, but this field may be unreliable due to the possibility of
       *     client clock errors.
       *     </dd>
       *
       * <dt>active</dt>
       *     <dd>If the note is available for normal actions and viewing,
       *     this flag will be set to true.
       *     </dd>
       *
       * <dt>updateSequenceNum</dt>
       *     <dd>A number identifying the last transaction to
       *     modify the state of this note (including changes to the note's attributes
       *     or resources).    The USN values are sequential within an account,
       *     and can be used to compare the order of modifications within the service.
       *     </dd>
       *
       * <dt>notebookGuid</dt>
       *     <dd>The unique identifier of the notebook that contains
       *     this note.    If no notebookGuid is provided on a call to createNote(), the
       *     default notebook will be used instead.
       *     <br/>
       *     Length:    EDAM_GUID_LEN_MIN - EDAM_GUID_LEN_MAX
       *     <br/>
       *     Regex:    EDAM_GUID_REGEX
       *     </dd>
       *
       * <dt>tagGuids</dt>
       *     <dd>A list of the GUID identifiers for tags that are applied to this note.
       *     This may be provided in a call to createNote() to unambiguously
       *     the tags that should be assigned to the new note.    Alternately, clients
       *     may pass the names of desired tags via the 'tagNames' field during
       *     note creation.
       *     If the list of tags are omitted on a call to createNote(), then
       *     the server will assume that no changes have been made to the resources.
       *     Maximum:    EDAM_NOTE_TAGS_MAX tags per note
       *     </dd>
       *
       * <dt>resources</dt>
       *     <dd>The list of resources that are embedded within this note.
       *     If the list of resources are omitted on a call to updateNote(), then
       *     the server will assume that no changes have been made to the resources.
       *     The binary contents of the resources must be provided when the resource
       *     is first sent to the service, but it will be omitted by the service when
       *     the Note is returned in the future.
       *     Maximum:    EDAM_NOTE_RESOURCES_MAX resources per note
       *     </dd>
       *
       * <dt>attributes</dt>
       *     <dd>A list of the attributes for this note.
       *     If the list of attributes are omitted on a call to updateNote(), then
       *     the server will assume that no changes have been made to the resources.
       *     </dd>
       *
       * <dt>tagNames</dt>
       *     <dd>May be provided by clients during calls to createNote() as an
       *     alternative to providing the tagGuids of existing tags.    If any tagNames
       *     are provided during createNote(), these will be found, or created if they
       *     don't already exist.    Created tags will have no parent (they will be at
       *     the top level of the tag panel).
       *     </dd>
       * </dl>
       */
  @js.native
  class Note () extends js.Object {
    def this(args: evernoteLib.Anon_Guid) = this()
    var active: scala.Boolean = js.native
    var attributes: NoteAttributes = js.native
    var content: java.lang.String = js.native
    var contentHash: java.lang.String = js.native
    var contentLength: scala.Double = js.native
    var created: scala.Double = js.native
    var deleted: scala.Double = js.native
    var guid: java.lang.String = js.native
    var notebookGuid: java.lang.String = js.native
    var resources: js.Array[Resource] = js.native
    var tagGuids: js.Array[java.lang.String] = js.native
    var tagNames: js.Array[java.lang.String] = js.native
    var title: java.lang.String = js.native
    var updateSequenceNum: scala.Double = js.native
    var updated: scala.Double = js.native
  }
  
  /**
       * The list of optional attributes that can be stored on a note.
       * <dl>
       * <dt>subjectDate</dt>
       *     <dd>time that the note refers to
       *     </dd>
       *
       * <dt>latitude</dt>
       *     <dd>the latitude where the note was taken
       *     </dd>
       *
       * <dt>longitude</dt>
       *     <dd>the longitude where the note was taken
       *     </dd>
       *
       * <dt>altitude</dt>
       *     <dd>the altitude where the note was taken
       *     </dd>
       *
       * <dt>author</dt>
       *     <dd>the author of the content of the note
       *     <br/>
       *     Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX
       *     </dd>
       *
       * <dt>source</dt>
       *     <dd>the method that the note was added to the account, if the
       *     note wasn't directly authored in an Evernote desktop client.
       *     <br/>
       *     Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX
       *     </dd>
       *
       * <dt>sourceURL</dt>
       *     <dd>the original location where the resource was hosted. For web clips,
       *     this will be the URL of the page that was clipped.
       *     <br/>
       *     Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX
       *     </dd>
       *
       * <dt>sourceApplication</dt>
       *     <dd>an identifying string for the application that
       *     created this note.    This string does not have a guaranteed syntax or
       *     structure -- it is intended for human inspection and tracking.
       *     <br/>
       *     Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX
       *     </dd>
       *
       * <dt>shareDate</dt>
       *    <dd>The date and time when this note was directly shared via its own URL.
       *    This is only set on notes that were individually shared - it is independent
       *    of any notebook-level sharing of the containing notebook. This field
       *    is treated as "read-only" for clients; the server will ignore changes
       *    to this field from an external client.
       *    </dd>
       *
       * <dt>reminderOrder</dt>
       * <dd>The set of notes with this parameter set are considered
       * "reminders" and are to be treated specially by clients to give them
       * higher UI prominence within a notebook.    The value is used to sort
       * the reminder notes within the notebook with higher values
       * representing greater prominence.    Outside of the context of a
       * notebook, the value of this parameter is undefined.    The value is
       * not intended to be compared to the values of reminder notes in
       * other notebooks.    In order to allow clients to place a note at a
       * higher precedence than other notes, you should never set a value
       * greater than the current time (as defined for a Timetstamp). To
       * place a note at higher precedence than existing notes, set the
       * value to the current time as defined for a timestamp (milliseconds
       * since the epoch).    Synchronizing clients must remember the time when
       * the update was performed, using the local clock on the client,
       * and use that value when they later upload the note to the service.
       * Clients must not set the reminderOrder to the reminderTime as the
       * reminderTime could be in the future.    Those two fields are never
       * intended to be related.    The correct value for reminderOrder field
       * for new notes is the "current" time when the user indicated that
       * the note is a reminder.    Clients may implement a separate
       * "sort by date" feature to show notes ordered by reminderTime.
       * Whenever a reminderDoneTime or reminderTime is set but a
       * reminderOrder is not set, the server will fill in the current
       * server time for the reminderOrder field.</dd>
       *
       * <dt>reminderDoneTime</dt>
       * <dd>The date and time when a user dismissed/"marked done" the reminder
       * on the note.    Users typically do not manually set this value directly
       * as it is set to the time when the user dismissed/"marked done" the
       * reminder.</dd>
       *
       * <dt>reminderTime</dt>
       * <dd>The date and time a user has selected to be reminded of the note.
       * A note with this value set is known as a "reminder" and the user can
       * be reminded, via e-mail or client-specific notifications, of the note
       * when the time is reached or about to be reached.    When a user sets
       * a reminder time on a note that has a reminder done time, and that
       * reminder time is in the future, then the reminder done time should be
       * cleared.    This should happen regardless of any existing reminder time
       * that may have previously existed on the note.</dd>
       *
       * <dt>placeName</dt>
       * <dd>Allows the user to assign a human-readable location name associated
       * with a note. Users may assign values like 'Home' and 'Work'. Place
       * names may also be populated with values from geonames database
       * (e.g., a restaurant name). Applications are encouraged to normalize values
       * so that grouping values by place name provides a useful result. Applications
       * MUST NOT automatically add place name values based on geolocation without
       * confirmation from the user; that is, the value in this field should be
       * more useful than a simple automated lookup based on the note's latitude
       * and longitude.</dd>
       *
       * <dt>contentClass</dt>
       * <dd>The class (or type) of note. This field is used to indicate to
       * clients that special structured information is represented within
       * the note such that special rules apply when making
       * modifications. If contentClass is set and the client
       * application does not specifically support the specified class,
       * the client MUST treat the note as read-only. In this case, the
       * client MAY modify the note's notebook and tags via the
       * Note.notebookGuid and Note.tagGuids fields.    The client MAY also
       * modify the reminderOrder field as well as the reminderTime and
       * reminderDoneTime fields.
       * <p>Applications should set contentClass only when they are creating notes
       * that contain structured information that needs to be maintained in order
       * for the user to be able to use the note within that application.
       * Setting contentClass makes a note read-only in other applications, so
       * there is a trade-off when an application chooses to use contentClass.
       * Applications that set contentClass when creating notes must use a contentClass
       * string of the form <i>CompanyName.ApplicationName</i> to ensure uniqueness.</p>
       * Length restrictions: EDAM_NOTE_CONTENT_CLASS_LEN_MIN, EDAM_NOTE_CONTENT_CLASS_LEN_MAX
       * <br/>
       * Regex: EDAM_NOTE_CONTENT_CLASS_REGEX
       * </dd>
       *
       * <dt>applicationData</dt>
       * <dd>Provides a location for applications to store a relatively small
       * (4kb) blob of data that is not meant to be visible to the user and
       * that is opaque to the Evernote service. A single application may use at most
       * one entry in this map, using its API consumer key as the map key. See the
       * documentation for LazyMap for a description of when the actual map values
       * are returned by the service.
       * <p>To safely add or modify your application's entry in the map, use
       * NoteStore.setNoteApplicationDataEntry. To safely remove your application's
       * entry from the map, use NoteStore.unsetNoteApplicationDataEntry.</p>
       * Minimum length of a name (key): EDAM_APPLICATIONDATA_NAME_LEN_MIN
       * <br/>
       * Sum max size of key and value: EDAM_APPLICATIONDATA_ENTRY_LEN_MAX
       * <br/>
       * Syntax regex for name (key): EDAM_APPLICATIONDATA_NAME_REGEX
       * </dd>
       *
       * <dt>creatorId</dt>
       * <dd>The numeric user ID of the user who originally created the note.</dd>
       *
       * <dt>lastEditedBy</dt>
       * <dd>An indication of who made the last change to the note.    If you are
       * accessing the note via a shared notebook to which you have modification
       * rights, or if you are the owner of the notebook to which the note belongs,
       * then you have access to the value.    In this case, the value will be
       * unset if the owner of the notebook containing the note was the last to
       * make the modification, else it will be a string describing the
       * guest who made the last edit.    If you do not have access to this value,
       * it will be left unset.    This field is read-only by clients.    The server
       * will ignore all values set by clients into this field.</dd>
       *
       * <dt>lastEditorId</dt>
       * <dd>The numeric user ID of the user described in lastEditedBy.</dd>
       *
       * <dt>classifications</dt>
       * <dd>A map of classifications applied to the note by clients or by the
       * Evernote service. The key is the string name of the classification type,
       * and the value is a constant that begins with CLASSIFICATION_.</dd>
       *
       * </dl>
       */
  @js.native
  class NoteAttributes () extends js.Object {
    def this(args: evernoteLib.Anon_ApplicationDataAltitude) = this()
    var altitude: scala.Double = js.native
    var applicationData: LazyMap = js.native
    var author: java.lang.String = js.native
    var classifications: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
    var contentClass: java.lang.String = js.native
    var creatorId: scala.Double = js.native
    var lastEditedBy: java.lang.String = js.native
    var lastEditorId: scala.Double = js.native
    var latitude: scala.Double = js.native
    var longitude: scala.Double = js.native
    var placeName: java.lang.String = js.native
    var reminderDoneTime: scala.Double = js.native
    var reminderOrder: scala.Double = js.native
    var reminderTime: scala.Double = js.native
    var shareDate: scala.Double = js.native
    var source: java.lang.String = js.native
    var sourceApplication: java.lang.String = js.native
    var sourceURL: java.lang.String = js.native
    var subjectDate: scala.Double = js.native
  }
  
  /**
       *    A data structure representing the number of notes for each notebook
       *    and tag with a non-zero set of applicable notes.
       *
       * <dl>
       *    <dt>notebookCounts</dt>
       *        <dd>
       *        A mapping from the Notebook GUID to the number of
       *        notes (from some selection) that are in the corresponding notebook.
       *        </dd>
       *
       *    <dt>tagCounts</dt>
       *        <dd>
       *        A mapping from the Tag GUID to the number of notes (from some
       *        selection) that have the corresponding tag.
       *        </dd>
       *
       *    <dt>trashCount</dt>
       *        <dd>
       *        If this is set, then this is the number of notes that are in the trash.
       *        If this is not set, then the number of notes in the trash hasn't been
       *        reported.    (I.e. if there are no notes in the trash, this will be set
       *        to 0.)
       *        </dd>
       *    </dl>
       */
  @js.native
  class NoteCollectionCounts () extends js.Object {
    def this(args: evernoteLib.Anon_TrashCount) = this()
    var notebookCounts: org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
    var tagCounts: org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
    var trashCount: scala.Double = js.native
  }
  
  /**
       * Parameters that must be given to the NoteStore emailNote call. These allow
       * the caller to specify the note to send, the recipient addresses, etc.
       *
       * <dl>
       *    <dt>guid</dt>
       *        <dd>
       *            If set, this must be the GUID of a note within the user's account that
       *            should be retrieved from the service and sent as email.    If not set,
       *            the 'note' field must be provided instead.
       *        </dd>
       *
       *    <dt>note</dt>
       *        <dd>
       *            If the 'guid' field is not set, this field must be provided, including
       *            the full contents of the note note (and all of its Resources) to send.
       *            This can be used for a Note that as not been created in the service,
       *            for example by a local client with local notes.
       *        </dd>
       *
       *    <dt>toAddresses</dt>
       *        <dd>
       *            If provided, this should contain a list of the SMTP email addresses
       *            that should be included in the "To:" line of the email.
       *            Callers must specify at least one "to" or "cc" email address.
       *        </dd>
       *
       *    <dt>ccAddresses</dt>
       *        <dd>
       *            If provided, this should contain a list of the SMTP email addresses
       *            that should be included in the "Cc:" line of the email.
       *            Callers must specify at least one "to" or "cc" email address.
       *        </dd>
       *
       *    <dt>subject</dt>
       *        <dd>
       *            If provided, this should contain the subject line of the email that
       *            will be sent.    If not provided, the title of the note will be used
       *            as the subject of the email.
       *        </dd>
       *
       *    <dt>message</dt>
       *        <dd>
       *            If provided, this is additional personal text that should be included
       *            into the email as a message from the owner to the recipient(s).
       *        </dd>
       * </dl>
       */
  @js.native
  class NoteEmailParameters () extends js.Object {
    def this(args: evernoteLib.Anon_Subject) = this()
    var ccAddresses: js.Array[java.lang.String] = js.native
    var guid: java.lang.String = js.native
    var message: java.lang.String = js.native
    var note: Note = js.native
    var subject: java.lang.String = js.native
    var toAddresses: js.Array[java.lang.String] = js.native
  }
  
  /**
       *    A list of criteria that are used to indicate which notes are desired from
       *    the account.    This is used in queries to the NoteStore to determine
       *    which notes should be retrieved.
       *
       * <dl>
       *    <dt>order</dt>
       *        <dd>
       *        The NoteSortOrder value indicating what criterion should be
       *        used to sort the results of the filter.
       *        </dd>
       *
       *    <dt>ascending</dt>
       *        <dd>
       *        If true, the results will be ascending in the requested
       *        sort order.    If false, the results will be descending.
       *        </dd>
       *
       *    <dt>words</dt>
       *        <dd>
       *        If present, a search query string that will filter the set of notes to be returned.
       *        Accepts the full search grammar documented in the Evernote API Overview.
       *        </dd>
       *
       *    <dt>notebookGuid</dt>
       *        <dd>
       *        If present, the Guid of the notebook that must contain
       *        the notes.
       *        </dd>
       *
       *    <dt>tagGuids</dt>
       *        <dd>
       *        If present, the list of tags (by GUID) that must be present
       *        on the notes.
       *        </dd>
       *
       *    <dt>timeZone</dt>
       *        <dd>
       *        The zone ID for the user, which will be used to interpret
       *        any dates or times in the queries that do not include their desired zone
       *        information.
       *        For example, if a query requests notes created "yesterday", this
       *        will be evaluated from the provided time zone, if provided.
       *        The format must be encoded as a standard zone ID such as
       *        "America/Los_Angeles".
       *        </dd>
       *
       *    <dt>inactive</dt>
       *        <dd>
       *        If true, then only notes that are not active (i.e. notes in
       *        the Trash) will be returned. Otherwise, only active notes will be returned.
       *        There is no way to find both active and inactive notes in a single query.
       *        </dd>
       *
       *    <dt>emphasized</dt>
       *        <dd>
       *        If present, a search query string that may or may not influence the notes
       *        to be returned, both in terms of coverage as well as of order. Think of it
       *        as a wish list, not a requirement.
       *        Accepts the full search grammar documented in the Evernote API Overview.
       *        </dd>
       *    </dl>
       */
  @js.native
  class NoteFilter () extends js.Object {
    def this(args: evernoteLib.Anon_NotebookGuid) = this()
    var ascending: scala.Boolean = js.native
    var emphasized: java.lang.String = js.native
    var inactive: scala.Boolean = js.native
    var notebookGuid: java.lang.String = js.native
    var order: scala.Double = js.native
    var tagGuids: js.Array[java.lang.String] = js.native
    var timeZone: java.lang.String = js.native
    var words: java.lang.String = js.native
  }
  
  /**
       *    A small structure for returning a list of notes out of a larger set.
       *
       * <dl>
       *    <dt>startIndex</dt>
       *        <dd>
       *        The starting index within the overall set of notes.    This
       *        is also the number of notes that are "before" this list in the set.
       *        </dd>
       *
       *    <dt>totalNotes</dt>
       *        <dd>
       *        The number of notes in the larger set.    This can be used
       *        to calculate how many notes are "after" this note in the set.
       *        (I.e.    remaining = totalNotes - (startIndex + notes.length)    )
       *        </dd>
       *
       *    <dt>notes</dt>
       *        <dd>
       *        The list of notes from this range.    The Notes will include all
       *        metadata (attributes, resources, etc.), but will not include the ENML
       *        content of the note or the binary contents of any resources.
       *        </dd>
       *
       *    <dt>stoppedWords</dt>
       *        <dd>
       *        If the NoteList was produced using a text based search
       *        query that included words that are not indexed or searched by the service,
       *        this will include a list of those ignored words.
       *        </dd>
       *
       *    <dt>searchedWords</dt>
       *        <dd>
       *        If the NoteList was produced using a text based search
       *        query that included viable search words or quoted expressions, this will
       *        include a list of those words.    Any stopped words will not be included
       *        in this list.
       *        </dd>
       *
       *    <dt>updateCount</dt>
       *        <dd>
       *        Indicates the total number of transactions that have
       *        been committed within the account.    This reflects (for example) the
       *        number of discrete additions or modifications that have been made to
       *        the data in this account (tags, notes, resources, etc.).
       *        This number is the "high water mark" for Update Sequence Numbers (USN)
       *        within the account.
       *        </dd>
       *    </dl>
       */
  @js.native
  class NoteList () extends js.Object {
    def this(args: evernoteLib.Anon_TotalNotesSearchedWords) = this()
    var notes: js.Array[Note] = js.native
    var searchedWords: js.Array[java.lang.String] = js.native
    var startIndex: scala.Double = js.native
    var stoppedWords: js.Array[java.lang.String] = js.native
    var totalNotes: scala.Double = js.native
    var updateCount: scala.Double = js.native
  }
  
  /**
       * This structure is used in the set of results returned by the
       * findNotesMetadata function.    It represents the high-level information about
       * a single Note, without some of the larger deep structure.    This allows
       * for the information about a list of Notes to be returned relatively quickly
       * with less marshalling and data transfer to remote clients.
       * Most fields in this structure are identical to the corresponding field in
       * the Note structure, with the exception of:
       *
       * <dl>
       * <dt>largestResourceMime</dt>
       *     <dd>If set, then this will contain the MIME type of the largest Resource
       *     (in bytes) within the Note.    This may be useful, for example, to choose
       *     an appropriate icon or thumbnail to represent the Note.
       *     </dd>
       *
       * <dt>largestResourceSize</dt>
       *    <dd>If set, this will contain the size of the largest Resource file, in
       *    bytes, within the Note.    This may be useful, for example, to decide whether
       *    to ask the server for a thumbnail to represent the Note.
       *    </dd>
       * </dl>
       */
  @js.native
  class NoteMetadata () extends js.Object {
    def this(args: evernoteLib.Anon_GuidContentLength) = this()
    var attributes: NoteAttributes = js.native
    var contentLength: scala.Double = js.native
    var created: scala.Double = js.native
    var deleted: scala.Double = js.native
    var guid: java.lang.String = js.native
    var largestResourceMime: java.lang.String = js.native
    var largestResourceSize: scala.Double = js.native
    var notebookGuid: java.lang.String = js.native
    var tagGuids: js.Array[java.lang.String] = js.native
    var title: java.lang.String = js.native
    var updateSequenceNum: scala.Double = js.native
    var updated: scala.Double = js.native
  }
  
  @js.native
  sealed trait NoteSortOrder extends js.Object
  
  @js.native
  class NoteStoreClient () extends js.Object {
    var seqid: scala.Double = js.native
    /**
             * Asks the service to produce an authentication token that can be used to
             * access the contents of a single Note which was individually shared
             * from someone's account.
             * This authenticationToken can be used with the various other NoteStore
             * calls to find and retrieve the Note and its directly-referenced children.
             *
             * @param guid
             *     The GUID identifying this Note on this shard.
             *
             * @param noteKey
             *     The 'noteKey' identifier from the Note that was originally created via
             *     a call to shareNote() and then given to a recipient to access.
             *
             * @param authenticationToken
             *     An optional authenticationToken that identifies the user accessing the
             *     shared note. This parameter may be required to access some shared notes.
             *
             * @throws EDAMUserException <ul>
             *     <li> PERMISSION_DENIED "Note" - the Note with that GUID is either not
             *         shared, or the noteKey doesn't match the current key for this note
             *     </li>
             *     <li> PERMISSION_DENIED "authenticationToken" - an authentication token is
             *         required to access this Note, but either no authentication token or a
             *         "non-owner" authentication token was provided.
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "guid" - the note with that GUID is not found
             *     </li>
             * </ul>
             *
             * @throws EDAMSystemException <ul>
             *     <li> TAKEN_DOWN "Note" - The specified shared note is taken down (for
             *         all requesters).
             *     </li>
             *     <li> TAKEN_DOWN "Country" - The specified shared note is taken down
             *         for the requester because of an IP-based country lookup.
             *     </ul>
             * </ul>
             */
    def authenticateToSharedNote(guid: java.lang.String, noteKey: java.lang.String, cb: Callback[AuthenticationResult]): scala.Unit = js.native
    /**
             * Asks the service to produce an authentication token that can be used to
             * access the contents of a shared notebook from someone else's account.
             * This authenticationToken can be used with the various other NoteStore
             * calls to find and retrieve notes, and if the permissions in the shared
             * notebook are sufficient, to make changes to the contents of the notebook.
             *
             * @param shareKey
             *     The 'shareKey' identifier from the SharedNotebook that was granted to
             *     some recipient.    This string internally encodes the notebook identifier
             *     and a security signature.
             *
             * @param authenticationToken
             *     If a non-empty string is provided, this is the full user-based
             *     authentication token that identifies the user who is currently logged in
             *     and trying to access the shared notebook.    This may be required if the
             *     notebook was created with 'requireLogin'.
             *     If this string is empty, the service will attempt to authenticate to the
             *     shared notebook without any logged in user.
             *
             * @throws EDAMSystemException <ul>
             *     <li> BAD_DATA_FORMAT "shareKey" - invalid shareKey string
             *     </li>
             *     <li> INVALID_AUTH "shareKey" - bad signature on shareKey string
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "SharedNotebook.id" - the shared notebook no longer exists
             *     </li>
             * </ul>
             *
             * @throws EDAMUserException <ul>
             *     <li> DATA_REQUIRED "authenticationToken" - the share requires login, and
             *                    no valid authentication token was provided.
             *     </li>
             *     <li> PERMISSION_DENIED "SharedNotebook.username" - share requires login,
             *                    and another username has already been bound to this notebook.
             *     </li>
             * </ul>
             */
    def authenticateToSharedNotebook(shareKey: java.lang.String, cb: Callback[AuthenticationResult]): scala.Unit = js.native
    /**
             * Performs a deep copy of the Note with the provided GUID 'noteGuid' into
             * the Notebook with the provided GUID 'toNotebookGuid'.
             * The caller must be the owner of both the Note and the Notebook.
             * This creates a new Note in the destination Notebook with new content and
             * Resources that match all of the content and Resources from the original
             * Note, but with new GUID identifiers.
             * The original Note is not modified by this operation.
             * The copied note is considered as an "upload" for the purpose of upload
             * transfer limit calculation, so its size is added to the upload count for
             * the owner.
             *
             * @param noteGuid
             *     The GUID of the Note to copy.
             *
             * @param toNotebookGuid
             *     The GUID of the Notebook that should receive the new Note.
             *
             * @return
             *     The metadata for the new Note that was created.    This will include the
             *     new GUID for this Note (and any copied Resources), but will not include
             *     the content body or the binary bodies of any Resources.
             *
             * @throws EDAMUserException <ul>
             *     <li> LIMIT_REACHED "Note" - at max number per account
             *     </li>
             *     <li> PERMISSION_DENIED "Notebook.guid" - destination not owned by user
             *     </li>
             *     <li> PERMISSION_DENIED "Note" - user doesn't own
             *     </li>
             *     <li> QUOTA_REACHED "Accounting.uploadLimit" - note exceeds upload quota
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Notebook.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def copyNote(noteGuid: java.lang.String, toNotebookGuid: java.lang.String, cb: Callback[Note]): scala.Unit = js.native
    /**
             * Asks the service to make a linked notebook with the provided name, username
             * of the owner and identifiers provided. A linked notebook can be either a
             * link to a public notebook or to a private shared notebook.
             *
             * @param linkedNotebook
             *     The desired fields for the linked notebook must be provided on this
             *     object.    The name of the linked notebook must be set. Either a username
             *     uri or a shard id and share key must be provided otherwise a
             *     EDAMUserException is thrown.
             *
             * @return
             *     The newly created LinkedNotebook.    The server-side id will be
             *     saved in this object's 'id' field.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "LinkedNotebook.name" - invalid length or pattern
             *     </li>
             *     <li> BAD_DATA_FORMAT "LinkedNotebook.username" - bad username format
             *     </li>
             *     <li> BAD_DATA_FORMAT "LinkedNotebook.uri" -
             *         if public notebook set but bad uri
             *     </li>
             *     <li> BAD_DATA_FORMAT "LinkedNotebook.shareKey" -
             *         if private notebook set but bad shareKey
             *     </li>
             *     <li> DATA_REQUIRED "LinkedNotebook.shardId" -
             *         if private notebook but shard id not provided
             *     </li>
             * </ul>
             */
    def createLinkedNotebook(linkedNotebook: LinkedNotebook, cb: Callback[LinkedNotebook]): scala.Unit = js.native
    /**
             * Asks the service to make a note with the provided set of information.
             *
             * @param note
             *     A Note object containing the desired fields to be populated on
             *     the service.
             *
             * @return
             *     The newly created Note from the service.    The server-side
             *     GUIDs for the Note and any Resources will be saved in this object.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Note.title" - invalid length or pattern
             *     </li>
             *     <li> BAD_DATA_FORMAT "Note.content" - invalid length for ENML content
             *     </li>
             *     <li> BAD_DATA_FORMAT "Resource.mime" - invalid resource MIME type
             *     </li>
             *     <li> BAD_DATA_FORMAT "NoteAttributes.*" - bad resource string
             *     </li>
             *     <li> BAD_DATA_FORMAT "ResourceAttributes.*" - bad resource string
             *     </li>
             *     <li> DATA_CONFLICT "Note.deleted" - deleted time set on active note
             *     </li>
             *     <li> DATA_REQUIRED "Resource.data" - resource data body missing
             *     </li>
             *     <li> ENML_VALIDATION "*" - note content doesn't validate against DTD
             *     </li>
             *     <li> LIMIT_REACHED "Note" - at max number per account
             *     </li>
             *     <li> LIMIT_REACHED "Note.size" - total note size too large
             *     </li>
             *     <li> LIMIT_REACHED "Note.resources" - too many resources on Note
             *     </li>
             *     <li> LIMIT_REACHED "Note.tagGuids" - too many Tags on Note
             *     </li>
             *     <li> LIMIT_REACHED "Resource.data.size" - resource too large
             *     </li>
             *     <li> LIMIT_REACHED "NoteAttribute.*" - attribute string too long
             *     </li>
             *     <li> LIMIT_REACHED "ResourceAttribute.*" - attribute string too long
             *     </li>
             *     <li> PERMISSION_DENIED "Note.notebookGuid" - NB not owned by user
             *     </li>
             *     <li> QUOTA_REACHED "Accounting.uploadLimit" - note exceeds upload quota
             *     </li>
             *     <li> BAD_DATA_FORMAT "Tag.name" - Note.tagNames was provided, and one
             *         of the specified tags had an invalid length or pattern
             *     </li>
             *     <li> LIMIT_REACHED "Tag" - Note.tagNames was provided, and the required
             *         new tags would exceed the maximum number per account
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Note.notebookGuid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def createNote(note: Note, cb: Callback[Note]): scala.Unit = js.native
    /**
             * Asks the service to make a notebook with the provided name.
             *
             * @param notebook
             *     The desired fields for the notebook must be provided on this
             *     object.    The name of the notebook must be set, and either the 'active'
             *     or 'defaultNotebook' fields may be set by the client at creation.
             *     If a notebook exists in the account with the same name (via
             *     case-insensitive compare), this will throw an EDAMUserException.
             *
             * @return
             *     The newly created Notebook.    The server-side GUID will be
             *     saved in this object's 'guid' field.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Notebook.name" - invalid length or pattern
             *     </li>
             *     <li> BAD_DATA_FORMAT "Notebook.stack" - invalid length or pattern
             *     </li>
             *     <li> BAD_DATA_FORMAT "Publishing.uri" - if publishing set but bad uri
             *     </li>
             *     <li> BAD_DATA_FORMAT "Publishing.publicDescription" - if too long
             *     </li>
             *     <li> DATA_CONFLICT "Notebook.name" - name already in use
             *     </li>
             *     <li> DATA_CONFLICT "Publishing.uri" - if URI already in use
             *     </li>
             *     <li> DATA_REQUIRED "Publishing.uri" - if publishing set but uri missing
             *     </li>
             *     <li> LIMIT_REACHED "Notebook" - at max number of notebooks
             *     </li>
             * </ul>
             */
    def createNotebook(notebook: Notebook, cb: Callback[Notebook]): scala.Unit = js.native
    /**
             * Asks the service to make a saved search with a set of information.
             *
             * @param search
             *     The desired list of fields for the search are specified in this
             *     object. The caller must specify the name and query for the
             *     search, and may optionally specify a search scope.
             *     The SavedSearch.format field is ignored by the service.
             *
             * @return
             *     The newly created SavedSearch.    The server-side GUID will be
             *     saved in this object.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "SavedSearch.name" - invalid length or pattern
             *     </li>
             *     <li> BAD_DATA_FORMAT "SavedSearch.query" - invalid length
             *     </li>
             *     <li> DATA_CONFLICT "SavedSearch.name" - name already in use
             *     </li>
             *     <li> LIMIT_REACHED "SavedSearch" - at max number of searches
             *     </li>
             * </ul>
             */
    def createSearch(search: SavedSearch, cb: Callback[SavedSearch]): scala.Unit = js.native
    /**
             * Used to construct a shared notebook object. The constructed notebook will
             * contain a "share key" which serve as a unique identifer and access token
             * for a user to access the notebook of the shared notebook owner.
             *
             * @param sharedNotebook
             *     A shared notebook object populated with the email address of the share
             *     recipient, the notebook guid and the access permissions. All other
             *     attributes of the shared object are ignored. The SharedNotebook.allowPreview
             *     field must be explicitly set with either a true or false value.
             *
             * @return
             *     The fully populated SharedNotebook object including the server assigned
             *     share id and shareKey which can both be used to uniquely identify the
             *     SharedNotebook.
             *
             * @throws EDAMUserException <ul>
             *     <li>BAD_DATA_FORMAT "SharedNotebook.email" - if the email was not valid</li>
             *     <li>BAD_DATA_FORMAT "requireLogin" - if the SharedNotebook.allowPreview field was
             *             not set, and the SharedNotebook.requireLogin was also not set or was set to
             *             false.</li>
             *     <li>PERMISSION_DENIED "SharedNotebook.recipientSettings" - if
             *             recipientSettings is set in the sharedNotebook.    Only the recipient
             *             can set these values via the setSharedNotebookRecipientSettings
             *             method.
             *     </li>
             *     </ul>
             * @throws EDAMNotFoundException <ul>
             *     <li>Notebook.guid - if the notebookGuid is not a valid GUID for the user.
             *     </li>
             *     </ul>
             */
    def createSharedNotebook(sharedNotebook: SharedNotebook, cb: Callback[SharedNotebook]): scala.Unit = js.native
    /**
             * Asks the service to make a tag with a set of information.
             *
             * @param tag
             *     The desired list of fields for the tag are specified in this
             *     object.    The caller must specify the tag name, and may provide
             *     the parentGUID.
             *
             * @return
             *     The newly created Tag.    The server-side GUID will be
             *     saved in this object.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Tag.name" - invalid length or pattern
             *     </li>
             *     <li> BAD_DATA_FORMAT "Tag.parentGuid" - malformed GUID
             *     </li>
             *     <li> DATA_CONFLICT "Tag.name" - name already in use
             *     </li>
             *     <li> LIMIT_REACHED "Tag" - at max number of tags
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Tag.parentGuid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def createTag(tag: Tag, cb: Callback[Tag]): scala.Unit = js.native
    /**
             * Moves the note into the trash. The note may still be undeleted, unless it
             * is expunged.    This is equivalent to calling updateNote() after setting
             * Note.active = false
             *
             * @param guid
             *     The GUID of the note to delete.
             *
             * @return
             *     The Update Sequence Number for this change within the account.
             *
             * @throws EDAMUserException <ul>
             *     <li> PERMISSION_DENIED "Note" - user doesn't have permission to
             *                    update the note.
             *     </li>
             * </ul>
             *
             * @throws EDAMUserException <ul>
             *     <li> DATA_CONFLICT "Note.guid" - the note is already deleted
             *     </li>
             * </ul>
             * @throws EDAMNotFoundException <ul>
             *     <li> "Note.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def deleteNote(guid: java.lang.String, cb: Callback[scala.Double]): scala.Unit = js.native
    /**
             * Attempts to send a single note to one or more email recipients.
             * <p/>
             * NOTE: This function is generally not available to third party applications.
             * Calls will result in an EDAMUserException with the error code
             * PERMISSION_DENIED.
             *
             * @param authenticationToken
             *        The note will be sent as the user logged in via this token, using that
             *        user's registered email address.    If the authenticated user doesn't
             *        have permission to read that note, the emailing will fail.
             *
             * @param parameters
             *        The note must be specified either by GUID (in which case it will be
             *        sent using the existing data in the service), or else the full Note
             *        must be passed to this call.    This also specifies the additional
             *        email fields that will be used in the email.
             *
             * @throws EDAMUserException <ul>
             *     <li> LIMIT_REACHED "NoteEmailParameters.toAddresses" -
             *         The email can't be sent because this would exceed the user's daily
             *         email limit.
             *     </li>
             *     <li> BAD_DATA_FORMAT "(email address)" -
             *         email address malformed
             *     </li>
             *     <li> DATA_REQUIRED "NoteEmailParameters.toAddresses" -
             *         if there are no To: or Cc: addresses provided.
             *     </li>
             *     <li> DATA_REQUIRED "Note.title" -
             *         if the caller provides a Note parameter with no title
             *     </li>
             *     <li> DATA_REQUIRED "Note.content" -
             *         if the caller provides a Note parameter with no content
             *     </li>
             *     <li> ENML_VALIDATION "*" - note content doesn't validate against DTD
             *     </li>
             *     <li> DATA_REQUIRED "NoteEmailParameters.note" -
             *         if no guid or note provided
             *     </li>
             *     <li> PERMISSION_DENIED "Note" - private note, user doesn't own
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Note.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def emailNote(parameters: NoteEmailParameters, cb: Callback[scala.Unit]): scala.Unit = js.native
    /**
             * Permanently removes all of the Notes that are currently marked as
             * inactive.    This is equivalent to "emptying the trash", and these Notes
             * will be gone permanently.
             * <p/>
             * This operation may be relatively slow if the account contains a large
             * number of inactive Notes.
             * <p/>
             * NOTE: This function is not available to third party applications.
             * Calls will result in an EDAMUserException with the error code
             * PERMISSION_DENIED.
             *
             * @return
             *        The number of notes that were expunged.
             */
    def expungeInactiveNotes(cb: Callback[scala.Double]): scala.Unit = js.native
    /**
             * Permanently expunges the linked notebook from the account.
             * <p/>
             * NOTE: This function is generally not available to third party applications.
             * Calls will result in an EDAMUserException with the error code
             * PERMISSION_DENIED.
             *
             * @param guid
             *     The LinkedNotebook.guid field of the LinkedNotebook to permanently remove
             *     from the account.
             */
    def expungeLinkedNotebook(guid: java.lang.String, cb: Callback[scala.Double]): scala.Unit = js.native
    /**
             * Permanently removes a Note, and all of its Resources,
             * from the service.
             * <p/>
             * NOTE: This function is not available to third party applications.
             * Calls will result in an EDAMUserException with the error code
             * PERMISSION_DENIED.
             *
             * @param guid
             *     The GUID of the note to delete.
             *
             * @return
             *     The Update Sequence Number for this change within the account.
             *
             * @throws EDAMUserException <ul>
             *     <li> PERMISSION_DENIED "Note" - user doesn't own
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Note.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def expungeNote(guid: java.lang.String, cb: Callback[scala.Double]): scala.Unit = js.native
    /**
             * Permanently removes the notebook from the user's account.
             * After this action, the notebook is no longer available for undeletion, etc.
             * If the notebook contains any Notes, they will be moved to the current
             * default notebook and moved into the trash (i.e. Note.active=false).
             * <p/>
             * NOTE: This function is generally not available to third party applications.
             * Calls will result in an EDAMUserException with the error code
             * PERMISSION_DENIED.
             *
             * @param guid
             *     The GUID of the notebook to delete.
             *
             * @return
             *     The Update Sequence Number for this change within the account.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Notebook.guid" - if the parameter is missing
             *     </li>
             *     <li> LIMIT_REACHED "Notebook" - trying to expunge the last Notebook
             *     </li>
             *     <li> PERMISSION_DENIED "Notebook" - private notebook, user doesn't own
             *     </li>
             * </ul>
             */
    def expungeNotebook(guid: java.lang.String, cb: Callback[scala.Double]): scala.Unit = js.native
    /**
             * Permanently removes a list of Notes, and all of their Resources, from
             * the service.    This should be invoked with a small number of Note GUIDs
             * (e.g. 100 or less) on each call.    To expunge a larger number of notes,
             * call this method multiple times.    This should also be used to reduce the
             * number of Notes in a notebook before calling expungeNotebook() or
             * in the trash before calling expungeInactiveNotes(), since these calls may
             * be prohibitively slow if there are more than a few hundred notes.
             * If an exception is thrown for any of the GUIDs, then none of the notes
             * will be deleted.    I.e. this call can be treated as an atomic transaction.
             * <p/>
             * NOTE: This function is not available to third party applications.
             * Calls will result in an EDAMUserException with the error code
             * PERMISSION_DENIED.
             *
             * @param noteGuids
             *     The list of GUIDs for the Notes to remove.
             *
             * @return
             *     The account's updateCount at the end of this operation
             *
             * @throws EDAMUserException <ul>
             *     <li> PERMISSION_DENIED "Note" - user doesn't own
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Note.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def expungeNotes(noteGuids: js.Array[java.lang.String], cb: Callback[scala.Double]): scala.Unit = js.native
    /**
             * Permanently deletes the saved search with the provided GUID, if present.
             * <p/>
             * NOTE: This function is generally not available to third party applications.
             * Calls will result in an EDAMUserException with the error code
             * PERMISSION_DENIED.
             *
             * @param guid
             *     The GUID of the search to delete.
             *
             * @return
             *     The Update Sequence Number for this change within the account.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "SavedSearch.guid" - if the guid parameter is empty
             *     </li>
             *     <li> PERMISSION_DENIED "SavedSearch" - user doesn't own
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "SavedSearch.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def expungeSearch(guid: java.lang.String, cb: Callback[scala.Double]): scala.Unit = js.native
    /**
             * Expunges the SharedNotebooks in the user's account using the
             * SharedNotebook.id as the identifier.
             * <p/>
             * NOTE: This function is generally not available to third party applications.
             * Calls will result in an EDAMUserException with the error code
             * PERMISSION_DENIED.
             *
             * @param
             *     sharedNotebookIds - a list of ShardNotebook.id longs identifying the
             *             objects to delete permanently.
             *
             * @return
             *     The account's update sequence number.
             */
    def expungeSharedNotebooks(sharedNotebookIds: js.Array[scala.Double], cb: Callback[scala.Double]): scala.Unit = js.native
    /**
             * Permanently deletes the tag with the provided GUID, if present.
             * <p/>
             * NOTE: This function is generally not available to third party applications.
             * Calls will result in an EDAMUserException with the error code
             * PERMISSION_DENIED.
             *
             * @param guid
             *     The GUID of the tag to delete.
             *
             * @return
             *     The Update Sequence Number for this change within the account.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Tag.guid" - if the guid parameter is missing
             *     </li>
             *     <li> PERMISSION_DENIED "Tag" - user doesn't own tag
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Tag.guid" - tag not found, by GUID
             *     </li>
             * </ul>
             */
    def expungeTag(guid: java.lang.String, cb: Callback[scala.Double]): scala.Unit = js.native
    /**
             * This function is used to determine how many notes are found for each
             * notebook and tag in the user's account, given a current set of filter
             * parameters that determine the current selection.    This function will
             * return a structure that gives the note count for each notebook and tag
             * that has at least one note under the requested filter.    Any notebook or
             * tag that has zero notes in the filtered set will not be listed in the
             * reply to this function (so they can be assumed to be 0).
             *
             * @param authenticationToken
             *     Must be a valid token for the user's account unless the NoteFilter
             *     'notebookGuid' is the GUID of a public notebook.
             *
             * @param filter
             *     The note selection filter that is currently being applied.    The note
             *     counts are to be calculated with this filter applied to the total set
             *     of notes in the user's account.
             *
             * @param withTrash
             *     If true, then the NoteCollectionCounts.trashCount will be calculated
             *     and supplied in the reply. Otherwise, the trash value will be omitted.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "NoteFilter.notebookGuid" - if malformed
             *     </li>
             *     <li> BAD_DATA_FORMAT "NoteFilter.notebookGuids" - if any are malformed
             *     </li>
             *     <li> BAD_DATA_FORMAT "NoteFilter.words" - if search string too long
             *     </li>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Notebook.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def findNoteCounts(filter: NoteFilter, withTrash: scala.Boolean, cb: Callback[NoteCollectionCounts]): scala.Unit = js.native
    /**
             * Finds the position of a note within a sorted subset of all of the user's
             * notes. This may be useful for thin clients that are displaying a paginated
             * listing of a large account, which need to know where a particular note
             * sits in the list without retrieving all notes first.
             *
             * @param authenticationToken
             *     Must be a valid token for the user's account unless the NoteFilter
             *     'notebookGuid' is the GUID of a public notebook.
             *
             * @param filter
             *     The list of criteria that will constrain the notes to be returned.
             *
             * @param guid
             *     The GUID of the note to be retrieved.
             *
             * @return
             *     If the note with the provided GUID is found within the matching note
             *     list, this will return the offset of that note within that list (where
             *     the first offset is 0).    If the note is not found within the set of
             *     notes, this will return -1.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "offset" - not between 0 and EDAM_USER_NOTES_MAX
             *     </li>
             *     <li> BAD_DATA_FORMAT "maxNotes" - not between 0 and EDAM_USER_NOTES_MAX
             *     </li>
             *     <li> BAD_DATA_FORMAT "NoteFilter.notebookGuid" - if malformed
             *     </li>
             *     <li> BAD_DATA_FORMAT "NoteFilter.tagGuids" - if any are malformed
             *     </li>
             *     <li> BAD_DATA_FORMAT "NoteFilter.words" - if search string too long
             *     </li>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Notebook.guid" - not found, by GUID
             *     </li>
             *     <li> "Note.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def findNoteOffset(filter: NoteFilter, guid: java.lang.String, cb: Callback[scala.Double]): scala.Unit = js.native
    /**
             * DEPRECATED. Use findNotesMetadata.
             */
    def findNotes(filter: NoteFilter, offset: scala.Double, maxNotes: scala.Double, cb: Callback[NoteList]): scala.Unit = js.native
    /**
             * Used to find the high-level information about a set of the notes from a
             * user's account based on various criteria specified via a NoteFilter object.
             * <p/>
             * Web applications that wish to periodically check for new content in a user's
             * Evernote account should consider using webhooks instead of polling this API.
             * See http://dev.evernote.com/documentation/cloud/chapters/polling_notification.php
             * for more information.
             *
             * @param authenticationToken
             *     Must be a valid token for the user's account unless the NoteFilter
             *     'notebookGuid' is the GUID of a public notebook.
             *
             * @param filter
             *     The list of criteria that will constrain the notes to be returned.
             *
             * @param offset
             *     The numeric index of the first note to show within the sorted
             *     results.    The numbering scheme starts with "0".    This can be used for
             *     pagination.
             *
             * @param maxNotes
             *     The mximum notes to return in this query.    The service will return a set
             *     of notes that is no larger than this number, but may return fewer notes
             *     if needed.    The NoteList.totalNotes field in the return value will
             *     indicate whether there are more values available after the returned set.
             *
             * @param resultSpec
             *     This specifies which information should be returned for each matching
             *     Note. The fields on this structure can be used to eliminate data that
             *     the client doesn't need, which will reduce the time and bandwidth
             *     to receive and process the reply.
             *
             * @return
             *     The list of notes that match the criteria.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "offset" - not between 0 and EDAM_USER_NOTES_MAX
             *     </li>
             *     <li> BAD_DATA_FORMAT "maxNotes" - not between 0 and EDAM_USER_NOTES_MAX
             *     </li>
             *     <li> BAD_DATA_FORMAT "NoteFilter.notebookGuid" - if malformed
             *     </li>
             *     <li> BAD_DATA_FORMAT "NoteFilter.tagGuids" - if any are malformed
             *     </li>
             *     <li> BAD_DATA_FORMAT "NoteFilter.words" - if search string too long
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Notebook.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def findNotesMetadata(
      filter: NoteFilter,
      offset: scala.Double,
      maxNotes: scala.Double,
      resultSpec: NotesMetadataResultSpec,
      cb: Callback[NotesMetadataList]
    ): scala.Unit = js.native
    /**
             * Identify related entities on the service, such as notes,
             * notebooks, and tags related to notes or content.
             *
             * @param query
             *     The information about which we are finding related entities.
             *
             * @param resultSpec
             *     Allows the client to indicate the type and quantity of
             *     information to be returned, allowing a saving of time and
             *     bandwidth.
             *
             * @return
             *     The result of the query, with information considered
             *     to likely be relevantly related to the information
             *     described by the query.
             *
             * @throws EDAMUserException <ul>
             *     <li>BAD_DATA_FORMAT "RelatedQuery.plainText" - If you provided a
             *         a zero-length plain text value.
             *     </li>
             *     <li>BAD_DATA_FORMAT "RelatedQuery.noteGuid" - If you provided an
             *         invalid Note GUID, that is, one that does not match the constraints
             *         defined by EDAM_GUID_LEN_MIN, EDAM_GUID_LEN_MAX, EDAM_GUID_REGEX.
             *     </li>
             *     <li> BAD_DATA_FORMAT "NoteFilter.notebookGuid" - if malformed
             *     </li>
             *     <li> BAD_DATA_FORMAT "NoteFilter.tagGuids" - if any are malformed
             *     </li>
             *     <li> BAD_DATA_FORMAT "NoteFilter.words" - if search string too long
             *     </li>
             *     <li>PERMISSION_DENIED "Note" - If the caller does not have access to
             *         the note identified by RelatedQuery.noteGuid.
             *     </li>
             *     <li>DATA_REQUIRED "RelatedResultSpec" - If you did not not set any values
             *         in the result spec.
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li>"RelatedQuery.noteGuid" - the note with that GUID is not
             *         found, if that field has been set in the query.
             *     </li>
             * </ul>
             */
    def findRelated(query: RelatedQuery, resultSpec: RelatedResultSpec, cb: Callback[RelatedResult]): scala.Unit = js.native
    /**
             * Returns the notebook that should be used to store new notes in the
             * user's account when no other notebooks are specified.
             */
    def getDefaultNotebook(cb: Callback[Notebook]): scala.Unit = js.native
    /**
             * Asks the NoteStore to provide the state of the account in order of
             * last modification.    This request retrieves one block of the server's
             * state so that a client can make several small requests against a large
             * account rather than getting the entire state in one big message.
             * This call gives fine-grained control of the data that will
             * be received by a client by omitting data elements that a client doesn't
             * need. This may reduce network traffic and sync times.
             *
             * @param afterUSN
             *     The client can pass this value to ask only for objects that
             *     have been updated after a certain point.    This allows the client to
             *     receive updates after its last checkpoint rather than doing a full
             *     synchronization on every pass.    The default value of "0" indicates
             *     that the client wants to get objects from the start of the account.
             *
             * @param maxEntries
             *     The maximum number of modified objects that should be
             *     returned in the result SyncChunk.    This can be used to limit the size
             *     of each individual message to be friendly for network transfer.
             *
             * @param filter
             *     The caller must set some of the flags in this structure to specify which
             *     data types should be returned during the synchronization.    See
             *     the SyncChunkFilter structure for information on each flag.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "afterUSN" - if negative
             *     </li>
             *     <li> BAD_DATA_FORMAT "maxEntries" - if less than 1
             *     </li>
             * </ul>
             */
    def getFilteredSyncChunk(afterUSN: scala.Double, maxEntries: scala.Double, filter: SyncChunkFilter, cb: Callback[SyncState]): scala.Unit = js.native
    /**
             * Asks the NoteStore to provide information about the contents of a linked
             * notebook that has been shared with the caller, or that is public to the
             * world.
             * This will return a result that is similar to getSyncChunk, but will only
             * contain entries that are visible to the caller.    I.e. only that particular
             * Notebook will be visible, along with its Notes, and Tags on those Notes.
             *
             * This function must be called on the shard that owns the referenced
             * notebook.    (I.e. the shardId in /shard/shardId/edam/note must be the
             * same as LinkedNotebook.shardId.)
             *
             * @param authenticationToken
             *     This should be an authenticationToken for the guest who has received
             *     the invitation to the share.    (I.e. this should not be the result of
             *     NoteStore.authenticateToSharedNotebook)
             *
             * @param linkedNotebook
             *     This structure should contain identifying information and permissions
             *     to access the notebook in question.    This must contain the valid fields
             *     for either a shared notebook (e.g. shareKey)
             *     or a public notebook (e.g. username, uri)
             *
             * @param afterUSN
             *     The client can pass this value to ask only for objects that
             *     have been updated after a certain point.    This allows the client to
             *     receive updates after its last checkpoint rather than doing a full
             *     synchronization on every pass.    The default value of "0" indicates
             *     that the client wants to get objects from the start of the account.
             *
             * @param maxEntries
             *     The maximum number of modified objects that should be
             *     returned in the result SyncChunk.    This can be used to limit the size
             *     of each individual message to be friendly for network transfer.
             *     Applications should not request more than 256 objects at a time,
             *     and must handle the case where the service returns less than the
             *     requested number of objects in a given request even though more
             *     objects are available on the service.
             *
             * @param fullSyncOnly
             *     If true, then the client only wants initial data for a full sync.
             *     In this case, the service will not return any expunged objects,
             *     and will not return any Resources, since these are also provided
             *     in their corresponding Notes.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "afterUSN" - if negative
             *     </li>
             *     <li> BAD_DATA_FORMAT "maxEntries" - if less than 1
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "LinkedNotebook" - if the provided information doesn't match any
             *         valid notebook
             *     </li>
             *     <li> "LinkedNotebook.uri" - if the provided public URI doesn't match any
             *         valid notebook
             *     </li>
             *     <li> "SharedNotebook.id" - if the provided information indicates a
             *            shared notebook that no longer exists
             *     </li>
             * </ul>
             */
    def getLinkedNotebookSyncChunk(
      linkedNotebook: LinkedNotebook,
      afterUSN: scala.Double,
      maxEntries: scala.Double,
      fullSyncOnly: scala.Boolean,
      cb: Callback[SyncChunk]
    ): scala.Unit = js.native
    /**
             * Asks the NoteStore to provide information about the status of a linked
             * notebook that has been shared with the caller, or that is public to the
             * world.
             * This will return a result that is similar to getSyncState, but may omit
             * SyncState.uploaded if the caller doesn't have permission to write to
             * the linked notebook.
             *
             * This function must be called on the shard that owns the referenced
             * notebook.    (I.e. the shardId in /shard/shardId/edam/note must be the
             * same as LinkedNotebook.shardId.)
             *
             * @param authenticationToken
             *     This should be an authenticationToken for the guest who has received
             *     the invitation to the share.    (I.e. this should not be the result of
             *     NoteStore.authenticateToSharedNotebook)
             *
             * @param linkedNotebook
             *     This structure should contain identifying information and permissions
             *     to access the notebook in question.
             */
    def getLinkedNotebookSyncState(linkedNotebook: LinkedNotebook, cb: Callback[SyncState]): scala.Unit = js.native
    /**
             * Returns the current state of the note in the service with the provided
             * GUID.    The ENML contents of the note will only be provided if the
             * 'withContent' parameter is true.    The service will include the meta-data
             * for each resource in the note, but the binary contents of the resources
             * and their recognition data will be omitted.
             * If the Note is found in a public notebook, the authenticationToken
             * will be ignored (so it could be an empty string).    The applicationData
             * fields are returned as keysOnly.
             *
             * @param guid
             *     The GUID of the note to be retrieved.
             *
             * @param withContent
             *     If true, the note will include the ENML contents of its
             *     'content' field.
             *
             * @param withResourcesData
             *     If true, any Resource elements in this Note will include the binary
             *     contents of their 'data' field's body.
             *
             * @param withResourcesRecognition
             *     If true, any Resource elements will include the binary contents of the
             *     'recognition' field's body if recognition data is present.
             *
             * @param withResourcesAlternateData
             *     If true, any Resource elements in this Note will include the binary
             *     contents of their 'alternateData' fields' body, if an alternate form
             *     is present.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Note.guid" - if the parameter is missing
             *     </li>
             *     <li> PERMISSION_DENIED "Note" - private note, user doesn't own
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Note.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def getNote(
      guid: java.lang.String,
      withContent: scala.Boolean,
      withResourcesData: scala.Boolean,
      withResourcesRecognition: scala.Boolean,
      withResourcesAlternateData: scala.Boolean,
      cb: Callback[Note]
    ): scala.Unit = js.native
    /**
             * Get all of the application data for the note identified by GUID,
             * with values returned within the LazyMap fullMap field.
             * If there are no applicationData entries, then a LazyMap
             * with an empty fullMap will be returned. If your application
             * only needs to fetch its own applicationData entry, use
             * getNoteApplicationDataEntry instead.
             */
    def getNoteApplicationData(guid: java.lang.String, cb: Callback[LazyMap]): scala.Unit = js.native
    /**
             * Get the value of a single entry in the applicationData map
             * for the note identified by GUID.
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Note.guid" - note not found, by GUID</li>
             *     <li> "NoteAttributes.applicationData.key" - note not found, by key</li>
             * </ul>
             */
    def getNoteApplicationDataEntry(guid: java.lang.String, key: java.lang.String, cb: Callback[java.lang.String]): scala.Unit = js.native
    /**
             * Returns XHTML contents of the note with the provided GUID.
             * If the Note is found in a public notebook, the authenticationToken
             * will be ignored (so it could be an empty string).
             *
             * @param guid
             *     The GUID of the note to be retrieved.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Note.guid" - if the parameter is missing
             *     </li>
             *     <li> PERMISSION_DENIED "Note" - private note, user doesn't own
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Note.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def getNoteContent(guid: java.lang.String, cb: Callback[java.lang.String]): scala.Unit = js.native
    /**
             * Returns a block of the extracted plain text contents of the note with the
             * provided GUID.    This text can be indexed for search purposes by a light
             * client that doesn't have capabilities to extract all of the searchable
             * text content from the note and its resources.
             *
             * If the Note is found in a public notebook, the authenticationToken
             * will be ignored (so it could be an empty string).
             *
             * @param guid
             *     The GUID of the note to be retrieved.
             *
             * @param noteOnly
             *     If true, this will only return the text extracted from the ENML contents
             *     of the note itself.    If false, this will also include the extracted text
             *     from any text-bearing resources (PDF, recognized images)
             *
             * @param tokenizeForIndexing
             *     If true, this will break the text into cleanly separated and sanitized
             *     tokens.    If false, this will return the more raw text extraction, with
             *     its original punctuation, capitalization, spacing, etc.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Note.guid" - if the parameter is missing
             *     </li>
             *     <li> PERMISSION_DENIED "Note" - private note, user doesn't own
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Note.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def getNoteSearchText(
      guid: java.lang.String,
      noteOnly: scala.Boolean,
      tokenizeForIndexing: scala.Boolean,
      cb: Callback[java.lang.String]
    ): scala.Unit = js.native
    /**
             * Returns a list of the names of the tags for the note with the provided
             * guid.    This can be used with authentication to get the tags for a
             * user's own note, or can be used without valid authentication to retrieve
             * the names of the tags for a note in a public notebook.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Note.guid" - if the parameter is missing
             *     </li>
             *     <li> PERMISSION_DENIED "Note" - private note, user doesn't own
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Note.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def getNoteTagNames(guid: java.lang.String, cb: Callback[js.Array[java.lang.String]]): scala.Unit = js.native
    /**
             * This can be used to retrieve a previous version of a Note after it has been
             * updated within the service.    The caller must identify the note (via its
             * guid) and the version (via the updateSequenceNumber of that version).
             * to find a listing of the stored version USNs for a note, call
             * listNoteVersions.
             * This call is only available for notes in Premium accounts.    (I.e. access
             * to past versions of Notes is a Premium-only feature.)
             *
             * @param noteGuid
             *     The GUID of the note to be retrieved.
             *
             * @param updateSequenceNum
             *     The USN of the version of the note that is being retrieved
             *
             * @param withResourcesData
             *     If true, any Resource elements in this Note will include the binary
             *     contents of their 'data' field's body.
             *
             * @param withResourcesRecognition
             *     If true, any Resource elements will include the binary contents of the
             *     'recognition' field's body if recognition data is present.
             *
             * @param withResourcesAlternateData
             *     If true, any Resource elements in this Note will include the binary
             *     contents of their 'alternateData' fields' body, if an alternate form
             *     is present.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Note.guid" - if the parameter is missing
             *     </li>
             *     <li> PERMISSION_DENIED "Note" - private note, user doesn't own
             *     </li>
             *     <li> PERMISSION_DENIED "updateSequenceNum" -
             *         The account isn't permitted to access previous versions of notes.
             *         (i.e. this is a Free account.)
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Note.guid" - not found, by GUID
             *     </li>
             *     <li> "Note.updateSequenceNumber" - the Note doesn't have a version with
             *            the corresponding USN.
             *     </li>
             * </ul>
             */
    def getNoteVersion(
      noteGuid: java.lang.String,
      updateSequenceNum: scala.Double,
      withResourcesData: scala.Boolean,
      withResourcesRecognition: scala.Boolean,
      withResourcesAlternateData: scala.Boolean,
      cb: Callback[Note]
    ): scala.Unit = js.native
    /**
             * Returns the current state of the notebook with the provided GUID.
             * The notebook may be active or deleted (but not expunged).
             *
             * @param guid
             *     The GUID of the notebook to be retrieved.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Notebook.guid" - if the parameter is missing
             *     </li>
             *     <li> PERMISSION_DENIED "Notebook" - private notebook, user doesn't own
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Notebook.guid" - tag not found, by GUID
             *     </li>
             * </ul>
             */
    def getNotebook(guid: java.lang.String, cb: Callback[Notebook]): scala.Unit = js.native
    /**
             * <p>
             * Looks for a user account with the provided userId on this NoteStore
             * shard and determines whether that account contains a public notebook
             * with the given URI.    If the account is not found, or no public notebook
             * exists with this URI, this will throw an EDAMNotFoundException,
             * otherwise this will return the information for that Notebook.
             * </p>
             * <p>
             * If a notebook is visible on the web with a full URL like
             * http://www.evernote.com/pub/sethdemo/api
             * Then 'sethdemo' is the username that can be used to look up the userId,
             * and 'api' is the publicUri.
             * </p>
             *
             * @param userId
             *        The numeric identifier for the user who owns the public notebook.
             *        To find this value based on a username string, you can invoke
             *        UserStore.getPublicUserInfo
             *
             * @param publicUri
             *        The uri string for the public notebook, from Notebook.publishing.uri.
             *
             * @throws EDAMNotFoundException <ul>
             *     <li>"Publishing.uri" - not found, by URI</li>
             * </ul>
             *
             * @throws EDAMSystemException <ul>
             *     <li> TAKEN_DOWN "PublicNotebook" - The specified public notebook is
             *         taken down (for all requesters).</li>
             *     <li> TAKEN_DOWN "Country" - The specified public notebook is taken
             *         down for the requester because of an IP-based country lookup.</li>
             * </ul>
             */
    def getPublicNotebook(userId: scala.Double, publicUri: java.lang.String, cb: Callback[Notebook]): scala.Unit = js.native
    /**
             * Returns the current state of the resource in the service with the
             * provided GUID.
             * If the Resource is found in a public notebook, the authenticationToken
             * will be ignored (so it could be an empty string).    Only the
             * keys for the applicationData will be returned.
             *
             * @param guid
             *     The GUID of the resource to be retrieved.
             *
             * @param withData
             *     If true, the Resource will include the binary contents of the
             *     'data' field's body.
             *
             * @param withRecognition
             *     If true, the Resource will include the binary contents of the
             *     'recognition' field's body if recognition data is present.
             *
             * @param withAttributes
             *     If true, the Resource will include the attributes
             *
             * @param withAlternateData
             *     If true, the Resource will include the binary contents of the
             *     'alternateData' field's body, if an alternate form is present.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Resource.guid" - if the parameter is missing
             *     </li>
             *     <li> PERMISSION_DENIED "Resource" - private resource, user doesn't own
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Resource.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def getResource(
      guid: java.lang.String,
      withData: scala.Boolean,
      withRecognition: scala.Boolean,
      withAttributes: scala.Boolean,
      withAlternateData: scala.Boolean,
      cb: Callback[Resource]
    ): scala.Unit = js.native
    /**
             * If the Resource with the provided GUID has an alternate data representation
             * (indicated via the Resource.alternateData field), then this request can
             * be used to retrieve the binary contents of that alternate data file.
             * If the caller asks about a resource that has no alternate data form, this
             * will throw EDAMNotFoundException.
             *
             * @param guid
             *        The GUID of the resource whose recognition data should be retrieved.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Resource.guid" - if the parameter is missing
             *     </li>
             *     <li> PERMISSION_DENIED "Resource" - private resource, user doesn't own
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Resource.guid" - not found, by GUID
             *     </li>
             *     <li> "Resource.alternateData" - resource has no recognition
             *     </li>
             * </ul>
             */
    def getResourceAlternateData(guid: java.lang.String, cb: Callback[java.lang.String]): scala.Unit = js.native
    /**
             * Get all of the application data for the Resource identified by GUID,
             * with values returned within the LazyMap fullMap field.
             * If there are no applicationData entries, then a LazyMap
             * with an empty fullMap will be returned. If your application
             * only needs to fetch its own applicationData entry, use
             * getResourceApplicationDataEntry instead.
             */
    def getResourceApplicationData(guid: java.lang.String, cb: Callback[LazyMap]): scala.Unit = js.native
    /**
             * Get the value of a single entry in the applicationData map
             * for the Resource identified by GUID.
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Resource.guid" - Resource not found, by GUID</li>
             *     <li> "ResourceAttributes.applicationData.key" - Resource not found, by key</li>
             * </ul>
             */
    def getResourceApplicationDataEntry(guid: java.lang.String, key: java.lang.String, cb: Callback[java.lang.String]): scala.Unit = js.native
    /**
             * Returns the set of attributes for the Resource with the provided GUID.
             * If the Resource is found in a public notebook, the authenticationToken
             * will be ignored (so it could be an empty string).
             *
             * @param guid
             *     The GUID of the resource whose attributes should be retrieved.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Resource.guid" - if the parameter is missing
             *     </li>
             *     <li> PERMISSION_DENIED "Resource" - private resource, user doesn't own
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Resource.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def getResourceAttributes(guid: java.lang.String, cb: Callback[ResourceAttributes]): scala.Unit = js.native
    /**
             * Returns the current state of a resource, referenced by containing
             * note GUID and resource content hash.
             *
             * @param noteGuid
             *     The GUID of the note that holds the resource to be retrieved.
             *
             * @param contentHash
             *     The MD5 checksum of the resource within that note. Note that
             *     this is the binary checksum, for example from Resource.data.bodyHash,
             *     and not the hex-encoded checksum that is used within an en-media
             *     tag in a note body.
             *
             * @param withData
             *     If true, the Resource will include the binary contents of the
             *     'data' field's body.
             *
             * @param withRecognition
             *     If true, the Resource will include the binary contents of the
             *     'recognition' field's body.
             *
             * @param withAlternateData
             *     If true, the Resource will include the binary contents of the
             *     'alternateData' field's body, if an alternate form is present.
             *
             * @throws EDAMUserException <ul>
             *     <li> DATA_REQUIRED "Note.guid" - noteGuid param missing
             *     </li>
             *     <li> DATA_REQUIRED "Note.contentHash" - contentHash param missing
             *     </li>
             *     <li> PERMISSION_DENIED "Resource" - private resource, user doesn't own
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Note" - not found, by guid
             *     </li>
             *     <li> "Resource" - not found, by hash
             *     </li>
             * </ul>
             */
    def getResourceByHash(
      noteGuid: java.lang.String,
      contentHash: java.lang.String,
      withData: scala.Boolean,
      withRecognition: scala.Boolean,
      withAlternateData: scala.Boolean,
      cb: Callback[Resource]
    ): scala.Unit = js.native
    /**
             * Returns binary data of the resource with the provided GUID.    For
             * example, if this were an image resource, this would contain the
             * raw bits of the image.
             * If the Resource is found in a public notebook, the authenticationToken
             * will be ignored (so it could be an empty string).
             *
             * @param guid
             *     The GUID of the resource to be retrieved.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Resource.guid" - if the parameter is missing
             *     </li>
             *     <li> PERMISSION_DENIED "Resource" - private resource, user doesn't own
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Resource.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def getResourceData(guid: java.lang.String, cb: Callback[java.lang.String]): scala.Unit = js.native
    /**
             * Returns the binary contents of the recognition index for the resource
             * with the provided GUID.    If the caller asks about a resource that has
             * no recognition data, this will throw EDAMNotFoundException.
             * If the Resource is found in a public notebook, the authenticationToken
             * will be ignored (so it could be an empty string).
             *
             * @param guid
             *     The GUID of the resource whose recognition data should be retrieved.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Resource.guid" - if the parameter is missing
             *     </li>
             *     <li> PERMISSION_DENIED "Resource" - private resource, user doesn't own
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Resource.guid" - not found, by GUID
             *     </li>
             *     <li> "Resource.recognition" - resource has no recognition
             *     </li>
             * </ul>
             */
    def getResourceRecognition(guid: java.lang.String, cb: Callback[java.lang.String]): scala.Unit = js.native
    /**
             * Returns a block of the extracted plain text contents of the resource with
             * the provided GUID.    This text can be indexed for search purposes by a light
             * client that doesn't have capability to extract all of the searchable
             * text content from a resource.
             *
             * If the Resource is found in a public notebook, the authenticationToken
             * will be ignored (so it could be an empty string).
             *
             * @param guid
             *     The GUID of the resource to be retrieved.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Resource.guid" - if the parameter is missing
             *     </li>
             *     <li> PERMISSION_DENIED "Resource" - private resource, user doesn't own
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Resource.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def getResourceSearchText(guid: java.lang.String, cb: Callback[java.lang.String]): scala.Unit = js.native
    /**
             * Returns the current state of the search with the provided GUID.
             *
             * @param guid
             *     The GUID of the search to be retrieved.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "SavedSearch.guid" - if the parameter is missing
             *     </li>
             *     <li> PERMISSION_DENIED "SavedSearch" - private Tag, user doesn't own
             *     </li>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "SavedSearch.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def getSearch(guid: java.lang.String, cb: Callback[SavedSearch]): scala.Unit = js.native
    /**
             * This function is used to retrieve extended information about a shared
             * notebook by a guest who has already authenticated to access that notebook.
             * This requires an 'authenticationToken' parameter which should be the
             * resut of a call to authenticateToSharedNotebook(...).
             * I.e. this is the token that gives access to the particular shared notebook
             * in someone else's account -- it's not the authenticationToken for the
             * owner of the notebook itself.
             *
             * @param authenticationToken
             *     Should be the authentication token retrieved from the reply of
             *     authenticateToSharedNotebook(), proving access to a particular shared
             *     notebook.
             *
             * @throws EDAMUserException <ul>
             *     <li> PERMISSION_DENIED "authenticationToken" -
             *                    authentication token doesn't correspond to a valid shared notebook
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "SharedNotebook.id" - the shared notebook no longer exists
             *     </li>
             * </ul>
             */
    def getSharedNotebookByAuth(cb: Callback[SharedNotebook]): scala.Unit = js.native
    /**
             * Asks the NoteStore to provide information about the status of the user
             * account corresponding to the provided authentication token.
             */
    def getSyncState(cb: Callback[SyncState]): scala.Unit = js.native
    /**
             * Asks the NoteStore to provide information about the status of the user
             * account corresponding to the provided authentication token.
             * This version of 'getSyncState' allows the client to upload coarse-
             * grained usage metrics to the service.
             *
             * @param clientMetrics    see the documentation of the ClientUsageMetrics
             *     structure for an explanation of the fields that clients can pass to
             *     the service.
             */
    def getSyncStateWithMetrics(clientMetrics: ClientUsageMetrics, cb: Callback[SyncState]): scala.Unit = js.native
    /**
             * Returns the current state of the Tag with the provided GUID.
             *
             * @param guid
             *     The GUID of the tag to be retrieved.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Tag.guid" - if the parameter is missing
             *     </li>
             *     <li> PERMISSION_DENIED "Tag" - private Tag, user doesn't own
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Tag.guid" - tag not found, by GUID
             *     </li>
             * </ul>
             */
    def getTag(guid: java.lang.String, cb: Callback[Tag]): scala.Unit = js.native
    /**
             * Returns a list of linked notebooks
             */
    def listLinkedNotebooks(cb: Callback[js.Array[LinkedNotebook]]): scala.Unit = js.native
    /**
             * Returns a list of the prior versions of a particular note that are
             * saved within the service.    These prior versions are stored to provide a
             * recovery from unintentional removal of content from a note. The identifiers
             * that are returned by this call can be used with getNoteVersion to retrieve
             * the previous note.
             * The identifiers will be listed from the most recent versions to the oldest.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Note.guid" - if the parameter is missing
             *     </li>
             *     <li> PERMISSION_DENIED "Note" - private note, user doesn't own
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Note.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def listNoteVersions(noteGuid: java.lang.String, cb: Callback[js.Array[NoteVersionId]]): scala.Unit = js.native
    /**
             * Returns a list of all of the notebooks in the account.
             */
    def listNotebooks(cb: Callback[js.Array[Notebook]]): scala.Unit = js.native
    /**
             * Returns a list of the searches in the account.    Evernote does not support
             * the undeletion of searches, so this will only include active searches.
             */
    def listSearches(cb: Callback[js.Array[SavedSearch]]): scala.Unit = js.native
    /**
             * Lists the collection of shared notebooks for all notebooks in the
             * users account.
             *
             * @return
             *    The list of all SharedNotebooks for the user
             */
    def listSharedNotebooks(cb: Callback[js.Array[SharedNotebook]]): scala.Unit = js.native
    /**
             * Returns a list of the tags in the account.    Evernote does not support
             * the undeletion of tags, so this will only include active tags.
             */
    def listTags(cb: Callback[js.Array[Tag]]): scala.Unit = js.native
    /**
             * Returns a list of the tags that are applied to at least one note within
             * the provided notebook.    If the notebook is public, the authenticationToken
             * may be ignored.
             *
             * @param notebookGuid
             *        the GUID of the notebook to use to find tags
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Notebook.guid" - notebook not found by GUID
             *     </li>
             * </ul>
             */
    def listTagsByNotebook(notebookGuid: java.lang.String, cb: Callback[js.Array[Tag]]): scala.Unit = js.native
    /**
             * Send a reminder message to some or all of the email addresses that a notebook has been
             * shared with. The message includes the current link to view the notebook.
             * @param authenticationToken
             *     The auth token of the user with permissions to share the notebook
             * @param notebookGuid
             *     The guid of the shared notebook
             * @param messageText
             *    User provided text to include in the email
             * @param recipients
             *    The email addresses of the recipients. If this list is empty then all of the
             *    users that the notebook has been shared with are emailed.
             *    If an email address doesn't correspond to share invite members then that address
             *    is ignored.
             * @return
             *    The number of messages sent
             * @throws EDAMUserException <ul>
             *     <li> LIMIT_REACHED "(recipients)" -
             *         The email can't be sent because this would exceed the user's daily
             *         email limit.
             *     </li>
             *     <li> PERMISSION_DENIED "Notebook.guid" - The user doesn't have permission to
             *         send a message for the specified notebook.
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Notebook.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def sendMessageToSharedNotebookMembers(
      notebookGuid: java.lang.String,
      messageText: java.lang.String,
      recipients: js.Array[java.lang.String],
      cb: Callback[scala.Double]
    ): scala.Unit = js.native
    /**
             * Update, or create, an entry in the applicationData map for
             * the note identified by guid.
             */
    def setNoteApplicationDataEntry(guid: java.lang.String, key: java.lang.String, value: java.lang.String, cb: Callback[scala.Double]): scala.Unit = js.native
    /**
             * Update, or create, an entry in the applicationData map for
             * the Resource identified by guid.
             */
    def setResourceApplicationDataEntry(guid: java.lang.String, key: java.lang.String, value: java.lang.String, cb: Callback[scala.Double]): scala.Unit = js.native
    /**
             * Set values for the recipient settings associated with a shared notebook.    Having
             * update rights to the shared notebook record itself has no effect on this call;
             * only the recipient of the shared notebook can can the recipient settings.
             *
             * If you do <i>not</i> wish to, or cannot, change one of the reminderNotifyEmail or
             * reminderNotifyInApp fields, you must leave that field unset in recipientSettings.
             * This method will skip that field for updates and leave the existing state as
             * it is.
             *
             * @return The update sequence number of the account to which the shared notebook
             *     belongs, which is the account from which we are sharing a notebook.
             *
             * @throws EDAMNotFoundException "sharedNotebookId" - Thrown if the service does not
             *     have a shared notebook record for the sharedNotebookId on the given shard.    If you
             *     receive this exception, it is probable that the shared notebook record has
             *     been revoked or expired, or that you accessed the wrong shard.
             *
             * @throws EDAMUserException <ul>
             *     <li>PEMISSION_DENIED "authenticationToken" - If you do not have permission to set
             *             the recipient settings for the shared notebook.    Only the recipient has
             *             permission to do this.
             *     <li>DATA_CONFLICT "recipientSettings.reminderNotifyEmail" - Setting whether
             *             or not you want to receive reminder e-mail notifications is possible on
             *             a business notebook in the business to which the user belongs.    All
             *             others can safely unset the reminderNotifyEmail field from the
             *             recipientSettings parameter.
             * </ul>
             */
    def setSharedNotebookRecipientSettings(
      sharedNotebookId: scala.Double,
      recipientSettings: SharedNotebookRecipientSettings,
      cb: Callback[scala.Double]
    ): scala.Unit = js.native
    /**
             * If this note is not already shared (via its own direct URL), then this
             * will start sharing that note.
             * This will return the secret "Note Key" for this note that
             * can currently be used in conjunction with the Note's GUID to gain direct
             * read-only access to the Note.
             * If the note is already shared, then this won't make any changes to the
             * note, and the existing "Note Key" will be returned.    The only way to change
             * the Note Key for an existing note is to stopSharingNote first, and then
             * call this function.
             *
             * @param guid
             *     The GUID of the note to be shared.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Note.guid" - if the parameter is missing
             *     </li>
             *     <li> PERMISSION_DENIED "Note" - private note, user doesn't own
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Note.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def shareNote(guid: java.lang.String, cb: Callback[java.lang.String]): scala.Unit = js.native
    /**
             * If this note is not already shared then this will stop sharing that note
             * and invalidate its "Note Key", so any existing URLs to access that Note
             * will stop working.
             * If the Note is not shared, then this function will do nothing.
             *
             * @param guid
             *     The GUID of the note to be un-shared.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Note.guid" - if the parameter is missing
             *     </li>
             *     <li> PERMISSION_DENIED "Note" - private note, user doesn't own
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Note.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def stopSharingNote(guid: java.lang.String, cb: Callback[scala.Unit]): scala.Unit = js.native
    /**
             * Remove an entry identified by 'key' from the applicationData map for
             * the note identified by 'guid'. Silently ignores an unset of a
             * non-existing key.
             */
    def unsetNoteApplicationDataEntry(guid: java.lang.String, key: java.lang.String, cb: Callback[scala.Double]): scala.Unit = js.native
    /**
             * Remove an entry identified by 'key' from the applicationData map for
             * the Resource identified by 'guid'.
             */
    def unsetResourceApplicationDataEntry(guid: java.lang.String, key: java.lang.String, cb: Callback[scala.Double]): scala.Unit = js.native
    /**
             * Removes the provided tag from every note that is currently tagged with
             * this tag.    If this operation is successful, the tag will still be in
             * the account, but it will not be tagged on any notes.
             *
             * This function is not indended for use by full synchronizing clients, since
             * it does not provide enough result information to the client to reconcile
             * the local state without performing a follow-up sync from the service.    This
             * is intended for "thin clients" that need to efficiently support this as
             * a UI operation.
             *
             * @param guid
             *     The GUID of the tag to remove from all notes.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Tag.guid" - if the guid parameter is missing
             *     </li>
             *     <li> PERMISSION_DENIED "Tag" - user doesn't own tag
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Tag.guid" - tag not found, by GUID
             *     </li>
             * </ul>
             */
    def untagAll(guid: java.lang.String, cb: Callback[scala.Unit]): scala.Unit = js.native
    /**
             * @param linkedNotebook
             *     Updates the name of a linked notebook.
             *
             * @return
             *     The Update Sequence Number for this change within the account.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "LinkedNotebook.name" - invalid length or pattern
             *     </li>
             * </ul>
             */
    def updateLinkedNotebook(linkedNotebook: LinkedNotebook, cb: Callback[scala.Double]): scala.Unit = js.native
    /**
             * Submit a set of changes to a note to the service.    The provided data
             * must include the note's guid field for identification. The note's
             * title must also be set.
             *
             * @param note
             *     A Note object containing the desired fields to be populated on
             *     the service. With the exception of the note's title and guid, fields
             *     that are not being changed do not need to be set. If the content is not
             *     being modified, note.content should be left unset. If the list of
             *     resources is not being modified, note.resources should be left unset.
             *
             * @return
             *     The metadata (no contents) for the Note on the server after the update
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Note.title" - invalid length or pattern
             *     </li>
             *     <li> BAD_DATA_FORMAT "Note.content" - invalid length for ENML body
             *     </li>
             *     <li> BAD_DATA_FORMAT "NoteAttributes.*" - bad resource string
             *     </li>
             *     <li> BAD_DATA_FORMAT "ResourceAttributes.*" - bad resource string
             *     </li>
             *     <li> BAD_DATA_FORMAT "Resource.mime" - invalid resource MIME type
             *     </li>
             *     <li> DATA_CONFLICT "Note.deleted" - deleted time set on active note
             *     </li>
             *     <li> DATA_REQUIRED "Resource.data" - resource data body missing
             *     </li>
             *     <li> ENML_VALIDATION "*" - note content doesn't validate against DTD
             *     </li>
             *     <li> LIMIT_REACHED "Note.tagGuids" - too many Tags on Note
             *     </li>
             *     <li> LIMIT_REACHED "Note.resources" - too many resources on Note
             *     </li>
             *     <li> LIMIT_REACHED "Note.size" - total note size too large
             *     </li>
             *     <li> LIMIT_REACHED "Resource.data.size" - resource too large
             *     </li>
             *     <li> LIMIT_REACHED "NoteAttribute.*" - attribute string too long
             *     </li>
             *     <li> LIMIT_REACHED "ResourceAttribute.*" - attribute string too long
             *     </li>
             *     <li> PERMISSION_DENIED "Note" - user doesn't own
             *     </li>
             *     <li> PERMISSION_DENIED "Note.notebookGuid" - user doesn't own destination
             *     </li>
             *     <li> QUOTA_REACHED "Accounting.uploadLimit" - note exceeds upload quota
             *     </li>
             *     <li> BAD_DATA_FORMAT "Tag.name" - Note.tagNames was provided, and one
             *         of the specified tags had an invalid length or pattern
             *     </li>
             *     <li> LIMIT_REACHED "Tag" - Note.tagNames was provided, and the required
             *         new tags would exceed the maximum number per account
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Note.guid" - note not found, by GUID
             *     </li>
             *     <li> "Note.notebookGuid" - if notebookGuid provided, but not found
             *     </li>
             * </ul>
             */
    def updateNote(note: Note, cb: Callback[Note]): scala.Unit = js.native
    /**
             * Submits notebook changes to the service.    The provided data must include
             * the notebook's guid field for identification.
             *
             * @param notebook
             *     The notebook object containing the requested changes.
             *
             * @return
             *     The Update Sequence Number for this change within the account.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Notebook.name" - invalid length or pattern
             *     </li>
             *     <li> BAD_DATA_FORMAT "Notebook.stack" - invalid length or pattern
             *     </li>
             *     <li> BAD_DATA_FORMAT "Publishing.uri" - if publishing set but bad uri
             *     </li>
             *     <li> BAD_DATA_FORMAT "Publishing.publicDescription" - if too long
             *     </li>
             *     <li> DATA_CONFLICT "Notebook.name" - name already in use
             *     </li>
             *     <li> DATA_CONFLICT "Publishing.uri" - if URI already in use
             *     </li>
             *     <li> DATA_REQUIRED "Publishing.uri" - if publishing set but uri missing
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Notebook.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def updateNotebook(notebook: Notebook, cb: Callback[scala.Double]): scala.Unit = js.native
    /**
             * Submit a set of changes to a resource to the service.    This can be used
             * to update the meta-data about the resource, but cannot be used to change
             * the binary contents of the resource (including the length and hash).    These
             * cannot be changed directly without creating a new resource and removing the
             * old one via updateNote.
             *
             * @param resource
             *     A Resource object containing the desired fields to be populated on
             *     the service.    The service will attempt to update the resource with the
             *     following fields from the client:
             *     <ul>
             *            <li>guid:    must be provided to identify the resource
             *            </li>
             *            <li>mime
             *            </li>
             *            <li>width
             *            </li>
             *            <li>height
             *            </li>
             *            <li>duration
             *            </li>
             *            <li>attributes:    optional.    if present, the set of attributes will
             *                     be replaced.
             *            </li>
             *     </ul>
             *
             * @return
             *     The Update Sequence Number of the resource after the changes have been
             *     applied.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Resource.guid" - if the parameter is missing
             *     </li>
             *     <li> BAD_DATA_FORMAT "Resource.mime" - invalid resource MIME type
             *     </li>
             *     <li> BAD_DATA_FORMAT "ResourceAttributes.*" - bad resource string
             *     </li>
             *     <li> LIMIT_REACHED "ResourceAttribute.*" - attribute string too long
             *     </li>
             *     <li> PERMISSION_DENIED "Resource" - private resource, user doesn't own
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Resource.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def updateResource(resource: Resource, cb: Callback[scala.Double]): scala.Unit = js.native
    /**
             * Submits search changes to the service. The provided data must include
             * the search's guid field for identification. The service will apply
             * updates to the following search fields: name, query, and scope.
             *
             * @param search
             *     The search object containing the requested changes.
             *
             * @return
             *     The Update Sequence Number for this change within the account.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "SavedSearch.name" - invalid length or pattern
             *     </li>
             *     <li> BAD_DATA_FORMAT "SavedSearch.query" - invalid length
             *     </li>
             *     <li> DATA_CONFLICT "SavedSearch.name" - name already in use
             *     </li>
             *     <li> PERMISSION_DENIED "SavedSearch" - user doesn't own tag
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "SavedSearch.guid" - not found, by GUID
             *     </li>
             * </ul>
             */
    def updateSearch(search: SavedSearch, cb: Callback[scala.Double]): scala.Double = js.native
    /**
             * Update a SharedNotebook object.
             *
             * @param authenticationToken
             *     Must be an authentication token from the owner or a shared notebook
             *     authentication token or business authentication token with sufficient
             *     permissions to change invitations for a notebook.
             *
             * @param sharedNotebook
             *    The SharedNotebook object containing the requested changes.
             *    The "id" of the shared notebook must be set to allow the service
             *    to identify the SharedNotebook to be updated. In addition, you MUST set
             *    the email, permission, and allowPreview fields to the desired values.
             *    All other fields will be ignored if set.
             *
             * @return
             *    The Update Serial Number for this change within the account.
             *
             * @throws EDAMUserException <ul>
             *     <li>UNSUPPORTED_OPERATION "updateSharedNotebook" - if this service instance does not support shared notebooks.</li>
             *     <li>BAD_DATA_FORMAT "SharedNotebook.email" - if the email was not valid.</li>
             *     <li>DATA_REQUIRED "SharedNotebook.id" - if the id field was not set.</li>
             *     <li>DATA_REQUIRED "SharedNotebook.privilege" - if the privilege field was not set.</li>
             *     <li>DATA_REQUIRED "SharedNotebook.allowPreview" - if the allowPreview field was not set.</li>
             *     </ul>
             * @throws EDAMNotFoundException <ul>
             *     <li>SharedNotebook.id - if no shared notebook with the specified ID was found.
             *     </ul>
             */
    def updateSharedNotebook(sharedNotebook: SharedNotebook, cb: Callback[scala.Double]): scala.Unit = js.native
    /**
             * Submits tag changes to the service.    The provided data must include
             * the tag's guid field for identification.    The service will apply
             * updates to the following tag fields:    name, parentGuid
             *
             * @param tag
             *     The tag object containing the requested changes.
             *
             * @return
             *     The Update Sequence Number for this change within the account.
             *
             * @throws EDAMUserException <ul>
             *     <li> BAD_DATA_FORMAT "Tag.name" - invalid length or pattern
             *     </li>
             *     <li> BAD_DATA_FORMAT "Tag.parentGuid" - malformed GUID
             *     </li>
             *     <li> DATA_CONFLICT "Tag.name" - name already in use
             *     </li>
             *     <li> DATA_CONFLICT "Tag.parentGuid" - can't set parent: circular
             *     </li>
             *     <li> PERMISSION_DENIED "Tag" - user doesn't own tag
             *     </li>
             * </ul>
             *
             * @throws EDAMNotFoundException <ul>
             *     <li> "Tag.guid" - tag not found, by GUID
             *     </li>
             *     <li> "Tag.parentGuid" - parent not found, by GUID
             *     </li>
             * </ul>
             */
    def updateTag(tag: Tag, cb: Callback[scala.Double]): scala.Unit = js.native
  }
  
  /**
       * Identifying information about previous versions of a note that are backed up
       * within Evernote's servers.    Used in the return value of the listNoteVersions
       * call.
       *
       * <dl>
       *    <dt>updateSequenceNum</dt>
       *    <dd>
       *        The update sequence number for the Note when it last had this content.
       *        This serves to uniquely identify each version of the note, since USN
       *        values are unique within an account for each update.
       *    </dd>
       *    <dt>updated</dt>
       *    <dd>
       *        The 'updated' time that was set on the Note when it had this version
       *        of the content.    This is the user-modifiable modification time on the
       *        note, so it's not reliable for guaranteeing the order of various
       *        versions.    (E.g. if someone modifies the note, then changes this time
       *        manually into the past and then updates the note again.)
       *    </dd>
       *    <dt>saved</dt>
       *    <dd>
       *        A timestamp that holds the date and time when this version of the note
       *        was backed up by Evernote's servers.    This
       *    </dd>
       *    <dt>title</dt>
       *    <dd>
       *        The title of the note when this particular version was saved.    (The
       *        current title of the note may differ from this value.)
       *    </dd>
       * </dl>
       */
  @js.native
  class NoteVersionId () extends js.Object {
    def this(args: evernoteLib.Anon_UpdateSequenceNum) = this()
    var saved: scala.Double = js.native
    var title: java.lang.String = js.native
    var updateSequenceNum: scala.Double = js.native
    var updated: scala.Double = js.native
  }
  
  /**
       * A unique container for a set of notes.
       * <dl>
       * <dt>guid</dt>
       *     <dd>The unique identifier of this notebook.
       *     <br/>
       *     Length:    EDAM_GUID_LEN_MIN - EDAM_GUID_LEN_MAX
       *     <br/>
       *     Regex:    EDAM_GUID_REGEX
       *     </dd>
       *
       * <dt>name</dt>
       *     <dd>A sequence of characters representing the name of the
       *     notebook.    May be changed by clients, but the account may not contain two
       *     notebooks with names that are equal via a case-insensitive comparison.
       *     Can't begin or end with a space.
       *     <br/>
       *     Length:    EDAM_NOTEBOOK_NAME_LEN_MIN - EDAM_NOTEBOOK_NAME_LEN_MAX
       *     <br/>
       *     Regex:    EDAM_NOTEBOOK_NAME_REGEX
       *     </dd>
       *
       * <dt>updateSequenceNum</dt>
       *     <dd>A number identifying the last transaction to
       *     modify the state of this object.    The USN values are sequential within an
       *     account, and can be used to compare the order of modifications within the
       *     service.
       *     </dd>
       *
       * <dt>defaultNotebook</dt>
       *     <dd>If true, this notebook should be used for new notes
       *     whenever the user has not (or cannot) specify a desired target notebook.
       *     For example, if a note is submitted via SMTP email.
       *     The service will maintain at most one defaultNotebook per account.
       *     If a second notebook is created or updated with defaultNotebook set to
       *     true, the service will automatically update the prior notebook's
       *     defaultNotebook field to false.    If the default notebook is deleted
       *     (i.e. "active" set to false), the "defaultNotebook" field will be
       *     set to false by the service.    If the account has no default notebook
       *     set, the service will use the most recent notebook as the default.
       *     </dd>
       *
       * <dt>serviceCreated</dt>
       *     <dd>The time when this notebook was created on the
       *     service. This will be set on the service during creation, and the service
       *     will provide this value when it returns a Notebook to a client.
       *     The service will ignore this value if it is sent by clients.
       *     </dd>
       *
       * <dt>serviceUpdated</dt>
       *     <dd>The time when this notebook was last modified on the
       *     service.    This will be set on the service during creation, and the service
       *     will provide this value when it returns a Notebook to a client.
       *     The service will ignore this value if it is sent by clients.
       *     </dd>
       *
       * <dt>publishing</dt>
       *     <dd>If the Notebook has been opened for public access, or
       *     business users shared with their business (i.e. if 'published' is
       *     set to true), then this will point to the set of publishing
       *     information for the Notebook (URI, description, etc.).    A
       *     Notebook cannot be published without providing this information,
       *     but it will persist for later use if publishing is ever disabled
       *     on the Notebook.    Clients that do not wish to change the
       *     publishing behavior of a Notebook should not set this value when
       *     calling NoteStore.updateNotebook().
       *     </dd>
       *
       * <dt>published</dt>
       *     <dd>If this is set to true, then the Notebook will be
       *     accessible either to the public, or for business users to their business,
       *     via the 'publishing' specification, which must also be set.    If this is set
       *     to false, the Notebook will not be available to the public (or business).
       *     Clients that do not wish to change the publishing behavior of a Notebook
       *     should not set this value when calling NoteStore.updateNotebook().
       *     </dd>
       *
       * <dt>stack</dt>
       *     <dd>If this is set, then the notebook is visually contained within a stack
       *     of notebooks with this name.    All notebooks in the same account with the
       *     same 'stack' field are considered to be in the same stack.
       *     Notebooks with no stack set are "top level" and not contained within a
       *     stack.
       *     </dd>
       *
       * <dt>sharedNotebookIds</dt>
       *     <dd><i>DEPRECATED</i> - replaced by sharedNotebooks.</dd>
       *
       * <dt>sharedNotebooks</dt>
       *     <dd>The list of recipients to whom this notebook has been shared
       *     (one SharedNotebook object per recipient email address). This field will
       *     be unset if you do not have permission to access this data. If you are
       *     accessing the notebook as the owner or via a shared notebook that is
       *     modifiable, then you have access to this data and the value will be set.
       *     This field is read-only. Clients may not make changes to shared notebooks
       *     via this field.
       *     </dd>
       *
       * <dt>businessNotebook</dt>
       *     <dd>If the notebook is part of a business account and has been published to the
       *     business library, this will contain information for the library listing.
       *     The presence or absence of this field is not a reliable test of whether a given
       *     notebook is in fact a business notebook - the field is only used when a notebook is or
       *     has been published to the business library.
       *     </dd>
       *
       * <dt>contact</dt>
       *     <dd>Intended for use with Business accounts, this field identifies the user who
       *     has been designated as the "contact".    For notebooks created in business
       *     accounts, the server will automatically set this value to the user who created
       *     the notebook unless Notebook.contact.username has been set, in which that value
       *     will be used.    When updating a notebook, it is common to leave Notebook.contact
       *     field unset, indicating that no change to the value is being requested and that
       *     the existing value, if any, should be preserved.
       *     </dd>
       *
       * </dl>
       */
  @js.native
  class Notebook () extends js.Object {
    def this(args: evernoteLib.Anon_SharedNotebooks) = this()
    var businessNotebook: BusinessNotebook = js.native
    var contact: User = js.native
    var defaultNotebook: scala.Boolean = js.native
    var guid: java.lang.String = js.native
    var name: java.lang.String = js.native
    var published: scala.Boolean = js.native
    var publishing: Publishing = js.native
    var restrictions: NotebookRestrictions = js.native
    var serviceCreated: scala.Double = js.native
    var serviceUpdated: scala.Double = js.native
    var sharedNotebookIds: js.Array[scala.Double] = js.native
    var sharedNotebooks: js.Array[SharedNotebook] = js.native
    var stack: java.lang.String = js.native
    var updateSequenceNum: scala.Double = js.native
  }
  
  /**
       * A structure that describes a notebook or a user's relationship with
       * a notebook. NotebookDescriptor is expected to remain a lighter-weight
       * structure when compared to Notebook.
       * <dl>
       * <dt>guid</dt>
       *     <dd>The unique identifier of the notebook.
       *     </dd>
       *
       * <dt>notebookDisplayName</dt>
       *     <dd>A sequence of characters representing the name of the
       *     notebook.
       *     </dd>
       *
       * <dt>contactName</dt>
       *     <dd>The User.name value of the notebook's "contact".
       *     </dd>
       *
       * <dt>hasSharedNotebook</dt>
       *     <dd>Whether a SharedNotebook record exists between the calling user and this
       *     notebook.
       *     </dd>
       *
       * <dt>joinedUserCount</dt>
       *     <dd>The number of users who have joined this notebook.
       *     </dd>
       *
       * </dl>
       */
  @js.native
  class NotebookDescriptor () extends js.Object {
    def this(args: evernoteLib.Anon_GuidJoinedUserCount) = this()
    var contactName: java.lang.String = js.native
    var guid: java.lang.String = js.native
    var hasSharedNotebook: scala.Boolean = js.native
    var joinedUserCount: scala.Double = js.native
    var notebookDisplayName: java.lang.String = js.native
  }
  
  /**
       * This structure captures information about the types of operations
       * that cannot be performed on a given notebook with a type of
       * authenticated access and credentials.    The values filled into this
       * structure are based on then-current values in the server database
       * for shared notebooks and notebook publishing records, as well as
       * information related to the authentication token.    Information from
       * the authentication token includes the application that is accessing
       * the server, as defined by the permissions granted by consumer (api)
       * key, and the method used to obtain the token, for example via
       * authenticateToSharedNotebook, authenticateToBusiness, etc.    Note
       * that changes to values in this structure that are the result of
       * shared notebook or publishing record changes are communicated to
       * the client via a change in the notebook USN during sync.    It is
       * important to use the same access method, parameters, and consumer
       * key in order obtain correct results from the sync engine.
       *
       * The server has the final say on what is allowed as values may
       * change between calls to obtain NotebookRestrictions instances
       * and to operate on data on the service.
       *
       * If the following are set and true, then the given restriction is
       * in effect, as accessed by the same authentication token from which
       * the values were obtained.
       *
       * <dt>noReadNotes</dt>
       *     <dd>The client is not able to read notes from the service and
       *     the notebook is write-only.
       *     </dd>
       * <dt>noCreateNotes</dt>
       *     <dd>The client may not create new notes in the notebook.
       *     </dd>
       * <dt>noUpdateNotes</dt>
       *     <dd>The client may not update notes currently in the notebook.
       *     </dd>
       * <dt>noExpungeNotes</dt>
       *     <dd>The client may not expunge notes currently in the notebook.
       *     </dd>
       * <dt>noShareNotes</dt>
       *     <dd>The client may not share notes in the notebook via the
       *     shareNote method.
       *     </dd>
       * <dt>noEmailNotes</dt>
       *     <dd>The client may not e-mail notes via the Evernote service by
       *     using the emailNote method.
       *     </dd>
       * <dt>noSendMessageToRecipients</dt>
       *     <dd>The client may not send messages to the share recipients of
       *     the notebook.
       *     </dd>
       * <dt>noUpdateNotebook</dt>
       *     <dd>The client may not update the Notebook object itself, for
       *     example, via the updateNotebook method.
       *     </dd>
       * <dt>noExpungeNotebook</dt>
       *     <dd>The client may not expunge the Notebook object itself, for
       *     example, via the expungeNotebook method.
       *     </dd>
       * <dt>noSetDefaultNotebook</dt>
       *     <dd>The client may not set this notebook to be the default notebook.
       *     The caller should leave Notebook.defaultNotebook unset.
       *     </dd>
       * <dt>noSetNotebookStack</dt>
       *     <dd>If the client is able to update the Notebook, the Notebook.stack
       *     value may not be set.
       *     </dd>
       * <dt>noPublishToPublic</dt>
       *     <dd>The client may not change the publish the notebook to the public.
       *     For example, business notebooks may not be shared publicly.
       *     </dd>
       * <dt>noPublishToBusinessLibrary</dt>
       *     <dd>The client may not publish the notebook to the business library.
       *     </dd>
       * <dt>noCreateTags</dt>
       *     <dd>The client may not complete an operation that results in a new tag
       *     being created in the owner's account.
       *     </dd>
       * <dt>noUpdateTags</dt>
       *     <dd>The client may not update tags in the owner's account.
       *     </dd>
       * <dt>noExpungeTags</dt>
       *     <dd>The client may not expunge tags in the owner's account.
       *     </dd>
       * <dt>noSetParentTag</dt>
       *     <dd>If the client is able to create or update tags in the owner's account,
       *     then they will not be able to set the parent tag.    Leave the value unset.
       *     </dd>
       * <dt>noCreateSharedNotebooks</dt>
       *     <dd>The client is unable to create shared notebooks for the notebook.
       *     </dd>
       * <dt>updateWhichSharedNotebookRestrictions</dt>
       *     <dd>Restrictions on which shared notebook instances can be updated.    If the
       *     value is not set or null, then the client can update any of the shared notebooks
       *     associated with the notebook on which the NotebookRestrictions are defined.
       *     See the enumeration for further details.
       *     </dd>
       * <dt>expungeWhichSharedNotebookRestrictions</dt>
       *     <dd>Restrictions on which shared notebook instances can be expunged.    If the
       *     value is not set or null, then the client can expunge any of the shared notebooks
       *     associated with the notebook on which the NotebookRestrictions are defined.
       *     See the enumeration for further details.
       *     </dd>
       */
  @js.native
  class NotebookRestrictions () extends js.Object {
    def this(args: evernoteLib.Anon_NoCreateTags) = this()
    var expungeWhichSharedNotebookRestrictions: SharedNotebookInstanceRestrictions = js.native
    var noCreateNotes: scala.Boolean = js.native
    var noCreateSharedNotebooks: scala.Boolean = js.native
    var noCreateTags: scala.Boolean = js.native
    var noEmailNotes: scala.Boolean = js.native
    var noExpungeNotebook: scala.Boolean = js.native
    var noExpungeNotes: scala.Boolean = js.native
    var noExpungeTags: scala.Boolean = js.native
    var noPublishToBusinessLibrary: scala.Boolean = js.native
    var noPublishToPublic: scala.Boolean = js.native
    var noReadNotes: scala.Boolean = js.native
    var noSendMessageToRecipients: scala.Boolean = js.native
    var noSetDefaultNotebook: scala.Boolean = js.native
    var noSetNotebookStack: scala.Boolean = js.native
    var noSetParentTag: scala.Boolean = js.native
    var noShareNotes: scala.Boolean = js.native
    var noUpdateNotebook: scala.Boolean = js.native
    var noUpdateNotes: scala.Boolean = js.native
    var noUpdateTags: scala.Boolean = js.native
    var updateWhichSharedNotebookRestrictions: SharedNotebookInstanceRestrictions = js.native
  }
  
  /**
       *    This structure is returned from calls to the findNotesMetadata function to
       *    give the high-level metadata about a subset of Notes that are found to
       *    match a specified NoteFilter in a search.
       *
       * <dl>
       *    <dt>startIndex</dt>
       *        <dd>
       *        The starting index within the overall set of notes.    This
       *        is also the number of notes that are "before" this list in the set.
       *        </dd>
       *
       *    <dt>totalNotes</dt>
       *        <dd>
       *        The number of notes in the larger set.    This can be used
       *        to calculate how many notes are "after" this note in the set.
       *        (I.e.    remaining = totalNotes - (startIndex + notes.length)    )
       *        </dd>
       *
       *    <dt>notes</dt>
       *        <dd>
       *        The list of metadata for Notes in this range.    The set of optional fields
       *        that are set in each metadata structure will depend on the
       *        NotesMetadataResultSpec provided by the caller when the search was
       *        performed.    Only the 'guid' field will be guaranteed to be set in each
       *        Note.
       *        </dd>
       *
       *    <dt>stoppedWords</dt>
       *        <dd>
       *        If the NoteList was produced using a text based search
       *        query that included words that are not indexed or searched by the service,
       *        this will include a list of those ignored words.
       *        </dd>
       *
       *    <dt>searchedWords</dt>
       *        <dd>
       *        If the NoteList was produced using a text based search
       *        query that included viable search words or quoted expressions, this will
       *        include a list of those words.    Any stopped words will not be included
       *        in this list.
       *        </dd>
       *
       *    <dt>updateCount</dt>
       *        <dd>
       *        Indicates the total number of transactions that have
       *        been committed within the account.    This reflects (for example) the
       *        number of discrete additions or modifications that have been made to
       *        the data in this account (tags, notes, resources, etc.).
       *        This number is the "high water mark" for Update Sequence Numbers (USN)
       *        within the account.
       *        </dd>
       *    </dl>
       */
  @js.native
  class NotesMetadataList () extends js.Object {
    def this(args: evernoteLib.Anon_TotalNotes) = this()
    var notes: js.Array[NoteMetadata] = js.native
    var searchedWords: js.Array[java.lang.String] = js.native
    var startIndex: scala.Double = js.native
    var stoppedWords: js.Array[java.lang.String] = js.native
    var totalNotes: scala.Double = js.native
    var updateCount: scala.Double = js.native
  }
  
  /**
       * This structure is provided to the findNotesMetadata function to specify
       * the subset of fields that should be included in each NoteMetadata element
       * that is returned in the NotesMetadataList.
       * Each field on this structure is a boolean flag that indicates whether the
       * corresponding field should be included in the NoteMetadata structure when
       * it is returned.    For example, if the 'includeTitle' field is set on this
       * structure when calling findNotesMetadata, then each NoteMetadata in the
       * list should have its 'title' field set.
       * If one of the fields in this spec is not set, then it will be treated as
       * 'false' by the server, so the default behavior is to include nothing in
       * replies (but the mandatory GUID)
       */
  @js.native
  class NotesMetadataResultSpec () extends js.Object {
    def this(args: evernoteLib.Anon_IncludeNotebookGuid) = this()
    var includeAttributes: scala.Boolean = js.native
    var includeContentLength: scala.Boolean = js.native
    var includeCreated: scala.Boolean = js.native
    var includeDeleted: scala.Boolean = js.native
    var includeLargestResourceMime: scala.Boolean = js.native
    var includeLargestResourceSize: scala.Boolean = js.native
    var includeNotebookGuid: scala.Boolean = js.native
    var includeTagGuids: scala.Boolean = js.native
    var includeTitle: scala.Boolean = js.native
    var includeUpdateSequenceNum: scala.Boolean = js.native
    var includeUpdated: scala.Boolean = js.native
  }
  
  /**
       *    This structure is used to provide information about a user's Premium account.
       * <dl>
       *    <dt>currentTime</dt>
       *        <dd>
       *        The server-side date and time when this data was generated.
       *        </dd>
       *    <dt>premium</dt>
       *        <dd>
       *        True if the user's account is Premium.
       *        </dd>
       *    <dt>premiumRecurring</dt>
       *        <dd>
       *        True if the user's account is Premium and has a recurring payment method.
       *        </dd>
       *    <dt>premiumExpirationDate</dt>
       *        <dd>
       *        The date when the user's Premium account expires, or the date when the
       *        user's account is due for payment if it has a recurring payment method.
       *        </dd>
       *    <dt>premiumExtendable</dt>
       *        <dd>
       *        True if the user is eligible for purchasing Premium account extensions.
       *        </dd>
       *    <dt>premiumPending</dt>
       *        <dd>
       *        True if the user's Premium account is pending payment confirmation
       *        </dd>
       *    <dt>premiumCancellationPending</dt>
       *        <dd>
       *        True if the user has requested that no further charges to be made; the
       *        Premium account will remain active until it expires.
       *        </dd>
       *    <dt>canPurchaseUploadAllowance</dt>
       *        <dd>
       *        True if the user is eligible for purchasing additional upload allowance.
       *        </dd>
       *    <dt>sponsoredGroupName</dt>
       *        <dd>
       *        The name of the sponsored group that the user is part of.
       *        </dd>
       *    <dt>sponsoredGroupRole</dt>
       *        <dd>
       *        DEPRECATED - will be removed in a future update.
       *        </dd>
       *    <dt>premiumUpgradable</dt>
       *        <dd>
       *        True if the user is eligible for purchasing Premium account upgrade.
       *        </dd>
       *    </dl>
       */
  @js.native
  class PremiumInfo () extends js.Object {
    def this(args: evernoteLib.Anon_SponsoredGroupName) = this()
    var canPurchaseUploadAllowance: scala.Boolean = js.native
    var currentTime: scala.Double = js.native
    var premium: scala.Boolean = js.native
    var premiumCancellationPending: scala.Boolean = js.native
    var premiumExpirationDate: scala.Double = js.native
    var premiumExtendable: scala.Boolean = js.native
    var premiumPending: scala.Boolean = js.native
    var premiumRecurring: scala.Boolean = js.native
    var premiumUpgradable: scala.Boolean = js.native
    var sponsoredGroupName: java.lang.String = js.native
    var sponsoredGroupRole: SponsoredGroupRole = js.native
  }
  
  @js.native
  sealed trait PremiumOrderStatus extends js.Object
  
  @js.native
  sealed trait PrivilegeLevel extends js.Object
  
  /**
       *    This structure is used to provide publicly-available user information
       *    about a particular account.
       * <dl>
       *    <dt>userId:</dt>
       *        <dd>
       *        The unique numeric user identifier for the user account.
       *        </dd>
       *    <dt>shardId:</dt>
       *        <dd>
       *        DEPRECATED - Client applications should have no need to use this field.
       *        </dd>
       *    <dt>privilege:</dt>
       *        <dd>
       *        The privilege level of the account, to determine whether
       *        this is a Premium or Free account.
       *        </dd>
       *    <dt>noteStoreUrl:</dt>
       *        <dd>
       *        This field will contain the full URL that clients should use to make
       *        NoteStore requests to the server shard that contains that user's data.
       *        I.e. this is the URL that should be used to create the Thrift HTTP client
       *        transport to send messages to the NoteStore service for the account.
       *        </dd>
       *    <dt>webApiUrlPrefix:</dt>
       *        <dd>
       *        This field will contain the initial part of the URLs that should be used
       *        to make requests to Evernote's thin client "web API", which provide
       *        optimized operations for clients that aren't capable of manipulating
       *        the full contents of accounts via the full Thrift data model. Clients
       *        should concatenate the relative path for the various servlets onto the
       *        end of this string to construct the full URL, as documented on our
       *        developer web site.
       *        </dd>
       *    </dl>
       */
  @js.native
  class PublicUserInfo () extends js.Object {
    def this(args: evernoteLib.Anon_Username) = this()
    var noteStoreUrl: java.lang.String = js.native
    var privilege: PrivilegeLevel = js.native
    var shardId: java.lang.String = js.native
    var userId: scala.Double = js.native
    var username: java.lang.String = js.native
    var webApiUrlPrefix: java.lang.String = js.native
  }
  
  /**
       * If a Notebook has been opened to the public, the Notebook will have a
       * reference to one of these structures, which gives the location and optional
       * description of the externally-visible public Notebook.
       * <dl>
       * <dt>uri</dt>
       *     <dd>If this field is present, then the notebook is published for
       *     mass consumption on the Internet under the provided URI, which is
       *     relative to a defined base publishing URI defined by the service.
       *     This field can only be modified via the web service GUI ... publishing
       *     cannot be modified via an offline client.
       *     <br/>
       *     Length:    EDAM_PUBLISHING_URI_LEN_MIN - EDAM_PUBLISHING_URI_LEN_MAX
       *     <br/>
       *     Regex:    EDAM_PUBLISHING_URI_REGEX
       *     </dd>
       *
       * <dt>order</dt>
       *     <dd>When the notes are publicly displayed, they will be sorted
       *     based on the requested criteria.
       *     </dd>
       *
       * <dt>ascending</dt>
       *     <dd>If this is set to true, then the public notes will be
       *     displayed in ascending order (e.g. from oldest to newest).    Otherwise,
       *     the notes will be displayed in descending order (e.g. newest to oldest).
       *     </dd>
       *
       * <dt>publicDescription</dt>
       *     <dd>This field may be used to provide a short
       *     description of the notebook, which may be displayed when (e.g.) the
       *     notebook is shown in a public view.    Can't begin or end with a space.
       *     <br/>
       *     Length:    EDAM_PUBLISHING_DESCRIPTION_LEN_MIN -
       *                        EDAM_PUBLISHING_DESCRIPTION_LEN_MAX
       *     <br/>
       *     Regex:    EDAM_PUBLISHING_DESCRIPTION_REGEX
       *     </dd>
       *
       * </dl>
       */
  @js.native
  class Publishing () extends js.Object {
    def this(args: evernoteLib.Anon_Order) = this()
    var ascending: scala.Boolean = js.native
    var order: NoteSortOrder = js.native
    var publicDescription: java.lang.String = js.native
    var uri: java.lang.String = js.native
  }
  
  @js.native
  sealed trait QueryFormat extends js.Object
  
  /**
       * A description of the thing for which we are searching for related
       * entities.
       *
       * You must specify either <em>noteGuid</em> or <em>plainText</em>, but
       * not both. <em>filter</em> and <em>referenceUri</em> are optional.
       *
       * <dl>
       * <dt>noteGuid</dt>
       * <dd>The GUID of an existing note in your account for which related
       *         entities will be found.</dd>
       *
       * <dt>plainText</dt>
       * <dd>A string of plain text for which to find related entities.
       *         You should provide a text block with a number of characters between
       *         EDAM_RELATED_PLAINTEXT_LEN_MIN and EDAM_RELATED_PLAINTEXT_LEN_MAX.
       *         </dd>
       *
       * <dt>filter</dt>
       * <dd>The list of criteria that will constrain the notes being considered
       *         related.
       *         Please note that some of the parameters may be ignored, such as
       *         <em>order</em> and <em>ascending</em>.
       * </dd>
       *
       * <dt>referenceUri</dt>
       * <dd>A URI string specifying a reference entity, around which "relatedness"
       *         should be based. This can be an URL pointing to a web page, for example.
       * </dd>
       * </dl>
       */
  @js.native
  class RelatedQuery () extends js.Object {
    def this(args: evernoteLib.Anon_Filter) = this()
    var filter: NoteFilter = js.native
    var noteGuid: java.lang.String = js.native
    var plainText: java.lang.String = js.native
    var referenceUri: java.lang.String = js.native
  }
  
  /**
       * The result of calling findRelated().    The contents of the notes,
       * notebooks, and tags fields will be in decreasing order of expected
       * relevance.    It is possible that fewer results than requested will be
       * returned even if there are enough distinct entities in the account
       * in cases where the relevance is estimated to be low.
       *
       * <dl>
       * <dt>notes</dt>
       * <dd>If notes have been requested to be included, this will be the
       *         list of notes.</dd>
       *
       * <dt>notebooks</dt>
       * <dd>If notebooks have been requested to be included, this will be the
       *         list of notebooks.</dd>
       *
       * <dt>tags</dt>
       * <dd>If tags have been requested to be included, this will be the list
       *         of tags.</dd>
       * </dl>
       *
       * <dt>containingNotebooks</dt>
       * <dd>If <code>includeContainingNotebooks</code> is set to <code>true</code>
       *         in the RelatedResultSpec, return the list of notebooks to
       *         to which the returned related notes belong. The notebooks in this
       *         list will occur once per notebook GUID and are represented as
       *         NotebookDescriptor objects.</dd>
       * </dl>
       * </dl>
       */
  @js.native
  class RelatedResult () extends js.Object {
    def this(args: evernoteLib.Anon_Notebooks) = this()
    var containingNotebooks: js.Array[NotebookDescriptor] = js.native
    var notebooks: js.Array[Notebook] = js.native
    var notes: js.Array[Note] = js.native
    var tags: js.Array[Tag] = js.native
  }
  
  /**
       * A description of the thing for which the service will find related
       * entities, via findRelated(), together with a description of what
       * type of entities and how many you are seeking in the
       * RelatedResult.
       *
       * <dl>
       * <dt>maxNotes</dt>
       * <dd>Return notes that are related to the query, but no more than
       *         this many.    Any value greater than EDAM_RELATED_MAX_NOTES
       *         will be silently capped.    If you do not set this field, then
       *         no notes will be returned.</dd>
       *
       * <dt>maxNotebooks</dt>
       * <dd>Return notebooks that are related to the query, but no more than
       *         this many.    Any value greater than EDAM_RELATED_MAX_NOTEBOOKS
       *         will be silently capped.    If you do not set this field, then
       *         no notebooks will be returned.</dd>
       *
       * <dt>maxTags</dt>
       * <dd>Return tags that are related to the query, but no more than
       *         this many.    Any value greater than EDAM_RELATED_MAX_TAGS
       *         will be silently capped.    If you do not set this field, then
       *         no tags will be returned.</dd>
       * </dl>
       *
       * <dt>writableNotebooksOnly</dt>
       * <dd>Require that all returned related notebooks are writable.
       *         The user will be able to create notes in all returned notebooks.
       *         However, individual notes returned may still belong to notebooks
       *         in which the user lacks the ability to create notes.</dd>
       * </dl>
       *
       * <dt>includeContainingNotebooks</dt>
       * <dd>If set to <code>true</code>, return the containingNotebooks field
       *         in the RelatedResult, which will contain the list of notebooks to
       *         to which the returned related notes belong.</dd>
       * </dl>
       * </dl>
       */
  @js.native
  class RelatedResultSpec () extends js.Object {
    def this(args: evernoteLib.Anon_MaxTags) = this()
    var includeContainingNotebooks: scala.Boolean = js.native
    var maxNotebooks: scala.Double = js.native
    var maxNotes: scala.Double = js.native
    var maxTags: scala.Double = js.native
    var writableNotebooksOnly: scala.Boolean = js.native
  }
  
  @js.native
  sealed trait ReminderEmailConfig extends js.Object
  
  /**
       * Every media file that is embedded or attached to a note is represented
       * through a Resource entry.
       * <dl>
       * <dt>guid</dt>
       *     <dd>The unique identifier of this resource.    Will be set whenever
       *     a resource is retrieved from the service, but may be null when a client
       *     is creating a resource.
       *     <br/>
       *     Length:    EDAM_GUID_LEN_MIN - EDAM_GUID_LEN_MAX
       *     <br/>
       *     Regex:    EDAM_GUID_REGEX
       *     </dd>
       *
       * <dt>noteGuid</dt>
       *     <dd>The unique identifier of the Note that holds this
       *     Resource. Will be set whenever the resource is retrieved from the service,
       *     but may be null when a client is creating a resource.
       *     <br/>
       *     Length:    EDAM_GUID_LEN_MIN - EDAM_GUID_LEN_MAX
       *     <br/>
       *     Regex:    EDAM_GUID_REGEX
       *     </dd>
       *
       * <dt>data</dt>
       *     <dd>The contents of the resource.
       *     Maximum length:    The data.body is limited to EDAM_RESOURCE_SIZE_MAX_FREE
       *     for free accounts and EDAM_RESOURCE_SIZE_MAX_PREMIUM for premium accounts.
       *     </dd>
       *
       * <dt>mime</dt>
       *     <dd>The MIME type for the embedded resource.    E.g. "image/gif"
       *     <br/>
       *     Length:    EDAM_MIME_LEN_MIN - EDAM_MIME_LEN_MAX
       *     <br/>
       *     Regex:    EDAM_MIME_REGEX
       *     </dd>
       *
       * <dt>width</dt>
       *     <dd>If set, this contains the display width of this resource, in
       *     pixels.
       *     </dd>
       *
       * <dt>height</dt>
       *     <dd>If set, this contains the display height of this resource,
       *     in pixels.
       *     </dd>
       *
       * <dt>duration</dt>
       *     <dd>DEPRECATED: ignored.
       *     </dd>
       *
       * <dt>active</dt>
       *     <dd>DEPRECATED: ignored.
       *     </dd>
       *
       * <dt>recognition</dt>
       *     <dd>If set, this will hold the encoded data that provides
       *     information on search and recognition within this resource.
       *     </dd>
       *
       * <dt>attributes</dt>
       *     <dd>A list of the attributes for this resource.
       *     </dd>
       *
       * <dt>updateSequenceNum</dt>
       *     <dd>A number identifying the last transaction to
       *     modify the state of this object. The USN values are sequential within an
       *     account, and can be used to compare the order of modifications within the
       *     service.
       *     </dd>
       *
       * <dt>alternateData</dt>
       *     <dd>Some Resources may be assigned an alternate data format by the service
       *     which may be more appropriate for indexing or rendering than the original
       *     data provided by the user.    In these cases, the alternate data form will
       *     be available via this Data element.    If a Resource has no alternate form,
       *     this field will be unset.</dd>
       * </dl>
       */
  @js.native
  class Resource () extends js.Object {
    def this(args: evernoteLib.Anon_Duration) = this()
    var active: scala.Boolean = js.native
    var alternateData: Data = js.native
    var attributes: ResourceAttributes = js.native
    var data: Data = js.native
    var duration: scala.Double = js.native
    var guid: java.lang.String = js.native
    var height: scala.Double = js.native
    var mime: java.lang.String = js.native
    var noteGuid: java.lang.String = js.native
    var recognition: Data = js.native
    var updateSequenceNum: scala.Double = js.native
    var width: scala.Double = js.native
  }
  
  /**
       * Structure holding the optional attributes of a Resource
       * <dl>
       * <dt>sourceURL</dt>
       *     <dd>the original location where the resource was hosted
       *     <br/>
       *        Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX
       *     </dd>
       *
       * <dt>timestamp</dt>
       *     <dd>the date and time that is associated with this resource
       *     (e.g. the time embedded in an image from a digital camera with a clock)
       *     </dd>
       *
       * <dt>latitude</dt>
       *     <dd>the latitude where the resource was captured
       *     </dd>
       *
       * <dt>longitude</dt>
       *     <dd>the longitude where the resource was captured
       *     </dd>
       *
       * <dt>altitude</dt>
       *     <dd>the altitude where the resource was captured
       *     </dd>
       *
       * <dt>cameraMake</dt>
       *     <dd>information about an image's camera, e.g. as embedded in
       *     the image's EXIF data
       *     <br/>
       *     Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX
       *     </dd>
       *
       * <dt>cameraModel</dt>
       *     <dd>information about an image's camera, e.g. as embedded
       *     in the image's EXIF data
       *     <br/>
       *     Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX
       *     </dd>
       *
       * <dt>clientWillIndex</dt>
       *     <dd>if true, then the original client that submitted
       *     the resource plans to submit the recognition index for this resource at a
       *     later time.
       *     </dd>
       *
       * <dt>recoType</dt>
       *     <dd>DEPRECATED - this field is no longer set by the service, so should
       *         be ignored.
       *     </dd>
       *
       * <dt>fileName</dt>
       *     <dd>if the resource came from a source that provided an
       *     explicit file name, the original name will be stored here.    Many resources
       *     come from unnamed sources, so this will not always be set.
       *     </dd>
       *
       * <dt>attachment</dt>
       *     <dd>this will be true if the resource should be displayed as an attachment,
       *     or false if the resource should be displayed inline (if possible).
       *     </dd>
       *
       * <dt>applicationData</dt>
       * <dd>Provides a location for applications to store a relatively small
       * (4kb) blob of data associated with a Resource that is not visible to the user
       * and that is opaque to the Evernote service. A single application may use at most
       * one entry in this map, using its API consumer key as the map key. See the
       * documentation for LazyMap for a description of when the actual map values
       * are returned by the service.
       * <p>To safely add or modify your application's entry in the map, use
       * NoteStore.setResourceApplicationDataEntry. To safely remove your application's
       * entry from the map, use NoteStore.unsetResourceApplicationDataEntry.</p>
       * Minimum length of a name (key): EDAM_APPLICATIONDATA_NAME_LEN_MIN
       * <br/>
       * Sum max size of key and value: EDAM_APPLICATIONDATA_ENTRY_LEN_MAX
       * <br/>
       * Syntax regex for name (key): EDAM_APPLICATIONDATA_NAME_REGEX
       * </dd>
       *
       * </dl>
       */
  @js.native
  class ResourceAttributes () extends js.Object {
    def this(args: evernoteLib.Anon_ApplicationData) = this()
    var altitude: scala.Double = js.native
    var applicationData: LazyMap = js.native
    var attachment: scala.Boolean = js.native
    var cameraMake: java.lang.String = js.native
    var cameraModel: java.lang.String = js.native
    var clientWillIndex: scala.Boolean = js.native
    var fileName: java.lang.String = js.native
    var latitude: scala.Double = js.native
    var longitude: scala.Double = js.native
    var recoType: java.lang.String = js.native
    var sourceURL: java.lang.String = js.native
    var timestamp: scala.Double = js.native
  }
  
  /**
       * A named search associated with the account that can be quickly re-used.
       * <dl>
       * <dt>guid</dt>
       *     <dd>The unique identifier of this search.    Will be set by the
       *     service, so may be omitted by the client when creating.
       *     <br/>
       *     Length:    EDAM_GUID_LEN_MIN - EDAM_GUID_LEN_MAX
       *     <br/>
       *     Regex:    EDAM_GUID_REGEX
       *     </dd>
       *
       * <dt>name</dt>
       *     <dd>The name of the saved search to display in the GUI.    The
       *     account may only contain one search with a given name (case-insensitive
       *     compare). Can't begin or end with a space.
       *     <br/>
       *     Length:    EDAM_SAVED_SEARCH_NAME_LEN_MIN - EDAM_SAVED_SEARCH_NAME_LEN_MAX
       *     <br/>
       *     Regex:    EDAM_SAVED_SEARCH_NAME_REGEX
       *     </dd>
       *
       * <dt>query</dt>
       *     <dd>A string expressing the search to be performed.
       *     <br/>
       *     Length:    EDAM_SAVED_SEARCH_QUERY_LEN_MIN - EDAM_SAVED_SEARCH_QUERY_LEN_MAX
       *     </dd>
       *
       * <dt>format</dt>
       *     <dd>The format of the query string, to determine how to parse
       *     and process it.
       *     </dd>
       *
       * <dt>updateSequenceNum</dt>
       *     <dd>A number identifying the last transaction to
       *     modify the state of this object.    The USN values are sequential within an
       *     account, and can be used to compare the order of modifications within the
       *     service.
       *     </dd>
       *
       * <dt>scope</dt>
       *     <dd><p>Specifies the set of notes that should be included in the search, if
       *        possible.</p>
       *        <p>Clients are expected to search as much of the desired scope as possible,
       *        with the understanding that a given client may not be able to cover the full
       *        specified scope. For example, when executing a search that includes notes in both
       *        the owner's account and business notebooks, a mobile client may choose to only
       *        search within the user's account because it is not capable of searching both
       *        scopes simultaneously. When a search across multiple scopes is not possible,
       *        a client may choose which scope to search based on the current application
       *        context. If a client cannot search any of the desired scopes, it should refuse
       *        to execute the search.</p>
       *        </dd>
       * </dl>
       */
  @js.native
  class SavedSearch () extends js.Object {
    def this(args: evernoteLib.Anon_Format) = this()
    var format: QueryFormat = js.native
    var guid: java.lang.String = js.native
    var name: java.lang.String = js.native
    var query: java.lang.String = js.native
    var scope: SavedSearchScope = js.native
    var updateSequenceNum: scala.Double = js.native
  }
  
  /**
       * A structure defining the scope of a SavedSearch.
       *
       * <dl>
       *     <dt>includeAccount</dt>
       *     <dd>The search should include notes from the account that contains the SavedSearch.</dd>
       *
       *     <dt>includePersonalLinkedNotebooks</dt>
       *     <dd>The search should include notes within those shared notebooks
       *     that the user has joined that are NOT business notebooks.</dd>
       *
       *     <dt>includeBusinessLinkedNotebooks</dt>
       *     <dd>The search should include notes within those shared notebooks
       *     that the user has joined that are business notebooks in the business that
       *     the user is currently a member of.</dd>
       * </dl>
       */
  @js.native
  class SavedSearchScope () extends js.Object {
    def this(args: evernoteLib.Anon_IncludeBusinessLinkedNotebooks) = this()
    var includeAccount: scala.Boolean = js.native
    var includeBusinessLinkedNotebooks: scala.Boolean = js.native
    var includePersonalLinkedNotebooks: scala.Boolean = js.native
  }
  
  /**
       * Shared notebooks represent a relationship between a notebook and a single
       * share invitation recipient.
       * <dl>
       * <dt>id</dt>
       * <dd>the primary identifier of the share</dd>
       *
       * <dt>userId</dt>
       * <dd>the user id of the owner of the notebook</dd>
       *
       * <dt>notebookGuid</dt>
       * <dd>the GUID of the associated notebook shared.</dd>
       *
       * <dt>email</dt>
       * <dd>the email address of the recipient - used by the notebook
       * owner to identify who they shared with.</dd>
       *
       * <dt>notebookModifiable</dt>
       * <dd>(DEPRECATED) a flag indicating the share is read/write -otherwise it's read
       *         only.    This field is deprecated in favor of the new "privilege" field.</dd>
       *
       * <dt>requireLogin</dt>
       * <dd>(DEPRECATED) indicates that a user must login to access the share.    This
       *         field is deprecated and will be "true" for all new shared notebooks.    It
       *         is read-only and ignored when creating or modifying a shared notebook,
       *         except that a shared notebook can be modified to require login.
       *         See "allowPreview" for information on privileges and shared notebooks.</dd>
       *
       * <dt>serviceCreated</dt>
       * <dd>the date the owner first created the share with the specific email
       *     address</dd>
       *
       * <dt>serviceUpdated</dt>
       * <dd>the date the shared notebook was last updated on the service.    This
       *         will be updated when authenticateToSharedNotebook is called the first
       *         time with a shared notebook requiring login (i.e. when the username is
       *         bound to that shared notebook).</dd>
       *
       * <dt>username</dt>
       * <dd>the username of the user who can access this share.
       *     Once it's assigned it cannot be changed.</dd>
       *
       * <dt>privilege</dt>
       * <dd>The privilege level granted to the notebook, activity stream, and
       *         invitations.    See the corresponding enumeration for details.</dd>
       *
       * <dt>allowPreview</dt>
       * <dd>Whether or not to grant "READ_NOTEBOOK" privilege without an
       *         authentication token, for authenticateToSharedNotebook(...).    With
       *         the change to "requireLogin" always being true for new shared
       *         notebooks, this is the only way to access a shared notebook without
       *         an authorization token.    This setting expires after the first use
       *         of authenticateToSharedNotebook(...) with a valid authentication
       *         token.</dd>
       *
       * <dt>recipientSettings</dt>
       * <dd>Settings intended for use only by the recipient of this shared
       *         notebook.    You should skip setting this value unless you want
       *         to change the value contained inside the structure, and only if
       *         you are the recipient.</dd>
       * </dl>
       */
  @js.native
  class SharedNotebook () extends js.Object {
    def this(args: evernoteLib.Anon_RecipientSettings) = this()
    var allowPreview: scala.Boolean = js.native
    var email: java.lang.String = js.native
    var id: scala.Double = js.native
    var notebookGuid: java.lang.String = js.native
    var notebookModifiable: scala.Boolean = js.native
    var privilege: SharedNotebookPrivilegeLevel = js.native
    var recipientSettings: SharedNotebookRecipientSettings = js.native
    var requireLogin: scala.Boolean = js.native
    var serviceCreated: scala.Double = js.native
    var serviceUpdated: scala.Double = js.native
    var shareKey: java.lang.String = js.native
    var userId: scala.Double = js.native
    var username: java.lang.String = js.native
  }
  
  @js.native
  sealed trait SharedNotebookInstanceRestrictions extends js.Object
  
  @js.native
  sealed trait SharedNotebookPrivilegeLevel extends js.Object
  
  /**
       * Settings meant for the recipient of a shared notebook, such as
       * for indicating which types of notifications the recipient wishes
       * for reminders, etc.
       *
       * The reminderNotifyEmail and reminderNotifyInApp fields have a
       * 3-state read value but a 2-state write value.    On read, it is
       * possible to observe "unset", true, or false.    The initial state is
       * "unset".    When you choose to set a value, you may set it to either
       * true or false, but you cannot unset the value.    Once one of these
       * members has a true/false value, it will always have a true/false
       * value.
       *
       * <dl>
       * <dt>reminderNotifyEmail</dt>
       * <dd>Indicates that the user wishes to receive daily e-mail notifications
       *         for reminders associated with the shared notebook.    This may be
       *         true only for business notebooks that belong to the business of
       *         which the user is a member.    You may only set this value on a
       *         notebook in your business.</dd>
       * <dt>reminderNotifyInApp</dt>
       * <dd>Indicates that the user wishes to receive notifications for
       *         reminders by applications that support providing such
       *         notifications.    The exact nature of the notification is defined
       *         by the individual applications.</dd>
       * </dl>
       *
       */
  @js.native
  class SharedNotebookRecipientSettings () extends js.Object {
    def this(args: evernoteLib.Anon_ReminderNotifyEmail) = this()
    var reminderNotifyEmail: scala.Boolean = js.native
    var reminderNotifyInApp: scala.Boolean = js.native
  }
  
  @js.native
  sealed trait SponsoredGroupRole extends js.Object
  
  /**
       *    This structure is given out by the NoteStore when a client asks to
       *    receive the current state of an account.    The client asks for the server's
       *    state one chunk at a time in order to allow clients to retrieve the state
       *    of a large account without needing to transfer the entire account in
       *    a single message.
       *
       *    The server always gives SyncChunks using an ascending series of Update
       *    Sequence Numbers (USNs).
       *
       * <dl>
       *    <dt>currentTime</dt>
       *        <dd>
       *        The server's current date and time.
       *        </dd>
       *
       *    <dt>chunkHighUSN</dt>
       *        <dd>
       *        The highest USN for any of the data objects represented
       *        in this sync chunk.    If there are no objects in the chunk, this will not be
       *        set.
       *        </dd>
       *
       *    <dt>updateCount</dt>
       *        <dd>
       *        The total number of updates that have been performed in
       *        the service for this account.    This is equal to the highest USN within the
       *        account at the point that this SyncChunk was generated.    If updateCount
       *        and chunkHighUSN are identical, that means that this is the last chunk
       *        in the account ... there is no more recent information.
       *        </dd>
       *
       *    <dt>notes</dt>
       *        <dd>
       *        If present, this is a list of non-expunged notes that
       *        have a USN in this chunk.    This will include notes that are "deleted"
       *        but not expunged (i.e. in the trash).    The notes will include their list
       *        of tags and resources, but the note content, resource content, resource
       *        recognition data and resource alternate data will not be supplied.
       *        </dd>
       *
       *    <dt>notebooks</dt>
       *        <dd>
       *        If present, this is a list of non-expunged notebooks that
       *        have a USN in this chunk.    This will include notebooks that are "deleted"
       *        but not expunged (i.e. in the trash).
       *        </dd>
       *
       *    <dt>tags</dt>
       *        <dd>
       *        If present, this is a list of the non-expunged tags that have a
       *        USN in this chunk.
       *        </dd>
       *
       *    <dt>searches</dt>
       *        <dd>
       *        If present, this is a list of non-expunged searches that
       *        have a USN in this chunk.
       *        </dd>
       *
       *    <dt>resources</dt>
       *        <dd>
       *        If present, this is a list of the non-expunged resources
       *        that have a USN in this chunk.    This will include the metadata for each
       *        resource, but not its binary contents or recognition data, which must be
       *        retrieved separately.
       *        </dd>
       *
       *    <dt>expungedNotes</dt>
       *        <dd>
       *        If present, the GUIDs of all of the notes that were
       *        permanently expunged in this chunk.
       *        </dd>
       *
       *    <dt>expungedNotebooks</dt>
       *        <dd>
       *        If present, the GUIDs of all of the notebooks that
       *        were permanently expunged in this chunk.    When a notebook is expunged,
       *        this implies that all of its child notes (and their resources) were
       *        also expunged.
       *        </dd>
       *
       *    <dt>expungedTags</dt>
       *        <dd>
       *        If present, the GUIDs of all of the tags that were
       *        permanently expunged in this chunk.
       *        </dd>
       *
       *    <dt>expungedSearches</dt>
       *        <dd>
       *        If present, the GUIDs of all of the saved searches
       *        that were permanently expunged in this chunk.
       *        </dd>
       *
       *    <dt>linkedNotebooks</dt>
       *        <dd>
       *        If present, this is a list of non-expunged LinkedNotebooks that
       *        have a USN in this chunk.
       *        </dd>
       *
       *    <dt>expungedLinkedNotebooks</dt>
       *        <dd>
       *        If present, the GUIDs of all of the LinkedNotebooks
       *        that were permanently expunged in this chunk.
       *        </dd>
       *    </dl>
       */
  @js.native
  class SyncChunk () extends js.Object {
    def this(args: evernoteLib.Anon_ExpungedNotes) = this()
    var chunkHighUSN: scala.Double = js.native
    var currentTime: scala.Double = js.native
    var expungedLinkedNotebooks: js.Array[java.lang.String] = js.native
    var expungedNotebooks: js.Array[java.lang.String] = js.native
    var expungedNotes: js.Array[java.lang.String] = js.native
    var expungedSearches: js.Array[java.lang.String] = js.native
    var expungedTags: js.Array[java.lang.String] = js.native
    var linkedNotebooks: js.Array[LinkedNotebook] = js.native
    var notebooks: js.Array[Notebook] = js.native
    var notes: js.Array[Note] = js.native
    var resources: js.Array[Resource] = js.native
    var searches: js.Array[SavedSearch] = js.native
    var tags: js.Array[Tag] = js.native
    var updateCount: scala.Double = js.native
  }
  
  /**
       *    This structure is used with the 'getFilteredSyncChunk' call to provide
       *    fine-grained control over the data that's returned when a client needs
       *    to synchronize with the service. Each flag in this structure specifies
       *    whether to include one class of data in the results of that call.
       *
       * <dl>
       *    <dt>includeNotes</dt>
       *        <dd>
       *        If true, then the server will include the SyncChunks.notes field
       *        </dd>
       *
       *    <dt>includeNoteResources</dt>
       *        <dd>
       *        If true, then the server will include the 'resources' field on all of
       *        the Notes that are in SyncChunk.notes.
       *        If 'includeNotes' is false, then this will have no effect.
       *        </dd>
       *
       *    <dt>includeNoteAttributes</dt>
       *        <dd>
       *        If true, then the server will include the 'attributes' field on all of
       *        the Notes that are in SyncChunks.notes.
       *        If 'includeNotes' is false, then this will have no effect.
       *        </dd>
       *
       *    <dt>includeNotebooks</dt>
       *        <dd>
       *        If true, then the server will include the SyncChunks.notebooks field
       *        </dd>
       *
       *    <dt>includeTags</dt>
       *        <dd>
       *        If true, then the server will include the SyncChunks.tags field
       *        </dd>
       *
       *    <dt>includeSearches</dt>
       *        <dd>
       *        If true, then the server will include the SyncChunks.searches field
       *        </dd>
       *
       *    <dt>includeResources</dt>
       *        <dd>
       *        If true, then the server will include the SyncChunks.resources field.
       *        Since the Resources are also provided with their Note
       *        (in the Notes.resources list), this is primarily useful for clients that
       *        want to watch for changes to individual Resources due to recognition data
       *        being added.
       *        </dd>
       *
       *    <dt>includeLinkedNotebooks</dt>
       *        <dd>
       *        If true, then the server will include the SyncChunks.linkedNotebooks field.
       *        </dd>
       *
       *    <dt>includeExpunged</dt>
       *        <dd>
       *        If true, then the server will include the 'expunged' data for any type
       *        of included data.    For example, if 'includeTags' and 'includeExpunged'
       *        are both true, then the SyncChunks.expungedTags field will be set with
       *        the GUIDs of tags that have been expunged from the server.
       *        </dd>
       *
       *    <dt>includeNoteApplicationDataFullMap</dt>
       *        <dd>
       *        If true, then the values for the applicationData map will be filled
       *        in, assuming notes and note attributes are being returned.    Otherwise,
       *        only the keysOnly field will be filled in.
       *        </dd>
       *
       *    <dt>includeResourceApplicationDataFullMap</dt>
       *        <dd>
       *        If true, then the fullMap values for the applicationData map will be
       *        filled in, assuming resources and resource attributes are being returned
       *        (includeResources is true).    Otherwise, only the keysOnly field will be
       *        filled in.
       *        </dd>
       *
       *    <dt>includeNoteResourceApplicationDataFullMap</dt>
       *        <dd>
       *        If true, then the fullMap values for the applicationData map will be
       *        filled in for resources found inside of notes, assuming resources are
       *        being returned in notes (includeNoteResources is true).    Otherwise,
       *        only the keysOnly field will be filled in.
       *        </dd>
       *
       *    <dt>requireNoteContentClass</dt>
       *        <dd>
       *        If set, then only send notes whose content class matches this value.
       *        The value can be a literal match or, if the last character is an
       *        asterisk, a prefix match.
       *        </dd>
       *    </dl>
       */
  @js.native
  class SyncChunkFilter () extends js.Object {
    def this(args: evernoteLib.Anon_IncludeNotes) = this()
    var includeExpunged: scala.Boolean = js.native
    var includeLinkedNotebooks: scala.Boolean = js.native
    var includeNoteApplicationDataFullMap: scala.Boolean = js.native
    var includeNoteAttributes: scala.Boolean = js.native
    var includeNoteResourceApplicationDataFullMap: scala.Boolean = js.native
    var includeNoteResources: scala.Boolean = js.native
    var includeNotebooks: scala.Boolean = js.native
    var includeNotes: scala.Boolean = js.native
    var includeResourceApplicationDataFullMap: scala.Boolean = js.native
    var includeResources: scala.Boolean = js.native
    var includeSearches: scala.Boolean = js.native
    var includeTags: scala.Boolean = js.native
    var requireNoteContentClass: java.lang.String = js.native
  }
  
  /**
       *    This structure encapsulates the information about the state of the
       *    user's account for the purpose of "state based" synchronization.
       * <dl>
       *    <dt>currentTime</dt>
       *        <dd>
       *        The server's current date and time.
       *        </dd>
       *
       *    <dt>fullSyncBefore</dt>
       *        <dd>
       *        The cutoff date and time for client caches to be
       *        updated via incremental synchronization.    Any clients that were last
       *        synched with the server before this date/time must do a full resync of all
       *        objects.    This cutoff point will change over time as archival data is
       *        deleted or special circumstances on the service require resynchronization.
       *        </dd>
       *
       *    <dt>updateCount</dt>
       *        <dd>
       *        Indicates the total number of transactions that have
       *        been committed within the account.    This reflects (for example) the
       *        number of discrete additions or modifications that have been made to
       *        the data in this account (tags, notes, resources, etc.).
       *        This number is the "high water mark" for Update Sequence Numbers (USN)
       *        within the account.
       *        </dd>
       *
       *    <dt>uploaded</dt>
       *        <dd>
       *        The total number of bytes that have been uploaded to
       *        this account in the current monthly period.    This can be compared against
       *        Accounting.uploadLimit (from the UserStore) to determine how close the user
       *        is to their monthly upload limit.
       *        This value may not be present if the SyncState has been retrieved by
       *        a caller that only has read access to the account.
       *        </dd>
       *    </dl>
       */
  @js.native
  class SyncState () extends js.Object {
    def this(args: evernoteLib.Anon_FullSyncBefore) = this()
    var currentTime: scala.Double = js.native
    var fullSyncBefore: scala.Double = js.native
    var updateCount: scala.Double = js.native
    var uploaded: scala.Double = js.native
  }
  
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
  @js.native
  class Tag () extends js.Object {
    def this(args: evernoteLib.Anon_UpdateSequenceNumGuid) = this()
    var guid: java.lang.String = js.native
    var name: java.lang.String = js.native
    var parentGuid: java.lang.String = js.native
    var updateSequenceNum: scala.Double = js.native
  }
  
  /**
       *    This represents the information about a single user account.
       * <dl>
       *    <dt>id</dt>
       *        <dd>The unique numeric identifier for the account, which will not
       *        change for the lifetime of the account.
       *        </dd>
       *
       *    <dt>username</dt>
       *        <dd>The name that uniquely identifies a single user account. This name
       *        may be presented by the user, along with their password, to log into
       *        their account.
       *        May only contain a-z, 0-9, or '-', and may not start or end with the '-'
       *        <br/>
       *        Length:    EDAM_USER_USERNAME_LEN_MIN - EDAM_USER_USERNAME_LEN_MAX
       *        <br/>
       *        Regex:    EDAM_USER_USERNAME_REGEX
       *        </dd>
       *
       *    <dt>email</dt>
       *        <dd>The email address registered for the user.    Must comply with
       *        RFC 2821 and RFC 2822.<br/>
       *        Third party applications that authenticate using OAuth do not have
       *        access to this field.
       *        Length:    EDAM_EMAIL_LEN_MIN - EDAM_EMAIL_LEN_MAX
       *        <br/>
       *        Regex:    EDAM_EMAIL_REGEX
       *        </dd>
       *
       *    <dt>name</dt>
       *        <dd>The printable name of the user, which may be a combination
       *        of given and family names.    This is used instead of separate "first"
       *        and "last" names due to variations in international name format/order.
       *        May not start or end with a whitespace character.    May contain any
       *        character but carriage return or newline (Unicode classes Zl and Zp).
       *        <br/>
       *        Length:    EDAM_USER_NAME_LEN_MIN - EDAM_USER_NAME_LEN_MAX
       *        <br/>
       *        Regex:    EDAM_USER_NAME_REGEX
       *        </dd>
       *
       *    <dt>timezone</dt>
       *        <dd>The zone ID for the user's default location.    If present,
       *        this may be used to localize the display of any timestamp for which no
       *        other timezone is available.
       *        The format must be encoded as a standard zone ID such as
       *        "America/Los_Angeles" or "GMT+08:00"
       *        <br/>
       *        Length:    EDAM_TIMEZONE_LEN_MIN - EDAM_TIMEZONE_LEN_MAX
       *        <br/>
       *        Regex:    EDAM_TIMEZONE_REGEX
       *        </dd>
       *
       *    <dt>privilege</dt>
       *        <dd>The level of access permitted for the user.
       *        </dd>
       *
       *    <dt>created</dt>
       *        <dd>The date and time when this user account was created in the
       *        service.
       *        </dd>
       *
       *    <dt>updated</dt>
       *        <dd>The date and time when this user account was last modified
       *        in the service.
       *        </dd>
       *
       *    <dt>deleted</dt>
       *        <dd>If the account has been deleted from the system (e.g. as
       *        the result of a legal request by the user), the date and time of the
       *        deletion will be represented here.    If not, this value will not be set.
       *        </dd>
       *
       *    <dt>active</dt>
       *        <dd>If the user account is available for login and
       *        synchronization, this flag will be set to true.
       *        </dd>
       *
       *    <dt>shardId</dt>
       *        <dd>DEPRECATED - Client applications should have no need to use this field.
       *        </dd>
       *
       *    <dt>attributes</dt>
       *        <dd>If present, this will contain a list of the attributes
       *        for this user account.
       *        </dd>
       *
       *    <dt>accounting</dt>
       *        <dd>Bookkeeping information for the user's subscription.
       *        </dd>
       *
       *    <dt>premiumInfo</dt>
       *        <dd>If present, this will contain a set of commerce information
       *        relating to the user's premium service level.
       *        </dd>
       *
       *    <dt>businessUserInfo</dt>
       *        <dd>If present, this will contain a set of business information
       *        relating to the user's business membership.    If not present, the
       *        user is not currently part of a business.
       *        </dd>
       *    </dl>
       */
  @js.native
  class User () extends js.Object {
    def this(args: evernoteLib.Anon_Accounting) = this()
    var accounting: Accounting = js.native
    var active: scala.Boolean = js.native
    var attributes: UserAttributes = js.native
    var businessUserInfo: BusinessUserInfo = js.native
    var created: scala.Double = js.native
    var deleted: scala.Double = js.native
    var email: java.lang.String = js.native
    var id: scala.Double = js.native
    var name: java.lang.String = js.native
    var premiumInfo: PremiumInfo = js.native
    var privilege: PrivilegeLevel = js.native
    var shardId: java.lang.String = js.native
    var timezone: java.lang.String = js.native
    var updated: scala.Double = js.native
    var username: java.lang.String = js.native
  }
  
  /**
       *    A structure holding the optional attributes that can be stored
       *    on a User.    These are generally less critical than the core User fields.
       *
       * <dl>
       *    <dt>defaultLocationName</dt>
       *        <dd>the location string that should be associated
       *        with the user in order to determine where notes are taken if not otherwise
       *        specified.<br/>
       *        Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX
       *        </dd>
       *
       *    <dt>defaultLatitude</dt>
       *        <dd>if set, this is the latitude that should be
       *        assigned to any notes that have no other latitude information.
       *        </dd>
       *
       *    <dt>defaultLongitude</dt>
       *        <dd>if set, this is the longitude that should be
       *        assigned to any notes that have no other longitude information.
       *        </dd>
       *
       *    <dt>preactivation</dt>
       *        <dd>if set, the user account is not yet confirmed for
       *        login.    I.e. the account has been created, but we are still waiting for
       *        the user to complete the activation step.
       *        </dd>
       *
       *    <dt>viewedPromotions</dt>
       *        <dd>a list of promotions the user has seen.
       *         This list may occasionally be modified by the system when promotions are
       *         no longer available.<br/>
       *         Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX
       *        </dd>
       *
       *    <dt>incomingEmailAddress</dt>
       *        <dd>if set, this is the email address that the
       *         user may send email to in order to add an email note directly into the
       *         account via the SMTP email gateway.    This is the part of the email
       *         address before the '@' symbol ... our domain is not included.
       *         If this is not set, the user may not add notes via the gateway.<br/>
       *         Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX
       *        </dd>
       *
       *    <dt>recentMailedAddresses</dt>
       *        <dd>if set, this will contain a list of email
       *         addresses that have recently been used as recipients
       *         of outbound emails by the user.    This can be used to pre-populate a
       *         list of possible destinations when a user wishes to send a note via
       *         email.<br/>
       *         Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX each<br/>
       *         Max:    EDAM_USER_RECENT_MAILED_ADDRESSES_MAX entries
       *        </dd>
       *
       *    <dt>comments</dt>
       *        <dd>Free-form text field that may hold general support
       *         information, etc.<br/>
       *         Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX
       *        </dd>
       *
       *    <dt>dateAgreedToTermsOfService</dt>
       *        <dd>The date/time when the user agreed to
       *         the terms of service.    This can be used as the effective "start date"
       *         for the account.
       *        </dd>
       *
       *    <dt>maxReferrals</dt>
       *        <dd>The number of referrals that the user is permitted
       *         to make.
       *        </dd>
       *
       *    <dt>referralCount</dt>
       *        <dd>The number of referrals sent from this account.
       *        </dd>
       *
       *    <dt>refererCode</dt>
       *        <dd>A code indicating where the user was sent from. AKA
       *         promotion code
       *        </dd>
       *
       *    <dt>sentEmailDate</dt>
       *        <dd>The most recent date when the user sent outbound
       *         emails from the service.    Used with sentEmailCount to limit the number
       *         of emails that can be sent per day.
       *        </dd>
       *
       *    <dt>sentEmailCount</dt>
       *        <dd>The number of emails that were sent from the user
       *         via the service on sentEmailDate.    Used to enforce a limit on the number
       *         of emails per user per day to prevent spamming.
       *        </dd>
       *
       *    <dt>dailyEmailLimit</dt>
       *        <dd>If set, this is the maximum number of emails that
       *         may be sent in a given day from this account.    If unset, the server will
       *         use the configured default limit.
       *        </dd>
       *
       *    <dt>emailOptOutDate</dt>
       *        <dd>If set, this is the date when the user asked
       *         to be excluded from offers and promotions sent by Evernote.    If not set,
       *         then the user currently agrees to receive these messages.
       *        </dd>
       *
       *    <dt>partnerEmailOptInDate</dt>
       *        <dd>If set, this is the date when the user asked
       *         to be included in offers and promotions sent by Evernote's partners.
       *         If not sent, then the user currently does not agree to receive these
       *         emails.
       *        </dd>
       *
       *    <dt>preferredLanguage</dt>
       *        <dd>a 2 character language codes based on:
       *                http://ftp.ics.uci.edu/pub/ietf/http/related/iso639.txt used for
       *             localization purposes to determine what language to use for the web
       *             interface and for other direct communication (e.g. emails).
       *        </dd>
       *
       *    <dt>preferredCountry</dt>
       *        <dd>Preferred country code based on ISO 3166-1-alpha-2 indicating the
       *        users preferred country</dd>
       *
       *    <dt>clipFullPage</dt>
       *        <dd>Boolean flag set to true if the user wants to clip full pages by
       *        default when they use the web clipper without a selection.</dd>
       *
       *    <dt>twitterUserName</dt>
       *        <dd>The username of the account of someone who has chosen to enable
       *        Twittering into Evernote.    This value is subject to change, since users
       *        may change their Twitter user name.</dd>
       *
       *    <dt>twitterId</dt>
       *        <dd>The unique identifier of the user's Twitter account if that user
       *        has chosen to enable Twittering into Evernote.</dd>
       *
       *    <dt>groupName</dt>
       *        <dd>A name identifier used to identify a particular set of branding and
       *         light customization.</dd>
       *
       *    <dt>recognitionLanguage</dt>
       *        <dd>a 2 character language codes based on:
       *                http://ftp.ics.uci.edu/pub/ietf/http/related/iso639.txt
       *                If set, this is used to determine the language that should be used
       *                when processing images and PDF files to find text.
       *                If not set, then the 'preferredLanguage' will be used.
       *        </dd>
       *
       *    <dt>educationalInstitution</dt>
       *        <dd>a flag indicating that the user is part of an educational institution which
       *        makes them eligible for discounts on bulk purchases
       *        </dd>
       *
       *    <dt>businessAddress</dt>
       *        <dd>A string recording the business address of a Sponsored Account user who has requested invoicing.
       *        </dd>
       *
       *    <dt>hideSponsorBilling</dt>
       *        <dd>A flag indicating whether to hide the billing information on a sponsored
       *                account owner's settings page
       *        </dd>
       *
       *    <dt>taxExempt</dt>
       *        <dd>A flag indicating the user's sponsored group is exempt from sale tax
       *        </dd>
       *
       *    <dt>useEmailAutoFiling</dt>
       *        <dd>A flag indicating whether the user chooses to allow Evernote to automatically
       *                file and tag emailed notes
       *        </dd>
       *
       *    <dt>reminderEmailConfig</dt>
       *        <dd>Configuration state for whether or not the user wishes to receive
       *                reminder e-mail.    This setting applies to both the reminder e-mail sent
       *                for personal reminder notes and for the reminder e-mail sent for reminder
       *                notes in the user's business notebooks that the user has configured for
       *                e-mail notifications.
       *        </dd>
       *    </dl>
       */
  @js.native
  class UserAttributes () extends js.Object {
    def this(args: evernoteLib.Anon_EducationalDiscount) = this()
    var businessAddress: java.lang.String = js.native
    var clipFullPage: scala.Boolean = js.native
    var comments: java.lang.String = js.native
    var dailyEmailLimit: scala.Double = js.native
    var dateAgreedToTermsOfService: scala.Double = js.native
    var defaultLatitude: scala.Double = js.native
    var defaultLocationName: java.lang.String = js.native
    var defaultLongitude: scala.Double = js.native
    var educationalDiscount: scala.Boolean = js.native
    var emailOptOutDate: scala.Double = js.native
    var groupName: java.lang.String = js.native
    var hideSponsorBilling: scala.Boolean = js.native
    var incomingEmailAddress: java.lang.String = js.native
    var maxReferrals: scala.Double = js.native
    var partnerEmailOptInDate: scala.Double = js.native
    var preactivation: scala.Boolean = js.native
    var preferredCountry: java.lang.String = js.native
    var preferredLanguage: java.lang.String = js.native
    var recentMailedAddresses: js.Array[java.lang.String] = js.native
    var recognitionLanguage: java.lang.String = js.native
    var refererCode: java.lang.String = js.native
    var referralCount: scala.Double = js.native
    var referralProof: java.lang.String = js.native
    var reminderEmailConfig: ReminderEmailConfig = js.native
    var sentEmailCount: scala.Double = js.native
    var sentEmailDate: scala.Double = js.native
    var taxExempt: scala.Boolean = js.native
    var twitterId: java.lang.String = js.native
    var twitterUserName: java.lang.String = js.native
    var useEmailAutoFiling: scala.Boolean = js.native
    var viewedPromotions: js.Array[java.lang.String] = js.native
  }
  
  /**
       * Service:    UserStore
       * <p>
       * The UserStore service is primarily used by EDAM clients to establish
       * authentication via username and password over a trusted connection (e.g.
       * SSL).    A client's first call to this interface should be checkVersion() to
       * ensure that the client's software is up to date.
       * </p>
       * All calls which require an authenticationToken may throw an
       * EDAMUserException for the following reasons:
       *    <ul>
       *     <li> AUTH_EXPIRED "authenticationToken" - token has expired
       *     <li> BAD_DATA_FORMAT "authenticationToken" - token is malformed
       *     <li> DATA_REQUIRED "authenticationToken" - token is empty
       *     <li> INVALID_AUTH "authenticationToken" - token signature is invalid
       * </ul>
       */
  @js.native
  class UserStoreClient () extends js.Object {
    var seqid: scala.Double = js.native
    /**
             * This is used to take an existing authentication token that grants access
             * to an individual user account (returned from 'authenticate',
             * 'authenticateLongSession' or an OAuth authorization) and obtain an additional
             * authentication token that may be used to access business notebooks if the user
             * is a member of an Evernote Business account.
             *
             * The resulting authentication token may be used to make NoteStore API calls
             * against the business using the NoteStore URL returned in the result.
             *
             * @param authenticationToken
             *     The authentication token for the user. This may not be a shared authentication
             *     token (returned by NoteStore.authenticateToSharedNotebook or
             *     NoteStore.authenticateToSharedNote) or a business authentication token.
             *
             * @return
             *     The result of the authentication, with the token granting access to the
             *     business in the result's 'authenticationToken' field. The URL that must
             *     be used to access the business account NoteStore will be returned in the
             *     result's 'noteStoreUrl' field.    The 'User' field will
             *     not be set in the result.
             *
             * @throws EDAMUserException <ul>
             *     <li> PERMISSION_DENIED "authenticationToken" - the provided authentication token
             *                is a shared or business authentication token. </li>
             *     <li> PERMISSION_DENIED "Business" - the user identified by the provided
             *                authentication token is not currently a member of a business. </li>
             *     <li> PERMISSION_DENIED "Business.status" - the business that the user is a
             *                member of is not currently in an active status. </li>
             * </ul>
             */
    def authenticateToBusiness(cb: Callback[AuthenticationResult]): scala.Unit = js.native
    /**
             * This should be the first call made by a client to the EDAM service.    It
             * tells the service what protocol version is used by the client.    The
             * service will then return true if the client is capable of talking to
             * the service, and false if the client's protocol version is incompatible
             * with the service, so the client must upgrade.    If a client receives a
             * false value, it should report the incompatibility to the user and not
             * continue with any more EDAM requests (UserStore or NoteStore).
             *
             * @param clientName
             *     This string provides some information about the client for
             *     tracking/logging on the service.    It should provide information about
             *     the client's software and platform. The structure should be:
             *     application/version; platform/version; [ device/version ]
             *     E.g. "Evernote Windows/3.0.1; Windows/XP SP3".
             *
             * @param edamVersionMajor
             *     This should be the major protocol version that was compiled by the
             *     client.    This should be the current value of the EDAM_VERSION_MAJOR
             *     constant for the client.
             *
             * @param edamVersionMinor
             *     This should be the major protocol version that was compiled by the
             *     client.    This should be the current value of the EDAM_VERSION_MINOR
             *     constant for the client.
             */
    def checkVersion(
      clientName: java.lang.String,
      edamVersionMajor: scala.Double,
      edamVersionMinor: scala.Double,
      cb: Callback[scala.Boolean]
    ): scala.Unit = js.native
    /**
             * This provides bootstrap information to the client. Various bootstrap
             * profiles and settings may be used by the client to configure itself.
             *
             * @param locale
             *     The client's current locale, expressed in language[_country]
             *     format. E.g., "en_US". See ISO-639 and ISO-3166 for valid
             *     language and country codes.
             *
             * @return
             *     The bootstrap information suitable for this client.
             */
    def getBootstrapInfo(locale: java.lang.String, cb: Callback[BootstrapInfo]): scala.Unit = js.native
    /**
             * Returns the URL that should be used to talk to the NoteStore for the
             * account represented by the provided authenticationToken.
             * This method isn't needed by most clients, who can retrieve the correct
             * NoteStore URL from the AuthenticationResult returned from the authenticate
             * or refreshAuthentication calls. This method is typically only needed
             * to look up the correct URL for a long-lived session token (e.g. for an
             * OAuth web service).
             */
    def getNoteStoreUrl(cb: Callback[java.lang.String]): scala.Unit = js.native
    /**
             * Asks the UserStore about the publicly available location information for
             * a particular username.
             *
             * @throws EDAMUserException <ul>
             *     <li> DATA_REQUIRED "username" - username is empty
             * </ul>
             */
    def getPublicUserInfo(username: java.lang.String, cb: Callback[PublicUserInfo]): scala.Unit = js.native
    /**
             * Returns the User corresponding to the provided authentication token,
             * or throws an exception if this token is not valid.
             * The level of detail provided in the returned User structure depends on
             * the access level granted by the token, so a web service client may receive
             * fewer fields than an integrated desktop client.
             */
    def getUser(cb: Callback[User]): scala.Unit = js.native
    /**
             * Revoke an existing long lived authentication token. This can be used to
             * revoke OAuth tokens or tokens created by calling authenticateLongSession,
             * and allows a user to effectively log out of Evernote from the perspective
             * of the application that holds the token. The authentication token that is
             * passed is immediately revoked and may not be used to call any authenticated
             * EDAM function.
             *
             * @param authenticationToken the authentication token to revoke.
             *
             * @throws EDAMUserException <ul>
             *     <li> DATA_REQUIRED "authenticationToken" - no authentication token provided
             *     <li> BAD_DATA_FORMAT "authenticationToken" - the authentication token is not well formed
             *     <li> INVALID_AUTH "authenticationToken" - the authentication token is invalid
             *     <li> AUTH_EXPIRED "authenticationToken" - the authentication token is expired or
             *         is already revoked.
             * </ul>
             */
    def revokeLongSession(cb: Callback[scala.Unit]): scala.Unit = js.native
  }
  
  /**
       * A value for the "recipe" key in the "classifications" map in NoteAttributes
       * that indicates the Evernote service has classified a note as being a recipe.
       */
  var CLASSIFICATION_RECIPE_SERVICE_RECIPE: java.lang.String = js.native
  /**
       * A value for the "recipe" key in the "classifications" map in NoteAttributes
       * that indicates the user has classified a note as being a non-recipe.
       */
  var CLASSIFICATION_RECIPE_USER_NON_RECIPE: java.lang.String = js.native
  /**
       * A value for the "recipe" key in the "classifications" map in NoteAttributes
       * that indicates the user has classified a note as being a recipe.
       */
  var CLASSIFICATION_RECIPE_USER_RECIPE: java.lang.String = js.native
  /**
       * The total length of an entry in an applicationData LazyMap, which
       * is the sum of the length of the key and the value for the entry.
       */
  var EDAM_APPLICATIONDATA_ENTRY_LEN_MAX: scala.Double = js.native
  /**
       * Maximum length of an application name, which is the key in an
       * applicationData LazyMap found in entities such as Resources and
       * Notes.
       */
  var EDAM_APPLICATIONDATA_NAME_LEN_MAX: scala.Double = js.native
  /**
       * Minimum length of an application name, which is the key in an
       * applicationData LazyMap found in entities such as Resources and
       * Notes.
       */
  var EDAM_APPLICATIONDATA_NAME_LEN_MIN: scala.Double = js.native
  /**
       * An application name must match this regex.    An application
       * name is the key portion of an entry in an applicationData
       * map as found in entities such as Resources and Notes.
       * Note that even if both the name and value regexes match,
       * it is still necessary to check the sum of the lengths
       * against EDAM_APPLICATIONDATA_ENTRY_LEN_MAX.
       */
  var EDAM_APPLICATIONDATA_NAME_REGEX: java.lang.String = js.native
  /**
       * Maximum length of an applicationData value in a LazyMap, found
       * in entities such as Resources and Notes.    Note, however, that
       * the sum of the size of hte key and value is constrained by
       * EDAM_APPLICATIONDATA_ENTRY_LEN_MAX, so the maximum length, in
       * practice, depends upon the key value being used.
       */
  var EDAM_APPLICATIONDATA_VALUE_LEN_MAX: scala.Double = js.native
  /**
       * Minimum length of an applicationData value in a LazyMap, found
       * in entities such as Resources and Notes.
       */
  var EDAM_APPLICATIONDATA_VALUE_LEN_MIN: scala.Double = js.native
  /**
       * An applicationData map value must match this regex.
       * Note that even if both the name and value regexes match,
       * it is still necessary to check the sum of the lengths
       * against EDAM_APPLICATIONDATA_ENTRY_LEN_MAX.
       */
  var EDAM_APPLICATIONDATA_VALUE_REGEX: java.lang.String = js.native
  /**
       * Maximum length of any string-based attribute, in Unicode chars
       */
  var EDAM_ATTRIBUTE_LEN_MAX: scala.Double = js.native
  /**
       * Minimum length of any string-based attribute, in Unicode chars
       */
  var EDAM_ATTRIBUTE_LEN_MIN: scala.Double = js.native
  /**
       * The maximum number of values that can be stored in a list-based attribute
       * (e.g. see UserAttributes.recentMailedAddresses)
       */
  var EDAM_ATTRIBUTE_LIST_MAX: scala.Double = js.native
  /**
       * The maximum number of entries that can be stored in a map-based attribute
       * such as applicationData fields in Resources and Notes.
       */
  var EDAM_ATTRIBUTE_MAP_MAX: scala.Double = js.native
  /**
       * Any string-based attribute must match the provided regular expression.
       * This excludes all Unicode line endings and control characters.
       */
  var EDAM_ATTRIBUTE_REGEX: java.lang.String = js.native
  /**
       * Maximum number of Notebooks in a business account
       */
  var EDAM_BUSINESS_NOTEBOOKS_MAX: scala.Double = js.native
  /**
       * The maximum length, in Unicode characters, of a description for a business
       * notebook.
       */
  var EDAM_BUSINESS_NOTEBOOK_DESCRIPTION_LEN_MAX: scala.Double = js.native
  /**
       * The minimum length, in Unicode characters, of a description for a business
       * notebook.
       */
  var EDAM_BUSINESS_NOTEBOOK_DESCRIPTION_LEN_MIN: scala.Double = js.native
  /**
       * All business notebook descriptions must match this pattern.
       * This excludes control chars or line/paragraph separators.
       * The string may not begin or end with whitespace.
       */
  var EDAM_BUSINESS_NOTEBOOK_DESCRIPTION_REGEX: java.lang.String = js.native
  /**
       * Maximum number of Notes per business account
       */
  var EDAM_BUSINESS_NOTES_MAX: scala.Double = js.native
  /**
       * The maximum length of a business phone number.
       */
  var EDAM_BUSINESS_PHONE_NUMBER_LEN_MAX: scala.Double = js.native
  /**
       * Maximum number of Tags per business account.
       */
  var EDAM_BUSINESS_TAGS_MAX: scala.Double = js.native
  /**
       * The maximum length of an Evernote Business URI
       */
  var EDAM_BUSINESS_URI_LEN_MAX: scala.Double = js.native
  /**
       * The content class prefix used for structured notes created by
       * Evernote Food that captures the experience of a particular meal.
       * When performing a wildcard search via filtered sync chunks or search
       * strings, the * character must be appended to this constant.
       */
  var EDAM_CONTENT_CLASS_FOOD_MEAL: java.lang.String = js.native
  /**
       * The content class prefix used for structured notes created by Evernote
       * Hello that represents an encounter with a person. When performing a
       * wildcard search via filtered sync chunks or search strings, the *
       * character must be appended to this constant.
       */
  var EDAM_CONTENT_CLASS_HELLO_ENCOUNTER: java.lang.String = js.native
  /**
       * The content class prefix used for structured notes created by Evernote
       * Hello that represents the user's profile. When performing a
       * wildcard search via filtered sync chunks or search strings, the *
       * character must be appended to this constant.
       */
  var EDAM_CONTENT_CLASS_HELLO_PROFILE: java.lang.String = js.native
  /**
       * The content class value used for structured notes created by Evernote
       * Penultimate that represents a Penultimate notebook.
       */
  var EDAM_CONTENT_CLASS_PENULTIMATE_NOTEBOOK: java.lang.String = js.native
  /**
       * The content class prefix used for structured notes created by Evernote
       * Penultimate. When performing a wildcard search via filtered sync chunks
       * or search strings, the * character must be appended to this constant.
       */
  var EDAM_CONTENT_CLASS_PENULTIMATE_PREFIX: java.lang.String = js.native
  /**
       * The content class value used for structured image notes created by Evernote
       * Skitch.
       */
  var EDAM_CONTENT_CLASS_SKITCH: java.lang.String = js.native
  /**
       * The content class value used for structured PDF notes created by Evernote
       * Skitch.
       */
  var EDAM_CONTENT_CLASS_SKITCH_PDF: java.lang.String = js.native
  /**
       * The content class prefix used for structured notes created by Evernote
       * Skitch. When performing a wildcard search via filtered sync chunks
       * or search strings, the * character must be appended to this constant.
       */
  var EDAM_CONTENT_CLASS_SKITCH_PREFIX: java.lang.String = js.native
  /**
       * Maximum length of the device description string associated with long sessions.
       */
  var EDAM_DEVICE_DESCRIPTION_LEN_MAX: scala.Double = js.native
  /**
       * Regular expression for device description strings associated with long sessions.
       */
  var EDAM_DEVICE_DESCRIPTION_REGEX: java.lang.String = js.native
  /**
       * Maximum length of the device identifier string associated with long sessions.
       */
  var EDAM_DEVICE_ID_LEN_MAX: scala.Double = js.native
  /**
       * Regular expression for device identifier strings associated with long sessions.
       */
  var EDAM_DEVICE_ID_REGEX: java.lang.String = js.native
  /**
       * A regular expression that matches the part of an email address after
       * the '@' symbol.
       */
  var EDAM_EMAIL_DOMAIN_REGEX: java.lang.String = js.native
  /**
       * The maximum length of any email address
       */
  var EDAM_EMAIL_LEN_MAX: scala.Double = js.native
  /**
       * The minimum length of any email address
       */
  var EDAM_EMAIL_LEN_MIN: scala.Double = js.native
  /**
       * A regular expression that matches the part of an email address before
       * the '@' symbol.
       */
  var EDAM_EMAIL_LOCAL_REGEX: java.lang.String = js.native
  /**
       * A regular expression that must match any email address given to Evernote.
       * Email addresses must comply with RFC 2821 and 2822.
       */
  var EDAM_EMAIL_REGEX: java.lang.String = js.native
  /**
       * The content class prefix used for all notes created by Evernote Food.
       * This prefix can be used to assemble individual content class strings,
       * or can be used to create a wildcard search to get all notes created by
       * Food. When performing a wildcard search via filtered sync chunks or
       * search strings, the * character must be appended to this constant.
       */
  var EDAM_FOOD_APP_CONTENT_CLASS_PREFIX: java.lang.String = js.native
  /**
       * The maximum length of a GUID generated by the Evernote service
       */
  var EDAM_GUID_LEN_MAX: scala.Double = js.native
  /**
       * The minimum length of a GUID generated by the Evernote service
       */
  var EDAM_GUID_LEN_MIN: scala.Double = js.native
  /**
       * GUIDs generated by the Evernote service will match the provided pattern
       */
  var EDAM_GUID_REGEX: java.lang.String = js.native
  /**
       * The exact length of a MD5 hash checksum, in binary bytes.
       * This is the exact length that must be matched for any binary hash
       * value.
       */
  var EDAM_HASH_LEN: scala.Double = js.native
  /**
       * The content class prefix used for all notes created by Evernote Hello.
       * This prefix can be used to assemble individual content class strings,
       * or can be used to create a wildcard search to get all notes created by
       * Hello. When performing a wildcard search via filtered sync chunks or
       * search strings, the * character must be appended to this constant.
       */
  var EDAM_HELLO_APP_CONTENT_CLASS_PREFIX: java.lang.String = js.native
  /**
       * The set of MIME types that Evernote will parse and index for
       * searching. With exception of images, and PDFs, which are
       * handled in a different way.
       */
  var EDAM_INDEXABLE_RESOURCE_MIME_TYPES: js.Array[java.lang.String] = js.native
  /**
       * Maximum number of name/value pairs allowed
       */
  var EDAM_MAX_PREFERENCES: scala.Double = js.native
  /**
       * Maximum number of values per preference name
       */
  var EDAM_MAX_VALUES_PER_PREFERENCE: scala.Double = js.native
  /**
       * The maximum length of any MIME type string given to Evernote
       */
  var EDAM_MIME_LEN_MAX: scala.Double = js.native
  /**
       * The minimum length of any MIME type string given to Evernote
       */
  var EDAM_MIME_LEN_MIN: scala.Double = js.native
  /**
       * Any MIME type string given to Evernote must match the provided pattern.
       * E.g.:    image/gif
       */
  var EDAM_MIME_REGEX: java.lang.String = js.native
  /**
       * The set of resource MIME types that are expected to be handled
       * correctly by all of the major Evernote client applications.
       */
  var EDAM_MIME_TYPES: js.Array[java.lang.String] = js.native
  /**
       * Canonical MIME type string for AAC audio resources
       */
  var EDAM_MIME_TYPE_AAC: java.lang.String = js.native
  /**
       * Canonical MIME type string for AMR audio resources
       */
  var EDAM_MIME_TYPE_AMR: java.lang.String = js.native
  /**
       * MIME type used for attachments of an unspecified type
       */
  var EDAM_MIME_TYPE_DEFAULT: java.lang.String = js.native
  /**
       * Canonical MIME type string for GIF image resources
       */
  var EDAM_MIME_TYPE_GIF: java.lang.String = js.native
  /**
       * Canonical MIME type string for Evernote Ink resources
       */
  var EDAM_MIME_TYPE_INK: java.lang.String = js.native
  /**
       * Canonical MIME type string for JPEG image resources
       */
  var EDAM_MIME_TYPE_JPEG: java.lang.String = js.native
  /**
       * Canonical MIME type string for MP4 audio resources
       */
  var EDAM_MIME_TYPE_M4A: java.lang.String = js.native
  /**
       * Canonical MIME type string for MP3 audio resources
       */
  var EDAM_MIME_TYPE_MP3: java.lang.String = js.native
  /**
       * Canonical MIME type string for MP4 video resources
       */
  var EDAM_MIME_TYPE_MP4_VIDEO: java.lang.String = js.native
  /**
       * Canonical MIME type string for PDF resources
       */
  var EDAM_MIME_TYPE_PDF: java.lang.String = js.native
  /**
       * Canonical MIME type string for PNG image resources
       */
  var EDAM_MIME_TYPE_PNG: java.lang.String = js.native
  /**
       * Canonical MIME type string for WAV audio resources
       */
  var EDAM_MIME_TYPE_WAV: java.lang.String = js.native
  /**
       * The maximum length of a Notebook.name, in Unicode characters
       */
  var EDAM_NOTEBOOK_NAME_LEN_MAX: scala.Double = js.native
  /**
       * The minimum length of a Notebook.name, in Unicode characters
       */
  var EDAM_NOTEBOOK_NAME_LEN_MIN: scala.Double = js.native
  /**
       * All Notebook.name fields must match this pattern.
       * This excludes control chars or line/paragraph separators.
       * The string may not begin or end with whitespace.
       */
  var EDAM_NOTEBOOK_NAME_REGEX: java.lang.String = js.native
  /**
       * Maximum number of shared notebooks per notebook
       */
  var EDAM_NOTEBOOK_SHARED_NOTEBOOK_MAX: scala.Double = js.native
  /**
       * The maximum length of a Notebook.stack, in Unicode characters
       */
  var EDAM_NOTEBOOK_STACK_LEN_MAX: scala.Double = js.native
  /**
       * The minimum length of a Notebook.stack, in Unicode characters
       */
  var EDAM_NOTEBOOK_STACK_LEN_MIN: scala.Double = js.native
  /**
       * All Notebook.stack fields must match this pattern.
       * This excludes control chars or line/paragraph separators.
       * The string may not begin or end with whitespace.
       */
  var EDAM_NOTEBOOK_STACK_REGEX: java.lang.String = js.native
  /**
       * The maximum length of the content class attribute of a note.
       */
  var EDAM_NOTE_CONTENT_CLASS_LEN_MAX: scala.Double = js.native
  /**
       * The minimum length of the content class attribute of a note.
       */
  var EDAM_NOTE_CONTENT_CLASS_LEN_MIN: scala.Double = js.native
  /**
       * The regular expression that the content class of a note must match
       * to be valid.
       */
  var EDAM_NOTE_CONTENT_CLASS_REGEX: java.lang.String = js.native
  /**
       * Maximum length of a Note.content field
       * Note.content fields must comply with the ENML DTD.
       */
  var EDAM_NOTE_CONTENT_LEN_MAX: scala.Double = js.native
  /**
       * Minimum length of a Note.content field.
       * Note.content fields must comply with the ENML DTD.
       */
  var EDAM_NOTE_CONTENT_LEN_MIN: scala.Double = js.native
  /**
       * The maximum number of Resources per Note
       */
  var EDAM_NOTE_RESOURCES_MAX: scala.Double = js.native
  /**
       * Maximum total size of a Note that can be added to a Free account.
       * The size of a note is calculated as:
       * ENML content length (in Unicode characters) plus the sum of all resource
       * sizes (in bytes).
       */
  var EDAM_NOTE_SIZE_MAX_FREE: scala.Double = js.native
  /**
       * Maximum total size of a Note that can be added to a Premium account.
       * The size of a note is calculated as:
       * ENML content length (in Unicode characters) plus the sum of all resource
       * sizes (in bytes).
       */
  var EDAM_NOTE_SIZE_MAX_PREMIUM: scala.Double = js.native
  /**
       * Standardized value for the 'source' NoteAttribute for notes that
       * were clipped from an email message.
       */
  var EDAM_NOTE_SOURCE_MAIL_CLIP: java.lang.String = js.native
  /**
       * Standardized value for the 'source' NoteAttribute for notes that
       * were created via email sent to Evernote's email interface.
       */
  var EDAM_NOTE_SOURCE_MAIL_SMTP_GATEWAY: java.lang.String = js.native
  /**
       * Standardized value for the 'source' NoteAttribute for notes that
       * were clipped from the web in some manner.
       */
  var EDAM_NOTE_SOURCE_WEB_CLIP: java.lang.String = js.native
  /**
       * The maximum number of Tags per Note
       */
  var EDAM_NOTE_TAGS_MAX: scala.Double = js.native
  /**
       * The maximum length of a Note.title, in Unicode characters
       */
  var EDAM_NOTE_TITLE_LEN_MAX: scala.Double = js.native
  /**
       * The minimum length of a Note.title, in Unicode characters
       */
  var EDAM_NOTE_TITLE_LEN_MIN: scala.Double = js.native
  /**
       * All Note.title fields must match this pattern.
       * This excludes control chars or line/paragraph separators.
       * The string may not begin or end with whitespace.
       */
  var EDAM_NOTE_TITLE_REGEX: java.lang.String = js.native
  /**
       * Maximum length of a preference name
       */
  var EDAM_PREFERENCE_NAME_LEN_MAX: scala.Double = js.native
  /**
       * Minimum length of a preference name
       */
  var EDAM_PREFERENCE_NAME_LEN_MIN: scala.Double = js.native
  /**
       * A preference name must match this regex.
       */
  var EDAM_PREFERENCE_NAME_REGEX: java.lang.String = js.native
  /**
       * The name of the preferences entry that contains shortcuts.
       */
  var EDAM_PREFERENCE_SHORTCUTS: java.lang.String = js.native
  /**
       * The maximum number of shortcuts that a user may have.
       */
  var EDAM_PREFERENCE_SHORTCUTS_MAX_VALUES: scala.Double = js.native
  /**
       * Maximum length of a preference value
       */
  var EDAM_PREFERENCE_VALUE_LEN_MAX: scala.Double = js.native
  /**
       * Minimum length of a preference value
       */
  var EDAM_PREFERENCE_VALUE_LEN_MIN: scala.Double = js.native
  /**
       * A preference value must match this regex.
       */
  var EDAM_PREFERENCE_VALUE_REGEX: java.lang.String = js.native
  /**
       * The maximum length of a Publishing.publicDescription field.
       */
  var EDAM_PUBLISHING_DESCRIPTION_LEN_MAX: scala.Double = js.native
  /**
       * The minimum length of a Publishing.publicDescription field.
       */
  var EDAM_PUBLISHING_DESCRIPTION_LEN_MIN: scala.Double = js.native
  /**
       * Any public notebook's Publishing.publicDescription field must match
       * this pattern.
       * No control chars or line/paragraph separators, and can't start or
       * end with whitespace.
       */
  var EDAM_PUBLISHING_DESCRIPTION_REGEX: java.lang.String = js.native
  /**
       * The maximum length of a public notebook URI component
       */
  var EDAM_PUBLISHING_URI_LEN_MAX: scala.Double = js.native
  /**
       * The minimum length of a public notebook URI component
       */
  var EDAM_PUBLISHING_URI_LEN_MIN: scala.Double = js.native
  /**
       * The set of strings that may not be used as a publishing URI
       */
  var EDAM_PUBLISHING_URI_PROHIBITED: js.Array[java.lang.String] = js.native
  /**
       * A public notebook URI component must match the provided pattern
       */
  var EDAM_PUBLISHING_URI_REGEX: java.lang.String = js.native
  /**
       * The maximum number of notebooks that will be returned from a findRelated()
       * query.
       */
  var EDAM_RELATED_MAX_NOTEBOOKS: scala.Double = js.native
  /**
       * The maximum number of notes that will be returned from a findRelated()
       * query.
       */
  var EDAM_RELATED_MAX_NOTES: scala.Double = js.native
  /**
       * The maximum number of tags that will be returned from a findRelated() query.
       */
  var EDAM_RELATED_MAX_TAGS: scala.Double = js.native
  /**
       * The maximum length of the plain text in a findRelated query, assuming that
       * plaintext is being provided.
       */
  var EDAM_RELATED_PLAINTEXT_LEN_MAX: scala.Double = js.native
  /**
       * The minimum length of the plain text in a findRelated query, assuming that
       * plaintext is being provided.
       */
  var EDAM_RELATED_PLAINTEXT_LEN_MIN: scala.Double = js.native
  /**
       * Maximum size of a resource, in bytes, for Free accounts
       */
  var EDAM_RESOURCE_SIZE_MAX_FREE: scala.Double = js.native
  /**
       * Maximum size of a resource, in bytes, for Premium accounts
       */
  var EDAM_RESOURCE_SIZE_MAX_PREMIUM: scala.Double = js.native
  /**
       * The maximum length of a SavedSearch.name field
       */
  var EDAM_SAVED_SEARCH_NAME_LEN_MAX: scala.Double = js.native
  /**
       * The minimum length of a SavedSearch.name field
       */
  var EDAM_SAVED_SEARCH_NAME_LEN_MIN: scala.Double = js.native
  /**
       * SavedSearch.name fields must match this pattern.
       * No control chars or line/paragraph separators, and can't start or
       * end with whitespace.
       */
  var EDAM_SAVED_SEARCH_NAME_REGEX: java.lang.String = js.native
  /**
       * The maximum length of a user search query string in Unicode chars
       */
  var EDAM_SEARCH_QUERY_LEN_MAX: scala.Double = js.native
  /**
       * The minimum length of a user search query string in Unicode chars
       */
  var EDAM_SEARCH_QUERY_LEN_MIN: scala.Double = js.native
  /**
       * Search queries must match the provided pattern.    This is used for
       * both ad-hoc queries and SavedSearch.query fields.
       * This excludes all control characters and line/paragraph separators.
       */
  var EDAM_SEARCH_QUERY_REGEX: java.lang.String = js.native
  /**
       * Maximum number of search suggestions that can be returned
       */
  var EDAM_SEARCH_SUGGESTIONS_MAX: scala.Double = js.native
  /**
       * Maximum length of the search suggestion prefix
       */
  var EDAM_SEARCH_SUGGESTIONS_PREFIX_LEN_MAX: scala.Double = js.native
  /**
       * Minimum length of the search suggestion prefix
       */
  var EDAM_SEARCH_SUGGESTIONS_PREFIX_LEN_MIN: scala.Double = js.native
  /**
       * The maximum length of a Tag.name, in Unicode characters
       */
  var EDAM_TAG_NAME_LEN_MAX: scala.Double = js.native
  /**
       * The minimum length of a Tag.name, in Unicode characters
       */
  var EDAM_TAG_NAME_LEN_MIN: scala.Double = js.native
  /**
       * All Tag.name fields must match this pattern.
       * This excludes control chars, commas or line/paragraph separators.
       * The string may not begin or end with whitespace.
       */
  var EDAM_TAG_NAME_REGEX: java.lang.String = js.native
  /**
       * The maximum length of a timezone specification string
       */
  var EDAM_TIMEZONE_LEN_MAX: scala.Double = js.native
  /**
       * The minimum length of a timezone specification string
       */
  var EDAM_TIMEZONE_LEN_MIN: scala.Double = js.native
  /**
       * Any timezone string given to Evernote must match the provided pattern.
       * This permits either a locale-based standard timezone or a GMT offset.
       * E.g.:<ul>
       *        <li>America/Los_Angeles</li>
       *        <li>GMT+08:00</li>
       * </ul>
       */
  var EDAM_TIMEZONE_REGEX: java.lang.String = js.native
  /**
       * Maximum number of linked notebooks per account, for a free
       * account.
       */
  var EDAM_USER_LINKED_NOTEBOOK_MAX: scala.Double = js.native
  /**
       * Maximum number of linked notebooks per account, for a premium
       * account.    Users who are part of an active business are also
       * covered under "premium".
       */
  var EDAM_USER_LINKED_NOTEBOOK_MAX_PREMIUM: scala.Double = js.native
  /**
       * The number of emails of any type that can be sent by a user with a Free
       * account from the service per day.    If an email is sent to two different
       * recipients, this counts as two emails.
       */
  var EDAM_USER_MAIL_LIMIT_DAILY_FREE: scala.Double = js.native
  /**
       * The number of emails of any type that can be sent by a user with a Premium
       * account from the service per day.    If an email is sent to two different
       * recipients, this counts as two emails.
       */
  var EDAM_USER_MAIL_LIMIT_DAILY_PREMIUM: scala.Double = js.native
  /**
       * Maximum length of the User.name field
       */
  var EDAM_USER_NAME_LEN_MAX: scala.Double = js.native
  /**
       * Minimum length of the User.name field
       */
  var EDAM_USER_NAME_LEN_MIN: scala.Double = js.native
  /**
       * The User.name field must match this pattern, which excludes line
       * endings and control characters.
       */
  var EDAM_USER_NAME_REGEX: java.lang.String = js.native
  /**
       * Maximum number of Notebooks per user
       */
  var EDAM_USER_NOTEBOOKS_MAX: scala.Double = js.native
  /**
       * Maximum number of Notes per user
       */
  var EDAM_USER_NOTES_MAX: scala.Double = js.native
  /**
       * The maximum length of an Evernote user password
       */
  var EDAM_USER_PASSWORD_LEN_MAX: scala.Double = js.native
  /**
       * The minimum length of an Evernote user password
       */
  var EDAM_USER_PASSWORD_LEN_MIN: scala.Double = js.native
  /**
       * Evernote user passwords must match this regular expression
       */
  var EDAM_USER_PASSWORD_REGEX: java.lang.String = js.native
  /**
       * Maximum number of recent email addresses that are maintained
       * (see UserAttributes.recentMailedAddresses)
       */
  var EDAM_USER_RECENT_MAILED_ADDRESSES_MAX: scala.Double = js.native
  /**
       * Maximum number of SavedSearches per account
       */
  var EDAM_USER_SAVED_SEARCHES_MAX: scala.Double = js.native
  /**
       * Maximum number of Tags per account
       */
  var EDAM_USER_TAGS_MAX: scala.Double = js.native
  /**
       * The number of bytes of new data that may be uploaded to a Business user's
       * personal account each month. Note that content uploaded into the Business
       * notebooks by the user does not count against this limit.
       */
  var EDAM_USER_UPLOAD_LIMIT_BUSINESS: scala.Double = js.native
  /**
       * The number of bytes of new data that may be uploaded to a Free user's
       * account each month.
       */
  var EDAM_USER_UPLOAD_LIMIT_FREE: scala.Double = js.native
  /**
       * The number of bytes of new data that may be uploaded to a Premium user's
       * account each month.
       */
  var EDAM_USER_UPLOAD_LIMIT_PREMIUM: scala.Double = js.native
  /**
       * The maximum length of an Evernote username
       */
  var EDAM_USER_USERNAME_LEN_MAX: scala.Double = js.native
  /**
       * The minimum length of an Evernote username
       */
  var EDAM_USER_USERNAME_LEN_MIN: scala.Double = js.native
  /**
       * Any Evernote User.username field must match this pattern.    This
       * restricts usernames to a format that could permit use as a domain
       * name component.    E.g. "username.whatever.evernote.com"
       */
  var EDAM_USER_USERNAME_REGEX: java.lang.String = js.native
  /**
       * A regular expression that must match any VAT ID given to Evernote.
       * ref http://en.wikipedia.org/wiki/VAT_identification_number
       * ref http://my.safaribooksonline.com/book/programming/regular-expressions/9780596802837/4dot-validation-and-formatting/id2995136
       */
  var EDAM_VAT_REGEX: java.lang.String = js.native
  /**
       * The major version number for the current revision of the EDAM protocol.
       * Clients pass this to the service using UserStore.checkVersion at the
       * beginning of a session to confirm that they are not out of date.
       */
  var EDAM_VERSION_MAJOR: scala.Double = js.native
  /**
       * The minor version number for the current revision of the EDAM protocol.
       * Clients pass this to the service using UserStore.checkVersion at the
       * beginning of a session to confirm that they are not out of date.
       */
  var EDAM_VERSION_MINOR: scala.Double = js.native
  /**
       * Enumeration of the roles that a User can have within an Evernote Business account.
       *
       * ADMIN: The user is an administrator of the Evernote Business account.
       *
       * NORMAL: The user is a regular user within the Evernote Business account.
       */
  @js.native
  object BusinessUserRole extends js.Object {
    @js.native
    sealed trait ADMIN
      extends evernoteLib.evernoteMod.EvernoteNs.BusinessUserRole
    
    @js.native
    sealed trait NORMAL
      extends evernoteLib.evernoteMod.EvernoteNs.BusinessUserRole
    
    /* 1 */ val ADMIN: ADMIN with scala.Double = js.native
    /* 2 */ val NORMAL: NORMAL with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.BusinessUserRole with scala.Double] = js.native
  }
  
  @js.native
  object Client extends js.Object {
    def `new`(config: evernoteLib.evernoteMod.EvernoteNs.ClientConfig): evernoteLib.evernoteMod.EvernoteNs.Client = js.native
  }
  
  /**
       * Numeric codes indicating the type of error that occurred on the
       * service.
       * <dl>
       *     <dt>UNKNOWN</dt>
       *         <dd>No information available about the error</dd>
       *     <dt>BAD_DATA_FORMAT</dt>
       *         <dd>The format of the request data was incorrect</dd>
       *     <dt>PERMISSION_DENIED</dt>
       *         <dd>Not permitted to perform action</dd>
       *     <dt>INTERNAL_ERROR</dt>
       *         <dd>Unexpected problem with the service</dd>
       *     <dt>DATA_REQUIRED</dt>
       *         <dd>A required parameter/field was absent</dd>
       *     <dt>LIMIT_REACHED</dt>
       *         <dd>Operation denied due to data model limit</dd>
       *     <dt>QUOTA_REACHED</dt>
       *         <dd>Operation denied due to user storage limit</dd>
       *     <dt>INVALID_AUTH</dt>
       *         <dd>Username and/or password incorrect</dd>
       *     <dt>AUTH_EXPIRED</dt>
       *         <dd>Authentication token expired</dd>
       *     <dt>DATA_CONFLICT</dt>
       *         <dd>Change denied due to data model conflict</dd>
       *     <dt>ENML_VALIDATION</dt>
       *         <dd>Content of submitted note was malformed</dd>
       *     <dt>SHARD_UNAVAILABLE</dt>
       *         <dd>Service shard with account data is temporarily down</dd>
       *     <dt>LEN_TOO_SHORT</dt>
       *         <dd>Operation denied due to data model limit, where something such
       *                 as a string length was too short</dd>
       *     <dt>LEN_TOO_LONG</dt>
       *         <dd>Operation denied due to data model limit, where something such
       *                 as a string length was too long</dd>
       *     <dt>TOO_FEW</dt>
       *         <dd>Operation denied due to data model limit, where there were
       *                 too few of something.</dd>
       *     <dt>TOO_MANY</dt>
       *         <dd>Operation denied due to data model limit, where there were
       *                 too many of something.</dd>
       *     <dt>UNSUPPORTED_OPERATION</dt>
       *         <dd>Operation denied because it is currently unsupported.</dd>
       *     <dt>TAKEN_DOWN</dt>
       *         <dd>Operation denied because access to the corresponding object is
       *                 prohibited in response to a take-down notice.</dd>
       *     <dt>RATE_LIMIT_REACHED</dt>
       *         <dd>Operation denied because the calling application has reached
       *                 its hourly API call limit for this user.</dd>
       * </dl>
       */
  @js.native
  object EDAMErrorCode extends js.Object {
    @js.native
    sealed trait AUTH_EXPIRED
      extends evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode
    
    @js.native
    sealed trait BAD_DATA_FORMAT
      extends evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode
    
    @js.native
    sealed trait DATA_CONFLICT
      extends evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode
    
    @js.native
    sealed trait DATA_REQUIRED
      extends evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode
    
    @js.native
    sealed trait ENML_VALIDATION
      extends evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode
    
    @js.native
    sealed trait INTERNAL_ERROR
      extends evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode
    
    @js.native
    sealed trait INVALID_AUTH
      extends evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode
    
    @js.native
    sealed trait LEN_TOO_LONG
      extends evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode
    
    @js.native
    sealed trait LEN_TOO_SHORT
      extends evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode
    
    @js.native
    sealed trait LIMIT_REACHED
      extends evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode
    
    @js.native
    sealed trait PERMISSION_DENIED
      extends evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode
    
    @js.native
    sealed trait QUOTA_REACHED
      extends evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode
    
    @js.native
    sealed trait RATE_LIMIT_REACHED
      extends evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode
    
    @js.native
    sealed trait SHARD_UNAVAILABLE
      extends evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode
    
    @js.native
    sealed trait TAKEN_DOWN
      extends evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode
    
    @js.native
    sealed trait TOO_FEW
      extends evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode
    
    @js.native
    sealed trait TOO_MANY
      extends evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode
    
    @js.native
    sealed trait UNKNOWN
      extends evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode
    
    @js.native
    sealed trait UNSUPPORTED_OPERATION
      extends evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode
    
    /* 9 */ val AUTH_EXPIRED: AUTH_EXPIRED with scala.Double = js.native
    /* 2 */ val BAD_DATA_FORMAT: BAD_DATA_FORMAT with scala.Double = js.native
    /* 10 */ val DATA_CONFLICT: DATA_CONFLICT with scala.Double = js.native
    /* 5 */ val DATA_REQUIRED: DATA_REQUIRED with scala.Double = js.native
    /* 11 */ val ENML_VALIDATION: ENML_VALIDATION with scala.Double = js.native
    /* 4 */ val INTERNAL_ERROR: INTERNAL_ERROR with scala.Double = js.native
    /* 8 */ val INVALID_AUTH: INVALID_AUTH with scala.Double = js.native
    /* 14 */ val LEN_TOO_LONG: LEN_TOO_LONG with scala.Double = js.native
    /* 13 */ val LEN_TOO_SHORT: LEN_TOO_SHORT with scala.Double = js.native
    /* 6 */ val LIMIT_REACHED: LIMIT_REACHED with scala.Double = js.native
    /* 3 */ val PERMISSION_DENIED: PERMISSION_DENIED with scala.Double = js.native
    /* 7 */ val QUOTA_REACHED: QUOTA_REACHED with scala.Double = js.native
    /* 19 */ val RATE_LIMIT_REACHED: RATE_LIMIT_REACHED with scala.Double = js.native
    /* 12 */ val SHARD_UNAVAILABLE: SHARD_UNAVAILABLE with scala.Double = js.native
    /* 18 */ val TAKEN_DOWN: TAKEN_DOWN with scala.Double = js.native
    /* 15 */ val TOO_FEW: TOO_FEW with scala.Double = js.native
    /* 16 */ val TOO_MANY: TOO_MANY with scala.Double = js.native
    /* 1 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
    /* 17 */ val UNSUPPORTED_OPERATION: UNSUPPORTED_OPERATION with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode with scala.Double] = js.native
  }
  
  /**
       * This enumeration defines the possible sort ordering for notes when
       * they are returned from a search result.
       */
  @js.native
  object NoteSortOrder extends js.Object {
    @js.native
    sealed trait CREATED
      extends evernoteLib.evernoteMod.EvernoteNs.NoteSortOrder
    
    @js.native
    sealed trait RELEVANCE
      extends evernoteLib.evernoteMod.EvernoteNs.NoteSortOrder
    
    @js.native
    sealed trait TITLE
      extends evernoteLib.evernoteMod.EvernoteNs.NoteSortOrder
    
    @js.native
    sealed trait UPDATED
      extends evernoteLib.evernoteMod.EvernoteNs.NoteSortOrder
    
    @js.native
    sealed trait UPDATE_SEQUENCE_NUMBER
      extends evernoteLib.evernoteMod.EvernoteNs.NoteSortOrder
    
    /* 1 */ val CREATED: CREATED with scala.Double = js.native
    /* 3 */ val RELEVANCE: RELEVANCE with scala.Double = js.native
    /* 5 */ val TITLE: TITLE with scala.Double = js.native
    /* 2 */ val UPDATED: UPDATED with scala.Double = js.native
    /* 4 */ val UPDATE_SEQUENCE_NUMBER: UPDATE_SEQUENCE_NUMBER with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.NoteSortOrder with scala.Double] = js.native
  }
  
  /**
       * This enumeration defines the possible states of a premium account
       *
       * NONE:        the user has never attempted to become a premium subscriber
       *
       * PENDING: the user has requested a premium account but their charge has not
       *     been confirmed
       *
       * ACTIVE:    the user has been charged and their premium account is in good
       *    standing
       *
       * FAILED:    the system attempted to charge the was denied. Their premium
       *     privileges have been revoked. We will periodically attempt to re-validate
       *     their order.
       *
       * CANCELLATION_PENDING: the user has requested that no further charges be made
       *     but the current account is still active.
       *
       * CANCELED: the premium account was canceled either because of failure to pay
       *     or user cancelation. No more attempts will be made to activate the account.
       */
  @js.native
  object PremiumOrderStatus extends js.Object {
    @js.native
    sealed trait ACTIVE
      extends evernoteLib.evernoteMod.EvernoteNs.PremiumOrderStatus
    
    @js.native
    sealed trait CANCELED
      extends evernoteLib.evernoteMod.EvernoteNs.PremiumOrderStatus
    
    @js.native
    sealed trait CANCELLATION_PENDING
      extends evernoteLib.evernoteMod.EvernoteNs.PremiumOrderStatus
    
    @js.native
    sealed trait FAILED
      extends evernoteLib.evernoteMod.EvernoteNs.PremiumOrderStatus
    
    @js.native
    sealed trait NONE
      extends evernoteLib.evernoteMod.EvernoteNs.PremiumOrderStatus
    
    @js.native
    sealed trait PENDING
      extends evernoteLib.evernoteMod.EvernoteNs.PremiumOrderStatus
    
    /* 2 */ val ACTIVE: ACTIVE with scala.Double = js.native
    /* 5 */ val CANCELED: CANCELED with scala.Double = js.native
    /* 4 */ val CANCELLATION_PENDING: CANCELLATION_PENDING with scala.Double = js.native
    /* 3 */ val FAILED: FAILED with scala.Double = js.native
    /* 0 */ val NONE: NONE with scala.Double = js.native
    /* 1 */ val PENDING: PENDING with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.PremiumOrderStatus with scala.Double] = js.native
  }
  
  /**
       * This enumeration defines the possible permission levels for a user.
       * Free accounts will have a level of NORMAL and paid Premium accounts
       * will have a level of PREMIUM.
       */
  @js.native
  object PrivilegeLevel extends js.Object {
    @js.native
    sealed trait ADMIN
      extends evernoteLib.evernoteMod.EvernoteNs.PrivilegeLevel
    
    @js.native
    sealed trait MANAGER
      extends evernoteLib.evernoteMod.EvernoteNs.PrivilegeLevel
    
    @js.native
    sealed trait NORMAL
      extends evernoteLib.evernoteMod.EvernoteNs.PrivilegeLevel
    
    @js.native
    sealed trait PREMIUM
      extends evernoteLib.evernoteMod.EvernoteNs.PrivilegeLevel
    
    @js.native
    sealed trait SUPPORT
      extends evernoteLib.evernoteMod.EvernoteNs.PrivilegeLevel
    
    @js.native
    sealed trait VIP
      extends evernoteLib.evernoteMod.EvernoteNs.PrivilegeLevel
    
    /* 9 */ val ADMIN: ADMIN with scala.Double = js.native
    /* 7 */ val MANAGER: MANAGER with scala.Double = js.native
    /* 1 */ val NORMAL: NORMAL with scala.Double = js.native
    /* 3 */ val PREMIUM: PREMIUM with scala.Double = js.native
    /* 8 */ val SUPPORT: SUPPORT with scala.Double = js.native
    /* 5 */ val VIP: VIP with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.PrivilegeLevel with scala.Double] = js.native
  }
  
  /**
       * Every search query is specified as a sequence of characters.
       * Currently, only the USER query format is supported.
       */
  @js.native
  object QueryFormat extends js.Object {
    @js.native
    sealed trait SEXP
      extends evernoteLib.evernoteMod.EvernoteNs.QueryFormat
    
    @js.native
    sealed trait USER
      extends evernoteLib.evernoteMod.EvernoteNs.QueryFormat
    
    /* 2 */ val SEXP: SEXP with scala.Double = js.native
    /* 1 */ val USER: USER with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.QueryFormat with scala.Double] = js.native
  }
  
  /**
       * An enumeration describing the configuration state related to receiving
       * reminder e-mails from the service.    Reminder e-mails summarize notes
       * based on their Note.attributes.reminderTime values.
       *
       * DO_NOT_SEND: The user has selected to not receive reminder e-mail.
       *
       * SEND_DAILY_EMAIL: The user has selected to receive reminder e-mail for those
       *     days when there is a reminder.
       */
  @js.native
  object ReminderEmailConfig extends js.Object {
    @js.native
    sealed trait DO_NOT_SEND
      extends evernoteLib.evernoteMod.EvernoteNs.ReminderEmailConfig
    
    @js.native
    sealed trait SEND_DAILY_EMAIL
      extends evernoteLib.evernoteMod.EvernoteNs.ReminderEmailConfig
    
    /* 1 */ val DO_NOT_SEND: DO_NOT_SEND with scala.Double = js.native
    /* 2 */ val SEND_DAILY_EMAIL: SEND_DAILY_EMAIL with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.ReminderEmailConfig with scala.Double] = js.native
  }
  
  /**
       * An enumeration describing restrictions on the domain of shared notebook
       * instances that are valid for a given operation, as used, for example, in
       * NotebookRestrictions.
       *
       * ONLY_JOINED_OR_PREVIEW: The domain consists of shared notebooks that
       *     "belong" to the recipient or still available for preview by any recipient.
       *     Shared notebooks that the recipient has joined (the username has already been
       *     assigned to our user) are in the domain.    Additionally, shared notebooks
       *     that allow preview and have not yet been joined are in the domain.
       *
       * NO_SHARED_NOTEBOOKS: No shared notebooks are applicable to the operation.
       */
  @js.native
  object SharedNotebookInstanceRestrictions extends js.Object {
    @js.native
    sealed trait NO_SHARED_NOTEBOOKS
      extends evernoteLib.evernoteMod.EvernoteNs.SharedNotebookInstanceRestrictions
    
    @js.native
    sealed trait ONLY_JOINED_OR_PREVIEW
      extends evernoteLib.evernoteMod.EvernoteNs.SharedNotebookInstanceRestrictions
    
    /* 2 */ val NO_SHARED_NOTEBOOKS: NO_SHARED_NOTEBOOKS with scala.Double = js.native
    /* 1 */ val ONLY_JOINED_OR_PREVIEW: ONLY_JOINED_OR_PREVIEW with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        evernoteLib.evernoteMod.EvernoteNs.SharedNotebookInstanceRestrictions with scala.Double
      ] = js.native
  }
  
  /**
       * Privilege levels for accessing shared notebooks.
       *
       * READ_NOTEBOOK: Recipient is able to read the contents of the shared notebook
       *     but does to have access to information about other recipients of the
       *     notebook or the activity stream information.
       *
       * MODIFY_NOTEBOOK_PLUS_ACTIVITY: Recipient has rights to read and modify the contents
       *     of the shared notebook, including the right to move notes to the trash and to create
       *     notes in the notebook.    The recipient can also access information about other
       *     recipients and the activity stream.
       *
       * READ_NOTEBOOK_PLUS_ACTIVITY: Recipient has READ_NOTEBOOK rights and can also
       *     access information about other recipients and the activity stream.
       *
       * GROUP: If the user belongs to a group, such as a Business, that has a defined
       *     privilege level, use the privilege level of the group as the privilege for
       *     the individual.
       *
       * FULL_ACCESS: Recipient has full rights to the shared notebook and recipient lists,
       *     including privilege to revoke and create invitations and to change privilege
       *     levels on invitations for individuals.    This privilege level is primarily intended
       *     for use by individual shares.
       *
       * BUSINESS_FULL_ACCESS: Intended for use with Business Notebooks, a
       * BUSINESS_FULL_ACCESS level is FULL_ACCESS with the additional rights to
       * change how the notebook will appear in the business library, including the
       * rights to publish and unpublish the notebook from the library.
       */
  @js.native
  object SharedNotebookPrivilegeLevel extends js.Object {
    @js.native
    sealed trait BUSINESS_FULL_ACCESS
      extends evernoteLib.evernoteMod.EvernoteNs.SharedNotebookPrivilegeLevel
    
    @js.native
    sealed trait FULL_ACCESS
      extends evernoteLib.evernoteMod.EvernoteNs.SharedNotebookPrivilegeLevel
    
    @js.native
    sealed trait GROUP
      extends evernoteLib.evernoteMod.EvernoteNs.SharedNotebookPrivilegeLevel
    
    @js.native
    sealed trait MODIFY_NOTEBOOK_PLUS_ACTIVITY
      extends evernoteLib.evernoteMod.EvernoteNs.SharedNotebookPrivilegeLevel
    
    @js.native
    sealed trait READ_NOTEBOOK
      extends evernoteLib.evernoteMod.EvernoteNs.SharedNotebookPrivilegeLevel
    
    @js.native
    sealed trait READ_NOTEBOOK_PLUS_ACTIVITY
      extends evernoteLib.evernoteMod.EvernoteNs.SharedNotebookPrivilegeLevel
    
    /* 5 */ val BUSINESS_FULL_ACCESS: BUSINESS_FULL_ACCESS with scala.Double = js.native
    /* 4 */ val FULL_ACCESS: FULL_ACCESS with scala.Double = js.native
    /* 3 */ val GROUP: GROUP with scala.Double = js.native
    /* 1 */ val MODIFY_NOTEBOOK_PLUS_ACTIVITY: MODIFY_NOTEBOOK_PLUS_ACTIVITY with scala.Double = js.native
    /* 0 */ val READ_NOTEBOOK: READ_NOTEBOOK with scala.Double = js.native
    /* 2 */ val READ_NOTEBOOK_PLUS_ACTIVITY: READ_NOTEBOOK_PLUS_ACTIVITY with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        evernoteLib.evernoteMod.EvernoteNs.SharedNotebookPrivilegeLevel with scala.Double
      ] = js.native
  }
  
  /**
       * Enumeration of the roles that a User can have within a sponsored group.
       *
       * GROUP_MEMBER: The user is a member of the group with no special privileges.
       *
       * GROUP_ADMIN: The user is an administrator within the group.
       *
       * GROUP_OWNER: The user is the owner of the group.
       */
  @js.native
  object SponsoredGroupRole extends js.Object {
    @js.native
    sealed trait GROUP_ADMIN
      extends evernoteLib.evernoteMod.EvernoteNs.SponsoredGroupRole
    
    @js.native
    sealed trait GROUP_MEMBER
      extends evernoteLib.evernoteMod.EvernoteNs.SponsoredGroupRole
    
    @js.native
    sealed trait GROUP_OWNER
      extends evernoteLib.evernoteMod.EvernoteNs.SponsoredGroupRole
    
    /* 2 */ val GROUP_ADMIN: GROUP_ADMIN with scala.Double = js.native
    /* 1 */ val GROUP_MEMBER: GROUP_MEMBER with scala.Double = js.native
    /* 3 */ val GROUP_OWNER: GROUP_OWNER with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.SponsoredGroupRole with scala.Double] = js.native
  }
  
  type Callback[T] = js.Function2[
    /* err */ EDAMUserException | EDAMSystemException | EDAMNotFoundException, 
    /* v */ T, 
    scala.Unit
  ]
}

