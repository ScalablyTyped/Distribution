package typings.googleAppsScript.GoogleAppsScript

import org.scalablytyped.runtime.StringDictionary
import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import typings.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typings.googleAppsScript.GoogleAppsScript.Base.Date
import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.DraftsCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.HistoryCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.LabelsCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Messages.AttachmentsCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.MessagesCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings.DelegatesCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings.FiltersCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings.ForwardingAddressesCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings.SendAs.SmimeInfoCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings.SendAsCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.SettingsCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.ThreadsCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.UsersCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.AutoForwarding
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.BatchDeleteMessagesRequest
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.BatchModifyMessagesRequest
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.Delegate
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.Draft
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.Filter
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.FilterAction
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.FilterCriteria
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ForwardingAddress
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ImapSettings
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.Label
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.LabelColor
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListDelegatesResponse
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListDraftsResponse
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListFiltersResponse
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListForwardingAddressesResponse
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListHistoryResponse
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListLabelsResponse
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListMessagesResponse
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListSendAsResponse
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListSmimeInfoResponse
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListThreadsResponse
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.Message
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.MessagePart
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.MessagePartBody
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.MessagePartHeader
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ModifyMessageRequest
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ModifyThreadRequest
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.PopSettings
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.Profile
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SmimeInfo
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.SmtpMsa
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.Thread
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.VacationSettings
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.WatchRequest
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.WatchResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gmail extends StObject {
  
  var Users: js.UndefOr[UsersCollection] = js.undefined
  
  // Create a new instance of AutoForwarding
  def newAutoForwarding(): AutoForwarding
  
  // Create a new instance of BatchDeleteMessagesRequest
  def newBatchDeleteMessagesRequest(): BatchDeleteMessagesRequest
  
  // Create a new instance of BatchModifyMessagesRequest
  def newBatchModifyMessagesRequest(): BatchModifyMessagesRequest
  
  // Create a new instance of Delegate
  def newDelegate(): Delegate
  
  // Create a new instance of Draft
  def newDraft(): Draft
  
  // Create a new instance of Filter
  def newFilter(): Filter
  
  // Create a new instance of FilterAction
  def newFilterAction(): FilterAction
  
  // Create a new instance of FilterCriteria
  def newFilterCriteria(): FilterCriteria
  
  // Create a new instance of ForwardingAddress
  def newForwardingAddress(): ForwardingAddress
  
  // Create a new instance of ImapSettings
  def newImapSettings(): ImapSettings
  
  // Create a new instance of Label
  def newLabel(): Label
  
  // Create a new instance of LabelColor
  def newLabelColor(): LabelColor
  
  // Create a new instance of Message
  def newMessage(): Message
  
  // Create a new instance of MessagePart
  def newMessagePart(): MessagePart
  
  // Create a new instance of MessagePartBody
  def newMessagePartBody(): MessagePartBody
  
  // Create a new instance of MessagePartHeader
  def newMessagePartHeader(): MessagePartHeader
  
  // Create a new instance of ModifyMessageRequest
  def newModifyMessageRequest(): ModifyMessageRequest
  
  // Create a new instance of ModifyThreadRequest
  def newModifyThreadRequest(): ModifyThreadRequest
  
  // Create a new instance of PopSettings
  def newPopSettings(): PopSettings
  
  // Create a new instance of SendAs
  def newSendAs(): SendAs
  
  // Create a new instance of SmimeInfo
  def newSmimeInfo(): SmimeInfo
  
  // Create a new instance of SmtpMsa
  def newSmtpMsa(): SmtpMsa
  
  // Create a new instance of VacationSettings
  def newVacationSettings(): VacationSettings
  
  // Create a new instance of WatchRequest
  def newWatchRequest(): WatchRequest
}
object Gmail {
  
  inline def apply(
    newAutoForwarding: () => AutoForwarding,
    newBatchDeleteMessagesRequest: () => BatchDeleteMessagesRequest,
    newBatchModifyMessagesRequest: () => BatchModifyMessagesRequest,
    newDelegate: () => Delegate,
    newDraft: () => Draft,
    newFilter: () => Filter,
    newFilterAction: () => FilterAction,
    newFilterCriteria: () => FilterCriteria,
    newForwardingAddress: () => ForwardingAddress,
    newImapSettings: () => ImapSettings,
    newLabel: () => Label,
    newLabelColor: () => LabelColor,
    newMessage: () => Message,
    newMessagePart: () => MessagePart,
    newMessagePartBody: () => MessagePartBody,
    newMessagePartHeader: () => MessagePartHeader,
    newModifyMessageRequest: () => ModifyMessageRequest,
    newModifyThreadRequest: () => ModifyThreadRequest,
    newPopSettings: () => PopSettings,
    newSendAs: () => SendAs,
    newSmimeInfo: () => SmimeInfo,
    newSmtpMsa: () => SmtpMsa,
    newVacationSettings: () => VacationSettings,
    newWatchRequest: () => WatchRequest
  ): Gmail = {
    val __obj = js.Dynamic.literal(newAutoForwarding = js.Any.fromFunction0(newAutoForwarding), newBatchDeleteMessagesRequest = js.Any.fromFunction0(newBatchDeleteMessagesRequest), newBatchModifyMessagesRequest = js.Any.fromFunction0(newBatchModifyMessagesRequest), newDelegate = js.Any.fromFunction0(newDelegate), newDraft = js.Any.fromFunction0(newDraft), newFilter = js.Any.fromFunction0(newFilter), newFilterAction = js.Any.fromFunction0(newFilterAction), newFilterCriteria = js.Any.fromFunction0(newFilterCriteria), newForwardingAddress = js.Any.fromFunction0(newForwardingAddress), newImapSettings = js.Any.fromFunction0(newImapSettings), newLabel = js.Any.fromFunction0(newLabel), newLabelColor = js.Any.fromFunction0(newLabelColor), newMessage = js.Any.fromFunction0(newMessage), newMessagePart = js.Any.fromFunction0(newMessagePart), newMessagePartBody = js.Any.fromFunction0(newMessagePartBody), newMessagePartHeader = js.Any.fromFunction0(newMessagePartHeader), newModifyMessageRequest = js.Any.fromFunction0(newModifyMessageRequest), newModifyThreadRequest = js.Any.fromFunction0(newModifyThreadRequest), newPopSettings = js.Any.fromFunction0(newPopSettings), newSendAs = js.Any.fromFunction0(newSendAs), newSmimeInfo = js.Any.fromFunction0(newSmimeInfo), newSmtpMsa = js.Any.fromFunction0(newSmtpMsa), newVacationSettings = js.Any.fromFunction0(newVacationSettings), newWatchRequest = js.Any.fromFunction0(newWatchRequest))
    __obj.asInstanceOf[Gmail]
  }
  
  object Collection {
    
    object Users {
      
      @js.native
      trait DraftsCollection extends StObject {
        
        // Creates a new draft with the DRAFT label.
        def create(resource: Draft, userId: String): Draft = js.native
        // Creates a new draft with the DRAFT label.
        def create(resource: Draft, userId: String, mediaData: Any): Draft = js.native
        
        // Gets the specified draft.
        def get(userId: String, id: String): Draft = js.native
        // Gets the specified draft.
        def get(userId: String, id: String, optionalArgs: js.Object): Draft = js.native
        
        // Lists the drafts in the user's mailbox.
        def list(userId: String): ListDraftsResponse = js.native
        // Lists the drafts in the user's mailbox.
        def list(userId: String, optionalArgs: js.Object): ListDraftsResponse = js.native
        
        // Immediately and permanently deletes the specified draft. Does not simply trash it.
        def remove(userId: String, id: String): Unit = js.native
        
        // Sends the specified, existing draft to the recipients in the To, Cc, and Bcc headers.
        def send(resource: Draft, userId: String): Message = js.native
        // Sends the specified, existing draft to the recipients in the To, Cc, and Bcc headers.
        def send(resource: Draft, userId: String, mediaData: Any): Message = js.native
        
        // Replaces a draft's content.
        def update(resource: Draft, userId: String, id: String): Draft = js.native
        // Replaces a draft's content.
        def update(resource: Draft, userId: String, id: String, mediaData: Any): Draft = js.native
      }
      
      @js.native
      trait HistoryCollection extends StObject {
        
        // Lists the history of all changes to the given mailbox. History results are returned in chronological order (increasing historyId).
        def list(userId: String): ListHistoryResponse = js.native
        // Lists the history of all changes to the given mailbox. History results are returned in chronological order (increasing historyId).
        def list(userId: String, optionalArgs: js.Object): ListHistoryResponse = js.native
      }
      
      trait LabelsCollection extends StObject {
        
        // Creates a new label.
        def create(resource: Label, userId: String): Label
        
        // Gets the specified label.
        def get(userId: String, id: String): Label
        
        // Lists all labels in the user's mailbox.
        def list(userId: String): ListLabelsResponse
        
        // Updates the specified label. This method supports patch semantics.
        def patch(resource: Label, userId: String, id: String): Label
        
        // Immediately and permanently deletes the specified label and removes it from any messages and threads that it is applied to.
        def remove(userId: String, id: String): Unit
        
        // Updates the specified label.
        def update(resource: Label, userId: String, id: String): Label
      }
      object LabelsCollection {
        
        inline def apply(
          create: (Label, String) => Label,
          get: (String, String) => Label,
          list: String => ListLabelsResponse,
          patch: (Label, String, String) => Label,
          remove: (String, String) => Unit,
          update: (Label, String, String) => Label
        ): LabelsCollection = {
          val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction3(patch), remove = js.Any.fromFunction2(remove), update = js.Any.fromFunction3(update))
          __obj.asInstanceOf[LabelsCollection]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: LabelsCollection] (val x: Self) extends AnyVal {
          
          inline def setCreate(value: (Label, String) => Label): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
          
          inline def setGet(value: (String, String) => Label): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
          
          inline def setList(value: String => ListLabelsResponse): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
          
          inline def setPatch(value: (Label, String, String) => Label): Self = StObject.set(x, "patch", js.Any.fromFunction3(value))
          
          inline def setRemove(value: (String, String) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
          
          inline def setUpdate(value: (Label, String, String) => Label): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
        }
      }
      
      object Messages {
        
        trait AttachmentsCollection extends StObject {
          
          // Gets the specified message attachment.
          def get(userId: String, messageId: String, id: String): MessagePartBody
        }
        object AttachmentsCollection {
          
          inline def apply(get: (String, String, String) => MessagePartBody): AttachmentsCollection = {
            val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get))
            __obj.asInstanceOf[AttachmentsCollection]
          }
          
          @scala.inline
          implicit open class MutableBuilder[Self <: AttachmentsCollection] (val x: Self) extends AnyVal {
            
            inline def setGet(value: (String, String, String) => MessagePartBody): Self = StObject.set(x, "get", js.Any.fromFunction3(value))
          }
        }
      }
      
      @js.native
      trait MessagesCollection extends StObject {
        
        var Attachments: js.UndefOr[AttachmentsCollection] = js.native
        
        // Deletes many messages by message ID. Provides no guarantees that messages were not already deleted or even existed at all.
        def batchDelete(resource: BatchDeleteMessagesRequest, userId: String): Unit = js.native
        
        // Modifies the labels on the specified messages.
        def batchModify(resource: BatchModifyMessagesRequest, userId: String): Unit = js.native
        
        // Gets the specified message.
        def get(userId: String, id: String): Message = js.native
        // Gets the specified message.
        def get(userId: String, id: String, optionalArgs: js.Object): Message = js.native
        
        // Imports a message into only this user's mailbox, with standard email delivery scanning and classification similar to receiving via SMTP. Does not send a message.
        def `import`(resource: Message, userId: String): Message = js.native
        // Imports a message into only this user's mailbox, with standard email delivery scanning and classification similar to receiving via SMTP. Does not send a message.
        def `import`(resource: Message, userId: String, mediaData: Any): Message = js.native
        // Imports a message into only this user's mailbox, with standard email delivery scanning and classification similar to receiving via SMTP. Does not send a message.
        def `import`(resource: Message, userId: String, mediaData: Any, optionalArgs: js.Object): Message = js.native
        
        // Directly inserts a message into only this user's mailbox similar to IMAP APPEND, bypassing most scanning and classification. Does not send a message.
        def insert(resource: Message, userId: String): Message = js.native
        // Directly inserts a message into only this user's mailbox similar to IMAP APPEND, bypassing most scanning and classification. Does not send a message.
        def insert(resource: Message, userId: String, mediaData: Any): Message = js.native
        // Directly inserts a message into only this user's mailbox similar to IMAP APPEND, bypassing most scanning and classification. Does not send a message.
        def insert(resource: Message, userId: String, mediaData: Any, optionalArgs: js.Object): Message = js.native
        
        // Lists the messages in the user's mailbox.
        def list(userId: String): ListMessagesResponse = js.native
        // Lists the messages in the user's mailbox.
        def list(userId: String, optionalArgs: js.Object): ListMessagesResponse = js.native
        
        // Modifies the labels on the specified message.
        def modify(resource: ModifyMessageRequest, userId: String, id: String): Message = js.native
        
        // Immediately and permanently deletes the specified message. This operation cannot be undone. Prefer messages.trash instead.
        def remove(userId: String, id: String): Unit = js.native
        
        // Sends the specified message to the recipients in the To, Cc, and Bcc headers.
        def send(resource: Message, userId: String): Message = js.native
        // Sends the specified message to the recipients in the To, Cc, and Bcc headers.
        def send(resource: Message, userId: String, mediaData: Any): Message = js.native
        
        // Moves the specified message to the trash.
        def trash(userId: String, id: String): Message = js.native
        
        // Removes the specified message from the trash.
        def untrash(userId: String, id: String): Message = js.native
      }
      
      object Settings {
        
        trait DelegatesCollection extends StObject {
          
          // Adds a delegate with its verification status set directly to accepted, without sending any verification email. The delegate user must be a member of the same G Suite organization as the delegator user.
          // Gmail imposes limtations on the number of delegates and delegators each user in a G Suite organization can have. These limits depend on your organization, but in general each user can have up to 25 delegates and up to 10 delegators.
          // Note that a delegate user must be referred to by their primary email address, and not an email alias.
          // Also note that when a new delegate is created, there may be up to a one minute delay before the new delegate is available for use.
          // This method is only available to service account clients that have been delegated domain-wide authority.
          def create(resource: Delegate, userId: String): Delegate
          
          // Gets the specified delegate.
          // Note that a delegate user must be referred to by their primary email address, and not an email alias.
          // This method is only available to service account clients that have been delegated domain-wide authority.
          def get(userId: String, delegateEmail: String): Delegate
          
          // Lists the delegates for the specified account.
          // This method is only available to service account clients that have been delegated domain-wide authority.
          def list(userId: String): ListDelegatesResponse
          
          // Removes the specified delegate (which can be of any verification status), and revokes any verification that may have been required for using it.
          // Note that a delegate user must be referred to by their primary email address, and not an email alias.
          // This method is only available to service account clients that have been delegated domain-wide authority.
          def remove(userId: String, delegateEmail: String): Unit
        }
        object DelegatesCollection {
          
          inline def apply(
            create: (Delegate, String) => Delegate,
            get: (String, String) => Delegate,
            list: String => ListDelegatesResponse,
            remove: (String, String) => Unit
          ): DelegatesCollection = {
            val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove))
            __obj.asInstanceOf[DelegatesCollection]
          }
          
          @scala.inline
          implicit open class MutableBuilder[Self <: DelegatesCollection] (val x: Self) extends AnyVal {
            
            inline def setCreate(value: (Delegate, String) => Delegate): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
            
            inline def setGet(value: (String, String) => Delegate): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
            
            inline def setList(value: String => ListDelegatesResponse): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
            
            inline def setRemove(value: (String, String) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
          }
        }
        
        trait FiltersCollection extends StObject {
          
          // Creates a filter.
          def create(resource: Filter, userId: String): Filter
          
          // Gets a filter.
          def get(userId: String, id: String): Filter
          
          // Lists the message filters of a Gmail user.
          def list(userId: String): ListFiltersResponse
          
          // Deletes a filter.
          def remove(userId: String, id: String): Unit
        }
        object FiltersCollection {
          
          inline def apply(
            create: (Filter, String) => Filter,
            get: (String, String) => Filter,
            list: String => ListFiltersResponse,
            remove: (String, String) => Unit
          ): FiltersCollection = {
            val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove))
            __obj.asInstanceOf[FiltersCollection]
          }
          
          @scala.inline
          implicit open class MutableBuilder[Self <: FiltersCollection] (val x: Self) extends AnyVal {
            
            inline def setCreate(value: (Filter, String) => Filter): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
            
            inline def setGet(value: (String, String) => Filter): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
            
            inline def setList(value: String => ListFiltersResponse): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
            
            inline def setRemove(value: (String, String) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
          }
        }
        
        trait ForwardingAddressesCollection extends StObject {
          
          // Creates a forwarding address. If ownership verification is required, a message will be sent to the recipient and the resource's verification status will be set to pending; otherwise, the resource will be created with verification status set to accepted.
          // This method is only available to service account clients that have been delegated domain-wide authority.
          def create(resource: ForwardingAddress, userId: String): ForwardingAddress
          
          // Gets the specified forwarding address.
          def get(userId: String, forwardingEmail: String): ForwardingAddress
          
          // Lists the forwarding addresses for the specified account.
          def list(userId: String): ListForwardingAddressesResponse
          
          // Deletes the specified forwarding address and revokes any verification that may have been required.
          // This method is only available to service account clients that have been delegated domain-wide authority.
          def remove(userId: String, forwardingEmail: String): Unit
        }
        object ForwardingAddressesCollection {
          
          inline def apply(
            create: (ForwardingAddress, String) => ForwardingAddress,
            get: (String, String) => ForwardingAddress,
            list: String => ListForwardingAddressesResponse,
            remove: (String, String) => Unit
          ): ForwardingAddressesCollection = {
            val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove))
            __obj.asInstanceOf[ForwardingAddressesCollection]
          }
          
          @scala.inline
          implicit open class MutableBuilder[Self <: ForwardingAddressesCollection] (val x: Self) extends AnyVal {
            
            inline def setCreate(value: (ForwardingAddress, String) => ForwardingAddress): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
            
            inline def setGet(value: (String, String) => ForwardingAddress): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
            
            inline def setList(value: String => ListForwardingAddressesResponse): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
            
            inline def setRemove(value: (String, String) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
          }
        }
        
        object SendAs {
          
          trait SmimeInfoCollection extends StObject {
            
            // Gets the specified S/MIME config for the specified send-as alias.
            def get(userId: String, sendAsEmail: String, id: String): SmimeInfo
            
            // Insert (upload) the given S/MIME config for the specified send-as alias. Note that pkcs12 format is required for the key.
            def insert(resource: SmimeInfo, userId: String, sendAsEmail: String): SmimeInfo
            
            // Lists S/MIME configs for the specified send-as alias.
            def list(userId: String, sendAsEmail: String): ListSmimeInfoResponse
            
            // Deletes the specified S/MIME config for the specified send-as alias.
            def remove(userId: String, sendAsEmail: String, id: String): Unit
            
            // Sets the default S/MIME config for the specified send-as alias.
            def setDefault(userId: String, sendAsEmail: String, id: String): Unit
          }
          object SmimeInfoCollection {
            
            inline def apply(
              get: (String, String, String) => SmimeInfo,
              insert: (SmimeInfo, String, String) => SmimeInfo,
              list: (String, String) => ListSmimeInfoResponse,
              remove: (String, String, String) => Unit,
              setDefault: (String, String, String) => Unit
            ): SmimeInfoCollection = {
              val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get), insert = js.Any.fromFunction3(insert), list = js.Any.fromFunction2(list), remove = js.Any.fromFunction3(remove), setDefault = js.Any.fromFunction3(setDefault))
              __obj.asInstanceOf[SmimeInfoCollection]
            }
            
            @scala.inline
            implicit open class MutableBuilder[Self <: SmimeInfoCollection] (val x: Self) extends AnyVal {
              
              inline def setGet(value: (String, String, String) => SmimeInfo): Self = StObject.set(x, "get", js.Any.fromFunction3(value))
              
              inline def setInsert(value: (SmimeInfo, String, String) => SmimeInfo): Self = StObject.set(x, "insert", js.Any.fromFunction3(value))
              
              inline def setList(value: (String, String) => ListSmimeInfoResponse): Self = StObject.set(x, "list", js.Any.fromFunction2(value))
              
              inline def setRemove(value: (String, String, String) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction3(value))
              
              inline def setSetDefault(value: (String, String, String) => Unit): Self = StObject.set(x, "setDefault", js.Any.fromFunction3(value))
            }
          }
        }
        
        trait SendAsCollection extends StObject {
          
          var SmimeInfo: js.UndefOr[SmimeInfoCollection] = js.undefined
          
          // Creates a custom "from" send-as alias. If an SMTP MSA is specified, Gmail will attempt to connect to the SMTP service to validate the configuration before creating the alias. If ownership verification is required for the alias, a message will be sent to the email address and the resource's verification status will be set to pending; otherwise, the resource will be created with verification status set to accepted. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
          // This method is only available to service account clients that have been delegated domain-wide authority.
          def create(resource: SendAs, userId: String): SendAs
          
          // Gets the specified send-as alias. Fails with an HTTP 404 error if the specified address is not a member of the collection.
          def get(userId: String, sendAsEmail: String): SendAs
          
          // Lists the send-as aliases for the specified account. The result includes the primary send-as address associated with the account as well as any custom "from" aliases.
          def list(userId: String): ListSendAsResponse
          
          // Updates a send-as alias. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
          // Addresses other than the primary address for the account can only be updated by service account clients that have been delegated domain-wide authority. This method supports patch semantics.
          def patch(resource: SendAs, userId: String, sendAsEmail: String): SendAs
          
          // Deletes the specified send-as alias. Revokes any verification that may have been required for using it.
          // This method is only available to service account clients that have been delegated domain-wide authority.
          def remove(userId: String, sendAsEmail: String): Unit
          
          // Updates a send-as alias. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
          // Addresses other than the primary address for the account can only be updated by service account clients that have been delegated domain-wide authority.
          def update(resource: SendAs, userId: String, sendAsEmail: String): SendAs
          
          // Sends a verification email to the specified send-as alias address. The verification status must be pending.
          // This method is only available to service account clients that have been delegated domain-wide authority.
          def verify(userId: String, sendAsEmail: String): Unit
        }
        object SendAsCollection {
          
          inline def apply(
            create: (SendAs, String) => SendAs,
            get: (String, String) => SendAs,
            list: String => ListSendAsResponse,
            patch: (SendAs, String, String) => SendAs,
            remove: (String, String) => Unit,
            update: (SendAs, String, String) => SendAs,
            verify: (String, String) => Unit
          ): SendAsCollection = {
            val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction3(patch), remove = js.Any.fromFunction2(remove), update = js.Any.fromFunction3(update), verify = js.Any.fromFunction2(verify))
            __obj.asInstanceOf[SendAsCollection]
          }
          
          @scala.inline
          implicit open class MutableBuilder[Self <: SendAsCollection] (val x: Self) extends AnyVal {
            
            inline def setCreate(value: (SendAs, String) => SendAs): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
            
            inline def setGet(value: (String, String) => SendAs): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
            
            inline def setList(value: String => ListSendAsResponse): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
            
            inline def setPatch(value: (SendAs, String, String) => SendAs): Self = StObject.set(x, "patch", js.Any.fromFunction3(value))
            
            inline def setRemove(value: (String, String) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
            
            inline def setSmimeInfo(value: SmimeInfoCollection): Self = StObject.set(x, "SmimeInfo", value.asInstanceOf[js.Any])
            
            inline def setSmimeInfoUndefined: Self = StObject.set(x, "SmimeInfo", js.undefined)
            
            inline def setUpdate(value: (SendAs, String, String) => SendAs): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
            
            inline def setVerify(value: (String, String) => Unit): Self = StObject.set(x, "verify", js.Any.fromFunction2(value))
          }
        }
      }
      
      trait SettingsCollection extends StObject {
        
        var Delegates: js.UndefOr[DelegatesCollection] = js.undefined
        
        var Filters: js.UndefOr[FiltersCollection] = js.undefined
        
        var ForwardingAddresses: js.UndefOr[ForwardingAddressesCollection] = js.undefined
        
        var SendAs: js.UndefOr[SendAsCollection] = js.undefined
        
        // Gets the auto-forwarding setting for the specified account.
        def getAutoForwarding(userId: String): AutoForwarding
        
        // Gets IMAP settings.
        def getImap(userId: String): ImapSettings
        
        // Gets POP settings.
        def getPop(userId: String): PopSettings
        
        // Gets vacation responder settings.
        def getVacation(userId: String): VacationSettings
        
        // Updates the auto-forwarding setting for the specified account. A verified forwarding address must be specified when auto-forwarding is enabled.
        // This method is only available to service account clients that have been delegated domain-wide authority.
        def updateAutoForwarding(resource: AutoForwarding, userId: String): AutoForwarding
        
        // Updates IMAP settings.
        def updateImap(resource: ImapSettings, userId: String): ImapSettings
        
        // Updates POP settings.
        def updatePop(resource: PopSettings, userId: String): PopSettings
        
        // Updates vacation responder settings.
        def updateVacation(resource: VacationSettings, userId: String): VacationSettings
      }
      object SettingsCollection {
        
        inline def apply(
          getAutoForwarding: String => AutoForwarding,
          getImap: String => ImapSettings,
          getPop: String => PopSettings,
          getVacation: String => VacationSettings,
          updateAutoForwarding: (AutoForwarding, String) => AutoForwarding,
          updateImap: (ImapSettings, String) => ImapSettings,
          updatePop: (PopSettings, String) => PopSettings,
          updateVacation: (VacationSettings, String) => VacationSettings
        ): SettingsCollection = {
          val __obj = js.Dynamic.literal(getAutoForwarding = js.Any.fromFunction1(getAutoForwarding), getImap = js.Any.fromFunction1(getImap), getPop = js.Any.fromFunction1(getPop), getVacation = js.Any.fromFunction1(getVacation), updateAutoForwarding = js.Any.fromFunction2(updateAutoForwarding), updateImap = js.Any.fromFunction2(updateImap), updatePop = js.Any.fromFunction2(updatePop), updateVacation = js.Any.fromFunction2(updateVacation))
          __obj.asInstanceOf[SettingsCollection]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: SettingsCollection] (val x: Self) extends AnyVal {
          
          inline def setDelegates(value: DelegatesCollection): Self = StObject.set(x, "Delegates", value.asInstanceOf[js.Any])
          
          inline def setDelegatesUndefined: Self = StObject.set(x, "Delegates", js.undefined)
          
          inline def setFilters(value: FiltersCollection): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
          
          inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
          
          inline def setForwardingAddresses(value: ForwardingAddressesCollection): Self = StObject.set(x, "ForwardingAddresses", value.asInstanceOf[js.Any])
          
          inline def setForwardingAddressesUndefined: Self = StObject.set(x, "ForwardingAddresses", js.undefined)
          
          inline def setGetAutoForwarding(value: String => AutoForwarding): Self = StObject.set(x, "getAutoForwarding", js.Any.fromFunction1(value))
          
          inline def setGetImap(value: String => ImapSettings): Self = StObject.set(x, "getImap", js.Any.fromFunction1(value))
          
          inline def setGetPop(value: String => PopSettings): Self = StObject.set(x, "getPop", js.Any.fromFunction1(value))
          
          inline def setGetVacation(value: String => VacationSettings): Self = StObject.set(x, "getVacation", js.Any.fromFunction1(value))
          
          inline def setSendAs(value: SendAsCollection): Self = StObject.set(x, "SendAs", value.asInstanceOf[js.Any])
          
          inline def setSendAsUndefined: Self = StObject.set(x, "SendAs", js.undefined)
          
          inline def setUpdateAutoForwarding(value: (AutoForwarding, String) => AutoForwarding): Self = StObject.set(x, "updateAutoForwarding", js.Any.fromFunction2(value))
          
          inline def setUpdateImap(value: (ImapSettings, String) => ImapSettings): Self = StObject.set(x, "updateImap", js.Any.fromFunction2(value))
          
          inline def setUpdatePop(value: (PopSettings, String) => PopSettings): Self = StObject.set(x, "updatePop", js.Any.fromFunction2(value))
          
          inline def setUpdateVacation(value: (VacationSettings, String) => VacationSettings): Self = StObject.set(x, "updateVacation", js.Any.fromFunction2(value))
        }
      }
      
      @js.native
      trait ThreadsCollection extends StObject {
        
        // Gets the specified thread.
        def get(userId: String, id: String): Thread = js.native
        // Gets the specified thread.
        def get(userId: String, id: String, optionalArgs: js.Object): Thread = js.native
        
        // Lists the threads in the user's mailbox.
        def list(userId: String): ListThreadsResponse = js.native
        // Lists the threads in the user's mailbox.
        def list(userId: String, optionalArgs: js.Object): ListThreadsResponse = js.native
        
        // Modifies the labels applied to the thread. This applies to all messages in the thread.
        def modify(resource: ModifyThreadRequest, userId: String, id: String): Thread = js.native
        
        // Immediately and permanently deletes the specified thread. This operation cannot be undone. Prefer threads.trash instead.
        def remove(userId: String, id: String): Unit = js.native
        
        // Moves the specified thread to the trash.
        def trash(userId: String, id: String): Thread = js.native
        
        // Removes the specified thread from the trash.
        def untrash(userId: String, id: String): Thread = js.native
      }
    }
    
    trait UsersCollection extends StObject {
      
      var Drafts: js.UndefOr[DraftsCollection] = js.undefined
      
      var History: js.UndefOr[HistoryCollection] = js.undefined
      
      var Labels: js.UndefOr[LabelsCollection] = js.undefined
      
      var Messages: js.UndefOr[MessagesCollection] = js.undefined
      
      var Settings: js.UndefOr[SettingsCollection] = js.undefined
      
      var Threads: js.UndefOr[ThreadsCollection] = js.undefined
      
      // Gets the current user's Gmail profile.
      def getProfile(userId: String): Profile
      
      // Stop receiving push notifications for the given user mailbox.
      def stop(userId: String): Unit
      
      // Set up or update a push notification watch on the given user mailbox.
      def watch(resource: WatchRequest, userId: String): WatchResponse
    }
    object UsersCollection {
      
      inline def apply(
        getProfile: String => Profile,
        stop: String => Unit,
        watch: (WatchRequest, String) => WatchResponse
      ): UsersCollection = {
        val __obj = js.Dynamic.literal(getProfile = js.Any.fromFunction1(getProfile), stop = js.Any.fromFunction1(stop), watch = js.Any.fromFunction2(watch))
        __obj.asInstanceOf[UsersCollection]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: UsersCollection] (val x: Self) extends AnyVal {
        
        inline def setDrafts(value: DraftsCollection): Self = StObject.set(x, "Drafts", value.asInstanceOf[js.Any])
        
        inline def setDraftsUndefined: Self = StObject.set(x, "Drafts", js.undefined)
        
        inline def setGetProfile(value: String => Profile): Self = StObject.set(x, "getProfile", js.Any.fromFunction1(value))
        
        inline def setHistory(value: HistoryCollection): Self = StObject.set(x, "History", value.asInstanceOf[js.Any])
        
        inline def setHistoryUndefined: Self = StObject.set(x, "History", js.undefined)
        
        inline def setLabels(value: LabelsCollection): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
        
        inline def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
        
        inline def setMessages(value: MessagesCollection): Self = StObject.set(x, "Messages", value.asInstanceOf[js.Any])
        
        inline def setMessagesUndefined: Self = StObject.set(x, "Messages", js.undefined)
        
        inline def setSettings(value: SettingsCollection): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
        
        inline def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
        
        inline def setStop(value: String => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
        
        inline def setThreads(value: ThreadsCollection): Self = StObject.set(x, "Threads", value.asInstanceOf[js.Any])
        
        inline def setThreadsUndefined: Self = StObject.set(x, "Threads", js.undefined)
        
        inline def setWatch(value: (WatchRequest, String) => WatchResponse): Self = StObject.set(x, "watch", js.Any.fromFunction2(value))
      }
    }
  }
  
  /**
    * Options for a Gmail draft.
    */
  trait GmailAdvancedOptions extends StObject {
    
    /**
      * An array of files to send with the email.
      */
    var attachments: js.UndefOr[js.Array[BlobSource]] = js.undefined
    
    /**
      * A comma-separated list of email addresses to BCC.
      */
    var bcc: js.UndefOr[String] = js.undefined
    
    /**
      * A comma-separated list of email addresses to CC.
      */
    var cc: js.UndefOr[String] = js.undefined
    
    /**
      * The address that the email should be sent from, which must be one of the values returned by `GmailApp.getAliases()`.
      */
    var from: js.UndefOr[String] = js.undefined
    
    /**
      * If set, devices capable of rendering HTML will use it instead of the required body argument; you can add an optional `inlineImages` field in HTML body if you have inlined images for your email.
      */
    var htmlBody: js.UndefOr[String] = js.undefined
    
    /**
      * A JavaScript object containing a mapping from image key (`String`) to image data (`BlobSource`) ; this assumes that the `htmlBody` parameter is used and contains references to these images in the format `<img src="cid:imageKey" />`.
      */
    var inlineImages: js.UndefOr[StringDictionary[BlobSource]] = js.undefined
    
    /**
      * The name of the sender of the email (default: the user's name).
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * True if the email should be sent from a generic no-reply email address to discourage recipients from responding to emails; this option is only possible for Google Workspace accounts, not Gmail users.
      */
    var noReply: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An email address to use as the default reply-to address (default: the user's email address).
      */
    var replyTo: js.UndefOr[String] = js.undefined
  }
  object GmailAdvancedOptions {
    
    inline def apply(): GmailAdvancedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GmailAdvancedOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GmailAdvancedOptions] (val x: Self) extends AnyVal {
      
      inline def setAttachments(value: js.Array[BlobSource]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
      
      inline def setAttachmentsVarargs(value: BlobSource*): Self = StObject.set(x, "attachments", js.Array(value*))
      
      inline def setBcc(value: String): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
      
      inline def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
      
      inline def setCc(value: String): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
      
      inline def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setHtmlBody(value: String): Self = StObject.set(x, "htmlBody", value.asInstanceOf[js.Any])
      
      inline def setHtmlBodyUndefined: Self = StObject.set(x, "htmlBody", js.undefined)
      
      inline def setInlineImages(value: StringDictionary[BlobSource]): Self = StObject.set(x, "inlineImages", value.asInstanceOf[js.Any])
      
      inline def setInlineImagesUndefined: Self = StObject.set(x, "inlineImages", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNoReply(value: Boolean): Self = StObject.set(x, "noReply", value.asInstanceOf[js.Any])
      
      inline def setNoReplyUndefined: Self = StObject.set(x, "noReply", js.undefined)
      
      inline def setReplyTo(value: String): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
      
      inline def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
    }
  }
  
  /**
    * Provides access to Gmail threads, messages, and labels.
    */
  @js.native
  trait GmailApp extends StObject {
    
    def createDraft(recipient: String, subject: String, body: String): GmailDraft = js.native
    def createDraft(recipient: String, subject: String, body: String, options: GmailAdvancedOptions): GmailDraft = js.native
    
    def createLabel(name: String): GmailLabel = js.native
    
    def deleteLabel(label: GmailLabel): GmailApp = js.native
    
    def getAliases(): js.Array[String] = js.native
    
    def getChatThreads(): js.Array[GmailThread] = js.native
    def getChatThreads(start: Integer, max: Integer): js.Array[GmailThread] = js.native
    
    def getDraft(draftId: String): GmailDraft = js.native
    
    def getDraftMessages(): js.Array[GmailMessage] = js.native
    
    def getDrafts(): js.Array[GmailDraft] = js.native
    
    def getInboxThreads(): js.Array[GmailThread] = js.native
    def getInboxThreads(start: Integer, max: Integer): js.Array[GmailThread] = js.native
    
    def getInboxUnreadCount(): Integer = js.native
    
    def getMessageById(id: String): GmailMessage = js.native
    
    def getMessagesForThread(thread: GmailThread): js.Array[GmailMessage] = js.native
    
    def getMessagesForThreads(threads: js.Array[GmailThread]): js.Array[js.Array[GmailMessage]] = js.native
    
    def getPriorityInboxThreads(): js.Array[GmailThread] = js.native
    def getPriorityInboxThreads(start: Integer, max: Integer): js.Array[GmailThread] = js.native
    
    def getPriorityInboxUnreadCount(): Integer = js.native
    
    def getSpamThreads(): js.Array[GmailThread] = js.native
    def getSpamThreads(start: Integer, max: Integer): js.Array[GmailThread] = js.native
    
    def getSpamUnreadCount(): Integer = js.native
    
    def getStarredThreads(): js.Array[GmailThread] = js.native
    def getStarredThreads(start: Integer, max: Integer): js.Array[GmailThread] = js.native
    
    def getStarredUnreadCount(): Integer = js.native
    
    def getThreadById(id: String): GmailThread = js.native
    
    def getTrashThreads(): js.Array[GmailThread] = js.native
    def getTrashThreads(start: Integer, max: Integer): js.Array[GmailThread] = js.native
    
    def getUserLabelByName(name: String): GmailLabel = js.native
    
    def getUserLabels(): js.Array[GmailLabel] = js.native
    
    def markMessageRead(message: GmailMessage): GmailApp = js.native
    
    def markMessageUnread(message: GmailMessage): GmailApp = js.native
    
    def markMessagesRead(messages: js.Array[GmailMessage]): GmailApp = js.native
    
    def markMessagesUnread(messages: js.Array[GmailMessage]): GmailApp = js.native
    
    def markThreadImportant(thread: GmailThread): GmailApp = js.native
    
    def markThreadRead(thread: GmailThread): GmailApp = js.native
    
    def markThreadUnimportant(thread: GmailThread): GmailApp = js.native
    
    def markThreadUnread(thread: GmailThread): GmailApp = js.native
    
    def markThreadsImportant(threads: js.Array[GmailThread]): GmailApp = js.native
    
    def markThreadsRead(threads: js.Array[GmailThread]): GmailApp = js.native
    
    def markThreadsUnimportant(threads: js.Array[GmailThread]): GmailApp = js.native
    
    def markThreadsUnread(threads: js.Array[GmailThread]): GmailApp = js.native
    
    def moveMessageToTrash(message: GmailMessage): GmailApp = js.native
    
    def moveMessagesToTrash(messages: js.Array[GmailMessage]): GmailApp = js.native
    
    def moveThreadToArchive(thread: GmailThread): GmailApp = js.native
    
    def moveThreadToInbox(thread: GmailThread): GmailApp = js.native
    
    def moveThreadToSpam(thread: GmailThread): GmailApp = js.native
    
    def moveThreadToTrash(thread: GmailThread): GmailApp = js.native
    
    def moveThreadsToArchive(threads: js.Array[GmailThread]): GmailApp = js.native
    
    def moveThreadsToInbox(threads: js.Array[GmailThread]): GmailApp = js.native
    
    def moveThreadsToSpam(threads: js.Array[GmailThread]): GmailApp = js.native
    
    def moveThreadsToTrash(threads: js.Array[GmailThread]): GmailApp = js.native
    
    def refreshMessage(message: GmailMessage): GmailApp = js.native
    
    def refreshMessages(messages: js.Array[GmailMessage]): GmailApp = js.native
    
    def refreshThread(thread: GmailThread): GmailApp = js.native
    
    def refreshThreads(threads: js.Array[GmailThread]): GmailApp = js.native
    
    def search(query: String): js.Array[GmailThread] = js.native
    def search(query: String, start: Integer, max: Integer): js.Array[GmailThread] = js.native
    
    def sendEmail(recipient: String, subject: String, body: String): GmailApp = js.native
    def sendEmail(recipient: String, subject: String, body: String, options: GmailAdvancedOptions): GmailApp = js.native
    
    def setCurrentMessageAccessToken(accessToken: String): Unit = js.native
    
    def starMessage(message: GmailMessage): GmailApp = js.native
    
    def starMessages(messages: js.Array[GmailMessage]): GmailApp = js.native
    
    def unstarMessage(message: GmailMessage): GmailApp = js.native
    
    def unstarMessages(messages: js.Array[GmailMessage]): GmailApp = js.native
  }
  
  /**
    * An attachment from Gmail. This is a regular Blob except that it has an extra getSize() method that is faster than calling
    * getBytes().length and does not count against the Gmail read quota.
    *
    *     // Logs information about any attachments in the first 100 inbox threads.
    *     var threads = GmailApp.getInboxThreads(0, 100);
    *     var msgs = GmailApp.getMessagesForThreads(threads);
    *     for (var i = 0 ; i < msgs.length; i++) {
    *       for (var j = 0; j < msgs[i].length; j++) {
    *         var attachments = msgs[i][j].getAttachments();
    *         for (var k = 0; k < attachments.length; k++) {
    *           Logger.log('Message "%s" contains the attachment "%s" (%s bytes)',
    *                      msgs[i][j].getSubject(), attachments[k].getName(), attachments[k].getSize());
    *         }
    *       }
    *     }
    */
  @js.native
  trait GmailAttachment extends StObject {
    
    def copyBlob(): Blob = js.native
    
    /** @deprecated DO NOT USE */ def getAllBlobs(): js.Array[Blob] = js.native
    
    def getAs(contentType: String): Blob = js.native
    
    def getBytes(): js.Array[Byte] = js.native
    
    def getContentType(): String = js.native
    
    def getDataAsString(): String = js.native
    def getDataAsString(charset: String): String = js.native
    
    def getHash(): String = js.native
    
    def getName(): String = js.native
    
    def getSize(): Integer = js.native
    
    def isGoogleType(): Boolean = js.native
    
    def setBytes(data: js.Array[Byte]): Blob = js.native
    
    def setContentType(contentType: String): Blob = js.native
    
    def setContentTypeFromExtension(): Blob = js.native
    
    def setDataFromString(string: String): Blob = js.native
    def setDataFromString(string: String, charset: String): Blob = js.native
    
    def setName(name: String): Blob = js.native
  }
  
  /**
    * Options for a Gmail Attachments.
    */
  trait GmailAttachmentOptions extends StObject {
    
    /**
      *  If the returned array of Blob attachments should include regular (non-inline) attachments.
      */
    var includeAttachments: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If the returned array of Blob attachments should include inline images.
      */
    var includeInlineImages: js.UndefOr[Boolean] = js.undefined
  }
  object GmailAttachmentOptions {
    
    inline def apply(): GmailAttachmentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GmailAttachmentOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GmailAttachmentOptions] (val x: Self) extends AnyVal {
      
      inline def setIncludeAttachments(value: Boolean): Self = StObject.set(x, "includeAttachments", value.asInstanceOf[js.Any])
      
      inline def setIncludeAttachmentsUndefined: Self = StObject.set(x, "includeAttachments", js.undefined)
      
      inline def setIncludeInlineImages(value: Boolean): Self = StObject.set(x, "includeInlineImages", value.asInstanceOf[js.Any])
      
      inline def setIncludeInlineImagesUndefined: Self = StObject.set(x, "includeInlineImages", js.undefined)
    }
  }
  
  /**
    * A user-created draft message in a user's Gmail account.
    */
  @js.native
  trait GmailDraft extends StObject {
    
    /**
      * Deletes this draft message.
      */
    def deleteDraft(): Unit = js.native
    
    /**
      * Gets the ID of this draft message.
      */
    def getId(): String = js.native
    
    /**
      * Returns a GmailMessage representing this draft.
      */
    def getMessage(): GmailMessage = js.native
    
    /**
      * Returns the ID of the `GmailMessage` representing this draft.
      */
    def getMessageId(): String = js.native
    
    /**
      * Sends this draft email message.
      */
    def send(): GmailMessage = js.native
    
    /**
      * Replaces the contents of this draft message.
      */
    def update(recipient: String, subject: String, body: String): GmailDraft = js.native
    /**
      * Replaces the contents of this draft message using optional arguments.
      */
    def update(recipient: String, subject: String, body: String, options: GmailAdvancedOptions): GmailDraft = js.native
  }
  
  /** alias to GmailAdvancedOptions */
  type GmailDraftOptions = GmailAdvancedOptions
  
  /**
    * A user-created label in a user's Gmail account.
    */
  @js.native
  trait GmailLabel extends StObject {
    
    def addToThread(thread: GmailThread): GmailLabel = js.native
    
    def addToThreads(threads: js.Array[GmailThread]): GmailLabel = js.native
    
    def deleteLabel(): Unit = js.native
    
    def getName(): String = js.native
    
    def getThreads(): js.Array[GmailThread] = js.native
    def getThreads(start: Integer, max: Integer): js.Array[GmailThread] = js.native
    
    def getUnreadCount(): Integer = js.native
    
    def removeFromThread(thread: GmailThread): GmailLabel = js.native
    
    def removeFromThreads(threads: js.Array[GmailThread]): GmailLabel = js.native
  }
  
  /**
    * A message in a user's Gmail account.
    */
  @js.native
  trait GmailMessage extends StObject {
    
    def createDraftReply(body: String): GmailDraft = js.native
    def createDraftReply(body: String, options: GmailAdvancedOptions): GmailDraft = js.native
    
    def createDraftReplyAll(body: String): GmailDraft = js.native
    def createDraftReplyAll(body: String, options: GmailAdvancedOptions): GmailDraft = js.native
    
    def forward(recipient: String): GmailMessage = js.native
    def forward(recipient: String, options: GmailAdvancedOptions): GmailMessage = js.native
    
    def getAttachments(): js.Array[GmailAttachment] = js.native
    def getAttachments(options: GmailAttachmentOptions): js.Array[GmailAttachment] = js.native
    
    def getBcc(): String = js.native
    
    def getBody(): String = js.native
    
    def getCc(): String = js.native
    
    def getDate(): Date = js.native
    
    def getFrom(): String = js.native
    
    def getHeader(name: String): String = js.native
    
    def getId(): String = js.native
    
    def getPlainBody(): String = js.native
    
    def getRawContent(): String = js.native
    
    def getReplyTo(): String = js.native
    
    def getSubject(): String = js.native
    
    def getThread(): GmailThread = js.native
    
    def getTo(): String = js.native
    
    def isDraft(): Boolean = js.native
    
    def isInChats(): Boolean = js.native
    
    def isInInbox(): Boolean = js.native
    
    def isInPriorityInbox(): Boolean = js.native
    
    def isInTrash(): Boolean = js.native
    
    def isStarred(): Boolean = js.native
    
    def isUnread(): Boolean = js.native
    
    def markRead(): GmailMessage = js.native
    
    def markUnread(): GmailMessage = js.native
    
    def moveToTrash(): GmailMessage = js.native
    
    def refresh(): GmailMessage = js.native
    
    def reply(body: String): GmailMessage = js.native
    def reply(body: String, options: GmailAdvancedOptions): GmailMessage = js.native
    
    def replyAll(body: String): GmailMessage = js.native
    def replyAll(body: String, options: GmailAdvancedOptions): GmailMessage = js.native
    
    def star(): GmailMessage = js.native
    
    def unstar(): GmailMessage = js.native
  }
  
  /**
    * A thread in a user's Gmail account.
    */
  @js.native
  trait GmailThread extends StObject {
    
    def addLabel(label: GmailLabel): GmailThread = js.native
    
    def createDraftReply(body: String): GmailDraft = js.native
    def createDraftReply(body: String, options: GmailAdvancedOptions): GmailDraft = js.native
    
    def createDraftReplyAll(body: String): GmailDraft = js.native
    def createDraftReplyAll(body: String, options: GmailAdvancedOptions): GmailDraft = js.native
    
    def getFirstMessageSubject(): String = js.native
    
    def getId(): String = js.native
    
    def getLabels(): js.Array[GmailLabel] = js.native
    
    def getLastMessageDate(): Date = js.native
    
    def getMessageCount(): Integer = js.native
    
    def getMessages(): js.Array[GmailMessage] = js.native
    
    def getPermalink(): String = js.native
    
    def hasStarredMessages(): Boolean = js.native
    
    def isImportant(): Boolean = js.native
    
    def isInChats(): Boolean = js.native
    
    def isInInbox(): Boolean = js.native
    
    def isInPriorityInbox(): Boolean = js.native
    
    def isInSpam(): Boolean = js.native
    
    def isInTrash(): Boolean = js.native
    
    def isUnread(): Boolean = js.native
    
    def markImportant(): GmailThread = js.native
    
    def markRead(): GmailThread = js.native
    
    def markUnimportant(): GmailThread = js.native
    
    def markUnread(): GmailThread = js.native
    
    def moveToArchive(): GmailThread = js.native
    
    def moveToInbox(): GmailThread = js.native
    
    def moveToSpam(): GmailThread = js.native
    
    def moveToTrash(): GmailThread = js.native
    
    def refresh(): GmailThread = js.native
    
    def removeLabel(label: GmailLabel): GmailThread = js.native
    
    def reply(body: String): GmailThread = js.native
    def reply(body: String, options: GmailAdvancedOptions): GmailThread = js.native
    
    def replyAll(body: String): GmailThread = js.native
    def replyAll(body: String, options: GmailAdvancedOptions): GmailThread = js.native
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Gmail] (val x: Self) extends AnyVal {
    
    inline def setNewAutoForwarding(value: () => AutoForwarding): Self = StObject.set(x, "newAutoForwarding", js.Any.fromFunction0(value))
    
    inline def setNewBatchDeleteMessagesRequest(value: () => BatchDeleteMessagesRequest): Self = StObject.set(x, "newBatchDeleteMessagesRequest", js.Any.fromFunction0(value))
    
    inline def setNewBatchModifyMessagesRequest(value: () => BatchModifyMessagesRequest): Self = StObject.set(x, "newBatchModifyMessagesRequest", js.Any.fromFunction0(value))
    
    inline def setNewDelegate(value: () => Delegate): Self = StObject.set(x, "newDelegate", js.Any.fromFunction0(value))
    
    inline def setNewDraft(value: () => Draft): Self = StObject.set(x, "newDraft", js.Any.fromFunction0(value))
    
    inline def setNewFilter(value: () => Filter): Self = StObject.set(x, "newFilter", js.Any.fromFunction0(value))
    
    inline def setNewFilterAction(value: () => FilterAction): Self = StObject.set(x, "newFilterAction", js.Any.fromFunction0(value))
    
    inline def setNewFilterCriteria(value: () => FilterCriteria): Self = StObject.set(x, "newFilterCriteria", js.Any.fromFunction0(value))
    
    inline def setNewForwardingAddress(value: () => ForwardingAddress): Self = StObject.set(x, "newForwardingAddress", js.Any.fromFunction0(value))
    
    inline def setNewImapSettings(value: () => ImapSettings): Self = StObject.set(x, "newImapSettings", js.Any.fromFunction0(value))
    
    inline def setNewLabel(value: () => Label): Self = StObject.set(x, "newLabel", js.Any.fromFunction0(value))
    
    inline def setNewLabelColor(value: () => LabelColor): Self = StObject.set(x, "newLabelColor", js.Any.fromFunction0(value))
    
    inline def setNewMessage(value: () => Message): Self = StObject.set(x, "newMessage", js.Any.fromFunction0(value))
    
    inline def setNewMessagePart(value: () => MessagePart): Self = StObject.set(x, "newMessagePart", js.Any.fromFunction0(value))
    
    inline def setNewMessagePartBody(value: () => MessagePartBody): Self = StObject.set(x, "newMessagePartBody", js.Any.fromFunction0(value))
    
    inline def setNewMessagePartHeader(value: () => MessagePartHeader): Self = StObject.set(x, "newMessagePartHeader", js.Any.fromFunction0(value))
    
    inline def setNewModifyMessageRequest(value: () => ModifyMessageRequest): Self = StObject.set(x, "newModifyMessageRequest", js.Any.fromFunction0(value))
    
    inline def setNewModifyThreadRequest(value: () => ModifyThreadRequest): Self = StObject.set(x, "newModifyThreadRequest", js.Any.fromFunction0(value))
    
    inline def setNewPopSettings(value: () => PopSettings): Self = StObject.set(x, "newPopSettings", js.Any.fromFunction0(value))
    
    inline def setNewSendAs(value: () => SendAs): Self = StObject.set(x, "newSendAs", js.Any.fromFunction0(value))
    
    inline def setNewSmimeInfo(value: () => SmimeInfo): Self = StObject.set(x, "newSmimeInfo", js.Any.fromFunction0(value))
    
    inline def setNewSmtpMsa(value: () => SmtpMsa): Self = StObject.set(x, "newSmtpMsa", js.Any.fromFunction0(value))
    
    inline def setNewVacationSettings(value: () => VacationSettings): Self = StObject.set(x, "newVacationSettings", js.Any.fromFunction0(value))
    
    inline def setNewWatchRequest(value: () => WatchRequest): Self = StObject.set(x, "newWatchRequest", js.Any.fromFunction0(value))
    
    inline def setUsers(value: UsersCollection): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "Users", js.undefined)
  }
  
  object Schema {
    
    trait AutoForwarding extends StObject {
      
      var disposition: js.UndefOr[String] = js.undefined
      
      var emailAddress: js.UndefOr[String] = js.undefined
      
      var enabled: js.UndefOr[Boolean] = js.undefined
    }
    object AutoForwarding {
      
      inline def apply(): AutoForwarding = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AutoForwarding]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AutoForwarding] (val x: Self) extends AnyVal {
        
        inline def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
        
        inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
        
        inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
        
        inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
        
        inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
        
        inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      }
    }
    
    trait BatchDeleteMessagesRequest extends StObject {
      
      var ids: js.UndefOr[js.Array[String]] = js.undefined
    }
    object BatchDeleteMessagesRequest {
      
      inline def apply(): BatchDeleteMessagesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchDeleteMessagesRequest]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: BatchDeleteMessagesRequest] (val x: Self) extends AnyVal {
        
        inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
        
        inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
        
        inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
      }
    }
    
    trait BatchModifyMessagesRequest extends StObject {
      
      var addLabelIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var ids: js.UndefOr[js.Array[String]] = js.undefined
      
      var removeLabelIds: js.UndefOr[js.Array[String]] = js.undefined
    }
    object BatchModifyMessagesRequest {
      
      inline def apply(): BatchModifyMessagesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchModifyMessagesRequest]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: BatchModifyMessagesRequest] (val x: Self) extends AnyVal {
        
        inline def setAddLabelIds(value: js.Array[String]): Self = StObject.set(x, "addLabelIds", value.asInstanceOf[js.Any])
        
        inline def setAddLabelIdsUndefined: Self = StObject.set(x, "addLabelIds", js.undefined)
        
        inline def setAddLabelIdsVarargs(value: String*): Self = StObject.set(x, "addLabelIds", js.Array(value*))
        
        inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
        
        inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
        
        inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
        
        inline def setRemoveLabelIds(value: js.Array[String]): Self = StObject.set(x, "removeLabelIds", value.asInstanceOf[js.Any])
        
        inline def setRemoveLabelIdsUndefined: Self = StObject.set(x, "removeLabelIds", js.undefined)
        
        inline def setRemoveLabelIdsVarargs(value: String*): Self = StObject.set(x, "removeLabelIds", js.Array(value*))
      }
    }
    
    trait Delegate extends StObject {
      
      var delegateEmail: js.UndefOr[String] = js.undefined
      
      var verificationStatus: js.UndefOr[String] = js.undefined
    }
    object Delegate {
      
      inline def apply(): Delegate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Delegate]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Delegate] (val x: Self) extends AnyVal {
        
        inline def setDelegateEmail(value: String): Self = StObject.set(x, "delegateEmail", value.asInstanceOf[js.Any])
        
        inline def setDelegateEmailUndefined: Self = StObject.set(x, "delegateEmail", js.undefined)
        
        inline def setVerificationStatus(value: String): Self = StObject.set(x, "verificationStatus", value.asInstanceOf[js.Any])
        
        inline def setVerificationStatusUndefined: Self = StObject.set(x, "verificationStatus", js.undefined)
      }
    }
    
    trait Draft extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
      
      var message: js.UndefOr[Message] = js.undefined
    }
    object Draft {
      
      inline def apply(): Draft = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Draft]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Draft] (val x: Self) extends AnyVal {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      }
    }
    
    trait Filter extends StObject {
      
      var action: js.UndefOr[FilterAction] = js.undefined
      
      var criteria: js.UndefOr[FilterCriteria] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
    }
    object Filter {
      
      inline def apply(): Filter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Filter]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
        
        inline def setAction(value: FilterAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
        
        inline def setCriteria(value: FilterCriteria): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
        
        inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      }
    }
    
    trait FilterAction extends StObject {
      
      var addLabelIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var forward: js.UndefOr[String] = js.undefined
      
      var removeLabelIds: js.UndefOr[js.Array[String]] = js.undefined
    }
    object FilterAction {
      
      inline def apply(): FilterAction = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FilterAction]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: FilterAction] (val x: Self) extends AnyVal {
        
        inline def setAddLabelIds(value: js.Array[String]): Self = StObject.set(x, "addLabelIds", value.asInstanceOf[js.Any])
        
        inline def setAddLabelIdsUndefined: Self = StObject.set(x, "addLabelIds", js.undefined)
        
        inline def setAddLabelIdsVarargs(value: String*): Self = StObject.set(x, "addLabelIds", js.Array(value*))
        
        inline def setForward(value: String): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
        
        inline def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
        
        inline def setRemoveLabelIds(value: js.Array[String]): Self = StObject.set(x, "removeLabelIds", value.asInstanceOf[js.Any])
        
        inline def setRemoveLabelIdsUndefined: Self = StObject.set(x, "removeLabelIds", js.undefined)
        
        inline def setRemoveLabelIdsVarargs(value: String*): Self = StObject.set(x, "removeLabelIds", js.Array(value*))
      }
    }
    
    trait FilterCriteria extends StObject {
      
      var excludeChats: js.UndefOr[Boolean] = js.undefined
      
      var from: js.UndefOr[String] = js.undefined
      
      var hasAttachment: js.UndefOr[Boolean] = js.undefined
      
      var negatedQuery: js.UndefOr[String] = js.undefined
      
      var query: js.UndefOr[String] = js.undefined
      
      var size: js.UndefOr[Double] = js.undefined
      
      var sizeComparison: js.UndefOr[String] = js.undefined
      
      var subject: js.UndefOr[String] = js.undefined
      
      var to: js.UndefOr[String] = js.undefined
    }
    object FilterCriteria {
      
      inline def apply(): FilterCriteria = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FilterCriteria]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: FilterCriteria] (val x: Self) extends AnyVal {
        
        inline def setExcludeChats(value: Boolean): Self = StObject.set(x, "excludeChats", value.asInstanceOf[js.Any])
        
        inline def setExcludeChatsUndefined: Self = StObject.set(x, "excludeChats", js.undefined)
        
        inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
        
        inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
        
        inline def setHasAttachment(value: Boolean): Self = StObject.set(x, "hasAttachment", value.asInstanceOf[js.Any])
        
        inline def setHasAttachmentUndefined: Self = StObject.set(x, "hasAttachment", js.undefined)
        
        inline def setNegatedQuery(value: String): Self = StObject.set(x, "negatedQuery", value.asInstanceOf[js.Any])
        
        inline def setNegatedQueryUndefined: Self = StObject.set(x, "negatedQuery", js.undefined)
        
        inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
        
        inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeComparison(value: String): Self = StObject.set(x, "sizeComparison", value.asInstanceOf[js.Any])
        
        inline def setSizeComparisonUndefined: Self = StObject.set(x, "sizeComparison", js.undefined)
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
        
        inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
        
        inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
        
        inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      }
    }
    
    trait ForwardingAddress extends StObject {
      
      var forwardingEmail: js.UndefOr[String] = js.undefined
      
      var verificationStatus: js.UndefOr[String] = js.undefined
    }
    object ForwardingAddress {
      
      inline def apply(): ForwardingAddress = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ForwardingAddress]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ForwardingAddress] (val x: Self) extends AnyVal {
        
        inline def setForwardingEmail(value: String): Self = StObject.set(x, "forwardingEmail", value.asInstanceOf[js.Any])
        
        inline def setForwardingEmailUndefined: Self = StObject.set(x, "forwardingEmail", js.undefined)
        
        inline def setVerificationStatus(value: String): Self = StObject.set(x, "verificationStatus", value.asInstanceOf[js.Any])
        
        inline def setVerificationStatusUndefined: Self = StObject.set(x, "verificationStatus", js.undefined)
      }
    }
    
    trait History extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
      
      var labelsAdded: js.UndefOr[js.Array[HistoryLabelAdded]] = js.undefined
      
      var labelsRemoved: js.UndefOr[js.Array[HistoryLabelRemoved]] = js.undefined
      
      var messages: js.UndefOr[js.Array[Message]] = js.undefined
      
      var messagesAdded: js.UndefOr[js.Array[HistoryMessageAdded]] = js.undefined
      
      var messagesDeleted: js.UndefOr[js.Array[HistoryMessageDeleted]] = js.undefined
    }
    object History {
      
      inline def apply(): History = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[History]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: History] (val x: Self) extends AnyVal {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setLabelsAdded(value: js.Array[HistoryLabelAdded]): Self = StObject.set(x, "labelsAdded", value.asInstanceOf[js.Any])
        
        inline def setLabelsAddedUndefined: Self = StObject.set(x, "labelsAdded", js.undefined)
        
        inline def setLabelsAddedVarargs(value: HistoryLabelAdded*): Self = StObject.set(x, "labelsAdded", js.Array(value*))
        
        inline def setLabelsRemoved(value: js.Array[HistoryLabelRemoved]): Self = StObject.set(x, "labelsRemoved", value.asInstanceOf[js.Any])
        
        inline def setLabelsRemovedUndefined: Self = StObject.set(x, "labelsRemoved", js.undefined)
        
        inline def setLabelsRemovedVarargs(value: HistoryLabelRemoved*): Self = StObject.set(x, "labelsRemoved", js.Array(value*))
        
        inline def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
        
        inline def setMessagesAdded(value: js.Array[HistoryMessageAdded]): Self = StObject.set(x, "messagesAdded", value.asInstanceOf[js.Any])
        
        inline def setMessagesAddedUndefined: Self = StObject.set(x, "messagesAdded", js.undefined)
        
        inline def setMessagesAddedVarargs(value: HistoryMessageAdded*): Self = StObject.set(x, "messagesAdded", js.Array(value*))
        
        inline def setMessagesDeleted(value: js.Array[HistoryMessageDeleted]): Self = StObject.set(x, "messagesDeleted", value.asInstanceOf[js.Any])
        
        inline def setMessagesDeletedUndefined: Self = StObject.set(x, "messagesDeleted", js.undefined)
        
        inline def setMessagesDeletedVarargs(value: HistoryMessageDeleted*): Self = StObject.set(x, "messagesDeleted", js.Array(value*))
        
        inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
        
        inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value*))
      }
    }
    
    trait HistoryLabelAdded extends StObject {
      
      var labelIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var message: js.UndefOr[Message] = js.undefined
    }
    object HistoryLabelAdded {
      
      inline def apply(): HistoryLabelAdded = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HistoryLabelAdded]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HistoryLabelAdded] (val x: Self) extends AnyVal {
        
        inline def setLabelIds(value: js.Array[String]): Self = StObject.set(x, "labelIds", value.asInstanceOf[js.Any])
        
        inline def setLabelIdsUndefined: Self = StObject.set(x, "labelIds", js.undefined)
        
        inline def setLabelIdsVarargs(value: String*): Self = StObject.set(x, "labelIds", js.Array(value*))
        
        inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      }
    }
    
    trait HistoryLabelRemoved extends StObject {
      
      var labelIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var message: js.UndefOr[Message] = js.undefined
    }
    object HistoryLabelRemoved {
      
      inline def apply(): HistoryLabelRemoved = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HistoryLabelRemoved]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HistoryLabelRemoved] (val x: Self) extends AnyVal {
        
        inline def setLabelIds(value: js.Array[String]): Self = StObject.set(x, "labelIds", value.asInstanceOf[js.Any])
        
        inline def setLabelIdsUndefined: Self = StObject.set(x, "labelIds", js.undefined)
        
        inline def setLabelIdsVarargs(value: String*): Self = StObject.set(x, "labelIds", js.Array(value*))
        
        inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      }
    }
    
    trait HistoryMessageAdded extends StObject {
      
      var message: js.UndefOr[Message] = js.undefined
    }
    object HistoryMessageAdded {
      
      inline def apply(): HistoryMessageAdded = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HistoryMessageAdded]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HistoryMessageAdded] (val x: Self) extends AnyVal {
        
        inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      }
    }
    
    trait HistoryMessageDeleted extends StObject {
      
      var message: js.UndefOr[Message] = js.undefined
    }
    object HistoryMessageDeleted {
      
      inline def apply(): HistoryMessageDeleted = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HistoryMessageDeleted]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HistoryMessageDeleted] (val x: Self) extends AnyVal {
        
        inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      }
    }
    
    trait ImapSettings extends StObject {
      
      var autoExpunge: js.UndefOr[Boolean] = js.undefined
      
      var enabled: js.UndefOr[Boolean] = js.undefined
      
      var expungeBehavior: js.UndefOr[String] = js.undefined
      
      var maxFolderSize: js.UndefOr[Double] = js.undefined
    }
    object ImapSettings {
      
      inline def apply(): ImapSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ImapSettings]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ImapSettings] (val x: Self) extends AnyVal {
        
        inline def setAutoExpunge(value: Boolean): Self = StObject.set(x, "autoExpunge", value.asInstanceOf[js.Any])
        
        inline def setAutoExpungeUndefined: Self = StObject.set(x, "autoExpunge", js.undefined)
        
        inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
        
        inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
        
        inline def setExpungeBehavior(value: String): Self = StObject.set(x, "expungeBehavior", value.asInstanceOf[js.Any])
        
        inline def setExpungeBehaviorUndefined: Self = StObject.set(x, "expungeBehavior", js.undefined)
        
        inline def setMaxFolderSize(value: Double): Self = StObject.set(x, "maxFolderSize", value.asInstanceOf[js.Any])
        
        inline def setMaxFolderSizeUndefined: Self = StObject.set(x, "maxFolderSize", js.undefined)
      }
    }
    
    trait Label extends StObject {
      
      var color: js.UndefOr[LabelColor] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var labelListVisibility: js.UndefOr[String] = js.undefined
      
      var messageListVisibility: js.UndefOr[String] = js.undefined
      
      var messagesTotal: js.UndefOr[Double] = js.undefined
      
      var messagesUnread: js.UndefOr[Double] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var threadsTotal: js.UndefOr[Double] = js.undefined
      
      var threadsUnread: js.UndefOr[Double] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Label {
      
      inline def apply(): Label = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Label]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
        
        inline def setColor(value: LabelColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setLabelListVisibility(value: String): Self = StObject.set(x, "labelListVisibility", value.asInstanceOf[js.Any])
        
        inline def setLabelListVisibilityUndefined: Self = StObject.set(x, "labelListVisibility", js.undefined)
        
        inline def setMessageListVisibility(value: String): Self = StObject.set(x, "messageListVisibility", value.asInstanceOf[js.Any])
        
        inline def setMessageListVisibilityUndefined: Self = StObject.set(x, "messageListVisibility", js.undefined)
        
        inline def setMessagesTotal(value: Double): Self = StObject.set(x, "messagesTotal", value.asInstanceOf[js.Any])
        
        inline def setMessagesTotalUndefined: Self = StObject.set(x, "messagesTotal", js.undefined)
        
        inline def setMessagesUnread(value: Double): Self = StObject.set(x, "messagesUnread", value.asInstanceOf[js.Any])
        
        inline def setMessagesUnreadUndefined: Self = StObject.set(x, "messagesUnread", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setThreadsTotal(value: Double): Self = StObject.set(x, "threadsTotal", value.asInstanceOf[js.Any])
        
        inline def setThreadsTotalUndefined: Self = StObject.set(x, "threadsTotal", js.undefined)
        
        inline def setThreadsUnread(value: Double): Self = StObject.set(x, "threadsUnread", value.asInstanceOf[js.Any])
        
        inline def setThreadsUnreadUndefined: Self = StObject.set(x, "threadsUnread", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait LabelColor extends StObject {
      
      var backgroundColor: js.UndefOr[String] = js.undefined
      
      var textColor: js.UndefOr[String] = js.undefined
    }
    object LabelColor {
      
      inline def apply(): LabelColor = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LabelColor]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: LabelColor] (val x: Self) extends AnyVal {
        
        inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
        
        inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
        
        inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
        
        inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      }
    }
    
    trait ListDelegatesResponse extends StObject {
      
      var delegates: js.UndefOr[js.Array[Delegate]] = js.undefined
    }
    object ListDelegatesResponse {
      
      inline def apply(): ListDelegatesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListDelegatesResponse]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ListDelegatesResponse] (val x: Self) extends AnyVal {
        
        inline def setDelegates(value: js.Array[Delegate]): Self = StObject.set(x, "delegates", value.asInstanceOf[js.Any])
        
        inline def setDelegatesUndefined: Self = StObject.set(x, "delegates", js.undefined)
        
        inline def setDelegatesVarargs(value: Delegate*): Self = StObject.set(x, "delegates", js.Array(value*))
      }
    }
    
    trait ListDraftsResponse extends StObject {
      
      var drafts: js.UndefOr[js.Array[Draft]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var resultSizeEstimate: js.UndefOr[Double] = js.undefined
    }
    object ListDraftsResponse {
      
      inline def apply(): ListDraftsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListDraftsResponse]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ListDraftsResponse] (val x: Self) extends AnyVal {
        
        inline def setDrafts(value: js.Array[Draft]): Self = StObject.set(x, "drafts", value.asInstanceOf[js.Any])
        
        inline def setDraftsUndefined: Self = StObject.set(x, "drafts", js.undefined)
        
        inline def setDraftsVarargs(value: Draft*): Self = StObject.set(x, "drafts", js.Array(value*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setResultSizeEstimate(value: Double): Self = StObject.set(x, "resultSizeEstimate", value.asInstanceOf[js.Any])
        
        inline def setResultSizeEstimateUndefined: Self = StObject.set(x, "resultSizeEstimate", js.undefined)
      }
    }
    
    trait ListFiltersResponse extends StObject {
      
      var filter: js.UndefOr[js.Array[Filter]] = js.undefined
    }
    object ListFiltersResponse {
      
      inline def apply(): ListFiltersResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListFiltersResponse]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ListFiltersResponse] (val x: Self) extends AnyVal {
        
        inline def setFilter(value: js.Array[Filter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        inline def setFilterVarargs(value: Filter*): Self = StObject.set(x, "filter", js.Array(value*))
      }
    }
    
    trait ListForwardingAddressesResponse extends StObject {
      
      var forwardingAddresses: js.UndefOr[js.Array[ForwardingAddress]] = js.undefined
    }
    object ListForwardingAddressesResponse {
      
      inline def apply(): ListForwardingAddressesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListForwardingAddressesResponse]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ListForwardingAddressesResponse] (val x: Self) extends AnyVal {
        
        inline def setForwardingAddresses(value: js.Array[ForwardingAddress]): Self = StObject.set(x, "forwardingAddresses", value.asInstanceOf[js.Any])
        
        inline def setForwardingAddressesUndefined: Self = StObject.set(x, "forwardingAddresses", js.undefined)
        
        inline def setForwardingAddressesVarargs(value: ForwardingAddress*): Self = StObject.set(x, "forwardingAddresses", js.Array(value*))
      }
    }
    
    trait ListHistoryResponse extends StObject {
      
      var history: js.UndefOr[js.Array[History]] = js.undefined
      
      var historyId: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object ListHistoryResponse {
      
      inline def apply(): ListHistoryResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListHistoryResponse]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ListHistoryResponse] (val x: Self) extends AnyVal {
        
        inline def setHistory(value: js.Array[History]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
        
        inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
        
        inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
        
        inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
        
        inline def setHistoryVarargs(value: History*): Self = StObject.set(x, "history", js.Array(value*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait ListLabelsResponse extends StObject {
      
      var labels: js.UndefOr[js.Array[Label]] = js.undefined
    }
    object ListLabelsResponse {
      
      inline def apply(): ListLabelsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListLabelsResponse]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ListLabelsResponse] (val x: Self) extends AnyVal {
        
        inline def setLabels(value: js.Array[Label]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        inline def setLabelsVarargs(value: Label*): Self = StObject.set(x, "labels", js.Array(value*))
      }
    }
    
    trait ListMessagesResponse extends StObject {
      
      var messages: js.UndefOr[js.Array[Message]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var resultSizeEstimate: js.UndefOr[Double] = js.undefined
    }
    object ListMessagesResponse {
      
      inline def apply(): ListMessagesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListMessagesResponse]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ListMessagesResponse] (val x: Self) extends AnyVal {
        
        inline def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
        
        inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
        
        inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setResultSizeEstimate(value: Double): Self = StObject.set(x, "resultSizeEstimate", value.asInstanceOf[js.Any])
        
        inline def setResultSizeEstimateUndefined: Self = StObject.set(x, "resultSizeEstimate", js.undefined)
      }
    }
    
    trait ListSendAsResponse extends StObject {
      
      var sendAs: js.UndefOr[js.Array[SendAs]] = js.undefined
    }
    object ListSendAsResponse {
      
      inline def apply(): ListSendAsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListSendAsResponse]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ListSendAsResponse] (val x: Self) extends AnyVal {
        
        inline def setSendAs(value: js.Array[SendAs]): Self = StObject.set(x, "sendAs", value.asInstanceOf[js.Any])
        
        inline def setSendAsUndefined: Self = StObject.set(x, "sendAs", js.undefined)
        
        inline def setSendAsVarargs(value: SendAs*): Self = StObject.set(x, "sendAs", js.Array(value*))
      }
    }
    
    trait ListSmimeInfoResponse extends StObject {
      
      var smimeInfo: js.UndefOr[js.Array[SmimeInfo]] = js.undefined
    }
    object ListSmimeInfoResponse {
      
      inline def apply(): ListSmimeInfoResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListSmimeInfoResponse]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ListSmimeInfoResponse] (val x: Self) extends AnyVal {
        
        inline def setSmimeInfo(value: js.Array[SmimeInfo]): Self = StObject.set(x, "smimeInfo", value.asInstanceOf[js.Any])
        
        inline def setSmimeInfoUndefined: Self = StObject.set(x, "smimeInfo", js.undefined)
        
        inline def setSmimeInfoVarargs(value: SmimeInfo*): Self = StObject.set(x, "smimeInfo", js.Array(value*))
      }
    }
    
    trait ListThreadsResponse extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var resultSizeEstimate: js.UndefOr[Double] = js.undefined
      
      var threads: js.UndefOr[js.Array[Thread]] = js.undefined
    }
    object ListThreadsResponse {
      
      inline def apply(): ListThreadsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListThreadsResponse]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ListThreadsResponse] (val x: Self) extends AnyVal {
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setResultSizeEstimate(value: Double): Self = StObject.set(x, "resultSizeEstimate", value.asInstanceOf[js.Any])
        
        inline def setResultSizeEstimateUndefined: Self = StObject.set(x, "resultSizeEstimate", js.undefined)
        
        inline def setThreads(value: js.Array[Thread]): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
        
        inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
        
        inline def setThreadsVarargs(value: Thread*): Self = StObject.set(x, "threads", js.Array(value*))
      }
    }
    
    trait Message extends StObject {
      
      var historyId: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var internalDate: js.UndefOr[String] = js.undefined
      
      var labelIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var payload: js.UndefOr[MessagePart] = js.undefined
      
      var raw: js.UndefOr[String] = js.undefined
      
      var sizeEstimate: js.UndefOr[Double] = js.undefined
      
      var snippet: js.UndefOr[String] = js.undefined
      
      var threadId: js.UndefOr[String] = js.undefined
    }
    object Message {
      
      inline def apply(): Message = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Message]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
        
        inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
        
        inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setInternalDate(value: String): Self = StObject.set(x, "internalDate", value.asInstanceOf[js.Any])
        
        inline def setInternalDateUndefined: Self = StObject.set(x, "internalDate", js.undefined)
        
        inline def setLabelIds(value: js.Array[String]): Self = StObject.set(x, "labelIds", value.asInstanceOf[js.Any])
        
        inline def setLabelIdsUndefined: Self = StObject.set(x, "labelIds", js.undefined)
        
        inline def setLabelIdsVarargs(value: String*): Self = StObject.set(x, "labelIds", js.Array(value*))
        
        inline def setPayload(value: MessagePart): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
        
        inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
        
        inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
        
        inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
        
        inline def setSizeEstimate(value: Double): Self = StObject.set(x, "sizeEstimate", value.asInstanceOf[js.Any])
        
        inline def setSizeEstimateUndefined: Self = StObject.set(x, "sizeEstimate", js.undefined)
        
        inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
        
        inline def setThreadId(value: String): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
        
        inline def setThreadIdUndefined: Self = StObject.set(x, "threadId", js.undefined)
      }
    }
    
    trait MessagePart extends StObject {
      
      var body: js.UndefOr[MessagePartBody] = js.undefined
      
      var filename: js.UndefOr[String] = js.undefined
      
      var headers: js.UndefOr[js.Array[MessagePartHeader]] = js.undefined
      
      var mimeType: js.UndefOr[String] = js.undefined
      
      var partId: js.UndefOr[String] = js.undefined
      
      var parts: js.UndefOr[js.Array[MessagePart]] = js.undefined
    }
    object MessagePart {
      
      inline def apply(): MessagePart = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MessagePart]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: MessagePart] (val x: Self) extends AnyVal {
        
        inline def setBody(value: MessagePartBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
        
        inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
        
        inline def setHeaders(value: js.Array[MessagePartHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        inline def setHeadersVarargs(value: MessagePartHeader*): Self = StObject.set(x, "headers", js.Array(value*))
        
        inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
        
        inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
        
        inline def setPartId(value: String): Self = StObject.set(x, "partId", value.asInstanceOf[js.Any])
        
        inline def setPartIdUndefined: Self = StObject.set(x, "partId", js.undefined)
        
        inline def setParts(value: js.Array[MessagePart]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
        
        inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
        
        inline def setPartsVarargs(value: MessagePart*): Self = StObject.set(x, "parts", js.Array(value*))
      }
    }
    
    trait MessagePartBody extends StObject {
      
      var attachmentId: js.UndefOr[String] = js.undefined
      
      var data: js.UndefOr[String] = js.undefined
      
      var size: js.UndefOr[Double] = js.undefined
    }
    object MessagePartBody {
      
      inline def apply(): MessagePartBody = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MessagePartBody]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: MessagePartBody] (val x: Self) extends AnyVal {
        
        inline def setAttachmentId(value: String): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
        
        inline def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
        
        inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      }
    }
    
    trait MessagePartHeader extends StObject {
      
      var name: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object MessagePartHeader {
      
      inline def apply(): MessagePartHeader = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MessagePartHeader]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: MessagePartHeader] (val x: Self) extends AnyVal {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait ModifyMessageRequest extends StObject {
      
      var addLabelIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var removeLabelIds: js.UndefOr[js.Array[String]] = js.undefined
    }
    object ModifyMessageRequest {
      
      inline def apply(): ModifyMessageRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ModifyMessageRequest]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ModifyMessageRequest] (val x: Self) extends AnyVal {
        
        inline def setAddLabelIds(value: js.Array[String]): Self = StObject.set(x, "addLabelIds", value.asInstanceOf[js.Any])
        
        inline def setAddLabelIdsUndefined: Self = StObject.set(x, "addLabelIds", js.undefined)
        
        inline def setAddLabelIdsVarargs(value: String*): Self = StObject.set(x, "addLabelIds", js.Array(value*))
        
        inline def setRemoveLabelIds(value: js.Array[String]): Self = StObject.set(x, "removeLabelIds", value.asInstanceOf[js.Any])
        
        inline def setRemoveLabelIdsUndefined: Self = StObject.set(x, "removeLabelIds", js.undefined)
        
        inline def setRemoveLabelIdsVarargs(value: String*): Self = StObject.set(x, "removeLabelIds", js.Array(value*))
      }
    }
    
    trait ModifyThreadRequest extends StObject {
      
      var addLabelIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var removeLabelIds: js.UndefOr[js.Array[String]] = js.undefined
    }
    object ModifyThreadRequest {
      
      inline def apply(): ModifyThreadRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ModifyThreadRequest]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ModifyThreadRequest] (val x: Self) extends AnyVal {
        
        inline def setAddLabelIds(value: js.Array[String]): Self = StObject.set(x, "addLabelIds", value.asInstanceOf[js.Any])
        
        inline def setAddLabelIdsUndefined: Self = StObject.set(x, "addLabelIds", js.undefined)
        
        inline def setAddLabelIdsVarargs(value: String*): Self = StObject.set(x, "addLabelIds", js.Array(value*))
        
        inline def setRemoveLabelIds(value: js.Array[String]): Self = StObject.set(x, "removeLabelIds", value.asInstanceOf[js.Any])
        
        inline def setRemoveLabelIdsUndefined: Self = StObject.set(x, "removeLabelIds", js.undefined)
        
        inline def setRemoveLabelIdsVarargs(value: String*): Self = StObject.set(x, "removeLabelIds", js.Array(value*))
      }
    }
    
    trait PopSettings extends StObject {
      
      var accessWindow: js.UndefOr[String] = js.undefined
      
      var disposition: js.UndefOr[String] = js.undefined
    }
    object PopSettings {
      
      inline def apply(): PopSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PopSettings]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PopSettings] (val x: Self) extends AnyVal {
        
        inline def setAccessWindow(value: String): Self = StObject.set(x, "accessWindow", value.asInstanceOf[js.Any])
        
        inline def setAccessWindowUndefined: Self = StObject.set(x, "accessWindow", js.undefined)
        
        inline def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
        
        inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
      }
    }
    
    trait Profile extends StObject {
      
      var emailAddress: js.UndefOr[String] = js.undefined
      
      var historyId: js.UndefOr[String] = js.undefined
      
      var messagesTotal: js.UndefOr[Double] = js.undefined
      
      var threadsTotal: js.UndefOr[Double] = js.undefined
    }
    object Profile {
      
      inline def apply(): Profile = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Profile]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
        
        inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
        
        inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
        
        inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
        
        inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
        
        inline def setMessagesTotal(value: Double): Self = StObject.set(x, "messagesTotal", value.asInstanceOf[js.Any])
        
        inline def setMessagesTotalUndefined: Self = StObject.set(x, "messagesTotal", js.undefined)
        
        inline def setThreadsTotal(value: Double): Self = StObject.set(x, "threadsTotal", value.asInstanceOf[js.Any])
        
        inline def setThreadsTotalUndefined: Self = StObject.set(x, "threadsTotal", js.undefined)
      }
    }
    
    trait SendAs extends StObject {
      
      var displayName: js.UndefOr[String] = js.undefined
      
      var isDefault: js.UndefOr[Boolean] = js.undefined
      
      var isPrimary: js.UndefOr[Boolean] = js.undefined
      
      var replyToAddress: js.UndefOr[String] = js.undefined
      
      var sendAsEmail: js.UndefOr[String] = js.undefined
      
      var signature: js.UndefOr[String] = js.undefined
      
      var smtpMsa: js.UndefOr[SmtpMsa] = js.undefined
      
      var treatAsAlias: js.UndefOr[Boolean] = js.undefined
      
      var verificationStatus: js.UndefOr[String] = js.undefined
    }
    object SendAs {
      
      inline def apply(): SendAs = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SendAs]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SendAs] (val x: Self) extends AnyVal {
        
        inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
        
        inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
        
        inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
        
        inline def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
        
        inline def setReplyToAddress(value: String): Self = StObject.set(x, "replyToAddress", value.asInstanceOf[js.Any])
        
        inline def setReplyToAddressUndefined: Self = StObject.set(x, "replyToAddress", js.undefined)
        
        inline def setSendAsEmail(value: String): Self = StObject.set(x, "sendAsEmail", value.asInstanceOf[js.Any])
        
        inline def setSendAsEmailUndefined: Self = StObject.set(x, "sendAsEmail", js.undefined)
        
        inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
        
        inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
        
        inline def setSmtpMsa(value: SmtpMsa): Self = StObject.set(x, "smtpMsa", value.asInstanceOf[js.Any])
        
        inline def setSmtpMsaUndefined: Self = StObject.set(x, "smtpMsa", js.undefined)
        
        inline def setTreatAsAlias(value: Boolean): Self = StObject.set(x, "treatAsAlias", value.asInstanceOf[js.Any])
        
        inline def setTreatAsAliasUndefined: Self = StObject.set(x, "treatAsAlias", js.undefined)
        
        inline def setVerificationStatus(value: String): Self = StObject.set(x, "verificationStatus", value.asInstanceOf[js.Any])
        
        inline def setVerificationStatusUndefined: Self = StObject.set(x, "verificationStatus", js.undefined)
      }
    }
    
    trait SmimeInfo extends StObject {
      
      var encryptedKeyPassword: js.UndefOr[String] = js.undefined
      
      var expiration: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var isDefault: js.UndefOr[Boolean] = js.undefined
      
      var issuerCn: js.UndefOr[String] = js.undefined
      
      var pem: js.UndefOr[String] = js.undefined
      
      var pkcs12: js.UndefOr[String] = js.undefined
    }
    object SmimeInfo {
      
      inline def apply(): SmimeInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SmimeInfo]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SmimeInfo] (val x: Self) extends AnyVal {
        
        inline def setEncryptedKeyPassword(value: String): Self = StObject.set(x, "encryptedKeyPassword", value.asInstanceOf[js.Any])
        
        inline def setEncryptedKeyPasswordUndefined: Self = StObject.set(x, "encryptedKeyPassword", js.undefined)
        
        inline def setExpiration(value: String): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
        
        inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
        
        inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
        
        inline def setIssuerCn(value: String): Self = StObject.set(x, "issuerCn", value.asInstanceOf[js.Any])
        
        inline def setIssuerCnUndefined: Self = StObject.set(x, "issuerCn", js.undefined)
        
        inline def setPem(value: String): Self = StObject.set(x, "pem", value.asInstanceOf[js.Any])
        
        inline def setPemUndefined: Self = StObject.set(x, "pem", js.undefined)
        
        inline def setPkcs12(value: String): Self = StObject.set(x, "pkcs12", value.asInstanceOf[js.Any])
        
        inline def setPkcs12Undefined: Self = StObject.set(x, "pkcs12", js.undefined)
      }
    }
    
    trait SmtpMsa extends StObject {
      
      var host: js.UndefOr[String] = js.undefined
      
      var password: js.UndefOr[String] = js.undefined
      
      var port: js.UndefOr[Double] = js.undefined
      
      var securityMode: js.UndefOr[String] = js.undefined
      
      var username: js.UndefOr[String] = js.undefined
    }
    object SmtpMsa {
      
      inline def apply(): SmtpMsa = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SmtpMsa]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SmtpMsa] (val x: Self) extends AnyVal {
        
        inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
        
        inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
        
        inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
        
        inline def setSecurityMode(value: String): Self = StObject.set(x, "securityMode", value.asInstanceOf[js.Any])
        
        inline def setSecurityModeUndefined: Self = StObject.set(x, "securityMode", js.undefined)
        
        inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
        
        inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      }
    }
    
    trait Thread extends StObject {
      
      var historyId: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var messages: js.UndefOr[js.Array[Message]] = js.undefined
      
      var snippet: js.UndefOr[String] = js.undefined
    }
    object Thread {
      
      inline def apply(): Thread = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Thread]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Thread] (val x: Self) extends AnyVal {
        
        inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
        
        inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
        
        inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
        
        inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value*))
        
        inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
      }
    }
    
    trait VacationSettings extends StObject {
      
      var enableAutoReply: js.UndefOr[Boolean] = js.undefined
      
      var endTime: js.UndefOr[String] = js.undefined
      
      var responseBodyHtml: js.UndefOr[String] = js.undefined
      
      var responseBodyPlainText: js.UndefOr[String] = js.undefined
      
      var responseSubject: js.UndefOr[String] = js.undefined
      
      var restrictToContacts: js.UndefOr[Boolean] = js.undefined
      
      var restrictToDomain: js.UndefOr[Boolean] = js.undefined
      
      var startTime: js.UndefOr[String] = js.undefined
    }
    object VacationSettings {
      
      inline def apply(): VacationSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VacationSettings]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: VacationSettings] (val x: Self) extends AnyVal {
        
        inline def setEnableAutoReply(value: Boolean): Self = StObject.set(x, "enableAutoReply", value.asInstanceOf[js.Any])
        
        inline def setEnableAutoReplyUndefined: Self = StObject.set(x, "enableAutoReply", js.undefined)
        
        inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
        
        inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
        
        inline def setResponseBodyHtml(value: String): Self = StObject.set(x, "responseBodyHtml", value.asInstanceOf[js.Any])
        
        inline def setResponseBodyHtmlUndefined: Self = StObject.set(x, "responseBodyHtml", js.undefined)
        
        inline def setResponseBodyPlainText(value: String): Self = StObject.set(x, "responseBodyPlainText", value.asInstanceOf[js.Any])
        
        inline def setResponseBodyPlainTextUndefined: Self = StObject.set(x, "responseBodyPlainText", js.undefined)
        
        inline def setResponseSubject(value: String): Self = StObject.set(x, "responseSubject", value.asInstanceOf[js.Any])
        
        inline def setResponseSubjectUndefined: Self = StObject.set(x, "responseSubject", js.undefined)
        
        inline def setRestrictToContacts(value: Boolean): Self = StObject.set(x, "restrictToContacts", value.asInstanceOf[js.Any])
        
        inline def setRestrictToContactsUndefined: Self = StObject.set(x, "restrictToContacts", js.undefined)
        
        inline def setRestrictToDomain(value: Boolean): Self = StObject.set(x, "restrictToDomain", value.asInstanceOf[js.Any])
        
        inline def setRestrictToDomainUndefined: Self = StObject.set(x, "restrictToDomain", js.undefined)
        
        inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
        
        inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      }
    }
    
    trait WatchRequest extends StObject {
      
      var labelFilterAction: js.UndefOr[String] = js.undefined
      
      var labelIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var topicName: js.UndefOr[String] = js.undefined
    }
    object WatchRequest {
      
      inline def apply(): WatchRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WatchRequest]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: WatchRequest] (val x: Self) extends AnyVal {
        
        inline def setLabelFilterAction(value: String): Self = StObject.set(x, "labelFilterAction", value.asInstanceOf[js.Any])
        
        inline def setLabelFilterActionUndefined: Self = StObject.set(x, "labelFilterAction", js.undefined)
        
        inline def setLabelIds(value: js.Array[String]): Self = StObject.set(x, "labelIds", value.asInstanceOf[js.Any])
        
        inline def setLabelIdsUndefined: Self = StObject.set(x, "labelIds", js.undefined)
        
        inline def setLabelIdsVarargs(value: String*): Self = StObject.set(x, "labelIds", js.Array(value*))
        
        inline def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
        
        inline def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
      }
    }
    
    trait WatchResponse extends StObject {
      
      var expiration: js.UndefOr[String] = js.undefined
      
      var historyId: js.UndefOr[String] = js.undefined
    }
    object WatchResponse {
      
      inline def apply(): WatchResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WatchResponse]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: WatchResponse] (val x: Self) extends AnyVal {
        
        inline def setExpiration(value: String): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
        
        inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
        
        inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
        
        inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
      }
    }
  }
}
