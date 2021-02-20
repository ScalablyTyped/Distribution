package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.basicCard
import typings.dialogflow.dialogflowStrings.browseCarouselCard
import typings.dialogflow.dialogflowStrings.card
import typings.dialogflow.dialogflowStrings.carouselSelect
import typings.dialogflow.dialogflowStrings.icon
import typings.dialogflow.dialogflowStrings.image
import typings.dialogflow.dialogflowStrings.largeImage
import typings.dialogflow.dialogflowStrings.linkOutSuggestion
import typings.dialogflow.dialogflowStrings.listSelect
import typings.dialogflow.dialogflowStrings.mediaContent
import typings.dialogflow.dialogflowStrings.payload
import typings.dialogflow.dialogflowStrings.quickReplies
import typings.dialogflow.dialogflowStrings.simpleResponses
import typings.dialogflow.dialogflowStrings.suggestions
import typings.dialogflow.dialogflowStrings.tableCard
import typings.dialogflow.dialogflowStrings.text
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.IFollowupIntentInfo
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.IMessage
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.IParameter
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.ITrainingPhrase
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.IOpenUriAction
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BasicCard.IButton
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.IOpenUrlAction
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.IBrowseCarouselCardItem
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.ImageDisplayOptions
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.IItem
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.HorizontalAlignment
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IBasicCard
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IBrowseCarouselCard
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ICard
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ICarouselSelect
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IImage
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ILinkOutSuggestion
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IListSelect
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IMediaContent
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IQuickReplies
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ISimpleResponses
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ISuggestions
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ITableCard
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IText
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.MediaContent.IResponseMediaObject
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaType
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Platform
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.TrainingPhrase.IPart
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.TrainingPhrase.Type
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.WebhookState
import typings.dialogflow.mod.google.protobuf.IStruct
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an Intent. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent")
@js.native
/**
  * Constructs a new Intent.
  * @param [properties] Properties to set
  */
class Intent () extends IIntent {
  def this(properties: IIntent) = this()
  
  /** Intent action. */
  @JSName("action")
  var action_Intent: String = js.native
  
  /** Intent defaultResponsePlatforms. */
  @JSName("defaultResponsePlatforms")
  var defaultResponsePlatforms_Intent: js.Array[Platform] = js.native
  
  /** Intent displayName. */
  @JSName("displayName")
  var displayName_Intent: String = js.native
  
  /** Intent events. */
  @JSName("events")
  var events_Intent: js.Array[String] = js.native
  
  /** Intent followupIntentInfo. */
  @JSName("followupIntentInfo")
  var followupIntentInfo_Intent: js.Array[IFollowupIntentInfo] = js.native
  
  /** Intent inputContextNames. */
  @JSName("inputContextNames")
  var inputContextNames_Intent: js.Array[String] = js.native
  
  /** Intent isFallback. */
  @JSName("isFallback")
  var isFallback_Intent: Boolean = js.native
  
  /** Intent messages. */
  @JSName("messages")
  var messages_Intent: js.Array[IMessage] = js.native
  
  /** Intent mlDisabled. */
  @JSName("mlDisabled")
  var mlDisabled_Intent: Boolean = js.native
  
  /** Intent name. */
  @JSName("name")
  var name_Intent: String = js.native
  
  /** Intent outputContexts. */
  @JSName("outputContexts")
  var outputContexts_Intent: js.Array[IContext] = js.native
  
  /** Intent parameters. */
  @JSName("parameters")
  var parameters_Intent: js.Array[IParameter] = js.native
  
  /** Intent parentFollowupIntentName. */
  @JSName("parentFollowupIntentName")
  var parentFollowupIntentName_Intent: String = js.native
  
  /** Intent priority. */
  @JSName("priority")
  var priority_Intent: Double = js.native
  
  /** Intent resetContexts. */
  @JSName("resetContexts")
  var resetContexts_Intent: Boolean = js.native
  
  /** Intent rootFollowupIntentName. */
  @JSName("rootFollowupIntentName")
  var rootFollowupIntentName_Intent: String = js.native
  
  /**
    * Converts this Intent to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** Intent trainingPhrases. */
  @JSName("trainingPhrases")
  var trainingPhrases_Intent: js.Array[ITrainingPhrase] = js.native
  
  /** Intent webhookState. */
  @JSName("webhookState")
  var webhookState_Intent: WebhookState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.WebhookState * / any */ String) = js.native
}
object Intent {
  
  /** Represents a FollowupIntentInfo. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.FollowupIntentInfo")
  @js.native
  /**
    * Constructs a new FollowupIntentInfo.
    * @param [properties] Properties to set
    */
  class FollowupIntentInfo () extends IFollowupIntentInfo {
    def this(properties: IFollowupIntentInfo) = this()
    
    /** FollowupIntentInfo followupIntentName. */
    @JSName("followupIntentName")
    var followupIntentName_FollowupIntentInfo: String = js.native
    
    /** FollowupIntentInfo parentFollowupIntentName. */
    @JSName("parentFollowupIntentName")
    var parentFollowupIntentName_FollowupIntentInfo: String = js.native
    
    /**
      * Converts this FollowupIntentInfo to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object FollowupIntentInfo {
    
    /**
      * Creates a new FollowupIntentInfo instance using the specified properties.
      * @param [properties] Properties to set
      * @returns FollowupIntentInfo instance
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.FollowupIntentInfo.create")
    @js.native
    def create(): FollowupIntentInfo = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.FollowupIntentInfo.create")
    @js.native
    def create(properties: IFollowupIntentInfo): FollowupIntentInfo = js.native
    
    /**
      * Decodes a FollowupIntentInfo message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns FollowupIntentInfo
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.FollowupIntentInfo.decode")
    @js.native
    def decode(reader: Reader): FollowupIntentInfo = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.FollowupIntentInfo.decode")
    @js.native
    def decode(reader: Reader, length: Double): FollowupIntentInfo = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.FollowupIntentInfo.decode")
    @js.native
    def decode(reader: Uint8Array): FollowupIntentInfo = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.FollowupIntentInfo.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): FollowupIntentInfo = js.native
    
    /**
      * Decodes a FollowupIntentInfo message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns FollowupIntentInfo
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.FollowupIntentInfo.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): FollowupIntentInfo = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.FollowupIntentInfo.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): FollowupIntentInfo = js.native
    
    /**
      * Encodes the specified FollowupIntentInfo message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.FollowupIntentInfo.verify|verify} messages.
      * @param message FollowupIntentInfo message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.FollowupIntentInfo.encode")
    @js.native
    def encode(message: IFollowupIntentInfo): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.FollowupIntentInfo.encode")
    @js.native
    def encode(message: IFollowupIntentInfo, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified FollowupIntentInfo message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.FollowupIntentInfo.verify|verify} messages.
      * @param message FollowupIntentInfo message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.FollowupIntentInfo.encodeDelimited")
    @js.native
    def encodeDelimited(message: IFollowupIntentInfo): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.FollowupIntentInfo.encodeDelimited")
    @js.native
    def encodeDelimited(message: IFollowupIntentInfo, writer: Writer): Writer = js.native
    
    /**
      * Creates a FollowupIntentInfo message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns FollowupIntentInfo
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.FollowupIntentInfo.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): FollowupIntentInfo = js.native
    
    /**
      * Creates a plain object from a FollowupIntentInfo message. Also converts values to other types if specified.
      * @param message FollowupIntentInfo
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.FollowupIntentInfo.toObject")
    @js.native
    def toObject(message: FollowupIntentInfo): StringDictionary[js.Any] = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.FollowupIntentInfo.toObject")
    @js.native
    def toObject(message: FollowupIntentInfo, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a FollowupIntentInfo message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.FollowupIntentInfo.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a Message. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message")
  @js.native
  /**
    * Constructs a new Message.
    * @param [properties] Properties to set
    */
  class Message () extends IMessage {
    def this(properties: IMessage) = this()
    
    /** Message message. */
    var message: js.UndefOr[
        text | image | quickReplies | card | payload | simpleResponses | basicCard | suggestions | linkOutSuggestion | listSelect | carouselSelect | browseCarouselCard | tableCard | mediaContent
      ] = js.native
    
    /** Message platform. */
    @JSName("platform")
    var platform_Message: Platform | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.Platform * / any */ String) = js.native
    
    /**
      * Converts this Message to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object Message {
    
    /** Represents a BasicCard. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard")
    @js.native
    /**
      * Constructs a new BasicCard.
      * @param [properties] Properties to set
      */
    class BasicCard () extends IBasicCard {
      def this(properties: IBasicCard) = this()
      
      /** BasicCard buttons. */
      @JSName("buttons")
      var buttons_BasicCard: js.Array[IButton] = js.native
      
      /** BasicCard formattedText. */
      @JSName("formattedText")
      var formattedText_BasicCard: String = js.native
      
      /** BasicCard subtitle. */
      @JSName("subtitle")
      var subtitle_BasicCard: String = js.native
      
      /** BasicCard title. */
      @JSName("title")
      var title_BasicCard: String = js.native
      
      /**
        * Converts this BasicCard to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object BasicCard {
      
      /** Represents a Button. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button")
      @js.native
      /**
        * Constructs a new Button.
        * @param [properties] Properties to set
        */
      class Button () extends IButton {
        def this(properties: IButton) = this()
        
        /** Button title. */
        @JSName("title")
        var title_Button: String = js.native
        
        /**
          * Converts this Button to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[js.Any] = js.native
      }
      object Button {
        
        /** Represents an OpenUriAction. */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.OpenUriAction")
        @js.native
        /**
          * Constructs a new OpenUriAction.
          * @param [properties] Properties to set
          */
        class OpenUriAction () extends IOpenUriAction {
          def this(properties: IOpenUriAction) = this()
          
          /**
            * Converts this OpenUriAction to JSON.
            * @returns JSON object
            */
          def toJSON(): StringDictionary[js.Any] = js.native
          
          /** OpenUriAction uri. */
          @JSName("uri")
          var uri_OpenUriAction: String = js.native
        }
        object OpenUriAction {
          
          /**
            * Creates a new OpenUriAction instance using the specified properties.
            * @param [properties] Properties to set
            * @returns OpenUriAction instance
            */
          /* static member */
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.OpenUriAction.create")
          @js.native
          def create(): OpenUriAction = js.native
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.OpenUriAction.create")
          @js.native
          def create(properties: IOpenUriAction): OpenUriAction = js.native
          
          /**
            * Decodes an OpenUriAction message from the specified reader or buffer.
            * @param reader Reader or buffer to decode from
            * @param [length] Message length if known beforehand
            * @returns OpenUriAction
            * @throws {Error} If the payload is not a reader or valid buffer
            * @throws {$protobuf.util.ProtocolError} If required fields are missing
            */
          /* static member */
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.OpenUriAction.decode")
          @js.native
          def decode(reader: Reader): OpenUriAction = js.native
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.OpenUriAction.decode")
          @js.native
          def decode(reader: Reader, length: Double): OpenUriAction = js.native
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.OpenUriAction.decode")
          @js.native
          def decode(reader: Uint8Array): OpenUriAction = js.native
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.OpenUriAction.decode")
          @js.native
          def decode(reader: Uint8Array, length: Double): OpenUriAction = js.native
          
          /**
            * Decodes an OpenUriAction message from the specified reader or buffer, length delimited.
            * @param reader Reader or buffer to decode from
            * @returns OpenUriAction
            * @throws {Error} If the payload is not a reader or valid buffer
            * @throws {$protobuf.util.ProtocolError} If required fields are missing
            */
          /* static member */
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.OpenUriAction.decodeDelimited")
          @js.native
          def decodeDelimited(reader: Reader): OpenUriAction = js.native
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.OpenUriAction.decodeDelimited")
          @js.native
          def decodeDelimited(reader: Uint8Array): OpenUriAction = js.native
          
          /**
            * Encodes the specified OpenUriAction message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.OpenUriAction.verify|verify} messages.
            * @param message OpenUriAction message or plain object to encode
            * @param [writer] Writer to encode to
            * @returns Writer
            */
          /* static member */
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.OpenUriAction.encode")
          @js.native
          def encode(message: IOpenUriAction): Writer = js.native
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.OpenUriAction.encode")
          @js.native
          def encode(message: IOpenUriAction, writer: Writer): Writer = js.native
          
          /**
            * Encodes the specified OpenUriAction message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.OpenUriAction.verify|verify} messages.
            * @param message OpenUriAction message or plain object to encode
            * @param [writer] Writer to encode to
            * @returns Writer
            */
          /* static member */
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.OpenUriAction.encodeDelimited")
          @js.native
          def encodeDelimited(message: IOpenUriAction): Writer = js.native
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.OpenUriAction.encodeDelimited")
          @js.native
          def encodeDelimited(message: IOpenUriAction, writer: Writer): Writer = js.native
          
          /**
            * Creates an OpenUriAction message from a plain object. Also converts values to their respective internal types.
            * @param object Plain object
            * @returns OpenUriAction
            */
          /* static member */
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.OpenUriAction.fromObject")
          @js.native
          def fromObject(`object`: StringDictionary[js.Any]): OpenUriAction = js.native
          
          /**
            * Creates a plain object from an OpenUriAction message. Also converts values to other types if specified.
            * @param message OpenUriAction
            * @param [options] Conversion options
            * @returns Plain object
            */
          /* static member */
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.OpenUriAction.toObject")
          @js.native
          def toObject(message: OpenUriAction): StringDictionary[js.Any] = js.native
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.OpenUriAction.toObject")
          @js.native
          def toObject(message: OpenUriAction, options: IConversionOptions): StringDictionary[js.Any] = js.native
          
          /**
            * Verifies an OpenUriAction message.
            * @param message Plain object to verify
            * @returns `null` if valid, otherwise the reason why it is not
            */
          /* static member */
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.OpenUriAction.verify")
          @js.native
          def verify(message: StringDictionary[js.Any]): String | Null = js.native
        }
        
        /**
          * Creates a new Button instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Button instance
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.create")
        @js.native
        def create(): Button = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.create")
        @js.native
        def create(properties: IButton): Button = js.native
        
        /**
          * Decodes a Button message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Button
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.decode")
        @js.native
        def decode(reader: Reader): Button = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.decode")
        @js.native
        def decode(reader: Reader, length: Double): Button = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.decode")
        @js.native
        def decode(reader: Uint8Array): Button = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.decode")
        @js.native
        def decode(reader: Uint8Array, length: Double): Button = js.native
        
        /**
          * Decodes a Button message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Button
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Reader): Button = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Uint8Array): Button = js.native
        
        /**
          * Encodes the specified Button message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.verify|verify} messages.
          * @param message Button message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.encode")
        @js.native
        def encode(message: IButton): Writer = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.encode")
        @js.native
        def encode(message: IButton, writer: Writer): Writer = js.native
        
        /**
          * Encodes the specified Button message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.verify|verify} messages.
          * @param message Button message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.encodeDelimited")
        @js.native
        def encodeDelimited(message: IButton): Writer = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.encodeDelimited")
        @js.native
        def encodeDelimited(message: IButton, writer: Writer): Writer = js.native
        
        /**
          * Creates a Button message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Button
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.fromObject")
        @js.native
        def fromObject(`object`: StringDictionary[js.Any]): Button = js.native
        
        /**
          * Creates a plain object from a Button message. Also converts values to other types if specified.
          * @param message Button
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.toObject")
        @js.native
        def toObject(message: Button): StringDictionary[js.Any] = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.toObject")
        @js.native
        def toObject(message: Button, options: IConversionOptions): StringDictionary[js.Any] = js.native
        
        /**
          * Verifies a Button message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.verify")
        @js.native
        def verify(message: StringDictionary[js.Any]): String | Null = js.native
        
        /** Properties of an OpenUriAction. */
        @js.native
        trait IOpenUriAction extends StObject {
          
          /** OpenUriAction uri */
          var uri: js.UndefOr[String | Null] = js.native
        }
        object IOpenUriAction {
          
          @scala.inline
          def apply(): IOpenUriAction = {
            val __obj = js.Dynamic.literal()
            __obj.asInstanceOf[IOpenUriAction]
          }
          
          @scala.inline
          implicit class IOpenUriActionMutableBuilder[Self <: IOpenUriAction] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setUriNull: Self = StObject.set(x, "uri", null)
            
            @scala.inline
            def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
          }
        }
      }
      
      /**
        * Creates a new BasicCard instance using the specified properties.
        * @param [properties] Properties to set
        * @returns BasicCard instance
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.create")
      @js.native
      def create(): BasicCard = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.create")
      @js.native
      def create(properties: IBasicCard): BasicCard = js.native
      
      /**
        * Decodes a BasicCard message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns BasicCard
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.decode")
      @js.native
      def decode(reader: Reader): BasicCard = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.decode")
      @js.native
      def decode(reader: Reader, length: Double): BasicCard = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.decode")
      @js.native
      def decode(reader: Uint8Array): BasicCard = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): BasicCard = js.native
      
      /**
        * Decodes a BasicCard message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns BasicCard
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): BasicCard = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): BasicCard = js.native
      
      /**
        * Encodes the specified BasicCard message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BasicCard.verify|verify} messages.
        * @param message BasicCard message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.encode")
      @js.native
      def encode(message: IBasicCard): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.encode")
      @js.native
      def encode(message: IBasicCard, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified BasicCard message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BasicCard.verify|verify} messages.
        * @param message BasicCard message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.encodeDelimited")
      @js.native
      def encodeDelimited(message: IBasicCard): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.encodeDelimited")
      @js.native
      def encodeDelimited(message: IBasicCard, writer: Writer): Writer = js.native
      
      /**
        * Creates a BasicCard message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns BasicCard
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): BasicCard = js.native
      
      /**
        * Creates a plain object from a BasicCard message. Also converts values to other types if specified.
        * @param message BasicCard
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.toObject")
      @js.native
      def toObject(message: BasicCard): StringDictionary[js.Any] = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.toObject")
      @js.native
      def toObject(message: BasicCard, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a BasicCard message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
      
      /** Properties of a Button. */
      @js.native
      trait IButton extends StObject {
        
        /** Button openUriAction */
        var openUriAction: js.UndefOr[IOpenUriAction | Null] = js.native
        
        /** Button title */
        var title: js.UndefOr[String | Null] = js.native
      }
      object IButton {
        
        @scala.inline
        def apply(): IButton = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IButton]
        }
        
        @scala.inline
        implicit class IButtonMutableBuilder[Self <: IButton] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setOpenUriAction(value: IOpenUriAction): Self = StObject.set(x, "openUriAction", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOpenUriActionNull: Self = StObject.set(x, "openUriAction", null)
          
          @scala.inline
          def setOpenUriActionUndefined: Self = StObject.set(x, "openUriAction", js.undefined)
          
          @scala.inline
          def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTitleNull: Self = StObject.set(x, "title", null)
          
          @scala.inline
          def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        }
      }
    }
    
    /** Represents a BrowseCarouselCard. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard")
    @js.native
    /**
      * Constructs a new BrowseCarouselCard.
      * @param [properties] Properties to set
      */
    class BrowseCarouselCard () extends IBrowseCarouselCard {
      def this(properties: IBrowseCarouselCard) = this()
      
      /** BrowseCarouselCard imageDisplayOptions. */
      @JSName("imageDisplayOptions")
      var imageDisplayOptions_BrowseCarouselCard: ImageDisplayOptions | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.ImageDisplayOptions * / any */ String) = js.native
      
      /** BrowseCarouselCard items. */
      @JSName("items")
      var items_BrowseCarouselCard: js.Array[IBrowseCarouselCardItem] = js.native
      
      /**
        * Converts this BrowseCarouselCard to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object BrowseCarouselCard {
      
      /** Represents a BrowseCarouselCardItem. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem")
      @js.native
      /**
        * Constructs a new BrowseCarouselCardItem.
        * @param [properties] Properties to set
        */
      class BrowseCarouselCardItem () extends IBrowseCarouselCardItem {
        def this(properties: IBrowseCarouselCardItem) = this()
        
        /** BrowseCarouselCardItem description. */
        @JSName("description")
        var description_BrowseCarouselCardItem: String = js.native
        
        /** BrowseCarouselCardItem footer. */
        @JSName("footer")
        var footer_BrowseCarouselCardItem: String = js.native
        
        /** BrowseCarouselCardItem title. */
        @JSName("title")
        var title_BrowseCarouselCardItem: String = js.native
        
        /**
          * Converts this BrowseCarouselCardItem to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[js.Any] = js.native
      }
      object BrowseCarouselCardItem {
        
        /** Represents an OpenUrlAction. */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction")
        @js.native
        /**
          * Constructs a new OpenUrlAction.
          * @param [properties] Properties to set
          */
        class OpenUrlAction () extends IOpenUrlAction {
          def this(properties: IOpenUrlAction) = this()
          
          /**
            * Converts this OpenUrlAction to JSON.
            * @returns JSON object
            */
          def toJSON(): StringDictionary[js.Any] = js.native
          
          /** OpenUrlAction urlTypeHint. */
          @JSName("urlTypeHint")
          var urlTypeHint_OpenUrlAction: UrlTypeHint | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint * / any */ String) = js.native
          
          /** OpenUrlAction url. */
          @JSName("url")
          var url_OpenUrlAction: String = js.native
        }
        object OpenUrlAction {
          
          @js.native
          sealed trait UrlTypeHint extends StObject
          /** UrlTypeHint enum. */
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint")
          @js.native
          object UrlTypeHint extends StObject {
            
            @JSBracketAccess
            def apply(value: Double): js.UndefOr[UrlTypeHint with Double] = js.native
            
            @js.native
            sealed trait AMP_ACTION extends UrlTypeHint
            /* 1 */ val AMP_ACTION: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint.AMP_ACTION with Double = js.native
            
            @js.native
            sealed trait AMP_CONTENT extends UrlTypeHint
            /* 2 */ val AMP_CONTENT: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint.AMP_CONTENT with Double = js.native
            
            @js.native
            sealed trait URL_TYPE_HINT_UNSPECIFIED extends UrlTypeHint
            /* 0 */ val URL_TYPE_HINT_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint.URL_TYPE_HINT_UNSPECIFIED with Double = js.native
          }
          
          /**
            * Creates a new OpenUrlAction instance using the specified properties.
            * @param [properties] Properties to set
            * @returns OpenUrlAction instance
            */
          /* static member */
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.create")
          @js.native
          def create(): OpenUrlAction = js.native
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.create")
          @js.native
          def create(properties: IOpenUrlAction): OpenUrlAction = js.native
          
          /**
            * Decodes an OpenUrlAction message from the specified reader or buffer.
            * @param reader Reader or buffer to decode from
            * @param [length] Message length if known beforehand
            * @returns OpenUrlAction
            * @throws {Error} If the payload is not a reader or valid buffer
            * @throws {$protobuf.util.ProtocolError} If required fields are missing
            */
          /* static member */
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.decode")
          @js.native
          def decode(reader: Reader): OpenUrlAction = js.native
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.decode")
          @js.native
          def decode(reader: Reader, length: Double): OpenUrlAction = js.native
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.decode")
          @js.native
          def decode(reader: Uint8Array): OpenUrlAction = js.native
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.decode")
          @js.native
          def decode(reader: Uint8Array, length: Double): OpenUrlAction = js.native
          
          /**
            * Decodes an OpenUrlAction message from the specified reader or buffer, length delimited.
            * @param reader Reader or buffer to decode from
            * @returns OpenUrlAction
            * @throws {Error} If the payload is not a reader or valid buffer
            * @throws {$protobuf.util.ProtocolError} If required fields are missing
            */
          /* static member */
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.decodeDelimited")
          @js.native
          def decodeDelimited(reader: Reader): OpenUrlAction = js.native
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.decodeDelimited")
          @js.native
          def decodeDelimited(reader: Uint8Array): OpenUrlAction = js.native
          
          /**
            * Encodes the specified OpenUrlAction message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.verify|verify} messages.
            * @param message OpenUrlAction message or plain object to encode
            * @param [writer] Writer to encode to
            * @returns Writer
            */
          /* static member */
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.encode")
          @js.native
          def encode(message: IOpenUrlAction): Writer = js.native
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.encode")
          @js.native
          def encode(message: IOpenUrlAction, writer: Writer): Writer = js.native
          
          /**
            * Encodes the specified OpenUrlAction message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.verify|verify} messages.
            * @param message OpenUrlAction message or plain object to encode
            * @param [writer] Writer to encode to
            * @returns Writer
            */
          /* static member */
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.encodeDelimited")
          @js.native
          def encodeDelimited(message: IOpenUrlAction): Writer = js.native
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.encodeDelimited")
          @js.native
          def encodeDelimited(message: IOpenUrlAction, writer: Writer): Writer = js.native
          
          /**
            * Creates an OpenUrlAction message from a plain object. Also converts values to their respective internal types.
            * @param object Plain object
            * @returns OpenUrlAction
            */
          /* static member */
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.fromObject")
          @js.native
          def fromObject(`object`: StringDictionary[js.Any]): OpenUrlAction = js.native
          
          /**
            * Creates a plain object from an OpenUrlAction message. Also converts values to other types if specified.
            * @param message OpenUrlAction
            * @param [options] Conversion options
            * @returns Plain object
            */
          /* static member */
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.toObject")
          @js.native
          def toObject(message: OpenUrlAction): StringDictionary[js.Any] = js.native
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.toObject")
          @js.native
          def toObject(message: OpenUrlAction, options: IConversionOptions): StringDictionary[js.Any] = js.native
          
          /**
            * Verifies an OpenUrlAction message.
            * @param message Plain object to verify
            * @returns `null` if valid, otherwise the reason why it is not
            */
          /* static member */
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.verify")
          @js.native
          def verify(message: StringDictionary[js.Any]): String | Null = js.native
        }
        
        /**
          * Creates a new BrowseCarouselCardItem instance using the specified properties.
          * @param [properties] Properties to set
          * @returns BrowseCarouselCardItem instance
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.create")
        @js.native
        def create(): BrowseCarouselCardItem = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.create")
        @js.native
        def create(properties: IBrowseCarouselCardItem): BrowseCarouselCardItem = js.native
        
        /**
          * Decodes a BrowseCarouselCardItem message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns BrowseCarouselCardItem
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.decode")
        @js.native
        def decode(reader: Reader): BrowseCarouselCardItem = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.decode")
        @js.native
        def decode(reader: Reader, length: Double): BrowseCarouselCardItem = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.decode")
        @js.native
        def decode(reader: Uint8Array): BrowseCarouselCardItem = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.decode")
        @js.native
        def decode(reader: Uint8Array, length: Double): BrowseCarouselCardItem = js.native
        
        /**
          * Decodes a BrowseCarouselCardItem message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns BrowseCarouselCardItem
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Reader): BrowseCarouselCardItem = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Uint8Array): BrowseCarouselCardItem = js.native
        
        /**
          * Encodes the specified BrowseCarouselCardItem message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.verify|verify} messages.
          * @param message BrowseCarouselCardItem message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.encode")
        @js.native
        def encode(message: IBrowseCarouselCardItem): Writer = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.encode")
        @js.native
        def encode(message: IBrowseCarouselCardItem, writer: Writer): Writer = js.native
        
        /**
          * Encodes the specified BrowseCarouselCardItem message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.verify|verify} messages.
          * @param message BrowseCarouselCardItem message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.encodeDelimited")
        @js.native
        def encodeDelimited(message: IBrowseCarouselCardItem): Writer = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.encodeDelimited")
        @js.native
        def encodeDelimited(message: IBrowseCarouselCardItem, writer: Writer): Writer = js.native
        
        /**
          * Creates a BrowseCarouselCardItem message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns BrowseCarouselCardItem
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.fromObject")
        @js.native
        def fromObject(`object`: StringDictionary[js.Any]): BrowseCarouselCardItem = js.native
        
        /**
          * Creates a plain object from a BrowseCarouselCardItem message. Also converts values to other types if specified.
          * @param message BrowseCarouselCardItem
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.toObject")
        @js.native
        def toObject(message: BrowseCarouselCardItem): StringDictionary[js.Any] = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.toObject")
        @js.native
        def toObject(message: BrowseCarouselCardItem, options: IConversionOptions): StringDictionary[js.Any] = js.native
        
        /**
          * Verifies a BrowseCarouselCardItem message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.verify")
        @js.native
        def verify(message: StringDictionary[js.Any]): String | Null = js.native
        
        /** Properties of an OpenUrlAction. */
        @js.native
        trait IOpenUrlAction extends StObject {
          
          /** OpenUrlAction url */
          var url: js.UndefOr[String | Null] = js.native
          
          /** OpenUrlAction urlTypeHint */
          var urlTypeHint: js.UndefOr[
                    UrlTypeHint | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint * / any */ String) | Null
                  ] = js.native
        }
        object IOpenUrlAction {
          
          @scala.inline
          def apply(): IOpenUrlAction = {
            val __obj = js.Dynamic.literal()
            __obj.asInstanceOf[IOpenUrlAction]
          }
          
          @scala.inline
          implicit class IOpenUrlActionMutableBuilder[Self <: IOpenUrlAction] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setUrlNull: Self = StObject.set(x, "url", null)
            
            @scala.inline
            def setUrlTypeHint(
              value: UrlTypeHint | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint * / any */ String)
            ): Self = StObject.set(x, "urlTypeHint", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setUrlTypeHintNull: Self = StObject.set(x, "urlTypeHint", null)
            
            @scala.inline
            def setUrlTypeHintUndefined: Self = StObject.set(x, "urlTypeHint", js.undefined)
            
            @scala.inline
            def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
          }
        }
      }
      
      @js.native
      sealed trait ImageDisplayOptions extends StObject
      /** ImageDisplayOptions enum. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.ImageDisplayOptions")
      @js.native
      object ImageDisplayOptions extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[ImageDisplayOptions with Double] = js.native
        
        @js.native
        sealed trait BLURRED_BACKGROUND extends ImageDisplayOptions
        /* 4 */ val BLURRED_BACKGROUND: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.BLURRED_BACKGROUND with Double = js.native
        
        @js.native
        sealed trait CROPPED extends ImageDisplayOptions
        /* 3 */ val CROPPED: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.CROPPED with Double = js.native
        
        @js.native
        sealed trait GRAY extends ImageDisplayOptions
        /* 1 */ val GRAY: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.GRAY with Double = js.native
        
        @js.native
        sealed trait IMAGE_DISPLAY_OPTIONS_UNSPECIFIED extends ImageDisplayOptions
        /* 0 */ val IMAGE_DISPLAY_OPTIONS_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.IMAGE_DISPLAY_OPTIONS_UNSPECIFIED with Double = js.native
        
        @js.native
        sealed trait WHITE extends ImageDisplayOptions
        /* 2 */ val WHITE: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.WHITE with Double = js.native
      }
      
      /**
        * Creates a new BrowseCarouselCard instance using the specified properties.
        * @param [properties] Properties to set
        * @returns BrowseCarouselCard instance
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.create")
      @js.native
      def create(): BrowseCarouselCard = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.create")
      @js.native
      def create(properties: IBrowseCarouselCard): BrowseCarouselCard = js.native
      
      /**
        * Decodes a BrowseCarouselCard message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns BrowseCarouselCard
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.decode")
      @js.native
      def decode(reader: Reader): BrowseCarouselCard = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.decode")
      @js.native
      def decode(reader: Reader, length: Double): BrowseCarouselCard = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.decode")
      @js.native
      def decode(reader: Uint8Array): BrowseCarouselCard = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): BrowseCarouselCard = js.native
      
      /**
        * Decodes a BrowseCarouselCard message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns BrowseCarouselCard
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): BrowseCarouselCard = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): BrowseCarouselCard = js.native
      
      /**
        * Encodes the specified BrowseCarouselCard message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.verify|verify} messages.
        * @param message BrowseCarouselCard message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.encode")
      @js.native
      def encode(message: IBrowseCarouselCard): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.encode")
      @js.native
      def encode(message: IBrowseCarouselCard, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified BrowseCarouselCard message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.verify|verify} messages.
        * @param message BrowseCarouselCard message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.encodeDelimited")
      @js.native
      def encodeDelimited(message: IBrowseCarouselCard): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.encodeDelimited")
      @js.native
      def encodeDelimited(message: IBrowseCarouselCard, writer: Writer): Writer = js.native
      
      /**
        * Creates a BrowseCarouselCard message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns BrowseCarouselCard
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): BrowseCarouselCard = js.native
      
      /**
        * Creates a plain object from a BrowseCarouselCard message. Also converts values to other types if specified.
        * @param message BrowseCarouselCard
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.toObject")
      @js.native
      def toObject(message: BrowseCarouselCard): StringDictionary[js.Any] = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.toObject")
      @js.native
      def toObject(message: BrowseCarouselCard, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a BrowseCarouselCard message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
      
      /** Properties of a BrowseCarouselCardItem. */
      @js.native
      trait IBrowseCarouselCardItem extends StObject {
        
        /** BrowseCarouselCardItem description */
        var description: js.UndefOr[String | Null] = js.native
        
        /** BrowseCarouselCardItem footer */
        var footer: js.UndefOr[String | Null] = js.native
        
        /** BrowseCarouselCardItem image */
        var image: js.UndefOr[IImage | Null] = js.native
        
        /** BrowseCarouselCardItem openUriAction */
        var openUriAction: js.UndefOr[IOpenUrlAction | Null] = js.native
        
        /** BrowseCarouselCardItem title */
        var title: js.UndefOr[String | Null] = js.native
      }
      object IBrowseCarouselCardItem {
        
        @scala.inline
        def apply(): IBrowseCarouselCardItem = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IBrowseCarouselCardItem]
        }
        
        @scala.inline
        implicit class IBrowseCarouselCardItemMutableBuilder[Self <: IBrowseCarouselCardItem] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDescriptionNull: Self = StObject.set(x, "description", null)
          
          @scala.inline
          def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
          
          @scala.inline
          def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFooterNull: Self = StObject.set(x, "footer", null)
          
          @scala.inline
          def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
          
          @scala.inline
          def setImage(value: IImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setImageNull: Self = StObject.set(x, "image", null)
          
          @scala.inline
          def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
          
          @scala.inline
          def setOpenUriAction(value: IOpenUrlAction): Self = StObject.set(x, "openUriAction", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOpenUriActionNull: Self = StObject.set(x, "openUriAction", null)
          
          @scala.inline
          def setOpenUriActionUndefined: Self = StObject.set(x, "openUriAction", js.undefined)
          
          @scala.inline
          def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTitleNull: Self = StObject.set(x, "title", null)
          
          @scala.inline
          def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        }
      }
    }
    
    /** Represents a Card. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card")
    @js.native
    /**
      * Constructs a new Card.
      * @param [properties] Properties to set
      */
    class Card () extends ICard {
      def this(properties: ICard) = this()
      
      /** Card buttons. */
      @JSName("buttons")
      var buttons_Card: js.Array[typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton] = js.native
      
      /** Card imageUri. */
      @JSName("imageUri")
      var imageUri_Card: String = js.native
      
      /** Card subtitle. */
      @JSName("subtitle")
      var subtitle_Card: String = js.native
      
      /** Card title. */
      @JSName("title")
      var title_Card: String = js.native
      
      /**
        * Converts this Card to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object Card {
      
      /** Represents a Button. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.Button")
      @js.native
      /**
        * Constructs a new Button.
        * @param [properties] Properties to set
        */
      class Button ()
        extends typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton {
        def this(properties: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton) = this()
        
        /** Button postback. */
        @JSName("postback")
        var postback_Button: String = js.native
        
        /** Button text. */
        @JSName("text")
        var text_Button: String = js.native
        
        /**
          * Converts this Button to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[js.Any] = js.native
      }
      object Button {
        
        /**
          * Creates a new Button instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Button instance
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.Button.create")
        @js.native
        def create(): Button = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.Button.create")
        @js.native
        def create(properties: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton): Button = js.native
        
        /**
          * Decodes a Button message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Button
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.Button.decode")
        @js.native
        def decode(reader: Reader): Button = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.Button.decode")
        @js.native
        def decode(reader: Reader, length: Double): Button = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.Button.decode")
        @js.native
        def decode(reader: Uint8Array): Button = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.Button.decode")
        @js.native
        def decode(reader: Uint8Array, length: Double): Button = js.native
        
        /**
          * Decodes a Button message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Button
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.Button.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Reader): Button = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.Button.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Uint8Array): Button = js.native
        
        /**
          * Encodes the specified Button message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Card.Button.verify|verify} messages.
          * @param message Button message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.Button.encode")
        @js.native
        def encode(message: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton): Writer = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.Button.encode")
        @js.native
        def encode(
          message: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton,
          writer: Writer
        ): Writer = js.native
        
        /**
          * Encodes the specified Button message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Card.Button.verify|verify} messages.
          * @param message Button message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.Button.encodeDelimited")
        @js.native
        def encodeDelimited(message: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton): Writer = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.Button.encodeDelimited")
        @js.native
        def encodeDelimited(
          message: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton,
          writer: Writer
        ): Writer = js.native
        
        /**
          * Creates a Button message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Button
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.Button.fromObject")
        @js.native
        def fromObject(`object`: StringDictionary[js.Any]): Button = js.native
        
        /**
          * Creates a plain object from a Button message. Also converts values to other types if specified.
          * @param message Button
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.Button.toObject")
        @js.native
        def toObject(message: Button): StringDictionary[js.Any] = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.Button.toObject")
        @js.native
        def toObject(message: Button, options: IConversionOptions): StringDictionary[js.Any] = js.native
        
        /**
          * Verifies a Button message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.Button.verify")
        @js.native
        def verify(message: StringDictionary[js.Any]): String | Null = js.native
      }
      
      /**
        * Creates a new Card instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Card instance
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.create")
      @js.native
      def create(): Card = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.create")
      @js.native
      def create(properties: ICard): Card = js.native
      
      /**
        * Decodes a Card message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Card
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.decode")
      @js.native
      def decode(reader: Reader): Card = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.decode")
      @js.native
      def decode(reader: Reader, length: Double): Card = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.decode")
      @js.native
      def decode(reader: Uint8Array): Card = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): Card = js.native
      
      /**
        * Decodes a Card message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Card
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): Card = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): Card = js.native
      
      /**
        * Encodes the specified Card message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Card.verify|verify} messages.
        * @param message Card message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.encode")
      @js.native
      def encode(message: ICard): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.encode")
      @js.native
      def encode(message: ICard, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified Card message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Card.verify|verify} messages.
        * @param message Card message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.encodeDelimited")
      @js.native
      def encodeDelimited(message: ICard): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.encodeDelimited")
      @js.native
      def encodeDelimited(message: ICard, writer: Writer): Writer = js.native
      
      /**
        * Creates a Card message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Card
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): Card = js.native
      
      /**
        * Creates a plain object from a Card message. Also converts values to other types if specified.
        * @param message Card
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.toObject")
      @js.native
      def toObject(message: Card): StringDictionary[js.Any] = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.toObject")
      @js.native
      def toObject(message: Card, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a Card message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
      
      /** Properties of a Button. */
      @js.native
      trait IButton extends StObject {
        
        /** Button postback */
        var postback: js.UndefOr[String | Null] = js.native
        
        /** Button text */
        var text: js.UndefOr[String | Null] = js.native
      }
      object IButton {
        
        @scala.inline
        def apply(): typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton]
        }
        
        @scala.inline
        implicit class IButtonMutableBuilder[Self <: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setPostback(value: String): Self = StObject.set(x, "postback", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPostbackNull: Self = StObject.set(x, "postback", null)
          
          @scala.inline
          def setPostbackUndefined: Self = StObject.set(x, "postback", js.undefined)
          
          @scala.inline
          def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTextNull: Self = StObject.set(x, "text", null)
          
          @scala.inline
          def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
        }
      }
    }
    
    /** Represents a CarouselSelect. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect")
    @js.native
    /**
      * Constructs a new CarouselSelect.
      * @param [properties] Properties to set
      */
    class CarouselSelect () extends ICarouselSelect {
      def this(properties: ICarouselSelect) = this()
      
      /** CarouselSelect items. */
      @JSName("items")
      var items_CarouselSelect: js.Array[IItem] = js.native
      
      /**
        * Converts this CarouselSelect to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object CarouselSelect {
      
      /** Represents an Item. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.Item")
      @js.native
      /**
        * Constructs a new Item.
        * @param [properties] Properties to set
        */
      class Item () extends IItem {
        def this(properties: IItem) = this()
        
        /** Item description. */
        @JSName("description")
        var description_Item: String = js.native
        
        /** Item title. */
        @JSName("title")
        var title_Item: String = js.native
        
        /**
          * Converts this Item to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[js.Any] = js.native
      }
      object Item {
        
        /**
          * Creates a new Item instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Item instance
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.Item.create")
        @js.native
        def create(): Item = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.Item.create")
        @js.native
        def create(properties: IItem): Item = js.native
        
        /**
          * Decodes an Item message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Item
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.Item.decode")
        @js.native
        def decode(reader: Reader): Item = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.Item.decode")
        @js.native
        def decode(reader: Reader, length: Double): Item = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.Item.decode")
        @js.native
        def decode(reader: Uint8Array): Item = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.Item.decode")
        @js.native
        def decode(reader: Uint8Array, length: Double): Item = js.native
        
        /**
          * Decodes an Item message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Item
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.Item.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Reader): Item = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.Item.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Uint8Array): Item = js.native
        
        /**
          * Encodes the specified Item message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.Item.verify|verify} messages.
          * @param message Item message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.Item.encode")
        @js.native
        def encode(message: IItem): Writer = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.Item.encode")
        @js.native
        def encode(message: IItem, writer: Writer): Writer = js.native
        
        /**
          * Encodes the specified Item message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.Item.verify|verify} messages.
          * @param message Item message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.Item.encodeDelimited")
        @js.native
        def encodeDelimited(message: IItem): Writer = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.Item.encodeDelimited")
        @js.native
        def encodeDelimited(message: IItem, writer: Writer): Writer = js.native
        
        /**
          * Creates an Item message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Item
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.Item.fromObject")
        @js.native
        def fromObject(`object`: StringDictionary[js.Any]): Item = js.native
        
        /**
          * Creates a plain object from an Item message. Also converts values to other types if specified.
          * @param message Item
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.Item.toObject")
        @js.native
        def toObject(message: Item): StringDictionary[js.Any] = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.Item.toObject")
        @js.native
        def toObject(message: Item, options: IConversionOptions): StringDictionary[js.Any] = js.native
        
        /**
          * Verifies an Item message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.Item.verify")
        @js.native
        def verify(message: StringDictionary[js.Any]): String | Null = js.native
      }
      
      /**
        * Creates a new CarouselSelect instance using the specified properties.
        * @param [properties] Properties to set
        * @returns CarouselSelect instance
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.create")
      @js.native
      def create(): CarouselSelect = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.create")
      @js.native
      def create(properties: ICarouselSelect): CarouselSelect = js.native
      
      /**
        * Decodes a CarouselSelect message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns CarouselSelect
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.decode")
      @js.native
      def decode(reader: Reader): CarouselSelect = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.decode")
      @js.native
      def decode(reader: Reader, length: Double): CarouselSelect = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.decode")
      @js.native
      def decode(reader: Uint8Array): CarouselSelect = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): CarouselSelect = js.native
      
      /**
        * Decodes a CarouselSelect message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns CarouselSelect
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): CarouselSelect = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): CarouselSelect = js.native
      
      /**
        * Encodes the specified CarouselSelect message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.verify|verify} messages.
        * @param message CarouselSelect message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.encode")
      @js.native
      def encode(message: ICarouselSelect): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.encode")
      @js.native
      def encode(message: ICarouselSelect, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified CarouselSelect message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.verify|verify} messages.
        * @param message CarouselSelect message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.encodeDelimited")
      @js.native
      def encodeDelimited(message: ICarouselSelect): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.encodeDelimited")
      @js.native
      def encodeDelimited(message: ICarouselSelect, writer: Writer): Writer = js.native
      
      /**
        * Creates a CarouselSelect message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns CarouselSelect
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): CarouselSelect = js.native
      
      /**
        * Creates a plain object from a CarouselSelect message. Also converts values to other types if specified.
        * @param message CarouselSelect
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.toObject")
      @js.native
      def toObject(message: CarouselSelect): StringDictionary[js.Any] = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.toObject")
      @js.native
      def toObject(message: CarouselSelect, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a CarouselSelect message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
      
      /** Properties of an Item. */
      @js.native
      trait IItem extends StObject {
        
        /** Item description */
        var description: js.UndefOr[String | Null] = js.native
        
        /** Item image */
        var image: js.UndefOr[IImage | Null] = js.native
        
        /** Item info */
        var info: js.UndefOr[ISelectItemInfo | Null] = js.native
        
        /** Item title */
        var title: js.UndefOr[String | Null] = js.native
      }
      object IItem {
        
        @scala.inline
        def apply(): IItem = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IItem]
        }
        
        @scala.inline
        implicit class IItemMutableBuilder[Self <: IItem] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDescriptionNull: Self = StObject.set(x, "description", null)
          
          @scala.inline
          def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
          
          @scala.inline
          def setImage(value: IImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setImageNull: Self = StObject.set(x, "image", null)
          
          @scala.inline
          def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
          
          @scala.inline
          def setInfo(value: ISelectItemInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInfoNull: Self = StObject.set(x, "info", null)
          
          @scala.inline
          def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
          
          @scala.inline
          def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTitleNull: Self = StObject.set(x, "title", null)
          
          @scala.inline
          def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        }
      }
    }
    
    /** Represents a ColumnProperties. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ColumnProperties")
    @js.native
    /**
      * Constructs a new ColumnProperties.
      * @param [properties] Properties to set
      */
    class ColumnProperties () extends IColumnProperties {
      def this(properties: IColumnProperties) = this()
      
      /** ColumnProperties header. */
      @JSName("header")
      var header_ColumnProperties: String = js.native
      
      /** ColumnProperties horizontalAlignment. */
      @JSName("horizontalAlignment")
      var horizontalAlignment_ColumnProperties: HorizontalAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.HorizontalAlignment * / any */ String) = js.native
      
      /**
        * Converts this ColumnProperties to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object ColumnProperties {
      
      @js.native
      sealed trait HorizontalAlignment extends StObject
      /** HorizontalAlignment enum. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.HorizontalAlignment")
      @js.native
      object HorizontalAlignment extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[HorizontalAlignment with Double] = js.native
        
        @js.native
        sealed trait CENTER extends HorizontalAlignment
        /* 2 */ val CENTER: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.HorizontalAlignment.CENTER with Double = js.native
        
        @js.native
        sealed trait HORIZONTAL_ALIGNMENT_UNSPECIFIED extends HorizontalAlignment
        /* 0 */ val HORIZONTAL_ALIGNMENT_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.HorizontalAlignment.HORIZONTAL_ALIGNMENT_UNSPECIFIED with Double = js.native
        
        @js.native
        sealed trait LEADING extends HorizontalAlignment
        /* 1 */ val LEADING: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.HorizontalAlignment.LEADING with Double = js.native
        
        @js.native
        sealed trait TRAILING extends HorizontalAlignment
        /* 3 */ val TRAILING: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.HorizontalAlignment.TRAILING with Double = js.native
      }
      
      /**
        * Creates a new ColumnProperties instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ColumnProperties instance
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.create")
      @js.native
      def create(): ColumnProperties = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.create")
      @js.native
      def create(properties: IColumnProperties): ColumnProperties = js.native
      
      /**
        * Decodes a ColumnProperties message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ColumnProperties
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.decode")
      @js.native
      def decode(reader: Reader): ColumnProperties = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.decode")
      @js.native
      def decode(reader: Reader, length: Double): ColumnProperties = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.decode")
      @js.native
      def decode(reader: Uint8Array): ColumnProperties = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): ColumnProperties = js.native
      
      /**
        * Decodes a ColumnProperties message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ColumnProperties
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): ColumnProperties = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): ColumnProperties = js.native
      
      /**
        * Encodes the specified ColumnProperties message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.verify|verify} messages.
        * @param message ColumnProperties message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.encode")
      @js.native
      def encode(message: IColumnProperties): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.encode")
      @js.native
      def encode(message: IColumnProperties, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified ColumnProperties message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.verify|verify} messages.
        * @param message ColumnProperties message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.encodeDelimited")
      @js.native
      def encodeDelimited(message: IColumnProperties): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.encodeDelimited")
      @js.native
      def encodeDelimited(message: IColumnProperties, writer: Writer): Writer = js.native
      
      /**
        * Creates a ColumnProperties message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ColumnProperties
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): ColumnProperties = js.native
      
      /**
        * Creates a plain object from a ColumnProperties message. Also converts values to other types if specified.
        * @param message ColumnProperties
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.toObject")
      @js.native
      def toObject(message: ColumnProperties): StringDictionary[js.Any] = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.toObject")
      @js.native
      def toObject(message: ColumnProperties, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a ColumnProperties message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents an Image. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Image")
    @js.native
    /**
      * Constructs a new Image.
      * @param [properties] Properties to set
      */
    class Image () extends IImage {
      def this(properties: IImage) = this()
      
      /** Image accessibilityText. */
      @JSName("accessibilityText")
      var accessibilityText_Image: String = js.native
      
      /** Image imageUri. */
      @JSName("imageUri")
      var imageUri_Image: String = js.native
      
      /**
        * Converts this Image to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object Image {
      
      /**
        * Creates a new Image instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Image instance
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Image.create")
      @js.native
      def create(): Image = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Image.create")
      @js.native
      def create(properties: IImage): Image = js.native
      
      /**
        * Decodes an Image message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Image
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Image.decode")
      @js.native
      def decode(reader: Reader): Image = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Image.decode")
      @js.native
      def decode(reader: Reader, length: Double): Image = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Image.decode")
      @js.native
      def decode(reader: Uint8Array): Image = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Image.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): Image = js.native
      
      /**
        * Decodes an Image message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Image
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Image.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): Image = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Image.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): Image = js.native
      
      /**
        * Encodes the specified Image message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Image.verify|verify} messages.
        * @param message Image message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Image.encode")
      @js.native
      def encode(message: IImage): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Image.encode")
      @js.native
      def encode(message: IImage, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified Image message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Image.verify|verify} messages.
        * @param message Image message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Image.encodeDelimited")
      @js.native
      def encodeDelimited(message: IImage): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Image.encodeDelimited")
      @js.native
      def encodeDelimited(message: IImage, writer: Writer): Writer = js.native
      
      /**
        * Creates an Image message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Image
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Image.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): Image = js.native
      
      /**
        * Creates a plain object from an Image message. Also converts values to other types if specified.
        * @param message Image
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Image.toObject")
      @js.native
      def toObject(message: Image): StringDictionary[js.Any] = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Image.toObject")
      @js.native
      def toObject(message: Image, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies an Image message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Image.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a LinkOutSuggestion. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.LinkOutSuggestion")
    @js.native
    /**
      * Constructs a new LinkOutSuggestion.
      * @param [properties] Properties to set
      */
    class LinkOutSuggestion () extends ILinkOutSuggestion {
      def this(properties: ILinkOutSuggestion) = this()
      
      /** LinkOutSuggestion destinationName. */
      @JSName("destinationName")
      var destinationName_LinkOutSuggestion: String = js.native
      
      /**
        * Converts this LinkOutSuggestion to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
      
      /** LinkOutSuggestion uri. */
      @JSName("uri")
      var uri_LinkOutSuggestion: String = js.native
    }
    object LinkOutSuggestion {
      
      /**
        * Creates a new LinkOutSuggestion instance using the specified properties.
        * @param [properties] Properties to set
        * @returns LinkOutSuggestion instance
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.LinkOutSuggestion.create")
      @js.native
      def create(): LinkOutSuggestion = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.LinkOutSuggestion.create")
      @js.native
      def create(properties: ILinkOutSuggestion): LinkOutSuggestion = js.native
      
      /**
        * Decodes a LinkOutSuggestion message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns LinkOutSuggestion
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.LinkOutSuggestion.decode")
      @js.native
      def decode(reader: Reader): LinkOutSuggestion = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.LinkOutSuggestion.decode")
      @js.native
      def decode(reader: Reader, length: Double): LinkOutSuggestion = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.LinkOutSuggestion.decode")
      @js.native
      def decode(reader: Uint8Array): LinkOutSuggestion = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.LinkOutSuggestion.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): LinkOutSuggestion = js.native
      
      /**
        * Decodes a LinkOutSuggestion message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns LinkOutSuggestion
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.LinkOutSuggestion.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): LinkOutSuggestion = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.LinkOutSuggestion.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): LinkOutSuggestion = js.native
      
      /**
        * Encodes the specified LinkOutSuggestion message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.LinkOutSuggestion.verify|verify} messages.
        * @param message LinkOutSuggestion message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.LinkOutSuggestion.encode")
      @js.native
      def encode(message: ILinkOutSuggestion): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.LinkOutSuggestion.encode")
      @js.native
      def encode(message: ILinkOutSuggestion, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified LinkOutSuggestion message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.LinkOutSuggestion.verify|verify} messages.
        * @param message LinkOutSuggestion message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.LinkOutSuggestion.encodeDelimited")
      @js.native
      def encodeDelimited(message: ILinkOutSuggestion): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.LinkOutSuggestion.encodeDelimited")
      @js.native
      def encodeDelimited(message: ILinkOutSuggestion, writer: Writer): Writer = js.native
      
      /**
        * Creates a LinkOutSuggestion message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns LinkOutSuggestion
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.LinkOutSuggestion.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): LinkOutSuggestion = js.native
      
      /**
        * Creates a plain object from a LinkOutSuggestion message. Also converts values to other types if specified.
        * @param message LinkOutSuggestion
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.LinkOutSuggestion.toObject")
      @js.native
      def toObject(message: LinkOutSuggestion): StringDictionary[js.Any] = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.LinkOutSuggestion.toObject")
      @js.native
      def toObject(message: LinkOutSuggestion, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a LinkOutSuggestion message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.LinkOutSuggestion.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a ListSelect. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect")
    @js.native
    /**
      * Constructs a new ListSelect.
      * @param [properties] Properties to set
      */
    class ListSelect () extends IListSelect {
      def this(properties: IListSelect) = this()
      
      /** ListSelect items. */
      @JSName("items")
      var items_ListSelect: js.Array[
            typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem
          ] = js.native
      
      /** ListSelect subtitle. */
      @JSName("subtitle")
      var subtitle_ListSelect: String = js.native
      
      /** ListSelect title. */
      @JSName("title")
      var title_ListSelect: String = js.native
      
      /**
        * Converts this ListSelect to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object ListSelect {
      
      /** Represents an Item. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.Item")
      @js.native
      /**
        * Constructs a new Item.
        * @param [properties] Properties to set
        */
      class Item ()
        extends typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem {
        def this(properties: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem) = this()
        
        /** Item description. */
        @JSName("description")
        var description_Item: String = js.native
        
        /** Item title. */
        @JSName("title")
        var title_Item: String = js.native
        
        /**
          * Converts this Item to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[js.Any] = js.native
      }
      object Item {
        
        /**
          * Creates a new Item instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Item instance
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.Item.create")
        @js.native
        def create(): Item = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.Item.create")
        @js.native
        def create(properties: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem): Item = js.native
        
        /**
          * Decodes an Item message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Item
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.Item.decode")
        @js.native
        def decode(reader: Reader): Item = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.Item.decode")
        @js.native
        def decode(reader: Reader, length: Double): Item = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.Item.decode")
        @js.native
        def decode(reader: Uint8Array): Item = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.Item.decode")
        @js.native
        def decode(reader: Uint8Array, length: Double): Item = js.native
        
        /**
          * Decodes an Item message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Item
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.Item.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Reader): Item = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.Item.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Uint8Array): Item = js.native
        
        /**
          * Encodes the specified Item message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.ListSelect.Item.verify|verify} messages.
          * @param message Item message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.Item.encode")
        @js.native
        def encode(message: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem): Writer = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.Item.encode")
        @js.native
        def encode(
          message: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem,
          writer: Writer
        ): Writer = js.native
        
        /**
          * Encodes the specified Item message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.ListSelect.Item.verify|verify} messages.
          * @param message Item message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.Item.encodeDelimited")
        @js.native
        def encodeDelimited(message: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem): Writer = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.Item.encodeDelimited")
        @js.native
        def encodeDelimited(
          message: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem,
          writer: Writer
        ): Writer = js.native
        
        /**
          * Creates an Item message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Item
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.Item.fromObject")
        @js.native
        def fromObject(`object`: StringDictionary[js.Any]): Item = js.native
        
        /**
          * Creates a plain object from an Item message. Also converts values to other types if specified.
          * @param message Item
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.Item.toObject")
        @js.native
        def toObject(message: Item): StringDictionary[js.Any] = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.Item.toObject")
        @js.native
        def toObject(message: Item, options: IConversionOptions): StringDictionary[js.Any] = js.native
        
        /**
          * Verifies an Item message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.Item.verify")
        @js.native
        def verify(message: StringDictionary[js.Any]): String | Null = js.native
      }
      
      /**
        * Creates a new ListSelect instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ListSelect instance
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.create")
      @js.native
      def create(): ListSelect = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.create")
      @js.native
      def create(properties: IListSelect): ListSelect = js.native
      
      /**
        * Decodes a ListSelect message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ListSelect
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.decode")
      @js.native
      def decode(reader: Reader): ListSelect = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.decode")
      @js.native
      def decode(reader: Reader, length: Double): ListSelect = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.decode")
      @js.native
      def decode(reader: Uint8Array): ListSelect = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): ListSelect = js.native
      
      /**
        * Decodes a ListSelect message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ListSelect
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): ListSelect = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): ListSelect = js.native
      
      /**
        * Encodes the specified ListSelect message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.ListSelect.verify|verify} messages.
        * @param message ListSelect message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.encode")
      @js.native
      def encode(message: IListSelect): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.encode")
      @js.native
      def encode(message: IListSelect, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified ListSelect message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.ListSelect.verify|verify} messages.
        * @param message ListSelect message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.encodeDelimited")
      @js.native
      def encodeDelimited(message: IListSelect): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.encodeDelimited")
      @js.native
      def encodeDelimited(message: IListSelect, writer: Writer): Writer = js.native
      
      /**
        * Creates a ListSelect message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ListSelect
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): ListSelect = js.native
      
      /**
        * Creates a plain object from a ListSelect message. Also converts values to other types if specified.
        * @param message ListSelect
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.toObject")
      @js.native
      def toObject(message: ListSelect): StringDictionary[js.Any] = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.toObject")
      @js.native
      def toObject(message: ListSelect, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a ListSelect message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
      
      /** Properties of an Item. */
      @js.native
      trait IItem extends StObject {
        
        /** Item description */
        var description: js.UndefOr[String | Null] = js.native
        
        /** Item image */
        var image: js.UndefOr[IImage | Null] = js.native
        
        /** Item info */
        var info: js.UndefOr[ISelectItemInfo | Null] = js.native
        
        /** Item title */
        var title: js.UndefOr[String | Null] = js.native
      }
      object IItem {
        
        @scala.inline
        def apply(): typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem]
        }
        
        @scala.inline
        implicit class IItemMutableBuilder[Self <: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDescriptionNull: Self = StObject.set(x, "description", null)
          
          @scala.inline
          def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
          
          @scala.inline
          def setImage(value: IImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setImageNull: Self = StObject.set(x, "image", null)
          
          @scala.inline
          def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
          
          @scala.inline
          def setInfo(value: ISelectItemInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInfoNull: Self = StObject.set(x, "info", null)
          
          @scala.inline
          def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
          
          @scala.inline
          def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTitleNull: Self = StObject.set(x, "title", null)
          
          @scala.inline
          def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        }
      }
    }
    
    /** Represents a MediaContent. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent")
    @js.native
    /**
      * Constructs a new MediaContent.
      * @param [properties] Properties to set
      */
    class MediaContent () extends IMediaContent {
      def this(properties: IMediaContent) = this()
      
      /** MediaContent mediaObjects. */
      @JSName("mediaObjects")
      var mediaObjects_MediaContent: js.Array[IResponseMediaObject] = js.native
      
      /** MediaContent mediaType. */
      @JSName("mediaType")
      var mediaType_MediaContent: ResponseMediaType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaType * / any */ String) = js.native
      
      /**
        * Converts this MediaContent to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object MediaContent {
      
      /** Represents a ResponseMediaObject. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaObject")
      @js.native
      /**
        * Constructs a new ResponseMediaObject.
        * @param [properties] Properties to set
        */
      class ResponseMediaObject () extends IResponseMediaObject {
        def this(properties: IResponseMediaObject) = this()
        
        /** ResponseMediaObject contentUrl. */
        @JSName("contentUrl")
        var contentUrl_ResponseMediaObject: String = js.native
        
        /** ResponseMediaObject description. */
        @JSName("description")
        var description_ResponseMediaObject: String = js.native
        
        /** ResponseMediaObject image. */
        var image: js.UndefOr[largeImage | icon] = js.native
        
        /** ResponseMediaObject name. */
        @JSName("name")
        var name_ResponseMediaObject: String = js.native
        
        /**
          * Converts this ResponseMediaObject to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[js.Any] = js.native
      }
      object ResponseMediaObject {
        
        /**
          * Creates a new ResponseMediaObject instance using the specified properties.
          * @param [properties] Properties to set
          * @returns ResponseMediaObject instance
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaObject.create")
        @js.native
        def create(): ResponseMediaObject = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaObject.create")
        @js.native
        def create(properties: IResponseMediaObject): ResponseMediaObject = js.native
        
        /**
          * Decodes a ResponseMediaObject message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns ResponseMediaObject
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaObject.decode")
        @js.native
        def decode(reader: Reader): ResponseMediaObject = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaObject.decode")
        @js.native
        def decode(reader: Reader, length: Double): ResponseMediaObject = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaObject.decode")
        @js.native
        def decode(reader: Uint8Array): ResponseMediaObject = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaObject.decode")
        @js.native
        def decode(reader: Uint8Array, length: Double): ResponseMediaObject = js.native
        
        /**
          * Decodes a ResponseMediaObject message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns ResponseMediaObject
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaObject.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Reader): ResponseMediaObject = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaObject.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Uint8Array): ResponseMediaObject = js.native
        
        /**
          * Encodes the specified ResponseMediaObject message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaObject.verify|verify} messages.
          * @param message ResponseMediaObject message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaObject.encode")
        @js.native
        def encode(message: IResponseMediaObject): Writer = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaObject.encode")
        @js.native
        def encode(message: IResponseMediaObject, writer: Writer): Writer = js.native
        
        /**
          * Encodes the specified ResponseMediaObject message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaObject.verify|verify} messages.
          * @param message ResponseMediaObject message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaObject.encodeDelimited")
        @js.native
        def encodeDelimited(message: IResponseMediaObject): Writer = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaObject.encodeDelimited")
        @js.native
        def encodeDelimited(message: IResponseMediaObject, writer: Writer): Writer = js.native
        
        /**
          * Creates a ResponseMediaObject message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns ResponseMediaObject
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaObject.fromObject")
        @js.native
        def fromObject(`object`: StringDictionary[js.Any]): ResponseMediaObject = js.native
        
        /**
          * Creates a plain object from a ResponseMediaObject message. Also converts values to other types if specified.
          * @param message ResponseMediaObject
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaObject.toObject")
        @js.native
        def toObject(message: ResponseMediaObject): StringDictionary[js.Any] = js.native
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaObject.toObject")
        @js.native
        def toObject(message: ResponseMediaObject, options: IConversionOptions): StringDictionary[js.Any] = js.native
        
        /**
          * Verifies a ResponseMediaObject message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaObject.verify")
        @js.native
        def verify(message: StringDictionary[js.Any]): String | Null = js.native
      }
      
      @js.native
      sealed trait ResponseMediaType extends StObject
      /** ResponseMediaType enum. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaType")
      @js.native
      object ResponseMediaType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[ResponseMediaType with Double] = js.native
        
        @js.native
        sealed trait AUDIO extends ResponseMediaType
        /* 1 */ val AUDIO: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaType.AUDIO with Double = js.native
        
        @js.native
        sealed trait RESPONSE_MEDIA_TYPE_UNSPECIFIED extends ResponseMediaType
        /* 0 */ val RESPONSE_MEDIA_TYPE_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaType.RESPONSE_MEDIA_TYPE_UNSPECIFIED with Double = js.native
      }
      
      /**
        * Creates a new MediaContent instance using the specified properties.
        * @param [properties] Properties to set
        * @returns MediaContent instance
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.create")
      @js.native
      def create(): MediaContent = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.create")
      @js.native
      def create(properties: IMediaContent): MediaContent = js.native
      
      /**
        * Decodes a MediaContent message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns MediaContent
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.decode")
      @js.native
      def decode(reader: Reader): MediaContent = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.decode")
      @js.native
      def decode(reader: Reader, length: Double): MediaContent = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.decode")
      @js.native
      def decode(reader: Uint8Array): MediaContent = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): MediaContent = js.native
      
      /**
        * Decodes a MediaContent message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns MediaContent
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): MediaContent = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): MediaContent = js.native
      
      /**
        * Encodes the specified MediaContent message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.MediaContent.verify|verify} messages.
        * @param message MediaContent message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.encode")
      @js.native
      def encode(message: IMediaContent): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.encode")
      @js.native
      def encode(message: IMediaContent, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified MediaContent message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.MediaContent.verify|verify} messages.
        * @param message MediaContent message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.encodeDelimited")
      @js.native
      def encodeDelimited(message: IMediaContent): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.encodeDelimited")
      @js.native
      def encodeDelimited(message: IMediaContent, writer: Writer): Writer = js.native
      
      /**
        * Creates a MediaContent message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns MediaContent
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): MediaContent = js.native
      
      /**
        * Creates a plain object from a MediaContent message. Also converts values to other types if specified.
        * @param message MediaContent
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.toObject")
      @js.native
      def toObject(message: MediaContent): StringDictionary[js.Any] = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.toObject")
      @js.native
      def toObject(message: MediaContent, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a MediaContent message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
      
      /** Properties of a ResponseMediaObject. */
      @js.native
      trait IResponseMediaObject extends StObject {
        
        /** ResponseMediaObject contentUrl */
        var contentUrl: js.UndefOr[String | Null] = js.native
        
        /** ResponseMediaObject description */
        var description: js.UndefOr[String | Null] = js.native
        
        /** ResponseMediaObject icon */
        var icon: js.UndefOr[IImage | Null] = js.native
        
        /** ResponseMediaObject largeImage */
        var largeImage: js.UndefOr[IImage | Null] = js.native
        
        /** ResponseMediaObject name */
        var name: js.UndefOr[String | Null] = js.native
      }
      object IResponseMediaObject {
        
        @scala.inline
        def apply(): IResponseMediaObject = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IResponseMediaObject]
        }
        
        @scala.inline
        implicit class IResponseMediaObjectMutableBuilder[Self <: IResponseMediaObject] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setContentUrlNull: Self = StObject.set(x, "contentUrl", null)
          
          @scala.inline
          def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
          
          @scala.inline
          def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDescriptionNull: Self = StObject.set(x, "description", null)
          
          @scala.inline
          def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
          
          @scala.inline
          def setIcon(value: IImage): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIconNull: Self = StObject.set(x, "icon", null)
          
          @scala.inline
          def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
          
          @scala.inline
          def setLargeImage(value: IImage): Self = StObject.set(x, "largeImage", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLargeImageNull: Self = StObject.set(x, "largeImage", null)
          
          @scala.inline
          def setLargeImageUndefined: Self = StObject.set(x, "largeImage", js.undefined)
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNameNull: Self = StObject.set(x, "name", null)
          
          @scala.inline
          def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        }
      }
    }
    
    @js.native
    sealed trait Platform extends StObject
    /** Platform enum. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Platform")
    @js.native
    object Platform extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Platform with Double] = js.native
      
      @js.native
      sealed trait ACTIONS_ON_GOOGLE extends Platform
      /* 8 */ val ACTIONS_ON_GOOGLE: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Platform.ACTIONS_ON_GOOGLE with Double = js.native
      
      @js.native
      sealed trait FACEBOOK extends Platform
      /* 1 */ val FACEBOOK: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Platform.FACEBOOK with Double = js.native
      
      @js.native
      sealed trait GOOGLE_HANGOUTS extends Platform
      /* 11 */ val GOOGLE_HANGOUTS: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Platform.GOOGLE_HANGOUTS with Double = js.native
      
      @js.native
      sealed trait KIK extends Platform
      /* 4 */ val KIK: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Platform.KIK with Double = js.native
      
      @js.native
      sealed trait LINE extends Platform
      /* 6 */ val LINE: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Platform.LINE with Double = js.native
      
      @js.native
      sealed trait PLATFORM_UNSPECIFIED extends Platform
      /* 0 */ val PLATFORM_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Platform.PLATFORM_UNSPECIFIED with Double = js.native
      
      @js.native
      sealed trait SKYPE extends Platform
      /* 5 */ val SKYPE: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Platform.SKYPE with Double = js.native
      
      @js.native
      sealed trait SLACK extends Platform
      /* 2 */ val SLACK: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Platform.SLACK with Double = js.native
      
      @js.native
      sealed trait TELEGRAM extends Platform
      /* 3 */ val TELEGRAM: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Platform.TELEGRAM with Double = js.native
      
      @js.native
      sealed trait VIBER extends Platform
      /* 7 */ val VIBER: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Platform.VIBER with Double = js.native
    }
    
    /** Represents a QuickReplies. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.QuickReplies")
    @js.native
    /**
      * Constructs a new QuickReplies.
      * @param [properties] Properties to set
      */
    class QuickReplies () extends IQuickReplies {
      def this(properties: IQuickReplies) = this()
      
      /** QuickReplies quickReplies. */
      @JSName("quickReplies")
      var quickReplies_QuickReplies: js.Array[String] = js.native
      
      /** QuickReplies title. */
      @JSName("title")
      var title_QuickReplies: String = js.native
      
      /**
        * Converts this QuickReplies to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object QuickReplies {
      
      /**
        * Creates a new QuickReplies instance using the specified properties.
        * @param [properties] Properties to set
        * @returns QuickReplies instance
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.QuickReplies.create")
      @js.native
      def create(): QuickReplies = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.QuickReplies.create")
      @js.native
      def create(properties: IQuickReplies): QuickReplies = js.native
      
      /**
        * Decodes a QuickReplies message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns QuickReplies
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.QuickReplies.decode")
      @js.native
      def decode(reader: Reader): QuickReplies = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.QuickReplies.decode")
      @js.native
      def decode(reader: Reader, length: Double): QuickReplies = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.QuickReplies.decode")
      @js.native
      def decode(reader: Uint8Array): QuickReplies = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.QuickReplies.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): QuickReplies = js.native
      
      /**
        * Decodes a QuickReplies message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns QuickReplies
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.QuickReplies.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): QuickReplies = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.QuickReplies.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): QuickReplies = js.native
      
      /**
        * Encodes the specified QuickReplies message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.QuickReplies.verify|verify} messages.
        * @param message QuickReplies message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.QuickReplies.encode")
      @js.native
      def encode(message: IQuickReplies): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.QuickReplies.encode")
      @js.native
      def encode(message: IQuickReplies, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified QuickReplies message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.QuickReplies.verify|verify} messages.
        * @param message QuickReplies message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.QuickReplies.encodeDelimited")
      @js.native
      def encodeDelimited(message: IQuickReplies): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.QuickReplies.encodeDelimited")
      @js.native
      def encodeDelimited(message: IQuickReplies, writer: Writer): Writer = js.native
      
      /**
        * Creates a QuickReplies message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns QuickReplies
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.QuickReplies.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): QuickReplies = js.native
      
      /**
        * Creates a plain object from a QuickReplies message. Also converts values to other types if specified.
        * @param message QuickReplies
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.QuickReplies.toObject")
      @js.native
      def toObject(message: QuickReplies): StringDictionary[js.Any] = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.QuickReplies.toObject")
      @js.native
      def toObject(message: QuickReplies, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a QuickReplies message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.QuickReplies.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a SelectItemInfo. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SelectItemInfo")
    @js.native
    /**
      * Constructs a new SelectItemInfo.
      * @param [properties] Properties to set
      */
    class SelectItemInfo () extends ISelectItemInfo {
      def this(properties: ISelectItemInfo) = this()
      
      /** SelectItemInfo key. */
      @JSName("key")
      var key_SelectItemInfo: String = js.native
      
      /** SelectItemInfo synonyms. */
      @JSName("synonyms")
      var synonyms_SelectItemInfo: js.Array[String] = js.native
      
      /**
        * Converts this SelectItemInfo to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object SelectItemInfo {
      
      /**
        * Creates a new SelectItemInfo instance using the specified properties.
        * @param [properties] Properties to set
        * @returns SelectItemInfo instance
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SelectItemInfo.create")
      @js.native
      def create(): SelectItemInfo = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SelectItemInfo.create")
      @js.native
      def create(properties: ISelectItemInfo): SelectItemInfo = js.native
      
      /**
        * Decodes a SelectItemInfo message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns SelectItemInfo
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SelectItemInfo.decode")
      @js.native
      def decode(reader: Reader): SelectItemInfo = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SelectItemInfo.decode")
      @js.native
      def decode(reader: Reader, length: Double): SelectItemInfo = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SelectItemInfo.decode")
      @js.native
      def decode(reader: Uint8Array): SelectItemInfo = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SelectItemInfo.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): SelectItemInfo = js.native
      
      /**
        * Decodes a SelectItemInfo message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns SelectItemInfo
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SelectItemInfo.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): SelectItemInfo = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SelectItemInfo.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): SelectItemInfo = js.native
      
      /**
        * Encodes the specified SelectItemInfo message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.SelectItemInfo.verify|verify} messages.
        * @param message SelectItemInfo message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SelectItemInfo.encode")
      @js.native
      def encode(message: ISelectItemInfo): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SelectItemInfo.encode")
      @js.native
      def encode(message: ISelectItemInfo, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified SelectItemInfo message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.SelectItemInfo.verify|verify} messages.
        * @param message SelectItemInfo message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SelectItemInfo.encodeDelimited")
      @js.native
      def encodeDelimited(message: ISelectItemInfo): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SelectItemInfo.encodeDelimited")
      @js.native
      def encodeDelimited(message: ISelectItemInfo, writer: Writer): Writer = js.native
      
      /**
        * Creates a SelectItemInfo message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns SelectItemInfo
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SelectItemInfo.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): SelectItemInfo = js.native
      
      /**
        * Creates a plain object from a SelectItemInfo message. Also converts values to other types if specified.
        * @param message SelectItemInfo
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SelectItemInfo.toObject")
      @js.native
      def toObject(message: SelectItemInfo): StringDictionary[js.Any] = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SelectItemInfo.toObject")
      @js.native
      def toObject(message: SelectItemInfo, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a SelectItemInfo message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SelectItemInfo.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a SimpleResponse. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponse")
    @js.native
    /**
      * Constructs a new SimpleResponse.
      * @param [properties] Properties to set
      */
    class SimpleResponse () extends ISimpleResponse {
      def this(properties: ISimpleResponse) = this()
      
      /** SimpleResponse displayText. */
      @JSName("displayText")
      var displayText_SimpleResponse: String = js.native
      
      /** SimpleResponse ssml. */
      @JSName("ssml")
      var ssml_SimpleResponse: String = js.native
      
      /** SimpleResponse textToSpeech. */
      @JSName("textToSpeech")
      var textToSpeech_SimpleResponse: String = js.native
      
      /**
        * Converts this SimpleResponse to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object SimpleResponse {
      
      /**
        * Creates a new SimpleResponse instance using the specified properties.
        * @param [properties] Properties to set
        * @returns SimpleResponse instance
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponse.create")
      @js.native
      def create(): SimpleResponse = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponse.create")
      @js.native
      def create(properties: ISimpleResponse): SimpleResponse = js.native
      
      /**
        * Decodes a SimpleResponse message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns SimpleResponse
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponse.decode")
      @js.native
      def decode(reader: Reader): SimpleResponse = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponse.decode")
      @js.native
      def decode(reader: Reader, length: Double): SimpleResponse = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponse.decode")
      @js.native
      def decode(reader: Uint8Array): SimpleResponse = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponse.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): SimpleResponse = js.native
      
      /**
        * Decodes a SimpleResponse message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns SimpleResponse
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponse.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): SimpleResponse = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponse.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): SimpleResponse = js.native
      
      /**
        * Encodes the specified SimpleResponse message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.SimpleResponse.verify|verify} messages.
        * @param message SimpleResponse message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponse.encode")
      @js.native
      def encode(message: ISimpleResponse): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponse.encode")
      @js.native
      def encode(message: ISimpleResponse, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified SimpleResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.SimpleResponse.verify|verify} messages.
        * @param message SimpleResponse message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponse.encodeDelimited")
      @js.native
      def encodeDelimited(message: ISimpleResponse): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponse.encodeDelimited")
      @js.native
      def encodeDelimited(message: ISimpleResponse, writer: Writer): Writer = js.native
      
      /**
        * Creates a SimpleResponse message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns SimpleResponse
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponse.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): SimpleResponse = js.native
      
      /**
        * Creates a plain object from a SimpleResponse message. Also converts values to other types if specified.
        * @param message SimpleResponse
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponse.toObject")
      @js.native
      def toObject(message: SimpleResponse): StringDictionary[js.Any] = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponse.toObject")
      @js.native
      def toObject(message: SimpleResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a SimpleResponse message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponse.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a SimpleResponses. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponses")
    @js.native
    /**
      * Constructs a new SimpleResponses.
      * @param [properties] Properties to set
      */
    class SimpleResponses () extends ISimpleResponses {
      def this(properties: ISimpleResponses) = this()
      
      /** SimpleResponses simpleResponses. */
      @JSName("simpleResponses")
      var simpleResponses_SimpleResponses: js.Array[ISimpleResponse] = js.native
      
      /**
        * Converts this SimpleResponses to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object SimpleResponses {
      
      /**
        * Creates a new SimpleResponses instance using the specified properties.
        * @param [properties] Properties to set
        * @returns SimpleResponses instance
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponses.create")
      @js.native
      def create(): SimpleResponses = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponses.create")
      @js.native
      def create(properties: ISimpleResponses): SimpleResponses = js.native
      
      /**
        * Decodes a SimpleResponses message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns SimpleResponses
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponses.decode")
      @js.native
      def decode(reader: Reader): SimpleResponses = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponses.decode")
      @js.native
      def decode(reader: Reader, length: Double): SimpleResponses = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponses.decode")
      @js.native
      def decode(reader: Uint8Array): SimpleResponses = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponses.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): SimpleResponses = js.native
      
      /**
        * Decodes a SimpleResponses message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns SimpleResponses
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponses.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): SimpleResponses = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponses.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): SimpleResponses = js.native
      
      /**
        * Encodes the specified SimpleResponses message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.SimpleResponses.verify|verify} messages.
        * @param message SimpleResponses message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponses.encode")
      @js.native
      def encode(message: ISimpleResponses): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponses.encode")
      @js.native
      def encode(message: ISimpleResponses, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified SimpleResponses message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.SimpleResponses.verify|verify} messages.
        * @param message SimpleResponses message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponses.encodeDelimited")
      @js.native
      def encodeDelimited(message: ISimpleResponses): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponses.encodeDelimited")
      @js.native
      def encodeDelimited(message: ISimpleResponses, writer: Writer): Writer = js.native
      
      /**
        * Creates a SimpleResponses message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns SimpleResponses
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponses.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): SimpleResponses = js.native
      
      /**
        * Creates a plain object from a SimpleResponses message. Also converts values to other types if specified.
        * @param message SimpleResponses
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponses.toObject")
      @js.native
      def toObject(message: SimpleResponses): StringDictionary[js.Any] = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponses.toObject")
      @js.native
      def toObject(message: SimpleResponses, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a SimpleResponses message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponses.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a Suggestion. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestion")
    @js.native
    /**
      * Constructs a new Suggestion.
      * @param [properties] Properties to set
      */
    class Suggestion () extends ISuggestion {
      def this(properties: ISuggestion) = this()
      
      /** Suggestion title. */
      @JSName("title")
      var title_Suggestion: String = js.native
      
      /**
        * Converts this Suggestion to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object Suggestion {
      
      /**
        * Creates a new Suggestion instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Suggestion instance
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestion.create")
      @js.native
      def create(): Suggestion = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestion.create")
      @js.native
      def create(properties: ISuggestion): Suggestion = js.native
      
      /**
        * Decodes a Suggestion message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Suggestion
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestion.decode")
      @js.native
      def decode(reader: Reader): Suggestion = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestion.decode")
      @js.native
      def decode(reader: Reader, length: Double): Suggestion = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestion.decode")
      @js.native
      def decode(reader: Uint8Array): Suggestion = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestion.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): Suggestion = js.native
      
      /**
        * Decodes a Suggestion message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Suggestion
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestion.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): Suggestion = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestion.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): Suggestion = js.native
      
      /**
        * Encodes the specified Suggestion message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Suggestion.verify|verify} messages.
        * @param message Suggestion message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestion.encode")
      @js.native
      def encode(message: ISuggestion): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestion.encode")
      @js.native
      def encode(message: ISuggestion, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified Suggestion message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Suggestion.verify|verify} messages.
        * @param message Suggestion message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestion.encodeDelimited")
      @js.native
      def encodeDelimited(message: ISuggestion): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestion.encodeDelimited")
      @js.native
      def encodeDelimited(message: ISuggestion, writer: Writer): Writer = js.native
      
      /**
        * Creates a Suggestion message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Suggestion
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestion.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): Suggestion = js.native
      
      /**
        * Creates a plain object from a Suggestion message. Also converts values to other types if specified.
        * @param message Suggestion
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestion.toObject")
      @js.native
      def toObject(message: Suggestion): StringDictionary[js.Any] = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestion.toObject")
      @js.native
      def toObject(message: Suggestion, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a Suggestion message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestion.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a Suggestions. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestions")
    @js.native
    /**
      * Constructs a new Suggestions.
      * @param [properties] Properties to set
      */
    class Suggestions () extends ISuggestions {
      def this(properties: ISuggestions) = this()
      
      /** Suggestions suggestions. */
      @JSName("suggestions")
      var suggestions_Suggestions: js.Array[ISuggestion] = js.native
      
      /**
        * Converts this Suggestions to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object Suggestions {
      
      /**
        * Creates a new Suggestions instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Suggestions instance
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestions.create")
      @js.native
      def create(): Suggestions = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestions.create")
      @js.native
      def create(properties: ISuggestions): Suggestions = js.native
      
      /**
        * Decodes a Suggestions message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Suggestions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestions.decode")
      @js.native
      def decode(reader: Reader): Suggestions = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestions.decode")
      @js.native
      def decode(reader: Reader, length: Double): Suggestions = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestions.decode")
      @js.native
      def decode(reader: Uint8Array): Suggestions = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestions.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): Suggestions = js.native
      
      /**
        * Decodes a Suggestions message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Suggestions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestions.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): Suggestions = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestions.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): Suggestions = js.native
      
      /**
        * Encodes the specified Suggestions message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Suggestions.verify|verify} messages.
        * @param message Suggestions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestions.encode")
      @js.native
      def encode(message: ISuggestions): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestions.encode")
      @js.native
      def encode(message: ISuggestions, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified Suggestions message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Suggestions.verify|verify} messages.
        * @param message Suggestions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestions.encodeDelimited")
      @js.native
      def encodeDelimited(message: ISuggestions): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestions.encodeDelimited")
      @js.native
      def encodeDelimited(message: ISuggestions, writer: Writer): Writer = js.native
      
      /**
        * Creates a Suggestions message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Suggestions
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestions.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): Suggestions = js.native
      
      /**
        * Creates a plain object from a Suggestions message. Also converts values to other types if specified.
        * @param message Suggestions
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestions.toObject")
      @js.native
      def toObject(message: Suggestions): StringDictionary[js.Any] = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestions.toObject")
      @js.native
      def toObject(message: Suggestions, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a Suggestions message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestions.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a TableCard. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCard")
    @js.native
    /**
      * Constructs a new TableCard.
      * @param [properties] Properties to set
      */
    class TableCard () extends ITableCard {
      def this(properties: ITableCard) = this()
      
      /** TableCard buttons. */
      @JSName("buttons")
      var buttons_TableCard: js.Array[IButton] = js.native
      
      /** TableCard columnProperties. */
      @JSName("columnProperties")
      var columnProperties_TableCard: js.Array[IColumnProperties] = js.native
      
      /** TableCard rows. */
      @JSName("rows")
      var rows_TableCard: js.Array[ITableCardRow] = js.native
      
      /** TableCard subtitle. */
      @JSName("subtitle")
      var subtitle_TableCard: String = js.native
      
      /** TableCard title. */
      @JSName("title")
      var title_TableCard: String = js.native
      
      /**
        * Converts this TableCard to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object TableCard {
      
      /**
        * Creates a new TableCard instance using the specified properties.
        * @param [properties] Properties to set
        * @returns TableCard instance
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCard.create")
      @js.native
      def create(): TableCard = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCard.create")
      @js.native
      def create(properties: ITableCard): TableCard = js.native
      
      /**
        * Decodes a TableCard message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns TableCard
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCard.decode")
      @js.native
      def decode(reader: Reader): TableCard = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCard.decode")
      @js.native
      def decode(reader: Reader, length: Double): TableCard = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCard.decode")
      @js.native
      def decode(reader: Uint8Array): TableCard = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCard.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): TableCard = js.native
      
      /**
        * Decodes a TableCard message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns TableCard
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCard.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): TableCard = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCard.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): TableCard = js.native
      
      /**
        * Encodes the specified TableCard message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.TableCard.verify|verify} messages.
        * @param message TableCard message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCard.encode")
      @js.native
      def encode(message: ITableCard): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCard.encode")
      @js.native
      def encode(message: ITableCard, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified TableCard message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.TableCard.verify|verify} messages.
        * @param message TableCard message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCard.encodeDelimited")
      @js.native
      def encodeDelimited(message: ITableCard): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCard.encodeDelimited")
      @js.native
      def encodeDelimited(message: ITableCard, writer: Writer): Writer = js.native
      
      /**
        * Creates a TableCard message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns TableCard
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCard.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): TableCard = js.native
      
      /**
        * Creates a plain object from a TableCard message. Also converts values to other types if specified.
        * @param message TableCard
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCard.toObject")
      @js.native
      def toObject(message: TableCard): StringDictionary[js.Any] = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCard.toObject")
      @js.native
      def toObject(message: TableCard, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a TableCard message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCard.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a TableCardCell. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardCell")
    @js.native
    /**
      * Constructs a new TableCardCell.
      * @param [properties] Properties to set
      */
    class TableCardCell () extends ITableCardCell {
      def this(properties: ITableCardCell) = this()
      
      /** TableCardCell text. */
      @JSName("text")
      var text_TableCardCell: String = js.native
      
      /**
        * Converts this TableCardCell to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object TableCardCell {
      
      /**
        * Creates a new TableCardCell instance using the specified properties.
        * @param [properties] Properties to set
        * @returns TableCardCell instance
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardCell.create")
      @js.native
      def create(): TableCardCell = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardCell.create")
      @js.native
      def create(properties: ITableCardCell): TableCardCell = js.native
      
      /**
        * Decodes a TableCardCell message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns TableCardCell
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardCell.decode")
      @js.native
      def decode(reader: Reader): TableCardCell = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardCell.decode")
      @js.native
      def decode(reader: Reader, length: Double): TableCardCell = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardCell.decode")
      @js.native
      def decode(reader: Uint8Array): TableCardCell = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardCell.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): TableCardCell = js.native
      
      /**
        * Decodes a TableCardCell message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns TableCardCell
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardCell.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): TableCardCell = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardCell.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): TableCardCell = js.native
      
      /**
        * Encodes the specified TableCardCell message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.TableCardCell.verify|verify} messages.
        * @param message TableCardCell message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardCell.encode")
      @js.native
      def encode(message: ITableCardCell): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardCell.encode")
      @js.native
      def encode(message: ITableCardCell, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified TableCardCell message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.TableCardCell.verify|verify} messages.
        * @param message TableCardCell message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardCell.encodeDelimited")
      @js.native
      def encodeDelimited(message: ITableCardCell): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardCell.encodeDelimited")
      @js.native
      def encodeDelimited(message: ITableCardCell, writer: Writer): Writer = js.native
      
      /**
        * Creates a TableCardCell message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns TableCardCell
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardCell.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): TableCardCell = js.native
      
      /**
        * Creates a plain object from a TableCardCell message. Also converts values to other types if specified.
        * @param message TableCardCell
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardCell.toObject")
      @js.native
      def toObject(message: TableCardCell): StringDictionary[js.Any] = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardCell.toObject")
      @js.native
      def toObject(message: TableCardCell, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a TableCardCell message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardCell.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a TableCardRow. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardRow")
    @js.native
    /**
      * Constructs a new TableCardRow.
      * @param [properties] Properties to set
      */
    class TableCardRow () extends ITableCardRow {
      def this(properties: ITableCardRow) = this()
      
      /** TableCardRow cells. */
      @JSName("cells")
      var cells_TableCardRow: js.Array[ITableCardCell] = js.native
      
      /** TableCardRow dividerAfter. */
      @JSName("dividerAfter")
      var dividerAfter_TableCardRow: Boolean = js.native
      
      /**
        * Converts this TableCardRow to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object TableCardRow {
      
      /**
        * Creates a new TableCardRow instance using the specified properties.
        * @param [properties] Properties to set
        * @returns TableCardRow instance
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardRow.create")
      @js.native
      def create(): TableCardRow = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardRow.create")
      @js.native
      def create(properties: ITableCardRow): TableCardRow = js.native
      
      /**
        * Decodes a TableCardRow message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns TableCardRow
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardRow.decode")
      @js.native
      def decode(reader: Reader): TableCardRow = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardRow.decode")
      @js.native
      def decode(reader: Reader, length: Double): TableCardRow = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardRow.decode")
      @js.native
      def decode(reader: Uint8Array): TableCardRow = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardRow.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): TableCardRow = js.native
      
      /**
        * Decodes a TableCardRow message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns TableCardRow
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardRow.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): TableCardRow = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardRow.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): TableCardRow = js.native
      
      /**
        * Encodes the specified TableCardRow message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.TableCardRow.verify|verify} messages.
        * @param message TableCardRow message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardRow.encode")
      @js.native
      def encode(message: ITableCardRow): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardRow.encode")
      @js.native
      def encode(message: ITableCardRow, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified TableCardRow message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.TableCardRow.verify|verify} messages.
        * @param message TableCardRow message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardRow.encodeDelimited")
      @js.native
      def encodeDelimited(message: ITableCardRow): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardRow.encodeDelimited")
      @js.native
      def encodeDelimited(message: ITableCardRow, writer: Writer): Writer = js.native
      
      /**
        * Creates a TableCardRow message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns TableCardRow
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardRow.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): TableCardRow = js.native
      
      /**
        * Creates a plain object from a TableCardRow message. Also converts values to other types if specified.
        * @param message TableCardRow
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardRow.toObject")
      @js.native
      def toObject(message: TableCardRow): StringDictionary[js.Any] = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardRow.toObject")
      @js.native
      def toObject(message: TableCardRow, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a TableCardRow message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardRow.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a Text. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Text")
    @js.native
    /**
      * Constructs a new Text.
      * @param [properties] Properties to set
      */
    class Text () extends IText {
      def this(properties: IText) = this()
      
      /** Text text. */
      @JSName("text")
      var text_Text: js.Array[String] = js.native
      
      /**
        * Converts this Text to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object Text {
      
      /**
        * Creates a new Text instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Text instance
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Text.create")
      @js.native
      def create(): typings.std.Text = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Text.create")
      @js.native
      def create(properties: IText): typings.std.Text = js.native
      
      /**
        * Decodes a Text message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Text
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Text.decode")
      @js.native
      def decode(reader: Reader): typings.std.Text = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Text.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.std.Text = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Text.decode")
      @js.native
      def decode(reader: Uint8Array): typings.std.Text = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Text.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.std.Text = js.native
      
      /**
        * Decodes a Text message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Text
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Text.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.std.Text = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Text.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.std.Text = js.native
      
      /**
        * Encodes the specified Text message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Text.verify|verify} messages.
        * @param message Text message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Text.encode")
      @js.native
      def encode(message: IText): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Text.encode")
      @js.native
      def encode(message: IText, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified Text message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Text.verify|verify} messages.
        * @param message Text message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Text.encodeDelimited")
      @js.native
      def encodeDelimited(message: IText): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Text.encodeDelimited")
      @js.native
      def encodeDelimited(message: IText, writer: Writer): Writer = js.native
      
      /**
        * Creates a Text message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Text
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Text.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.std.Text = js.native
      
      /**
        * Creates a plain object from a Text message. Also converts values to other types if specified.
        * @param message Text
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Text.toObject")
      @js.native
      def toObject(message: typings.std.Text): StringDictionary[js.Any] = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Text.toObject")
      @js.native
      def toObject(message: typings.std.Text, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a Text message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Text.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /**
      * Creates a new Message instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Message instance
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.create")
    @js.native
    def create(): Message = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.create")
    @js.native
    def create(properties: IMessage): Message = js.native
    
    /**
      * Decodes a Message message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Message
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.decode")
    @js.native
    def decode(reader: Reader): Message = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.decode")
    @js.native
    def decode(reader: Reader, length: Double): Message = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.decode")
    @js.native
    def decode(reader: Uint8Array): Message = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Message = js.native
    
    /**
      * Decodes a Message message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Message
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Message = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Message = js.native
    
    /**
      * Encodes the specified Message message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.verify|verify} messages.
      * @param message Message message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.encode")
    @js.native
    def encode(message: IMessage): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.encode")
    @js.native
    def encode(message: IMessage, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Message message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.verify|verify} messages.
      * @param message Message message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.encodeDelimited")
    @js.native
    def encodeDelimited(message: IMessage): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.encodeDelimited")
    @js.native
    def encodeDelimited(message: IMessage, writer: Writer): Writer = js.native
    
    /**
      * Creates a Message message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Message
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Message = js.native
    
    /**
      * Creates a plain object from a Message message. Also converts values to other types if specified.
      * @param message Message
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.toObject")
    @js.native
    def toObject(message: Message): StringDictionary[js.Any] = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.toObject")
    @js.native
    def toObject(message: Message, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Message message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
    
    /** Properties of a BasicCard. */
    @js.native
    trait IBasicCard extends StObject {
      
      /** BasicCard buttons */
      var buttons: js.UndefOr[js.Array[IButton] | Null] = js.native
      
      /** BasicCard formattedText */
      var formattedText: js.UndefOr[String | Null] = js.native
      
      /** BasicCard image */
      var image: js.UndefOr[IImage | Null] = js.native
      
      /** BasicCard subtitle */
      var subtitle: js.UndefOr[String | Null] = js.native
      
      /** BasicCard title */
      var title: js.UndefOr[String | Null] = js.native
    }
    object IBasicCard {
      
      @scala.inline
      def apply(): IBasicCard = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IBasicCard]
      }
      
      @scala.inline
      implicit class IBasicCardMutableBuilder[Self <: IBasicCard] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setButtons(value: js.Array[IButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButtonsNull: Self = StObject.set(x, "buttons", null)
        
        @scala.inline
        def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
        
        @scala.inline
        def setButtonsVarargs(value: IButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
        
        @scala.inline
        def setFormattedText(value: String): Self = StObject.set(x, "formattedText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormattedTextNull: Self = StObject.set(x, "formattedText", null)
        
        @scala.inline
        def setFormattedTextUndefined: Self = StObject.set(x, "formattedText", js.undefined)
        
        @scala.inline
        def setImage(value: IImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImageNull: Self = StObject.set(x, "image", null)
        
        @scala.inline
        def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
        
        @scala.inline
        def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubtitleNull: Self = StObject.set(x, "subtitle", null)
        
        @scala.inline
        def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleNull: Self = StObject.set(x, "title", null)
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    /** Properties of a BrowseCarouselCard. */
    @js.native
    trait IBrowseCarouselCard extends StObject {
      
      /** BrowseCarouselCard imageDisplayOptions */
      var imageDisplayOptions: js.UndefOr[
            ImageDisplayOptions | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.ImageDisplayOptions * / any */ String) | Null
          ] = js.native
      
      /** BrowseCarouselCard items */
      var items: js.UndefOr[js.Array[IBrowseCarouselCardItem] | Null] = js.native
    }
    object IBrowseCarouselCard {
      
      @scala.inline
      def apply(): IBrowseCarouselCard = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IBrowseCarouselCard]
      }
      
      @scala.inline
      implicit class IBrowseCarouselCardMutableBuilder[Self <: IBrowseCarouselCard] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setImageDisplayOptions(
          value: ImageDisplayOptions | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.ImageDisplayOptions * / any */ String)
        ): Self = StObject.set(x, "imageDisplayOptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImageDisplayOptionsNull: Self = StObject.set(x, "imageDisplayOptions", null)
        
        @scala.inline
        def setImageDisplayOptionsUndefined: Self = StObject.set(x, "imageDisplayOptions", js.undefined)
        
        @scala.inline
        def setItems(value: js.Array[IBrowseCarouselCardItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsNull: Self = StObject.set(x, "items", null)
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: IBrowseCarouselCardItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      }
    }
    
    /** Properties of a Card. */
    @js.native
    trait ICard extends StObject {
      
      /** Card buttons */
      var buttons: js.UndefOr[
            js.Array[typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton] | Null
          ] = js.native
      
      /** Card imageUri */
      var imageUri: js.UndefOr[String | Null] = js.native
      
      /** Card subtitle */
      var subtitle: js.UndefOr[String | Null] = js.native
      
      /** Card title */
      var title: js.UndefOr[String | Null] = js.native
    }
    object ICard {
      
      @scala.inline
      def apply(): ICard = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ICard]
      }
      
      @scala.inline
      implicit class ICardMutableBuilder[Self <: ICard] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setButtons(value: js.Array[typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButtonsNull: Self = StObject.set(x, "buttons", null)
        
        @scala.inline
        def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
        
        @scala.inline
        def setButtonsVarargs(value: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
        
        @scala.inline
        def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImageUriNull: Self = StObject.set(x, "imageUri", null)
        
        @scala.inline
        def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
        
        @scala.inline
        def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubtitleNull: Self = StObject.set(x, "subtitle", null)
        
        @scala.inline
        def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleNull: Self = StObject.set(x, "title", null)
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    /** Properties of a CarouselSelect. */
    @js.native
    trait ICarouselSelect extends StObject {
      
      /** CarouselSelect items */
      var items: js.UndefOr[js.Array[IItem] | Null] = js.native
    }
    object ICarouselSelect {
      
      @scala.inline
      def apply(): ICarouselSelect = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ICarouselSelect]
      }
      
      @scala.inline
      implicit class ICarouselSelectMutableBuilder[Self <: ICarouselSelect] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setItems(value: js.Array[IItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsNull: Self = StObject.set(x, "items", null)
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: IItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      }
    }
    
    /** Properties of a ColumnProperties. */
    @js.native
    trait IColumnProperties extends StObject {
      
      /** ColumnProperties header */
      var header: js.UndefOr[String | Null] = js.native
      
      /** ColumnProperties horizontalAlignment */
      var horizontalAlignment: js.UndefOr[
            HorizontalAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.HorizontalAlignment * / any */ String) | Null
          ] = js.native
    }
    object IColumnProperties {
      
      @scala.inline
      def apply(): IColumnProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IColumnProperties]
      }
      
      @scala.inline
      implicit class IColumnPropertiesMutableBuilder[Self <: IColumnProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeaderNull: Self = StObject.set(x, "header", null)
        
        @scala.inline
        def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
        
        @scala.inline
        def setHorizontalAlignment(
          value: HorizontalAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.HorizontalAlignment * / any */ String)
        ): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHorizontalAlignmentNull: Self = StObject.set(x, "horizontalAlignment", null)
        
        @scala.inline
        def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
      }
    }
    
    /** Properties of an Image. */
    @js.native
    trait IImage extends StObject {
      
      /** Image accessibilityText */
      var accessibilityText: js.UndefOr[String | Null] = js.native
      
      /** Image imageUri */
      var imageUri: js.UndefOr[String | Null] = js.native
    }
    object IImage {
      
      @scala.inline
      def apply(): IImage = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IImage]
      }
      
      @scala.inline
      implicit class IImageMutableBuilder[Self <: IImage] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccessibilityText(value: String): Self = StObject.set(x, "accessibilityText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccessibilityTextNull: Self = StObject.set(x, "accessibilityText", null)
        
        @scala.inline
        def setAccessibilityTextUndefined: Self = StObject.set(x, "accessibilityText", js.undefined)
        
        @scala.inline
        def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImageUriNull: Self = StObject.set(x, "imageUri", null)
        
        @scala.inline
        def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
      }
    }
    
    /** Properties of a LinkOutSuggestion. */
    @js.native
    trait ILinkOutSuggestion extends StObject {
      
      /** LinkOutSuggestion destinationName */
      var destinationName: js.UndefOr[String | Null] = js.native
      
      /** LinkOutSuggestion uri */
      var uri: js.UndefOr[String | Null] = js.native
    }
    object ILinkOutSuggestion {
      
      @scala.inline
      def apply(): ILinkOutSuggestion = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ILinkOutSuggestion]
      }
      
      @scala.inline
      implicit class ILinkOutSuggestionMutableBuilder[Self <: ILinkOutSuggestion] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDestinationName(value: String): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDestinationNameNull: Self = StObject.set(x, "destinationName", null)
        
        @scala.inline
        def setDestinationNameUndefined: Self = StObject.set(x, "destinationName", js.undefined)
        
        @scala.inline
        def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUriNull: Self = StObject.set(x, "uri", null)
        
        @scala.inline
        def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      }
    }
    
    /** Properties of a ListSelect. */
    @js.native
    trait IListSelect extends StObject {
      
      /** ListSelect items */
      var items: js.UndefOr[
            (js.Array[
              typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem
            ]) | Null
          ] = js.native
      
      /** ListSelect subtitle */
      var subtitle: js.UndefOr[String | Null] = js.native
      
      /** ListSelect title */
      var title: js.UndefOr[String | Null] = js.native
    }
    object IListSelect {
      
      @scala.inline
      def apply(): IListSelect = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IListSelect]
      }
      
      @scala.inline
      implicit class IListSelectMutableBuilder[Self <: IListSelect] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setItems(
          value: js.Array[
                  typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem
                ]
        ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsNull: Self = StObject.set(x, "items", null)
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubtitleNull: Self = StObject.set(x, "subtitle", null)
        
        @scala.inline
        def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleNull: Self = StObject.set(x, "title", null)
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    /** Properties of a MediaContent. */
    @js.native
    trait IMediaContent extends StObject {
      
      /** MediaContent mediaObjects */
      var mediaObjects: js.UndefOr[js.Array[IResponseMediaObject] | Null] = js.native
      
      /** MediaContent mediaType */
      var mediaType: js.UndefOr[
            ResponseMediaType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaType * / any */ String) | Null
          ] = js.native
    }
    object IMediaContent {
      
      @scala.inline
      def apply(): IMediaContent = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IMediaContent]
      }
      
      @scala.inline
      implicit class IMediaContentMutableBuilder[Self <: IMediaContent] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMediaObjects(value: js.Array[IResponseMediaObject]): Self = StObject.set(x, "mediaObjects", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMediaObjectsNull: Self = StObject.set(x, "mediaObjects", null)
        
        @scala.inline
        def setMediaObjectsUndefined: Self = StObject.set(x, "mediaObjects", js.undefined)
        
        @scala.inline
        def setMediaObjectsVarargs(value: IResponseMediaObject*): Self = StObject.set(x, "mediaObjects", js.Array(value :_*))
        
        @scala.inline
        def setMediaType(
          value: ResponseMediaType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaType * / any */ String)
        ): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMediaTypeNull: Self = StObject.set(x, "mediaType", null)
        
        @scala.inline
        def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      }
    }
    
    /** Properties of a QuickReplies. */
    @js.native
    trait IQuickReplies extends StObject {
      
      /** QuickReplies quickReplies */
      var quickReplies: js.UndefOr[js.Array[String] | Null] = js.native
      
      /** QuickReplies title */
      var title: js.UndefOr[String | Null] = js.native
    }
    object IQuickReplies {
      
      @scala.inline
      def apply(): IQuickReplies = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IQuickReplies]
      }
      
      @scala.inline
      implicit class IQuickRepliesMutableBuilder[Self <: IQuickReplies] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setQuickReplies(value: js.Array[String]): Self = StObject.set(x, "quickReplies", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQuickRepliesNull: Self = StObject.set(x, "quickReplies", null)
        
        @scala.inline
        def setQuickRepliesUndefined: Self = StObject.set(x, "quickReplies", js.undefined)
        
        @scala.inline
        def setQuickRepliesVarargs(value: String*): Self = StObject.set(x, "quickReplies", js.Array(value :_*))
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleNull: Self = StObject.set(x, "title", null)
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    /** Properties of a SelectItemInfo. */
    @js.native
    trait ISelectItemInfo extends StObject {
      
      /** SelectItemInfo key */
      var key: js.UndefOr[String | Null] = js.native
      
      /** SelectItemInfo synonyms */
      var synonyms: js.UndefOr[js.Array[String] | Null] = js.native
    }
    object ISelectItemInfo {
      
      @scala.inline
      def apply(): ISelectItemInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ISelectItemInfo]
      }
      
      @scala.inline
      implicit class ISelectItemInfoMutableBuilder[Self <: ISelectItemInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyNull: Self = StObject.set(x, "key", null)
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        @scala.inline
        def setSynonyms(value: js.Array[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSynonymsNull: Self = StObject.set(x, "synonyms", null)
        
        @scala.inline
        def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
        
        @scala.inline
        def setSynonymsVarargs(value: String*): Self = StObject.set(x, "synonyms", js.Array(value :_*))
      }
    }
    
    /** Properties of a SimpleResponse. */
    @js.native
    trait ISimpleResponse extends StObject {
      
      /** SimpleResponse displayText */
      var displayText: js.UndefOr[String | Null] = js.native
      
      /** SimpleResponse ssml */
      var ssml: js.UndefOr[String | Null] = js.native
      
      /** SimpleResponse textToSpeech */
      var textToSpeech: js.UndefOr[String | Null] = js.native
    }
    object ISimpleResponse {
      
      @scala.inline
      def apply(): ISimpleResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ISimpleResponse]
      }
      
      @scala.inline
      implicit class ISimpleResponseMutableBuilder[Self <: ISimpleResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayTextNull: Self = StObject.set(x, "displayText", null)
        
        @scala.inline
        def setDisplayTextUndefined: Self = StObject.set(x, "displayText", js.undefined)
        
        @scala.inline
        def setSsml(value: String): Self = StObject.set(x, "ssml", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSsmlNull: Self = StObject.set(x, "ssml", null)
        
        @scala.inline
        def setSsmlUndefined: Self = StObject.set(x, "ssml", js.undefined)
        
        @scala.inline
        def setTextToSpeech(value: String): Self = StObject.set(x, "textToSpeech", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextToSpeechNull: Self = StObject.set(x, "textToSpeech", null)
        
        @scala.inline
        def setTextToSpeechUndefined: Self = StObject.set(x, "textToSpeech", js.undefined)
      }
    }
    
    /** Properties of a SimpleResponses. */
    @js.native
    trait ISimpleResponses extends StObject {
      
      /** SimpleResponses simpleResponses */
      var simpleResponses: js.UndefOr[js.Array[ISimpleResponse] | Null] = js.native
    }
    object ISimpleResponses {
      
      @scala.inline
      def apply(): ISimpleResponses = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ISimpleResponses]
      }
      
      @scala.inline
      implicit class ISimpleResponsesMutableBuilder[Self <: ISimpleResponses] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSimpleResponses(value: js.Array[ISimpleResponse]): Self = StObject.set(x, "simpleResponses", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSimpleResponsesNull: Self = StObject.set(x, "simpleResponses", null)
        
        @scala.inline
        def setSimpleResponsesUndefined: Self = StObject.set(x, "simpleResponses", js.undefined)
        
        @scala.inline
        def setSimpleResponsesVarargs(value: ISimpleResponse*): Self = StObject.set(x, "simpleResponses", js.Array(value :_*))
      }
    }
    
    /** Properties of a Suggestion. */
    @js.native
    trait ISuggestion extends StObject {
      
      /** Suggestion title */
      var title: js.UndefOr[String | Null] = js.native
    }
    object ISuggestion {
      
      @scala.inline
      def apply(): ISuggestion = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ISuggestion]
      }
      
      @scala.inline
      implicit class ISuggestionMutableBuilder[Self <: ISuggestion] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleNull: Self = StObject.set(x, "title", null)
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    /** Properties of a Suggestions. */
    @js.native
    trait ISuggestions extends StObject {
      
      /** Suggestions suggestions */
      var suggestions: js.UndefOr[js.Array[ISuggestion] | Null] = js.native
    }
    object ISuggestions {
      
      @scala.inline
      def apply(): ISuggestions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ISuggestions]
      }
      
      @scala.inline
      implicit class ISuggestionsMutableBuilder[Self <: ISuggestions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSuggestions(value: js.Array[ISuggestion]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSuggestionsNull: Self = StObject.set(x, "suggestions", null)
        
        @scala.inline
        def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
        
        @scala.inline
        def setSuggestionsVarargs(value: ISuggestion*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
      }
    }
    
    /** Properties of a TableCard. */
    @js.native
    trait ITableCard extends StObject {
      
      /** TableCard buttons */
      var buttons: js.UndefOr[js.Array[IButton] | Null] = js.native
      
      /** TableCard columnProperties */
      var columnProperties: js.UndefOr[js.Array[IColumnProperties] | Null] = js.native
      
      /** TableCard image */
      var image: js.UndefOr[IImage | Null] = js.native
      
      /** TableCard rows */
      var rows: js.UndefOr[js.Array[ITableCardRow] | Null] = js.native
      
      /** TableCard subtitle */
      var subtitle: js.UndefOr[String | Null] = js.native
      
      /** TableCard title */
      var title: js.UndefOr[String | Null] = js.native
    }
    object ITableCard {
      
      @scala.inline
      def apply(): ITableCard = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ITableCard]
      }
      
      @scala.inline
      implicit class ITableCardMutableBuilder[Self <: ITableCard] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setButtons(value: js.Array[IButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButtonsNull: Self = StObject.set(x, "buttons", null)
        
        @scala.inline
        def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
        
        @scala.inline
        def setButtonsVarargs(value: IButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
        
        @scala.inline
        def setColumnProperties(value: js.Array[IColumnProperties]): Self = StObject.set(x, "columnProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnPropertiesNull: Self = StObject.set(x, "columnProperties", null)
        
        @scala.inline
        def setColumnPropertiesUndefined: Self = StObject.set(x, "columnProperties", js.undefined)
        
        @scala.inline
        def setColumnPropertiesVarargs(value: IColumnProperties*): Self = StObject.set(x, "columnProperties", js.Array(value :_*))
        
        @scala.inline
        def setImage(value: IImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImageNull: Self = StObject.set(x, "image", null)
        
        @scala.inline
        def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
        
        @scala.inline
        def setRows(value: js.Array[ITableCardRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowsNull: Self = StObject.set(x, "rows", null)
        
        @scala.inline
        def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        @scala.inline
        def setRowsVarargs(value: ITableCardRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
        
        @scala.inline
        def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubtitleNull: Self = StObject.set(x, "subtitle", null)
        
        @scala.inline
        def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleNull: Self = StObject.set(x, "title", null)
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    /** Properties of a TableCardCell. */
    @js.native
    trait ITableCardCell extends StObject {
      
      /** TableCardCell text */
      var text: js.UndefOr[String | Null] = js.native
    }
    object ITableCardCell {
      
      @scala.inline
      def apply(): ITableCardCell = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ITableCardCell]
      }
      
      @scala.inline
      implicit class ITableCardCellMutableBuilder[Self <: ITableCardCell] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextNull: Self = StObject.set(x, "text", null)
        
        @scala.inline
        def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    /** Properties of a TableCardRow. */
    @js.native
    trait ITableCardRow extends StObject {
      
      /** TableCardRow cells */
      var cells: js.UndefOr[js.Array[ITableCardCell] | Null] = js.native
      
      /** TableCardRow dividerAfter */
      var dividerAfter: js.UndefOr[Boolean | Null] = js.native
    }
    object ITableCardRow {
      
      @scala.inline
      def apply(): ITableCardRow = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ITableCardRow]
      }
      
      @scala.inline
      implicit class ITableCardRowMutableBuilder[Self <: ITableCardRow] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCells(value: js.Array[ITableCardCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCellsNull: Self = StObject.set(x, "cells", null)
        
        @scala.inline
        def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
        
        @scala.inline
        def setCellsVarargs(value: ITableCardCell*): Self = StObject.set(x, "cells", js.Array(value :_*))
        
        @scala.inline
        def setDividerAfter(value: Boolean): Self = StObject.set(x, "dividerAfter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDividerAfterNull: Self = StObject.set(x, "dividerAfter", null)
        
        @scala.inline
        def setDividerAfterUndefined: Self = StObject.set(x, "dividerAfter", js.undefined)
      }
    }
    
    /** Properties of a Text. */
    @js.native
    trait IText extends StObject {
      
      /** Text text */
      var text: js.UndefOr[js.Array[String] | Null] = js.native
    }
    object IText {
      
      @scala.inline
      def apply(): IText = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IText]
      }
      
      @scala.inline
      implicit class ITextMutableBuilder[Self <: IText] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextNull: Self = StObject.set(x, "text", null)
        
        @scala.inline
        def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
        
        @scala.inline
        def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
      }
    }
  }
  
  /** Represents a Parameter. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Parameter")
  @js.native
  /**
    * Constructs a new Parameter.
    * @param [properties] Properties to set
    */
  class Parameter () extends IParameter {
    def this(properties: IParameter) = this()
    
    /** Parameter defaultValue. */
    @JSName("defaultValue")
    var defaultValue_Parameter: String = js.native
    
    /** Parameter displayName. */
    @JSName("displayName")
    var displayName_Parameter: String = js.native
    
    /** Parameter entityTypeDisplayName. */
    @JSName("entityTypeDisplayName")
    var entityTypeDisplayName_Parameter: String = js.native
    
    /** Parameter isList. */
    @JSName("isList")
    var isList_Parameter: Boolean = js.native
    
    /** Parameter mandatory. */
    @JSName("mandatory")
    var mandatory_Parameter: Boolean = js.native
    
    /** Parameter name. */
    @JSName("name")
    var name_Parameter: String = js.native
    
    /** Parameter prompts. */
    @JSName("prompts")
    var prompts_Parameter: js.Array[String] = js.native
    
    /**
      * Converts this Parameter to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
    
    /** Parameter value. */
    @JSName("value")
    var value_Parameter: String = js.native
  }
  object Parameter {
    
    /**
      * Creates a new Parameter instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Parameter instance
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Parameter.create")
    @js.native
    def create(): Parameter = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Parameter.create")
    @js.native
    def create(properties: IParameter): Parameter = js.native
    
    /**
      * Decodes a Parameter message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Parameter
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Parameter.decode")
    @js.native
    def decode(reader: Reader): Parameter = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Parameter.decode")
    @js.native
    def decode(reader: Reader, length: Double): Parameter = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Parameter.decode")
    @js.native
    def decode(reader: Uint8Array): Parameter = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Parameter.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Parameter = js.native
    
    /**
      * Decodes a Parameter message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Parameter
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Parameter.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Parameter = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Parameter.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Parameter = js.native
    
    /**
      * Encodes the specified Parameter message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Parameter.verify|verify} messages.
      * @param message Parameter message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Parameter.encode")
    @js.native
    def encode(message: IParameter): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Parameter.encode")
    @js.native
    def encode(message: IParameter, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Parameter message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Parameter.verify|verify} messages.
      * @param message Parameter message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Parameter.encodeDelimited")
    @js.native
    def encodeDelimited(message: IParameter): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Parameter.encodeDelimited")
    @js.native
    def encodeDelimited(message: IParameter, writer: Writer): Writer = js.native
    
    /**
      * Creates a Parameter message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Parameter
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Parameter.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Parameter = js.native
    
    /**
      * Creates a plain object from a Parameter message. Also converts values to other types if specified.
      * @param message Parameter
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Parameter.toObject")
    @js.native
    def toObject(message: Parameter): StringDictionary[js.Any] = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Parameter.toObject")
    @js.native
    def toObject(message: Parameter, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Parameter message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Parameter.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a TrainingPhrase. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase")
  @js.native
  /**
    * Constructs a new TrainingPhrase.
    * @param [properties] Properties to set
    */
  class TrainingPhrase () extends ITrainingPhrase {
    def this(properties: ITrainingPhrase) = this()
    
    /** TrainingPhrase name. */
    @JSName("name")
    var name_TrainingPhrase: String = js.native
    
    /** TrainingPhrase parts. */
    @JSName("parts")
    var parts_TrainingPhrase: js.Array[IPart] = js.native
    
    /** TrainingPhrase timesAddedCount. */
    @JSName("timesAddedCount")
    var timesAddedCount_TrainingPhrase: Double = js.native
    
    /**
      * Converts this TrainingPhrase to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
    
    /** TrainingPhrase type. */
    @JSName("type")
    var type_TrainingPhrase: Type | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.TrainingPhrase.Type * / any */ String) = js.native
  }
  object TrainingPhrase {
    
    /** Represents a Part. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.Part")
    @js.native
    /**
      * Constructs a new Part.
      * @param [properties] Properties to set
      */
    class Part () extends IPart {
      def this(properties: IPart) = this()
      
      /** Part alias. */
      @JSName("alias")
      var alias_Part: String = js.native
      
      /** Part entityType. */
      @JSName("entityType")
      var entityType_Part: String = js.native
      
      /** Part text. */
      @JSName("text")
      var text_Part: String = js.native
      
      /**
        * Converts this Part to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
      
      /** Part userDefined. */
      @JSName("userDefined")
      var userDefined_Part: Boolean = js.native
    }
    object Part {
      
      /**
        * Creates a new Part instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Part instance
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.Part.create")
      @js.native
      def create(): Part = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.Part.create")
      @js.native
      def create(properties: IPart): Part = js.native
      
      /**
        * Decodes a Part message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Part
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.Part.decode")
      @js.native
      def decode(reader: Reader): Part = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.Part.decode")
      @js.native
      def decode(reader: Reader, length: Double): Part = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.Part.decode")
      @js.native
      def decode(reader: Uint8Array): Part = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.Part.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): Part = js.native
      
      /**
        * Decodes a Part message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Part
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.Part.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): Part = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.Part.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): Part = js.native
      
      /**
        * Encodes the specified Part message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.TrainingPhrase.Part.verify|verify} messages.
        * @param message Part message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.Part.encode")
      @js.native
      def encode(message: IPart): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.Part.encode")
      @js.native
      def encode(message: IPart, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified Part message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.TrainingPhrase.Part.verify|verify} messages.
        * @param message Part message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.Part.encodeDelimited")
      @js.native
      def encodeDelimited(message: IPart): Writer = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.Part.encodeDelimited")
      @js.native
      def encodeDelimited(message: IPart, writer: Writer): Writer = js.native
      
      /**
        * Creates a Part message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Part
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.Part.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): Part = js.native
      
      /**
        * Creates a plain object from a Part message. Also converts values to other types if specified.
        * @param message Part
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.Part.toObject")
      @js.native
      def toObject(message: Part): StringDictionary[js.Any] = js.native
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.Part.toObject")
      @js.native
      def toObject(message: Part, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a Part message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.Part.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    @js.native
    sealed trait Type extends StObject
    /** Type enum. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.Type")
    @js.native
    object Type extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Type with Double] = js.native
      
      @js.native
      sealed trait EXAMPLE extends Type
      /* 1 */ val EXAMPLE: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.TrainingPhrase.Type.EXAMPLE with Double = js.native
      
      @js.native
      sealed trait TEMPLATE extends Type
      /* 2 */ val TEMPLATE: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.TrainingPhrase.Type.TEMPLATE with Double = js.native
      
      @js.native
      sealed trait TYPE_UNSPECIFIED extends Type
      /* 0 */ val TYPE_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.TrainingPhrase.Type.TYPE_UNSPECIFIED with Double = js.native
    }
    
    /**
      * Creates a new TrainingPhrase instance using the specified properties.
      * @param [properties] Properties to set
      * @returns TrainingPhrase instance
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.create")
    @js.native
    def create(): TrainingPhrase = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.create")
    @js.native
    def create(properties: ITrainingPhrase): TrainingPhrase = js.native
    
    /**
      * Decodes a TrainingPhrase message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns TrainingPhrase
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.decode")
    @js.native
    def decode(reader: Reader): TrainingPhrase = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.decode")
    @js.native
    def decode(reader: Reader, length: Double): TrainingPhrase = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.decode")
    @js.native
    def decode(reader: Uint8Array): TrainingPhrase = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): TrainingPhrase = js.native
    
    /**
      * Decodes a TrainingPhrase message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns TrainingPhrase
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): TrainingPhrase = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): TrainingPhrase = js.native
    
    /**
      * Encodes the specified TrainingPhrase message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.TrainingPhrase.verify|verify} messages.
      * @param message TrainingPhrase message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.encode")
    @js.native
    def encode(message: ITrainingPhrase): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.encode")
    @js.native
    def encode(message: ITrainingPhrase, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified TrainingPhrase message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.TrainingPhrase.verify|verify} messages.
      * @param message TrainingPhrase message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.encodeDelimited")
    @js.native
    def encodeDelimited(message: ITrainingPhrase): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.encodeDelimited")
    @js.native
    def encodeDelimited(message: ITrainingPhrase, writer: Writer): Writer = js.native
    
    /**
      * Creates a TrainingPhrase message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns TrainingPhrase
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): TrainingPhrase = js.native
    
    /**
      * Creates a plain object from a TrainingPhrase message. Also converts values to other types if specified.
      * @param message TrainingPhrase
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.toObject")
    @js.native
    def toObject(message: TrainingPhrase): StringDictionary[js.Any] = js.native
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.toObject")
    @js.native
    def toObject(message: TrainingPhrase, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a TrainingPhrase message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
    
    /** Properties of a Part. */
    @js.native
    trait IPart extends StObject {
      
      /** Part alias */
      var alias: js.UndefOr[String | Null] = js.native
      
      /** Part entityType */
      var entityType: js.UndefOr[String | Null] = js.native
      
      /** Part text */
      var text: js.UndefOr[String | Null] = js.native
      
      /** Part userDefined */
      var userDefined: js.UndefOr[Boolean | Null] = js.native
    }
    object IPart {
      
      @scala.inline
      def apply(): IPart = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IPart]
      }
      
      @scala.inline
      implicit class IPartMutableBuilder[Self <: IPart] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAliasNull: Self = StObject.set(x, "alias", null)
        
        @scala.inline
        def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
        
        @scala.inline
        def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEntityTypeNull: Self = StObject.set(x, "entityType", null)
        
        @scala.inline
        def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
        
        @scala.inline
        def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextNull: Self = StObject.set(x, "text", null)
        
        @scala.inline
        def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
        
        @scala.inline
        def setUserDefined(value: Boolean): Self = StObject.set(x, "userDefined", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserDefinedNull: Self = StObject.set(x, "userDefined", null)
        
        @scala.inline
        def setUserDefinedUndefined: Self = StObject.set(x, "userDefined", js.undefined)
      }
    }
  }
  
  @js.native
  sealed trait WebhookState extends StObject
  /** WebhookState enum. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.WebhookState")
  @js.native
  object WebhookState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WebhookState with Double] = js.native
    
    @js.native
    sealed trait WEBHOOK_STATE_ENABLED extends WebhookState
    /* 1 */ val WEBHOOK_STATE_ENABLED: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.WebhookState.WEBHOOK_STATE_ENABLED with Double = js.native
    
    @js.native
    sealed trait WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING extends WebhookState
    /* 2 */ val WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.WebhookState.WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING with Double = js.native
    
    @js.native
    sealed trait WEBHOOK_STATE_UNSPECIFIED extends WebhookState
    /* 0 */ val WEBHOOK_STATE_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.WebhookState.WEBHOOK_STATE_UNSPECIFIED with Double = js.native
  }
  
  /**
    * Creates a new Intent instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Intent instance
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.create")
  @js.native
  def create(): Intent = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.create")
  @js.native
  def create(properties: IIntent): Intent = js.native
  
  /**
    * Decodes an Intent message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Intent
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.decode")
  @js.native
  def decode(reader: Reader): Intent = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.decode")
  @js.native
  def decode(reader: Reader, length: Double): Intent = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.decode")
  @js.native
  def decode(reader: Uint8Array): Intent = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): Intent = js.native
  
  /**
    * Decodes an Intent message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Intent
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Intent = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): Intent = js.native
  
  /**
    * Encodes the specified Intent message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.verify|verify} messages.
    * @param message Intent message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.encode")
  @js.native
  def encode(message: IIntent): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.encode")
  @js.native
  def encode(message: IIntent, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Intent message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.verify|verify} messages.
    * @param message Intent message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.encodeDelimited")
  @js.native
  def encodeDelimited(message: IIntent): Writer = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.encodeDelimited")
  @js.native
  def encodeDelimited(message: IIntent, writer: Writer): Writer = js.native
  
  /**
    * Creates an Intent message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Intent
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Intent = js.native
  
  /**
    * Creates a plain object from an Intent message. Also converts values to other types if specified.
    * @param message Intent
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.toObject")
  @js.native
  def toObject(message: Intent): StringDictionary[js.Any] = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.toObject")
  @js.native
  def toObject(message: Intent, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an Intent message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Properties of a FollowupIntentInfo. */
  @js.native
  trait IFollowupIntentInfo extends StObject {
    
    /** FollowupIntentInfo followupIntentName */
    var followupIntentName: js.UndefOr[String | Null] = js.native
    
    /** FollowupIntentInfo parentFollowupIntentName */
    var parentFollowupIntentName: js.UndefOr[String | Null] = js.native
  }
  object IFollowupIntentInfo {
    
    @scala.inline
    def apply(): IFollowupIntentInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFollowupIntentInfo]
    }
    
    @scala.inline
    implicit class IFollowupIntentInfoMutableBuilder[Self <: IFollowupIntentInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFollowupIntentName(value: String): Self = StObject.set(x, "followupIntentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowupIntentNameNull: Self = StObject.set(x, "followupIntentName", null)
      
      @scala.inline
      def setFollowupIntentNameUndefined: Self = StObject.set(x, "followupIntentName", js.undefined)
      
      @scala.inline
      def setParentFollowupIntentName(value: String): Self = StObject.set(x, "parentFollowupIntentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentFollowupIntentNameNull: Self = StObject.set(x, "parentFollowupIntentName", null)
      
      @scala.inline
      def setParentFollowupIntentNameUndefined: Self = StObject.set(x, "parentFollowupIntentName", js.undefined)
    }
  }
  
  /** Properties of a Message. */
  @js.native
  trait IMessage extends StObject {
    
    /** Message basicCard */
    var basicCard: js.UndefOr[IBasicCard | Null] = js.native
    
    /** Message browseCarouselCard */
    var browseCarouselCard: js.UndefOr[IBrowseCarouselCard | Null] = js.native
    
    /** Message card */
    var card: js.UndefOr[ICard | Null] = js.native
    
    /** Message carouselSelect */
    var carouselSelect: js.UndefOr[ICarouselSelect | Null] = js.native
    
    /** Message image */
    var image: js.UndefOr[IImage | Null] = js.native
    
    /** Message linkOutSuggestion */
    var linkOutSuggestion: js.UndefOr[ILinkOutSuggestion | Null] = js.native
    
    /** Message listSelect */
    var listSelect: js.UndefOr[IListSelect | Null] = js.native
    
    /** Message mediaContent */
    var mediaContent: js.UndefOr[IMediaContent | Null] = js.native
    
    /** Message payload */
    var payload: js.UndefOr[IStruct | Null] = js.native
    
    /** Message platform */
    var platform: js.UndefOr[
        Platform | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.Platform * / any */ String) | Null
      ] = js.native
    
    /** Message quickReplies */
    var quickReplies: js.UndefOr[IQuickReplies | Null] = js.native
    
    /** Message simpleResponses */
    var simpleResponses: js.UndefOr[ISimpleResponses | Null] = js.native
    
    /** Message suggestions */
    var suggestions: js.UndefOr[ISuggestions | Null] = js.native
    
    /** Message tableCard */
    var tableCard: js.UndefOr[ITableCard | Null] = js.native
    
    /** Message text */
    var text: js.UndefOr[IText | Null] = js.native
  }
  object IMessage {
    
    @scala.inline
    def apply(): IMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMessage]
    }
    
    @scala.inline
    implicit class IMessageMutableBuilder[Self <: IMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasicCard(value: IBasicCard): Self = StObject.set(x, "basicCard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasicCardNull: Self = StObject.set(x, "basicCard", null)
      
      @scala.inline
      def setBasicCardUndefined: Self = StObject.set(x, "basicCard", js.undefined)
      
      @scala.inline
      def setBrowseCarouselCard(value: IBrowseCarouselCard): Self = StObject.set(x, "browseCarouselCard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowseCarouselCardNull: Self = StObject.set(x, "browseCarouselCard", null)
      
      @scala.inline
      def setBrowseCarouselCardUndefined: Self = StObject.set(x, "browseCarouselCard", js.undefined)
      
      @scala.inline
      def setCard(value: ICard): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardNull: Self = StObject.set(x, "card", null)
      
      @scala.inline
      def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
      
      @scala.inline
      def setCarouselSelect(value: ICarouselSelect): Self = StObject.set(x, "carouselSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarouselSelectNull: Self = StObject.set(x, "carouselSelect", null)
      
      @scala.inline
      def setCarouselSelectUndefined: Self = StObject.set(x, "carouselSelect", js.undefined)
      
      @scala.inline
      def setImage(value: IImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageNull: Self = StObject.set(x, "image", null)
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setLinkOutSuggestion(value: ILinkOutSuggestion): Self = StObject.set(x, "linkOutSuggestion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkOutSuggestionNull: Self = StObject.set(x, "linkOutSuggestion", null)
      
      @scala.inline
      def setLinkOutSuggestionUndefined: Self = StObject.set(x, "linkOutSuggestion", js.undefined)
      
      @scala.inline
      def setListSelect(value: IListSelect): Self = StObject.set(x, "listSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListSelectNull: Self = StObject.set(x, "listSelect", null)
      
      @scala.inline
      def setListSelectUndefined: Self = StObject.set(x, "listSelect", js.undefined)
      
      @scala.inline
      def setMediaContent(value: IMediaContent): Self = StObject.set(x, "mediaContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaContentNull: Self = StObject.set(x, "mediaContent", null)
      
      @scala.inline
      def setMediaContentUndefined: Self = StObject.set(x, "mediaContent", js.undefined)
      
      @scala.inline
      def setPayload(value: IStruct): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadNull: Self = StObject.set(x, "payload", null)
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setPlatform(
        value: Platform | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.Platform * / any */ String)
      ): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformNull: Self = StObject.set(x, "platform", null)
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setQuickReplies(value: IQuickReplies): Self = StObject.set(x, "quickReplies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuickRepliesNull: Self = StObject.set(x, "quickReplies", null)
      
      @scala.inline
      def setQuickRepliesUndefined: Self = StObject.set(x, "quickReplies", js.undefined)
      
      @scala.inline
      def setSimpleResponses(value: ISimpleResponses): Self = StObject.set(x, "simpleResponses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimpleResponsesNull: Self = StObject.set(x, "simpleResponses", null)
      
      @scala.inline
      def setSimpleResponsesUndefined: Self = StObject.set(x, "simpleResponses", js.undefined)
      
      @scala.inline
      def setSuggestions(value: ISuggestions): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionsNull: Self = StObject.set(x, "suggestions", null)
      
      @scala.inline
      def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
      
      @scala.inline
      def setTableCard(value: ITableCard): Self = StObject.set(x, "tableCard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableCardNull: Self = StObject.set(x, "tableCard", null)
      
      @scala.inline
      def setTableCardUndefined: Self = StObject.set(x, "tableCard", js.undefined)
      
      @scala.inline
      def setText(value: IText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextNull: Self = StObject.set(x, "text", null)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  /** Properties of a Parameter. */
  @js.native
  trait IParameter extends StObject {
    
    /** Parameter defaultValue */
    var defaultValue: js.UndefOr[String | Null] = js.native
    
    /** Parameter displayName */
    var displayName: js.UndefOr[String | Null] = js.native
    
    /** Parameter entityTypeDisplayName */
    var entityTypeDisplayName: js.UndefOr[String | Null] = js.native
    
    /** Parameter isList */
    var isList: js.UndefOr[Boolean | Null] = js.native
    
    /** Parameter mandatory */
    var mandatory: js.UndefOr[Boolean | Null] = js.native
    
    /** Parameter name */
    var name: js.UndefOr[String | Null] = js.native
    
    /** Parameter prompts */
    var prompts: js.UndefOr[js.Array[String] | Null] = js.native
    
    /** Parameter value */
    var value: js.UndefOr[String | Null] = js.native
  }
  object IParameter {
    
    @scala.inline
    def apply(): IParameter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IParameter]
    }
    
    @scala.inline
    implicit class IParameterMutableBuilder[Self <: IParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setEntityTypeDisplayName(value: String): Self = StObject.set(x, "entityTypeDisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityTypeDisplayNameNull: Self = StObject.set(x, "entityTypeDisplayName", null)
      
      @scala.inline
      def setEntityTypeDisplayNameUndefined: Self = StObject.set(x, "entityTypeDisplayName", js.undefined)
      
      @scala.inline
      def setIsList(value: Boolean): Self = StObject.set(x, "isList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsListNull: Self = StObject.set(x, "isList", null)
      
      @scala.inline
      def setIsListUndefined: Self = StObject.set(x, "isList", js.undefined)
      
      @scala.inline
      def setMandatory(value: Boolean): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMandatoryNull: Self = StObject.set(x, "mandatory", null)
      
      @scala.inline
      def setMandatoryUndefined: Self = StObject.set(x, "mandatory", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPrompts(value: js.Array[String]): Self = StObject.set(x, "prompts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptsNull: Self = StObject.set(x, "prompts", null)
      
      @scala.inline
      def setPromptsUndefined: Self = StObject.set(x, "prompts", js.undefined)
      
      @scala.inline
      def setPromptsVarargs(value: String*): Self = StObject.set(x, "prompts", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /** Properties of a TrainingPhrase. */
  @js.native
  trait ITrainingPhrase extends StObject {
    
    /** TrainingPhrase name */
    var name: js.UndefOr[String | Null] = js.native
    
    /** TrainingPhrase parts */
    var parts: js.UndefOr[js.Array[IPart] | Null] = js.native
    
    /** TrainingPhrase timesAddedCount */
    var timesAddedCount: js.UndefOr[Double | Null] = js.native
    
    /** TrainingPhrase type */
    var `type`: js.UndefOr[
        Type | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.TrainingPhrase.Type * / any */ String) | Null
      ] = js.native
  }
  object ITrainingPhrase {
    
    @scala.inline
    def apply(): ITrainingPhrase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITrainingPhrase]
    }
    
    @scala.inline
    implicit class ITrainingPhraseMutableBuilder[Self <: ITrainingPhrase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParts(value: js.Array[IPart]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartsNull: Self = StObject.set(x, "parts", null)
      
      @scala.inline
      def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
      
      @scala.inline
      def setPartsVarargs(value: IPart*): Self = StObject.set(x, "parts", js.Array(value :_*))
      
      @scala.inline
      def setTimesAddedCount(value: Double): Self = StObject.set(x, "timesAddedCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimesAddedCountNull: Self = StObject.set(x, "timesAddedCount", null)
      
      @scala.inline
      def setTimesAddedCountUndefined: Self = StObject.set(x, "timesAddedCount", js.undefined)
      
      @scala.inline
      def setType(
        value: Type | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.TrainingPhrase.Type * / any */ String)
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
