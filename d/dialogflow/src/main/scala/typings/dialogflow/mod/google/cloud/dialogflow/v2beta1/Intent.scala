package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.action
import typings.dialogflow.dialogflowStrings.basicCard
import typings.dialogflow.dialogflowStrings.browseCarouselCard
import typings.dialogflow.dialogflowStrings.card
import typings.dialogflow.dialogflowStrings.carouselSelect
import typings.dialogflow.dialogflowStrings.dial
import typings.dialogflow.dialogflowStrings.icon
import typings.dialogflow.dialogflowStrings.image
import typings.dialogflow.dialogflowStrings.largeImage
import typings.dialogflow.dialogflowStrings.linkOutSuggestion
import typings.dialogflow.dialogflowStrings.listSelect
import typings.dialogflow.dialogflowStrings.mediaContent
import typings.dialogflow.dialogflowStrings.openUrl
import typings.dialogflow.dialogflowStrings.payload
import typings.dialogflow.dialogflowStrings.quickReplies
import typings.dialogflow.dialogflowStrings.rbmCarouselRichCard
import typings.dialogflow.dialogflowStrings.rbmStandaloneRichCard
import typings.dialogflow.dialogflowStrings.rbmText
import typings.dialogflow.dialogflowStrings.reply
import typings.dialogflow.dialogflowStrings.shareLocation
import typings.dialogflow.dialogflowStrings.simpleResponses
import typings.dialogflow.dialogflowStrings.ssml
import typings.dialogflow.dialogflowStrings.suggestions
import typings.dialogflow.dialogflowStrings.tableCard
import typings.dialogflow.dialogflowStrings.telephonyPlayAudio
import typings.dialogflow.dialogflowStrings.telephonySynthesizeSpeech
import typings.dialogflow.dialogflowStrings.telephonyTransferCall
import typings.dialogflow.dialogflowStrings.text
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.IFollowupIntentInfo
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.IMessage
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.IParameter
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.ITrainingPhrase
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button.IOpenUriAction
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.IButton
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.IOpenUrlAction
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.IBrowseCarouselCardItem
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect.IItem
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ColumnProperties.HorizontalAlignment
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IBasicCard
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IBrowseCarouselCard
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ICard
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ICarouselSelect
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IImage
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ILinkOutSuggestion
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IListSelect
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IMediaContent
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IQuickReplies
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IRbmCarouselCard
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IRbmStandaloneCard
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IRbmText
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ISimpleResponses
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ISuggestions
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ITableCard
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ITelephonyPlayAudio
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ITelephonySynthesizeSpeech
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ITelephonyTransferCall
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IText
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.IResponseMediaObject
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.ResponseMediaType
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.IRbmMedia
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia.Height
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCarouselCard.CardWidth
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.CardOrientation
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.ThumbnailImageAlignment
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.IRbmSuggestedActionDial
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.IRbmSuggestedActionOpenUri
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.IRbmSuggestedActionShareLocation
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.IPart
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Type
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.WebhookState
import typings.dialogflow.mod.google.protobuf.IStruct
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an Intent. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent")
@js.native
/**
  * Constructs a new Intent.
  * @param [properties] Properties to set
  */
class Intent ()
  extends StObject
     with IIntent {
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
  
  /** Intent endInteraction. */
  @JSName("endInteraction")
  var endInteraction_Intent: Boolean = js.native
  
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
  
  /** Intent mlEnabled. */
  @JSName("mlEnabled")
  var mlEnabled_Intent: Boolean = js.native
  
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
  var webhookState_Intent: WebhookState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.WebhookState * / any */ String) = js.native
}
object Intent {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a FollowupIntentInfo. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.FollowupIntentInfo")
  @js.native
  /**
    * Constructs a new FollowupIntentInfo.
    * @param [properties] Properties to set
    */
  class FollowupIntentInfo ()
    extends StObject
       with IFollowupIntentInfo {
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
    
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.FollowupIntentInfo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new FollowupIntentInfo instance using the specified properties.
      * @param [properties] Properties to set
      * @returns FollowupIntentInfo instance
      */
    /* static member */
    @scala.inline
    def create(): FollowupIntentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[FollowupIntentInfo]
    @scala.inline
    def create(properties: IFollowupIntentInfo): FollowupIntentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[FollowupIntentInfo]
    
    /**
      * Decodes a FollowupIntentInfo message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns FollowupIntentInfo
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): FollowupIntentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FollowupIntentInfo]
    @scala.inline
    def decode(reader: Reader, length: Double): FollowupIntentInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FollowupIntentInfo]
    @scala.inline
    def decode(reader: Uint8Array): FollowupIntentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FollowupIntentInfo]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): FollowupIntentInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FollowupIntentInfo]
    
    /**
      * Decodes a FollowupIntentInfo message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns FollowupIntentInfo
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): FollowupIntentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FollowupIntentInfo]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): FollowupIntentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FollowupIntentInfo]
    
    /**
      * Encodes the specified FollowupIntentInfo message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.FollowupIntentInfo.verify|verify} messages.
      * @param message FollowupIntentInfo message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IFollowupIntentInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IFollowupIntentInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified FollowupIntentInfo message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.FollowupIntentInfo.verify|verify} messages.
      * @param message FollowupIntentInfo message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IFollowupIntentInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IFollowupIntentInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a FollowupIntentInfo message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns FollowupIntentInfo
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): FollowupIntentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[FollowupIntentInfo]
    
    /**
      * Creates a plain object from a FollowupIntentInfo message. Also converts values to other types if specified.
      * @param message FollowupIntentInfo
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: FollowupIntentInfo): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(message: FollowupIntentInfo, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a FollowupIntentInfo message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a Message. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message")
  @js.native
  /**
    * Constructs a new Message.
    * @param [properties] Properties to set
    */
  class Message ()
    extends StObject
       with IMessage {
    def this(properties: IMessage) = this()
    
    /** Message message. */
    var message: js.UndefOr[
        text | image | quickReplies | card | payload | simpleResponses | basicCard | suggestions | linkOutSuggestion | listSelect | carouselSelect | telephonyPlayAudio | telephonySynthesizeSpeech | telephonyTransferCall | rbmText | rbmStandaloneRichCard | rbmCarouselRichCard | browseCarouselCard | tableCard | mediaContent
      ] = js.native
    
    /** Message platform. */
    @JSName("platform")
    var platform_Message: Platform | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.Platform * / any */ String) = js.native
    
    /**
      * Converts this Message to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object Message {
    
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message")
    @js.native
    val ^ : js.Any = js.native
    
    /** Represents a BasicCard. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard")
    @js.native
    /**
      * Constructs a new BasicCard.
      * @param [properties] Properties to set
      */
    class BasicCard ()
      extends StObject
         with IBasicCard {
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
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard")
      @js.native
      val ^ : js.Any = js.native
      
      /** Represents a Button. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button")
      @js.native
      /**
        * Constructs a new Button.
        * @param [properties] Properties to set
        */
      class Button ()
        extends StObject
           with IButton {
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
        
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button")
        @js.native
        val ^ : js.Any = js.native
        
        /** Represents an OpenUriAction. */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button.OpenUriAction")
        @js.native
        /**
          * Constructs a new OpenUriAction.
          * @param [properties] Properties to set
          */
        class OpenUriAction ()
          extends StObject
             with IOpenUriAction {
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
          
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button.OpenUriAction")
          @js.native
          val ^ : js.Any = js.native
          
          /**
            * Creates a new OpenUriAction instance using the specified properties.
            * @param [properties] Properties to set
            * @returns OpenUriAction instance
            */
          /* static member */
          @scala.inline
          def create(): OpenUriAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[OpenUriAction]
          @scala.inline
          def create(properties: IOpenUriAction): OpenUriAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[OpenUriAction]
          
          /**
            * Decodes an OpenUriAction message from the specified reader or buffer.
            * @param reader Reader or buffer to decode from
            * @param [length] Message length if known beforehand
            * @returns OpenUriAction
            * @throws {Error} If the payload is not a reader or valid buffer
            * @throws {$protobuf.util.ProtocolError} If required fields are missing
            */
          /* static member */
          @scala.inline
          def decode(reader: Reader): OpenUriAction = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[OpenUriAction]
          @scala.inline
          def decode(reader: Reader, length: Double): OpenUriAction = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[OpenUriAction]
          @scala.inline
          def decode(reader: Uint8Array): OpenUriAction = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[OpenUriAction]
          @scala.inline
          def decode(reader: Uint8Array, length: Double): OpenUriAction = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[OpenUriAction]
          
          /**
            * Decodes an OpenUriAction message from the specified reader or buffer, length delimited.
            * @param reader Reader or buffer to decode from
            * @returns OpenUriAction
            * @throws {Error} If the payload is not a reader or valid buffer
            * @throws {$protobuf.util.ProtocolError} If required fields are missing
            */
          /* static member */
          @scala.inline
          def decodeDelimited(reader: Reader): OpenUriAction = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[OpenUriAction]
          @scala.inline
          def decodeDelimited(reader: Uint8Array): OpenUriAction = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[OpenUriAction]
          
          /**
            * Encodes the specified OpenUriAction message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button.OpenUriAction.verify|verify} messages.
            * @param message OpenUriAction message or plain object to encode
            * @param [writer] Writer to encode to
            * @returns Writer
            */
          /* static member */
          @scala.inline
          def encode(message: IOpenUriAction): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
          @scala.inline
          def encode(message: IOpenUriAction, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
          
          /**
            * Encodes the specified OpenUriAction message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button.OpenUriAction.verify|verify} messages.
            * @param message OpenUriAction message or plain object to encode
            * @param [writer] Writer to encode to
            * @returns Writer
            */
          /* static member */
          @scala.inline
          def encodeDelimited(message: IOpenUriAction): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
          @scala.inline
          def encodeDelimited(message: IOpenUriAction, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
          
          /**
            * Creates an OpenUriAction message from a plain object. Also converts values to their respective internal types.
            * @param object Plain object
            * @returns OpenUriAction
            */
          /* static member */
          @scala.inline
          def fromObject(`object`: StringDictionary[js.Any]): OpenUriAction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[OpenUriAction]
          
          /**
            * Creates a plain object from an OpenUriAction message. Also converts values to other types if specified.
            * @param message OpenUriAction
            * @param [options] Conversion options
            * @returns Plain object
            */
          /* static member */
          @scala.inline
          def toObject(message: OpenUriAction): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
          @scala.inline
          def toObject(message: OpenUriAction, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
          
          /**
            * Verifies an OpenUriAction message.
            * @param message Plain object to verify
            * @returns `null` if valid, otherwise the reason why it is not
            */
          /* static member */
          @scala.inline
          def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
        }
        
        /**
          * Creates a new Button instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Button instance
          */
        /* static member */
        @scala.inline
        def create(): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Button]
        @scala.inline
        def create(properties: IButton): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Button]
        
        /**
          * Decodes a Button message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Button
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @scala.inline
        def decode(reader: Reader): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Button]
        @scala.inline
        def decode(reader: Reader, length: Double): Button = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Button]
        @scala.inline
        def decode(reader: Uint8Array): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Button]
        @scala.inline
        def decode(reader: Uint8Array, length: Double): Button = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Button]
        
        /**
          * Decodes a Button message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Button
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @scala.inline
        def decodeDelimited(reader: Reader): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Button]
        @scala.inline
        def decodeDelimited(reader: Uint8Array): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Button]
        
        /**
          * Encodes the specified Button message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button.verify|verify} messages.
          * @param message Button message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @scala.inline
        def encode(message: IButton): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        @scala.inline
        def encode(message: IButton, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified Button message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button.verify|verify} messages.
          * @param message Button message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @scala.inline
        def encodeDelimited(message: IButton): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        @scala.inline
        def encodeDelimited(message: IButton, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates a Button message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Button
          */
        /* static member */
        @scala.inline
        def fromObject(`object`: StringDictionary[js.Any]): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Button]
        
        /**
          * Creates a plain object from a Button message. Also converts values to other types if specified.
          * @param message Button
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @scala.inline
        def toObject(message: Button): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
        @scala.inline
        def toObject(message: Button, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
        
        /**
          * Verifies a Button message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @scala.inline
        def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
        
        /** Properties of an OpenUriAction. */
        trait IOpenUriAction extends StObject {
          
          /** OpenUriAction uri */
          var uri: js.UndefOr[String | Null] = js.undefined
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
      @scala.inline
      def create(): BasicCard = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BasicCard]
      @scala.inline
      def create(properties: IBasicCard): BasicCard = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BasicCard]
      
      /**
        * Decodes a BasicCard message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns BasicCard
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): BasicCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BasicCard]
      @scala.inline
      def decode(reader: Reader, length: Double): BasicCard = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BasicCard]
      @scala.inline
      def decode(reader: Uint8Array): BasicCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BasicCard]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): BasicCard = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BasicCard]
      
      /**
        * Decodes a BasicCard message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns BasicCard
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): BasicCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BasicCard]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): BasicCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BasicCard]
      
      /**
        * Encodes the specified BasicCard message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.verify|verify} messages.
        * @param message BasicCard message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: IBasicCard): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: IBasicCard, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified BasicCard message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.verify|verify} messages.
        * @param message BasicCard message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: IBasicCard): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: IBasicCard, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a BasicCard message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns BasicCard
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): BasicCard = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BasicCard]
      
      /**
        * Creates a plain object from a BasicCard message. Also converts values to other types if specified.
        * @param message BasicCard
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: BasicCard): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: BasicCard, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a BasicCard message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      
      /** Properties of a Button. */
      trait IButton extends StObject {
        
        /** Button openUriAction */
        var openUriAction: js.UndefOr[IOpenUriAction | Null] = js.undefined
        
        /** Button title */
        var title: js.UndefOr[String | Null] = js.undefined
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
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard")
    @js.native
    /**
      * Constructs a new BrowseCarouselCard.
      * @param [properties] Properties to set
      */
    class BrowseCarouselCard ()
      extends StObject
         with IBrowseCarouselCard {
      def this(properties: IBrowseCarouselCard) = this()
      
      /** BrowseCarouselCard imageDisplayOptions. */
      @JSName("imageDisplayOptions")
      var imageDisplayOptions_BrowseCarouselCard: ImageDisplayOptions | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions * / any */ String) = js.native
      
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
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard")
      @js.native
      val ^ : js.Any = js.native
      
      /** Represents a BrowseCarouselCardItem. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem")
      @js.native
      /**
        * Constructs a new BrowseCarouselCardItem.
        * @param [properties] Properties to set
        */
      class BrowseCarouselCardItem ()
        extends StObject
           with IBrowseCarouselCardItem {
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
        
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem")
        @js.native
        val ^ : js.Any = js.native
        
        /** Represents an OpenUrlAction. */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction")
        @js.native
        /**
          * Constructs a new OpenUrlAction.
          * @param [properties] Properties to set
          */
        class OpenUrlAction ()
          extends StObject
             with IOpenUrlAction {
          def this(properties: IOpenUrlAction) = this()
          
          /**
            * Converts this OpenUrlAction to JSON.
            * @returns JSON object
            */
          def toJSON(): StringDictionary[js.Any] = js.native
          
          /** OpenUrlAction urlTypeHint. */
          @JSName("urlTypeHint")
          var urlTypeHint_OpenUrlAction: UrlTypeHint | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint * / any */ String) = js.native
          
          /** OpenUrlAction url. */
          @JSName("url")
          var url_OpenUrlAction: String = js.native
        }
        object OpenUrlAction {
          
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction")
          @js.native
          val ^ : js.Any = js.native
          
          @js.native
          sealed trait UrlTypeHint extends StObject
          /** UrlTypeHint enum. */
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint")
          @js.native
          object UrlTypeHint extends StObject {
            
            @JSBracketAccess
            def apply(value: Double): js.UndefOr[UrlTypeHint & Double] = js.native
            
            @js.native
            sealed trait AMP_ACTION
              extends StObject
                 with UrlTypeHint
            /* 1 */ val AMP_ACTION: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint.AMP_ACTION & Double = js.native
            
            @js.native
            sealed trait AMP_CONTENT
              extends StObject
                 with UrlTypeHint
            /* 2 */ val AMP_CONTENT: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint.AMP_CONTENT & Double = js.native
            
            @js.native
            sealed trait URL_TYPE_HINT_UNSPECIFIED
              extends StObject
                 with UrlTypeHint
            /* 0 */ val URL_TYPE_HINT_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint.URL_TYPE_HINT_UNSPECIFIED & Double = js.native
          }
          
          /**
            * Creates a new OpenUrlAction instance using the specified properties.
            * @param [properties] Properties to set
            * @returns OpenUrlAction instance
            */
          /* static member */
          @scala.inline
          def create(): OpenUrlAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[OpenUrlAction]
          @scala.inline
          def create(properties: IOpenUrlAction): OpenUrlAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[OpenUrlAction]
          
          /**
            * Decodes an OpenUrlAction message from the specified reader or buffer.
            * @param reader Reader or buffer to decode from
            * @param [length] Message length if known beforehand
            * @returns OpenUrlAction
            * @throws {Error} If the payload is not a reader or valid buffer
            * @throws {$protobuf.util.ProtocolError} If required fields are missing
            */
          /* static member */
          @scala.inline
          def decode(reader: Reader): OpenUrlAction = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[OpenUrlAction]
          @scala.inline
          def decode(reader: Reader, length: Double): OpenUrlAction = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[OpenUrlAction]
          @scala.inline
          def decode(reader: Uint8Array): OpenUrlAction = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[OpenUrlAction]
          @scala.inline
          def decode(reader: Uint8Array, length: Double): OpenUrlAction = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[OpenUrlAction]
          
          /**
            * Decodes an OpenUrlAction message from the specified reader or buffer, length delimited.
            * @param reader Reader or buffer to decode from
            * @returns OpenUrlAction
            * @throws {Error} If the payload is not a reader or valid buffer
            * @throws {$protobuf.util.ProtocolError} If required fields are missing
            */
          /* static member */
          @scala.inline
          def decodeDelimited(reader: Reader): OpenUrlAction = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[OpenUrlAction]
          @scala.inline
          def decodeDelimited(reader: Uint8Array): OpenUrlAction = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[OpenUrlAction]
          
          /**
            * Encodes the specified OpenUrlAction message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.verify|verify} messages.
            * @param message OpenUrlAction message or plain object to encode
            * @param [writer] Writer to encode to
            * @returns Writer
            */
          /* static member */
          @scala.inline
          def encode(message: IOpenUrlAction): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
          @scala.inline
          def encode(message: IOpenUrlAction, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
          
          /**
            * Encodes the specified OpenUrlAction message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.verify|verify} messages.
            * @param message OpenUrlAction message or plain object to encode
            * @param [writer] Writer to encode to
            * @returns Writer
            */
          /* static member */
          @scala.inline
          def encodeDelimited(message: IOpenUrlAction): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
          @scala.inline
          def encodeDelimited(message: IOpenUrlAction, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
          
          /**
            * Creates an OpenUrlAction message from a plain object. Also converts values to their respective internal types.
            * @param object Plain object
            * @returns OpenUrlAction
            */
          /* static member */
          @scala.inline
          def fromObject(`object`: StringDictionary[js.Any]): OpenUrlAction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[OpenUrlAction]
          
          /**
            * Creates a plain object from an OpenUrlAction message. Also converts values to other types if specified.
            * @param message OpenUrlAction
            * @param [options] Conversion options
            * @returns Plain object
            */
          /* static member */
          @scala.inline
          def toObject(message: OpenUrlAction): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
          @scala.inline
          def toObject(message: OpenUrlAction, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
          
          /**
            * Verifies an OpenUrlAction message.
            * @param message Plain object to verify
            * @returns `null` if valid, otherwise the reason why it is not
            */
          /* static member */
          @scala.inline
          def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
        }
        
        /**
          * Creates a new BrowseCarouselCardItem instance using the specified properties.
          * @param [properties] Properties to set
          * @returns BrowseCarouselCardItem instance
          */
        /* static member */
        @scala.inline
        def create(): BrowseCarouselCardItem = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BrowseCarouselCardItem]
        @scala.inline
        def create(properties: IBrowseCarouselCardItem): BrowseCarouselCardItem = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCardItem]
        
        /**
          * Decodes a BrowseCarouselCardItem message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns BrowseCarouselCardItem
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @scala.inline
        def decode(reader: Reader): BrowseCarouselCardItem = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCardItem]
        @scala.inline
        def decode(reader: Reader, length: Double): BrowseCarouselCardItem = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BrowseCarouselCardItem]
        @scala.inline
        def decode(reader: Uint8Array): BrowseCarouselCardItem = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCardItem]
        @scala.inline
        def decode(reader: Uint8Array, length: Double): BrowseCarouselCardItem = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BrowseCarouselCardItem]
        
        /**
          * Decodes a BrowseCarouselCardItem message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns BrowseCarouselCardItem
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @scala.inline
        def decodeDelimited(reader: Reader): BrowseCarouselCardItem = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCardItem]
        @scala.inline
        def decodeDelimited(reader: Uint8Array): BrowseCarouselCardItem = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCardItem]
        
        /**
          * Encodes the specified BrowseCarouselCardItem message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.verify|verify} messages.
          * @param message BrowseCarouselCardItem message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @scala.inline
        def encode(message: IBrowseCarouselCardItem): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        @scala.inline
        def encode(message: IBrowseCarouselCardItem, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified BrowseCarouselCardItem message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.verify|verify} messages.
          * @param message BrowseCarouselCardItem message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @scala.inline
        def encodeDelimited(message: IBrowseCarouselCardItem): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        @scala.inline
        def encodeDelimited(message: IBrowseCarouselCardItem, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates a BrowseCarouselCardItem message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns BrowseCarouselCardItem
          */
        /* static member */
        @scala.inline
        def fromObject(`object`: StringDictionary[js.Any]): BrowseCarouselCardItem = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCardItem]
        
        /**
          * Creates a plain object from a BrowseCarouselCardItem message. Also converts values to other types if specified.
          * @param message BrowseCarouselCardItem
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @scala.inline
        def toObject(message: BrowseCarouselCardItem): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
        @scala.inline
        def toObject(message: BrowseCarouselCardItem, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
        
        /**
          * Verifies a BrowseCarouselCardItem message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @scala.inline
        def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
        
        /** Properties of an OpenUrlAction. */
        trait IOpenUrlAction extends StObject {
          
          /** OpenUrlAction url */
          var url: js.UndefOr[String | Null] = js.undefined
          
          /** OpenUrlAction urlTypeHint */
          var urlTypeHint: js.UndefOr[
                    UrlTypeHint | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint * / any */ String) | Null
                  ] = js.undefined
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
              value: UrlTypeHint | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint * / any */ String)
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
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions")
      @js.native
      object ImageDisplayOptions extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[ImageDisplayOptions & Double] = js.native
        
        @js.native
        sealed trait BLURRED_BACKGROUND
          extends StObject
             with ImageDisplayOptions
        /* 4 */ val BLURRED_BACKGROUND: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.BLURRED_BACKGROUND & Double = js.native
        
        @js.native
        sealed trait CROPPED
          extends StObject
             with ImageDisplayOptions
        /* 3 */ val CROPPED: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.CROPPED & Double = js.native
        
        @js.native
        sealed trait GRAY
          extends StObject
             with ImageDisplayOptions
        /* 1 */ val GRAY: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.GRAY & Double = js.native
        
        @js.native
        sealed trait IMAGE_DISPLAY_OPTIONS_UNSPECIFIED
          extends StObject
             with ImageDisplayOptions
        /* 0 */ val IMAGE_DISPLAY_OPTIONS_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.IMAGE_DISPLAY_OPTIONS_UNSPECIFIED & Double = js.native
        
        @js.native
        sealed trait WHITE
          extends StObject
             with ImageDisplayOptions
        /* 2 */ val WHITE: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.WHITE & Double = js.native
      }
      
      /**
        * Creates a new BrowseCarouselCard instance using the specified properties.
        * @param [properties] Properties to set
        * @returns BrowseCarouselCard instance
        */
      /* static member */
      @scala.inline
      def create(): BrowseCarouselCard = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BrowseCarouselCard]
      @scala.inline
      def create(properties: IBrowseCarouselCard): BrowseCarouselCard = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCard]
      
      /**
        * Decodes a BrowseCarouselCard message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns BrowseCarouselCard
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): BrowseCarouselCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCard]
      @scala.inline
      def decode(reader: Reader, length: Double): BrowseCarouselCard = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BrowseCarouselCard]
      @scala.inline
      def decode(reader: Uint8Array): BrowseCarouselCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCard]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): BrowseCarouselCard = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BrowseCarouselCard]
      
      /**
        * Decodes a BrowseCarouselCard message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns BrowseCarouselCard
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): BrowseCarouselCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCard]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): BrowseCarouselCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCard]
      
      /**
        * Encodes the specified BrowseCarouselCard message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.verify|verify} messages.
        * @param message BrowseCarouselCard message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: IBrowseCarouselCard): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: IBrowseCarouselCard, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified BrowseCarouselCard message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.verify|verify} messages.
        * @param message BrowseCarouselCard message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: IBrowseCarouselCard): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: IBrowseCarouselCard, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a BrowseCarouselCard message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns BrowseCarouselCard
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): BrowseCarouselCard = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCard]
      
      /**
        * Creates a plain object from a BrowseCarouselCard message. Also converts values to other types if specified.
        * @param message BrowseCarouselCard
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: BrowseCarouselCard): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: BrowseCarouselCard, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a BrowseCarouselCard message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      
      /** Properties of a BrowseCarouselCardItem. */
      trait IBrowseCarouselCardItem extends StObject {
        
        /** BrowseCarouselCardItem description */
        var description: js.UndefOr[String | Null] = js.undefined
        
        /** BrowseCarouselCardItem footer */
        var footer: js.UndefOr[String | Null] = js.undefined
        
        /** BrowseCarouselCardItem image */
        var image: js.UndefOr[IImage | Null] = js.undefined
        
        /** BrowseCarouselCardItem openUriAction */
        var openUriAction: js.UndefOr[IOpenUrlAction | Null] = js.undefined
        
        /** BrowseCarouselCardItem title */
        var title: js.UndefOr[String | Null] = js.undefined
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
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.Card")
    @js.native
    /**
      * Constructs a new Card.
      * @param [properties] Properties to set
      */
    class Card ()
      extends StObject
         with ICard {
      def this(properties: ICard) = this()
      
      /** Card buttons. */
      @JSName("buttons")
      var buttons_Card: js.Array[
            typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Card.IButton
          ] = js.native
      
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
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.Card")
      @js.native
      val ^ : js.Any = js.native
      
      /** Represents a Button. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.Card.Button")
      @js.native
      /**
        * Constructs a new Button.
        * @param [properties] Properties to set
        */
      class Button ()
        extends StObject
           with typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Card.IButton {
        def this(properties: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Card.IButton) = this()
        
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
        
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.Card.Button")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new Button instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Button instance
          */
        /* static member */
        @scala.inline
        def create(): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Button]
        @scala.inline
        def create(properties: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Card.IButton): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Button]
        
        /**
          * Decodes a Button message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Button
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @scala.inline
        def decode(reader: Reader): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Button]
        @scala.inline
        def decode(reader: Reader, length: Double): Button = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Button]
        @scala.inline
        def decode(reader: Uint8Array): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Button]
        @scala.inline
        def decode(reader: Uint8Array, length: Double): Button = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Button]
        
        /**
          * Decodes a Button message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Button
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @scala.inline
        def decodeDelimited(reader: Reader): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Button]
        @scala.inline
        def decodeDelimited(reader: Uint8Array): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Button]
        
        /**
          * Encodes the specified Button message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.Card.Button.verify|verify} messages.
          * @param message Button message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @scala.inline
        def encode(message: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Card.IButton): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        @scala.inline
        def encode(
          message: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Card.IButton,
          writer: Writer
        ): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified Button message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.Card.Button.verify|verify} messages.
          * @param message Button message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @scala.inline
        def encodeDelimited(message: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Card.IButton): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        @scala.inline
        def encodeDelimited(
          message: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Card.IButton,
          writer: Writer
        ): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates a Button message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Button
          */
        /* static member */
        @scala.inline
        def fromObject(`object`: StringDictionary[js.Any]): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Button]
        
        /**
          * Creates a plain object from a Button message. Also converts values to other types if specified.
          * @param message Button
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @scala.inline
        def toObject(message: Button): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
        @scala.inline
        def toObject(message: Button, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
        
        /**
          * Verifies a Button message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @scala.inline
        def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      /**
        * Creates a new Card instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Card instance
        */
      /* static member */
      @scala.inline
      def create(): Card = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Card]
      @scala.inline
      def create(properties: ICard): Card = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Card]
      
      /**
        * Decodes a Card message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Card
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): Card = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Card]
      @scala.inline
      def decode(reader: Reader, length: Double): Card = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Card]
      @scala.inline
      def decode(reader: Uint8Array): Card = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Card]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): Card = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Card]
      
      /**
        * Decodes a Card message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Card
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): Card = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Card]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): Card = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Card]
      
      /**
        * Encodes the specified Card message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.Card.verify|verify} messages.
        * @param message Card message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: ICard): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: ICard, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Card message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.Card.verify|verify} messages.
        * @param message Card message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: ICard): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: ICard, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a Card message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Card
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): Card = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Card]
      
      /**
        * Creates a plain object from a Card message. Also converts values to other types if specified.
        * @param message Card
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: Card): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: Card, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a Card message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      
      /** Properties of a Button. */
      trait IButton extends StObject {
        
        /** Button postback */
        var postback: js.UndefOr[String | Null] = js.undefined
        
        /** Button text */
        var text: js.UndefOr[String | Null] = js.undefined
      }
      object IButton {
        
        @scala.inline
        def apply(): typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Card.IButton = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Card.IButton]
        }
        
        @scala.inline
        implicit class IButtonMutableBuilder[Self <: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Card.IButton] (val x: Self) extends AnyVal {
          
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
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect")
    @js.native
    /**
      * Constructs a new CarouselSelect.
      * @param [properties] Properties to set
      */
    class CarouselSelect ()
      extends StObject
         with ICarouselSelect {
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
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect")
      @js.native
      val ^ : js.Any = js.native
      
      /** Represents an Item. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect.Item")
      @js.native
      /**
        * Constructs a new Item.
        * @param [properties] Properties to set
        */
      class Item ()
        extends StObject
           with IItem {
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
        
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect.Item")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new Item instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Item instance
          */
        /* static member */
        @scala.inline
        def create(): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Item]
        @scala.inline
        def create(properties: IItem): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Item]
        
        /**
          * Decodes an Item message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Item
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @scala.inline
        def decode(reader: Reader): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Item]
        @scala.inline
        def decode(reader: Reader, length: Double): Item = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Item]
        @scala.inline
        def decode(reader: Uint8Array): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Item]
        @scala.inline
        def decode(reader: Uint8Array, length: Double): Item = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Item]
        
        /**
          * Decodes an Item message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Item
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @scala.inline
        def decodeDelimited(reader: Reader): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Item]
        @scala.inline
        def decodeDelimited(reader: Uint8Array): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Item]
        
        /**
          * Encodes the specified Item message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect.Item.verify|verify} messages.
          * @param message Item message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @scala.inline
        def encode(message: IItem): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        @scala.inline
        def encode(message: IItem, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified Item message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect.Item.verify|verify} messages.
          * @param message Item message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @scala.inline
        def encodeDelimited(message: IItem): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        @scala.inline
        def encodeDelimited(message: IItem, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates an Item message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Item
          */
        /* static member */
        @scala.inline
        def fromObject(`object`: StringDictionary[js.Any]): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Item]
        
        /**
          * Creates a plain object from an Item message. Also converts values to other types if specified.
          * @param message Item
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @scala.inline
        def toObject(message: Item): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
        @scala.inline
        def toObject(message: Item, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
        
        /**
          * Verifies an Item message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @scala.inline
        def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      /**
        * Creates a new CarouselSelect instance using the specified properties.
        * @param [properties] Properties to set
        * @returns CarouselSelect instance
        */
      /* static member */
      @scala.inline
      def create(): CarouselSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CarouselSelect]
      @scala.inline
      def create(properties: ICarouselSelect): CarouselSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CarouselSelect]
      
      /**
        * Decodes a CarouselSelect message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns CarouselSelect
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): CarouselSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CarouselSelect]
      @scala.inline
      def decode(reader: Reader, length: Double): CarouselSelect = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CarouselSelect]
      @scala.inline
      def decode(reader: Uint8Array): CarouselSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CarouselSelect]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): CarouselSelect = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CarouselSelect]
      
      /**
        * Decodes a CarouselSelect message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns CarouselSelect
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): CarouselSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CarouselSelect]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): CarouselSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CarouselSelect]
      
      /**
        * Encodes the specified CarouselSelect message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect.verify|verify} messages.
        * @param message CarouselSelect message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: ICarouselSelect): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: ICarouselSelect, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified CarouselSelect message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect.verify|verify} messages.
        * @param message CarouselSelect message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: ICarouselSelect): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: ICarouselSelect, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a CarouselSelect message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns CarouselSelect
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): CarouselSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CarouselSelect]
      
      /**
        * Creates a plain object from a CarouselSelect message. Also converts values to other types if specified.
        * @param message CarouselSelect
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: CarouselSelect): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: CarouselSelect, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a CarouselSelect message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      
      /** Properties of an Item. */
      trait IItem extends StObject {
        
        /** Item description */
        var description: js.UndefOr[String | Null] = js.undefined
        
        /** Item image */
        var image: js.UndefOr[IImage | Null] = js.undefined
        
        /** Item info */
        var info: js.UndefOr[ISelectItemInfo | Null] = js.undefined
        
        /** Item title */
        var title: js.UndefOr[String | Null] = js.undefined
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
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.ColumnProperties")
    @js.native
    /**
      * Constructs a new ColumnProperties.
      * @param [properties] Properties to set
      */
    class ColumnProperties ()
      extends StObject
         with IColumnProperties {
      def this(properties: IColumnProperties) = this()
      
      /** ColumnProperties header. */
      @JSName("header")
      var header_ColumnProperties: String = js.native
      
      /** ColumnProperties horizontalAlignment. */
      @JSName("horizontalAlignment")
      var horizontalAlignment_ColumnProperties: HorizontalAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.ColumnProperties.HorizontalAlignment * / any */ String) = js.native
      
      /**
        * Converts this ColumnProperties to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object ColumnProperties {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.ColumnProperties")
      @js.native
      val ^ : js.Any = js.native
      
      @js.native
      sealed trait HorizontalAlignment extends StObject
      /** HorizontalAlignment enum. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.ColumnProperties.HorizontalAlignment")
      @js.native
      object HorizontalAlignment extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[HorizontalAlignment & Double] = js.native
        
        @js.native
        sealed trait CENTER
          extends StObject
             with HorizontalAlignment
        /* 2 */ val CENTER: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ColumnProperties.HorizontalAlignment.CENTER & Double = js.native
        
        @js.native
        sealed trait HORIZONTAL_ALIGNMENT_UNSPECIFIED
          extends StObject
             with HorizontalAlignment
        /* 0 */ val HORIZONTAL_ALIGNMENT_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ColumnProperties.HorizontalAlignment.HORIZONTAL_ALIGNMENT_UNSPECIFIED & Double = js.native
        
        @js.native
        sealed trait LEADING
          extends StObject
             with HorizontalAlignment
        /* 1 */ val LEADING: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ColumnProperties.HorizontalAlignment.LEADING & Double = js.native
        
        @js.native
        sealed trait TRAILING
          extends StObject
             with HorizontalAlignment
        /* 3 */ val TRAILING: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ColumnProperties.HorizontalAlignment.TRAILING & Double = js.native
      }
      
      /**
        * Creates a new ColumnProperties instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ColumnProperties instance
        */
      /* static member */
      @scala.inline
      def create(): ColumnProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ColumnProperties]
      @scala.inline
      def create(properties: IColumnProperties): ColumnProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ColumnProperties]
      
      /**
        * Decodes a ColumnProperties message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ColumnProperties
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): ColumnProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ColumnProperties]
      @scala.inline
      def decode(reader: Reader, length: Double): ColumnProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ColumnProperties]
      @scala.inline
      def decode(reader: Uint8Array): ColumnProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ColumnProperties]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): ColumnProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ColumnProperties]
      
      /**
        * Decodes a ColumnProperties message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ColumnProperties
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): ColumnProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ColumnProperties]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): ColumnProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ColumnProperties]
      
      /**
        * Encodes the specified ColumnProperties message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.ColumnProperties.verify|verify} messages.
        * @param message ColumnProperties message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: IColumnProperties): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: IColumnProperties, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified ColumnProperties message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.ColumnProperties.verify|verify} messages.
        * @param message ColumnProperties message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: IColumnProperties): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: IColumnProperties, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a ColumnProperties message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ColumnProperties
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): ColumnProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ColumnProperties]
      
      /**
        * Creates a plain object from a ColumnProperties message. Also converts values to other types if specified.
        * @param message ColumnProperties
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: ColumnProperties): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: ColumnProperties, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a ColumnProperties message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents an Image. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.Image")
    @js.native
    /**
      * Constructs a new Image.
      * @param [properties] Properties to set
      */
    class Image ()
      extends StObject
         with IImage {
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
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.Image")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Image instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Image instance
        */
      /* static member */
      @scala.inline
      def create(): Image = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Image]
      @scala.inline
      def create(properties: IImage): Image = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Image]
      
      /**
        * Decodes an Image message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Image
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): Image = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Image]
      @scala.inline
      def decode(reader: Reader, length: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Image]
      @scala.inline
      def decode(reader: Uint8Array): Image = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Image]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Image]
      
      /**
        * Decodes an Image message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Image
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): Image = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Image]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): Image = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Image]
      
      /**
        * Encodes the specified Image message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.Image.verify|verify} messages.
        * @param message Image message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: IImage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: IImage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Image message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.Image.verify|verify} messages.
        * @param message Image message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: IImage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: IImage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates an Image message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Image
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): Image = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Image]
      
      /**
        * Creates a plain object from an Image message. Also converts values to other types if specified.
        * @param message Image
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: Image): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: Image, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies an Image message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a LinkOutSuggestion. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.LinkOutSuggestion")
    @js.native
    /**
      * Constructs a new LinkOutSuggestion.
      * @param [properties] Properties to set
      */
    class LinkOutSuggestion ()
      extends StObject
         with ILinkOutSuggestion {
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
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.LinkOutSuggestion")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new LinkOutSuggestion instance using the specified properties.
        * @param [properties] Properties to set
        * @returns LinkOutSuggestion instance
        */
      /* static member */
      @scala.inline
      def create(): LinkOutSuggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[LinkOutSuggestion]
      @scala.inline
      def create(properties: ILinkOutSuggestion): LinkOutSuggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[LinkOutSuggestion]
      
      /**
        * Decodes a LinkOutSuggestion message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns LinkOutSuggestion
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): LinkOutSuggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[LinkOutSuggestion]
      @scala.inline
      def decode(reader: Reader, length: Double): LinkOutSuggestion = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[LinkOutSuggestion]
      @scala.inline
      def decode(reader: Uint8Array): LinkOutSuggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[LinkOutSuggestion]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): LinkOutSuggestion = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[LinkOutSuggestion]
      
      /**
        * Decodes a LinkOutSuggestion message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns LinkOutSuggestion
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): LinkOutSuggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[LinkOutSuggestion]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): LinkOutSuggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[LinkOutSuggestion]
      
      /**
        * Encodes the specified LinkOutSuggestion message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.LinkOutSuggestion.verify|verify} messages.
        * @param message LinkOutSuggestion message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: ILinkOutSuggestion): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: ILinkOutSuggestion, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified LinkOutSuggestion message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.LinkOutSuggestion.verify|verify} messages.
        * @param message LinkOutSuggestion message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: ILinkOutSuggestion): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: ILinkOutSuggestion, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a LinkOutSuggestion message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns LinkOutSuggestion
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): LinkOutSuggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[LinkOutSuggestion]
      
      /**
        * Creates a plain object from a LinkOutSuggestion message. Also converts values to other types if specified.
        * @param message LinkOutSuggestion
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: LinkOutSuggestion): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: LinkOutSuggestion, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a LinkOutSuggestion message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a ListSelect. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.ListSelect")
    @js.native
    /**
      * Constructs a new ListSelect.
      * @param [properties] Properties to set
      */
    class ListSelect ()
      extends StObject
         with IListSelect {
      def this(properties: IListSelect) = this()
      
      /** ListSelect items. */
      @JSName("items")
      var items_ListSelect: js.Array[
            typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ListSelect.IItem
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
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.ListSelect")
      @js.native
      val ^ : js.Any = js.native
      
      /** Represents an Item. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.ListSelect.Item")
      @js.native
      /**
        * Constructs a new Item.
        * @param [properties] Properties to set
        */
      class Item ()
        extends StObject
           with typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ListSelect.IItem {
        def this(properties: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ListSelect.IItem) = this()
        
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
        
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.ListSelect.Item")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new Item instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Item instance
          */
        /* static member */
        @scala.inline
        def create(): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Item]
        @scala.inline
        def create(properties: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ListSelect.IItem): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Item]
        
        /**
          * Decodes an Item message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Item
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @scala.inline
        def decode(reader: Reader): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Item]
        @scala.inline
        def decode(reader: Reader, length: Double): Item = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Item]
        @scala.inline
        def decode(reader: Uint8Array): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Item]
        @scala.inline
        def decode(reader: Uint8Array, length: Double): Item = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Item]
        
        /**
          * Decodes an Item message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Item
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @scala.inline
        def decodeDelimited(reader: Reader): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Item]
        @scala.inline
        def decodeDelimited(reader: Uint8Array): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Item]
        
        /**
          * Encodes the specified Item message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.ListSelect.Item.verify|verify} messages.
          * @param message Item message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @scala.inline
        def encode(message: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ListSelect.IItem): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        @scala.inline
        def encode(
          message: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ListSelect.IItem,
          writer: Writer
        ): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified Item message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.ListSelect.Item.verify|verify} messages.
          * @param message Item message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @scala.inline
        def encodeDelimited(message: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ListSelect.IItem): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        @scala.inline
        def encodeDelimited(
          message: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ListSelect.IItem,
          writer: Writer
        ): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates an Item message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Item
          */
        /* static member */
        @scala.inline
        def fromObject(`object`: StringDictionary[js.Any]): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Item]
        
        /**
          * Creates a plain object from an Item message. Also converts values to other types if specified.
          * @param message Item
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @scala.inline
        def toObject(message: Item): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
        @scala.inline
        def toObject(message: Item, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
        
        /**
          * Verifies an Item message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @scala.inline
        def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      /**
        * Creates a new ListSelect instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ListSelect instance
        */
      /* static member */
      @scala.inline
      def create(): ListSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListSelect]
      @scala.inline
      def create(properties: IListSelect): ListSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListSelect]
      
      /**
        * Decodes a ListSelect message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ListSelect
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): ListSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSelect]
      @scala.inline
      def decode(reader: Reader, length: Double): ListSelect = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListSelect]
      @scala.inline
      def decode(reader: Uint8Array): ListSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSelect]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): ListSelect = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListSelect]
      
      /**
        * Decodes a ListSelect message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ListSelect
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): ListSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSelect]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): ListSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSelect]
      
      /**
        * Encodes the specified ListSelect message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.ListSelect.verify|verify} messages.
        * @param message ListSelect message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: IListSelect): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: IListSelect, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified ListSelect message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.ListSelect.verify|verify} messages.
        * @param message ListSelect message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: IListSelect): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: IListSelect, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a ListSelect message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ListSelect
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): ListSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListSelect]
      
      /**
        * Creates a plain object from a ListSelect message. Also converts values to other types if specified.
        * @param message ListSelect
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: ListSelect): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: ListSelect, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a ListSelect message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      
      /** Properties of an Item. */
      trait IItem extends StObject {
        
        /** Item description */
        var description: js.UndefOr[String | Null] = js.undefined
        
        /** Item image */
        var image: js.UndefOr[IImage | Null] = js.undefined
        
        /** Item info */
        var info: js.UndefOr[ISelectItemInfo | Null] = js.undefined
        
        /** Item title */
        var title: js.UndefOr[String | Null] = js.undefined
      }
      object IItem {
        
        @scala.inline
        def apply(): typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ListSelect.IItem = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ListSelect.IItem]
        }
        
        @scala.inline
        implicit class IItemMutableBuilder[Self <: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ListSelect.IItem] (val x: Self) extends AnyVal {
          
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
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent")
    @js.native
    /**
      * Constructs a new MediaContent.
      * @param [properties] Properties to set
      */
    class MediaContent ()
      extends StObject
         with IMediaContent {
      def this(properties: IMediaContent) = this()
      
      /** MediaContent mediaObjects. */
      @JSName("mediaObjects")
      var mediaObjects_MediaContent: js.Array[IResponseMediaObject] = js.native
      
      /** MediaContent mediaType. */
      @JSName("mediaType")
      var mediaType_MediaContent: ResponseMediaType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.ResponseMediaType * / any */ String) = js.native
      
      /**
        * Converts this MediaContent to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object MediaContent {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent")
      @js.native
      val ^ : js.Any = js.native
      
      /** Represents a ResponseMediaObject. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.ResponseMediaObject")
      @js.native
      /**
        * Constructs a new ResponseMediaObject.
        * @param [properties] Properties to set
        */
      class ResponseMediaObject ()
        extends StObject
           with IResponseMediaObject {
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
        
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.ResponseMediaObject")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new ResponseMediaObject instance using the specified properties.
          * @param [properties] Properties to set
          * @returns ResponseMediaObject instance
          */
        /* static member */
        @scala.inline
        def create(): ResponseMediaObject = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ResponseMediaObject]
        @scala.inline
        def create(properties: IResponseMediaObject): ResponseMediaObject = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ResponseMediaObject]
        
        /**
          * Decodes a ResponseMediaObject message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns ResponseMediaObject
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @scala.inline
        def decode(reader: Reader): ResponseMediaObject = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ResponseMediaObject]
        @scala.inline
        def decode(reader: Reader, length: Double): ResponseMediaObject = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ResponseMediaObject]
        @scala.inline
        def decode(reader: Uint8Array): ResponseMediaObject = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ResponseMediaObject]
        @scala.inline
        def decode(reader: Uint8Array, length: Double): ResponseMediaObject = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ResponseMediaObject]
        
        /**
          * Decodes a ResponseMediaObject message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns ResponseMediaObject
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @scala.inline
        def decodeDelimited(reader: Reader): ResponseMediaObject = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ResponseMediaObject]
        @scala.inline
        def decodeDelimited(reader: Uint8Array): ResponseMediaObject = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ResponseMediaObject]
        
        /**
          * Encodes the specified ResponseMediaObject message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.ResponseMediaObject.verify|verify} messages.
          * @param message ResponseMediaObject message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @scala.inline
        def encode(message: IResponseMediaObject): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        @scala.inline
        def encode(message: IResponseMediaObject, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified ResponseMediaObject message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.ResponseMediaObject.verify|verify} messages.
          * @param message ResponseMediaObject message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @scala.inline
        def encodeDelimited(message: IResponseMediaObject): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        @scala.inline
        def encodeDelimited(message: IResponseMediaObject, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates a ResponseMediaObject message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns ResponseMediaObject
          */
        /* static member */
        @scala.inline
        def fromObject(`object`: StringDictionary[js.Any]): ResponseMediaObject = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ResponseMediaObject]
        
        /**
          * Creates a plain object from a ResponseMediaObject message. Also converts values to other types if specified.
          * @param message ResponseMediaObject
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @scala.inline
        def toObject(message: ResponseMediaObject): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
        @scala.inline
        def toObject(message: ResponseMediaObject, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
        
        /**
          * Verifies a ResponseMediaObject message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @scala.inline
        def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      @js.native
      sealed trait ResponseMediaType extends StObject
      /** ResponseMediaType enum. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.ResponseMediaType")
      @js.native
      object ResponseMediaType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[ResponseMediaType & Double] = js.native
        
        @js.native
        sealed trait AUDIO
          extends StObject
             with ResponseMediaType
        /* 1 */ val AUDIO: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.ResponseMediaType.AUDIO & Double = js.native
        
        @js.native
        sealed trait RESPONSE_MEDIA_TYPE_UNSPECIFIED
          extends StObject
             with ResponseMediaType
        /* 0 */ val RESPONSE_MEDIA_TYPE_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.ResponseMediaType.RESPONSE_MEDIA_TYPE_UNSPECIFIED & Double = js.native
      }
      
      /**
        * Creates a new MediaContent instance using the specified properties.
        * @param [properties] Properties to set
        * @returns MediaContent instance
        */
      /* static member */
      @scala.inline
      def create(): MediaContent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[MediaContent]
      @scala.inline
      def create(properties: IMediaContent): MediaContent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[MediaContent]
      
      /**
        * Decodes a MediaContent message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns MediaContent
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): MediaContent = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[MediaContent]
      @scala.inline
      def decode(reader: Reader, length: Double): MediaContent = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[MediaContent]
      @scala.inline
      def decode(reader: Uint8Array): MediaContent = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[MediaContent]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): MediaContent = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[MediaContent]
      
      /**
        * Decodes a MediaContent message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns MediaContent
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): MediaContent = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[MediaContent]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): MediaContent = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[MediaContent]
      
      /**
        * Encodes the specified MediaContent message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.verify|verify} messages.
        * @param message MediaContent message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: IMediaContent): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: IMediaContent, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified MediaContent message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.verify|verify} messages.
        * @param message MediaContent message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: IMediaContent): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: IMediaContent, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a MediaContent message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns MediaContent
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): MediaContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[MediaContent]
      
      /**
        * Creates a plain object from a MediaContent message. Also converts values to other types if specified.
        * @param message MediaContent
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: MediaContent): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: MediaContent, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a MediaContent message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      
      /** Properties of a ResponseMediaObject. */
      trait IResponseMediaObject extends StObject {
        
        /** ResponseMediaObject contentUrl */
        var contentUrl: js.UndefOr[String | Null] = js.undefined
        
        /** ResponseMediaObject description */
        var description: js.UndefOr[String | Null] = js.undefined
        
        /** ResponseMediaObject icon */
        var icon: js.UndefOr[IImage | Null] = js.undefined
        
        /** ResponseMediaObject largeImage */
        var largeImage: js.UndefOr[IImage | Null] = js.undefined
        
        /** ResponseMediaObject name */
        var name: js.UndefOr[String | Null] = js.undefined
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
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.Platform")
    @js.native
    object Platform extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Platform & Double] = js.native
      
      @js.native
      sealed trait ACTIONS_ON_GOOGLE
        extends StObject
           with Platform
      /* 8 */ val ACTIONS_ON_GOOGLE: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform.ACTIONS_ON_GOOGLE & Double = js.native
      
      @js.native
      sealed trait FACEBOOK
        extends StObject
           with Platform
      /* 1 */ val FACEBOOK: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform.FACEBOOK & Double = js.native
      
      @js.native
      sealed trait GOOGLE_HANGOUTS
        extends StObject
           with Platform
      /* 11 */ val GOOGLE_HANGOUTS: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform.GOOGLE_HANGOUTS & Double = js.native
      
      @js.native
      sealed trait KIK
        extends StObject
           with Platform
      /* 4 */ val KIK: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform.KIK & Double = js.native
      
      @js.native
      sealed trait LINE
        extends StObject
           with Platform
      /* 6 */ val LINE: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform.LINE & Double = js.native
      
      @js.native
      sealed trait PLATFORM_UNSPECIFIED
        extends StObject
           with Platform
      /* 0 */ val PLATFORM_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform.PLATFORM_UNSPECIFIED & Double = js.native
      
      @js.native
      sealed trait SKYPE
        extends StObject
           with Platform
      /* 5 */ val SKYPE: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform.SKYPE & Double = js.native
      
      @js.native
      sealed trait SLACK
        extends StObject
           with Platform
      /* 2 */ val SLACK: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform.SLACK & Double = js.native
      
      @js.native
      sealed trait TELEGRAM
        extends StObject
           with Platform
      /* 3 */ val TELEGRAM: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform.TELEGRAM & Double = js.native
      
      @js.native
      sealed trait TELEPHONY
        extends StObject
           with Platform
      /* 10 */ val TELEPHONY: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform.TELEPHONY & Double = js.native
      
      @js.native
      sealed trait VIBER
        extends StObject
           with Platform
      /* 7 */ val VIBER: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform.VIBER & Double = js.native
    }
    
    /** Represents a QuickReplies. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.QuickReplies")
    @js.native
    /**
      * Constructs a new QuickReplies.
      * @param [properties] Properties to set
      */
    class QuickReplies ()
      extends StObject
         with IQuickReplies {
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
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.QuickReplies")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new QuickReplies instance using the specified properties.
        * @param [properties] Properties to set
        * @returns QuickReplies instance
        */
      /* static member */
      @scala.inline
      def create(): QuickReplies = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[QuickReplies]
      @scala.inline
      def create(properties: IQuickReplies): QuickReplies = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[QuickReplies]
      
      /**
        * Decodes a QuickReplies message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns QuickReplies
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): QuickReplies = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[QuickReplies]
      @scala.inline
      def decode(reader: Reader, length: Double): QuickReplies = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[QuickReplies]
      @scala.inline
      def decode(reader: Uint8Array): QuickReplies = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[QuickReplies]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): QuickReplies = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[QuickReplies]
      
      /**
        * Decodes a QuickReplies message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns QuickReplies
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): QuickReplies = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[QuickReplies]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): QuickReplies = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[QuickReplies]
      
      /**
        * Encodes the specified QuickReplies message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.QuickReplies.verify|verify} messages.
        * @param message QuickReplies message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: IQuickReplies): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: IQuickReplies, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified QuickReplies message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.QuickReplies.verify|verify} messages.
        * @param message QuickReplies message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: IQuickReplies): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: IQuickReplies, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a QuickReplies message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns QuickReplies
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): QuickReplies = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[QuickReplies]
      
      /**
        * Creates a plain object from a QuickReplies message. Also converts values to other types if specified.
        * @param message QuickReplies
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: QuickReplies): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: QuickReplies, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a QuickReplies message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a RbmCardContent. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent")
    @js.native
    /**
      * Constructs a new RbmCardContent.
      * @param [properties] Properties to set
      */
    class RbmCardContent ()
      extends StObject
         with IRbmCardContent {
      def this(properties: IRbmCardContent) = this()
      
      /** RbmCardContent description. */
      @JSName("description")
      var description_RbmCardContent: String = js.native
      
      /** RbmCardContent suggestions. */
      @JSName("suggestions")
      var suggestions_RbmCardContent: js.Array[IRbmSuggestion] = js.native
      
      /** RbmCardContent title. */
      @JSName("title")
      var title_RbmCardContent: String = js.native
      
      /**
        * Converts this RbmCardContent to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object RbmCardContent {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent")
      @js.native
      val ^ : js.Any = js.native
      
      /** Represents a RbmMedia. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia")
      @js.native
      /**
        * Constructs a new RbmMedia.
        * @param [properties] Properties to set
        */
      class RbmMedia ()
        extends StObject
           with IRbmMedia {
        def this(properties: IRbmMedia) = this()
        
        /** RbmMedia fileUri. */
        @JSName("fileUri")
        var fileUri_RbmMedia: String = js.native
        
        /** RbmMedia height. */
        @JSName("height")
        var height_RbmMedia: Height | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia.Height * / any */ String) = js.native
        
        /** RbmMedia thumbnailUri. */
        @JSName("thumbnailUri")
        var thumbnailUri_RbmMedia: String = js.native
        
        /**
          * Converts this RbmMedia to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[js.Any] = js.native
      }
      object RbmMedia {
        
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia")
        @js.native
        val ^ : js.Any = js.native
        
        @js.native
        sealed trait Height extends StObject
        /** Height enum. */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia.Height")
        @js.native
        object Height extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[Height & Double] = js.native
          
          @js.native
          sealed trait HEIGHT_UNSPECIFIED
            extends StObject
               with Height
          /* 0 */ val HEIGHT_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia.Height.HEIGHT_UNSPECIFIED & Double = js.native
          
          @js.native
          sealed trait MEDIUM
            extends StObject
               with Height
          /* 2 */ val MEDIUM: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia.Height.MEDIUM & Double = js.native
          
          @js.native
          sealed trait SHORT
            extends StObject
               with Height
          /* 1 */ val SHORT: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia.Height.SHORT & Double = js.native
          
          @js.native
          sealed trait TALL
            extends StObject
               with Height
          /* 3 */ val TALL: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia.Height.TALL & Double = js.native
        }
        
        /**
          * Creates a new RbmMedia instance using the specified properties.
          * @param [properties] Properties to set
          * @returns RbmMedia instance
          */
        /* static member */
        @scala.inline
        def create(): RbmMedia = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[RbmMedia]
        @scala.inline
        def create(properties: IRbmMedia): RbmMedia = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[RbmMedia]
        
        /**
          * Decodes a RbmMedia message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns RbmMedia
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @scala.inline
        def decode(reader: Reader): RbmMedia = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmMedia]
        @scala.inline
        def decode(reader: Reader, length: Double): RbmMedia = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RbmMedia]
        @scala.inline
        def decode(reader: Uint8Array): RbmMedia = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmMedia]
        @scala.inline
        def decode(reader: Uint8Array, length: Double): RbmMedia = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RbmMedia]
        
        /**
          * Decodes a RbmMedia message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns RbmMedia
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @scala.inline
        def decodeDelimited(reader: Reader): RbmMedia = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmMedia]
        @scala.inline
        def decodeDelimited(reader: Uint8Array): RbmMedia = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmMedia]
        
        /**
          * Encodes the specified RbmMedia message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia.verify|verify} messages.
          * @param message RbmMedia message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @scala.inline
        def encode(message: IRbmMedia): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        @scala.inline
        def encode(message: IRbmMedia, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified RbmMedia message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia.verify|verify} messages.
          * @param message RbmMedia message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @scala.inline
        def encodeDelimited(message: IRbmMedia): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        @scala.inline
        def encodeDelimited(message: IRbmMedia, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates a RbmMedia message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns RbmMedia
          */
        /* static member */
        @scala.inline
        def fromObject(`object`: StringDictionary[js.Any]): RbmMedia = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[RbmMedia]
        
        /**
          * Creates a plain object from a RbmMedia message. Also converts values to other types if specified.
          * @param message RbmMedia
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @scala.inline
        def toObject(message: RbmMedia): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
        @scala.inline
        def toObject(message: RbmMedia, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
        
        /**
          * Verifies a RbmMedia message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @scala.inline
        def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      /**
        * Creates a new RbmCardContent instance using the specified properties.
        * @param [properties] Properties to set
        * @returns RbmCardContent instance
        */
      /* static member */
      @scala.inline
      def create(): RbmCardContent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[RbmCardContent]
      @scala.inline
      def create(properties: IRbmCardContent): RbmCardContent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[RbmCardContent]
      
      /**
        * Decodes a RbmCardContent message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns RbmCardContent
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): RbmCardContent = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmCardContent]
      @scala.inline
      def decode(reader: Reader, length: Double): RbmCardContent = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RbmCardContent]
      @scala.inline
      def decode(reader: Uint8Array): RbmCardContent = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmCardContent]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): RbmCardContent = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RbmCardContent]
      
      /**
        * Decodes a RbmCardContent message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns RbmCardContent
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): RbmCardContent = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmCardContent]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): RbmCardContent = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmCardContent]
      
      /**
        * Encodes the specified RbmCardContent message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.verify|verify} messages.
        * @param message RbmCardContent message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: IRbmCardContent): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: IRbmCardContent, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified RbmCardContent message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.verify|verify} messages.
        * @param message RbmCardContent message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: IRbmCardContent): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: IRbmCardContent, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a RbmCardContent message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns RbmCardContent
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): RbmCardContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[RbmCardContent]
      
      /**
        * Creates a plain object from a RbmCardContent message. Also converts values to other types if specified.
        * @param message RbmCardContent
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: RbmCardContent): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: RbmCardContent, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a RbmCardContent message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      
      /** Properties of a RbmMedia. */
      trait IRbmMedia extends StObject {
        
        /** RbmMedia fileUri */
        var fileUri: js.UndefOr[String | Null] = js.undefined
        
        /** RbmMedia height */
        var height: js.UndefOr[
                Height | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia.Height * / any */ String) | Null
              ] = js.undefined
        
        /** RbmMedia thumbnailUri */
        var thumbnailUri: js.UndefOr[String | Null] = js.undefined
      }
      object IRbmMedia {
        
        @scala.inline
        def apply(): IRbmMedia = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IRbmMedia]
        }
        
        @scala.inline
        implicit class IRbmMediaMutableBuilder[Self <: IRbmMedia] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setFileUri(value: String): Self = StObject.set(x, "fileUri", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFileUriNull: Self = StObject.set(x, "fileUri", null)
          
          @scala.inline
          def setFileUriUndefined: Self = StObject.set(x, "fileUri", js.undefined)
          
          @scala.inline
          def setHeight(
            value: Height | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia.Height * / any */ String)
          ): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHeightNull: Self = StObject.set(x, "height", null)
          
          @scala.inline
          def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
          
          @scala.inline
          def setThumbnailUri(value: String): Self = StObject.set(x, "thumbnailUri", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setThumbnailUriNull: Self = StObject.set(x, "thumbnailUri", null)
          
          @scala.inline
          def setThumbnailUriUndefined: Self = StObject.set(x, "thumbnailUri", js.undefined)
        }
      }
    }
    
    /** Represents a RbmCarouselCard. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmCarouselCard")
    @js.native
    /**
      * Constructs a new RbmCarouselCard.
      * @param [properties] Properties to set
      */
    class RbmCarouselCard ()
      extends StObject
         with IRbmCarouselCard {
      def this(properties: IRbmCarouselCard) = this()
      
      /** RbmCarouselCard cardContents. */
      @JSName("cardContents")
      var cardContents_RbmCarouselCard: js.Array[IRbmCardContent] = js.native
      
      /** RbmCarouselCard cardWidth. */
      @JSName("cardWidth")
      var cardWidth_RbmCarouselCard: CardWidth | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.RbmCarouselCard.CardWidth * / any */ String) = js.native
      
      /**
        * Converts this RbmCarouselCard to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object RbmCarouselCard {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmCarouselCard")
      @js.native
      val ^ : js.Any = js.native
      
      @js.native
      sealed trait CardWidth extends StObject
      /** CardWidth enum. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmCarouselCard.CardWidth")
      @js.native
      object CardWidth extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[CardWidth & Double] = js.native
        
        @js.native
        sealed trait CARD_WIDTH_UNSPECIFIED
          extends StObject
             with CardWidth
        /* 0 */ val CARD_WIDTH_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCarouselCard.CardWidth.CARD_WIDTH_UNSPECIFIED & Double = js.native
        
        @js.native
        sealed trait MEDIUM
          extends StObject
             with CardWidth
        /* 2 */ val MEDIUM: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCarouselCard.CardWidth.MEDIUM & Double = js.native
        
        @js.native
        sealed trait SMALL
          extends StObject
             with CardWidth
        /* 1 */ val SMALL: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCarouselCard.CardWidth.SMALL & Double = js.native
      }
      
      /**
        * Creates a new RbmCarouselCard instance using the specified properties.
        * @param [properties] Properties to set
        * @returns RbmCarouselCard instance
        */
      /* static member */
      @scala.inline
      def create(): RbmCarouselCard = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[RbmCarouselCard]
      @scala.inline
      def create(properties: IRbmCarouselCard): RbmCarouselCard = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[RbmCarouselCard]
      
      /**
        * Decodes a RbmCarouselCard message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns RbmCarouselCard
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): RbmCarouselCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmCarouselCard]
      @scala.inline
      def decode(reader: Reader, length: Double): RbmCarouselCard = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RbmCarouselCard]
      @scala.inline
      def decode(reader: Uint8Array): RbmCarouselCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmCarouselCard]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): RbmCarouselCard = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RbmCarouselCard]
      
      /**
        * Decodes a RbmCarouselCard message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns RbmCarouselCard
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): RbmCarouselCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmCarouselCard]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): RbmCarouselCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmCarouselCard]
      
      /**
        * Encodes the specified RbmCarouselCard message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmCarouselCard.verify|verify} messages.
        * @param message RbmCarouselCard message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: IRbmCarouselCard): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: IRbmCarouselCard, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified RbmCarouselCard message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmCarouselCard.verify|verify} messages.
        * @param message RbmCarouselCard message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: IRbmCarouselCard): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: IRbmCarouselCard, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a RbmCarouselCard message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns RbmCarouselCard
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): RbmCarouselCard = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[RbmCarouselCard]
      
      /**
        * Creates a plain object from a RbmCarouselCard message. Also converts values to other types if specified.
        * @param message RbmCarouselCard
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: RbmCarouselCard): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: RbmCarouselCard, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a RbmCarouselCard message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a RbmStandaloneCard. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard")
    @js.native
    /**
      * Constructs a new RbmStandaloneCard.
      * @param [properties] Properties to set
      */
    class RbmStandaloneCard ()
      extends StObject
         with IRbmStandaloneCard {
      def this(properties: IRbmStandaloneCard) = this()
      
      /** RbmStandaloneCard cardOrientation. */
      @JSName("cardOrientation")
      var cardOrientation_RbmStandaloneCard: CardOrientation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.CardOrientation * / any */ String) = js.native
      
      /** RbmStandaloneCard thumbnailImageAlignment. */
      @JSName("thumbnailImageAlignment")
      var thumbnailImageAlignment_RbmStandaloneCard: ThumbnailImageAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.ThumbnailImageAlignment * / any */ String) = js.native
      
      /**
        * Converts this RbmStandaloneCard to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object RbmStandaloneCard {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard")
      @js.native
      val ^ : js.Any = js.native
      
      @js.native
      sealed trait CardOrientation extends StObject
      /** CardOrientation enum. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.CardOrientation")
      @js.native
      object CardOrientation extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[CardOrientation & Double] = js.native
        
        @js.native
        sealed trait CARD_ORIENTATION_UNSPECIFIED
          extends StObject
             with CardOrientation
        /* 0 */ val CARD_ORIENTATION_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.CardOrientation.CARD_ORIENTATION_UNSPECIFIED & Double = js.native
        
        @js.native
        sealed trait HORIZONTAL
          extends StObject
             with CardOrientation
        /* 1 */ val HORIZONTAL: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.CardOrientation.HORIZONTAL & Double = js.native
        
        @js.native
        sealed trait VERTICAL
          extends StObject
             with CardOrientation
        /* 2 */ val VERTICAL: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.CardOrientation.VERTICAL & Double = js.native
      }
      
      @js.native
      sealed trait ThumbnailImageAlignment extends StObject
      /** ThumbnailImageAlignment enum. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.ThumbnailImageAlignment")
      @js.native
      object ThumbnailImageAlignment extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[ThumbnailImageAlignment & Double] = js.native
        
        @js.native
        sealed trait LEFT
          extends StObject
             with ThumbnailImageAlignment
        /* 1 */ val LEFT: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.ThumbnailImageAlignment.LEFT & Double = js.native
        
        @js.native
        sealed trait RIGHT
          extends StObject
             with ThumbnailImageAlignment
        /* 2 */ val RIGHT: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.ThumbnailImageAlignment.RIGHT & Double = js.native
        
        @js.native
        sealed trait THUMBNAIL_IMAGE_ALIGNMENT_UNSPECIFIED
          extends StObject
             with ThumbnailImageAlignment
        /* 0 */ val THUMBNAIL_IMAGE_ALIGNMENT_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.ThumbnailImageAlignment.THUMBNAIL_IMAGE_ALIGNMENT_UNSPECIFIED & Double = js.native
      }
      
      /**
        * Creates a new RbmStandaloneCard instance using the specified properties.
        * @param [properties] Properties to set
        * @returns RbmStandaloneCard instance
        */
      /* static member */
      @scala.inline
      def create(): RbmStandaloneCard = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[RbmStandaloneCard]
      @scala.inline
      def create(properties: IRbmStandaloneCard): RbmStandaloneCard = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[RbmStandaloneCard]
      
      /**
        * Decodes a RbmStandaloneCard message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns RbmStandaloneCard
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): RbmStandaloneCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmStandaloneCard]
      @scala.inline
      def decode(reader: Reader, length: Double): RbmStandaloneCard = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RbmStandaloneCard]
      @scala.inline
      def decode(reader: Uint8Array): RbmStandaloneCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmStandaloneCard]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): RbmStandaloneCard = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RbmStandaloneCard]
      
      /**
        * Decodes a RbmStandaloneCard message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns RbmStandaloneCard
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): RbmStandaloneCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmStandaloneCard]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): RbmStandaloneCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmStandaloneCard]
      
      /**
        * Encodes the specified RbmStandaloneCard message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.verify|verify} messages.
        * @param message RbmStandaloneCard message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: IRbmStandaloneCard): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: IRbmStandaloneCard, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified RbmStandaloneCard message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.verify|verify} messages.
        * @param message RbmStandaloneCard message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: IRbmStandaloneCard): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: IRbmStandaloneCard, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a RbmStandaloneCard message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns RbmStandaloneCard
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): RbmStandaloneCard = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[RbmStandaloneCard]
      
      /**
        * Creates a plain object from a RbmStandaloneCard message. Also converts values to other types if specified.
        * @param message RbmStandaloneCard
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: RbmStandaloneCard): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: RbmStandaloneCard, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a RbmStandaloneCard message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a RbmSuggestedAction. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction")
    @js.native
    /**
      * Constructs a new RbmSuggestedAction.
      * @param [properties] Properties to set
      */
    class RbmSuggestedAction ()
      extends StObject
         with IRbmSuggestedAction {
      def this(properties: IRbmSuggestedAction) = this()
      
      /** RbmSuggestedAction action. */
      var action: js.UndefOr[dial | openUrl | shareLocation] = js.native
      
      /** RbmSuggestedAction postbackData. */
      @JSName("postbackData")
      var postbackData_RbmSuggestedAction: String = js.native
      
      /** RbmSuggestedAction text. */
      @JSName("text")
      var text_RbmSuggestedAction: String = js.native
      
      /**
        * Converts this RbmSuggestedAction to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object RbmSuggestedAction {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction")
      @js.native
      val ^ : js.Any = js.native
      
      /** Represents a RbmSuggestedActionDial. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionDial")
      @js.native
      /**
        * Constructs a new RbmSuggestedActionDial.
        * @param [properties] Properties to set
        */
      class RbmSuggestedActionDial ()
        extends StObject
           with IRbmSuggestedActionDial {
        def this(properties: IRbmSuggestedActionDial) = this()
        
        /** RbmSuggestedActionDial phoneNumber. */
        @JSName("phoneNumber")
        var phoneNumber_RbmSuggestedActionDial: String = js.native
        
        /**
          * Converts this RbmSuggestedActionDial to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[js.Any] = js.native
      }
      object RbmSuggestedActionDial {
        
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionDial")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new RbmSuggestedActionDial instance using the specified properties.
          * @param [properties] Properties to set
          * @returns RbmSuggestedActionDial instance
          */
        /* static member */
        @scala.inline
        def create(): RbmSuggestedActionDial = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[RbmSuggestedActionDial]
        @scala.inline
        def create(properties: IRbmSuggestedActionDial): RbmSuggestedActionDial = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedActionDial]
        
        /**
          * Decodes a RbmSuggestedActionDial message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns RbmSuggestedActionDial
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @scala.inline
        def decode(reader: Reader): RbmSuggestedActionDial = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedActionDial]
        @scala.inline
        def decode(reader: Reader, length: Double): RbmSuggestedActionDial = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RbmSuggestedActionDial]
        @scala.inline
        def decode(reader: Uint8Array): RbmSuggestedActionDial = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedActionDial]
        @scala.inline
        def decode(reader: Uint8Array, length: Double): RbmSuggestedActionDial = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RbmSuggestedActionDial]
        
        /**
          * Decodes a RbmSuggestedActionDial message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns RbmSuggestedActionDial
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @scala.inline
        def decodeDelimited(reader: Reader): RbmSuggestedActionDial = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedActionDial]
        @scala.inline
        def decodeDelimited(reader: Uint8Array): RbmSuggestedActionDial = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedActionDial]
        
        /**
          * Encodes the specified RbmSuggestedActionDial message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionDial.verify|verify} messages.
          * @param message RbmSuggestedActionDial message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @scala.inline
        def encode(message: IRbmSuggestedActionDial): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        @scala.inline
        def encode(message: IRbmSuggestedActionDial, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified RbmSuggestedActionDial message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionDial.verify|verify} messages.
          * @param message RbmSuggestedActionDial message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @scala.inline
        def encodeDelimited(message: IRbmSuggestedActionDial): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        @scala.inline
        def encodeDelimited(message: IRbmSuggestedActionDial, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates a RbmSuggestedActionDial message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns RbmSuggestedActionDial
          */
        /* static member */
        @scala.inline
        def fromObject(`object`: StringDictionary[js.Any]): RbmSuggestedActionDial = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedActionDial]
        
        /**
          * Creates a plain object from a RbmSuggestedActionDial message. Also converts values to other types if specified.
          * @param message RbmSuggestedActionDial
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @scala.inline
        def toObject(message: RbmSuggestedActionDial): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
        @scala.inline
        def toObject(message: RbmSuggestedActionDial, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
        
        /**
          * Verifies a RbmSuggestedActionDial message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @scala.inline
        def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      /** Represents a RbmSuggestedActionOpenUri. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionOpenUri")
      @js.native
      /**
        * Constructs a new RbmSuggestedActionOpenUri.
        * @param [properties] Properties to set
        */
      class RbmSuggestedActionOpenUri ()
        extends StObject
           with IRbmSuggestedActionOpenUri {
        def this(properties: IRbmSuggestedActionOpenUri) = this()
        
        /**
          * Converts this RbmSuggestedActionOpenUri to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[js.Any] = js.native
        
        /** RbmSuggestedActionOpenUri uri. */
        @JSName("uri")
        var uri_RbmSuggestedActionOpenUri: String = js.native
      }
      object RbmSuggestedActionOpenUri {
        
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionOpenUri")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new RbmSuggestedActionOpenUri instance using the specified properties.
          * @param [properties] Properties to set
          * @returns RbmSuggestedActionOpenUri instance
          */
        /* static member */
        @scala.inline
        def create(): RbmSuggestedActionOpenUri = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[RbmSuggestedActionOpenUri]
        @scala.inline
        def create(properties: IRbmSuggestedActionOpenUri): RbmSuggestedActionOpenUri = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedActionOpenUri]
        
        /**
          * Decodes a RbmSuggestedActionOpenUri message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns RbmSuggestedActionOpenUri
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @scala.inline
        def decode(reader: Reader): RbmSuggestedActionOpenUri = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedActionOpenUri]
        @scala.inline
        def decode(reader: Reader, length: Double): RbmSuggestedActionOpenUri = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RbmSuggestedActionOpenUri]
        @scala.inline
        def decode(reader: Uint8Array): RbmSuggestedActionOpenUri = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedActionOpenUri]
        @scala.inline
        def decode(reader: Uint8Array, length: Double): RbmSuggestedActionOpenUri = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RbmSuggestedActionOpenUri]
        
        /**
          * Decodes a RbmSuggestedActionOpenUri message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns RbmSuggestedActionOpenUri
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @scala.inline
        def decodeDelimited(reader: Reader): RbmSuggestedActionOpenUri = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedActionOpenUri]
        @scala.inline
        def decodeDelimited(reader: Uint8Array): RbmSuggestedActionOpenUri = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedActionOpenUri]
        
        /**
          * Encodes the specified RbmSuggestedActionOpenUri message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionOpenUri.verify|verify} messages.
          * @param message RbmSuggestedActionOpenUri message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @scala.inline
        def encode(message: IRbmSuggestedActionOpenUri): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        @scala.inline
        def encode(message: IRbmSuggestedActionOpenUri, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified RbmSuggestedActionOpenUri message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionOpenUri.verify|verify} messages.
          * @param message RbmSuggestedActionOpenUri message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @scala.inline
        def encodeDelimited(message: IRbmSuggestedActionOpenUri): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        @scala.inline
        def encodeDelimited(message: IRbmSuggestedActionOpenUri, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates a RbmSuggestedActionOpenUri message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns RbmSuggestedActionOpenUri
          */
        /* static member */
        @scala.inline
        def fromObject(`object`: StringDictionary[js.Any]): RbmSuggestedActionOpenUri = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedActionOpenUri]
        
        /**
          * Creates a plain object from a RbmSuggestedActionOpenUri message. Also converts values to other types if specified.
          * @param message RbmSuggestedActionOpenUri
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @scala.inline
        def toObject(message: RbmSuggestedActionOpenUri): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
        @scala.inline
        def toObject(message: RbmSuggestedActionOpenUri, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
        
        /**
          * Verifies a RbmSuggestedActionOpenUri message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @scala.inline
        def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      /** Represents a RbmSuggestedActionShareLocation. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionShareLocation")
      @js.native
      /**
        * Constructs a new RbmSuggestedActionShareLocation.
        * @param [properties] Properties to set
        */
      class RbmSuggestedActionShareLocation ()
        extends StObject
           with IRbmSuggestedActionShareLocation {
        def this(properties: IRbmSuggestedActionShareLocation) = this()
        
        /**
          * Converts this RbmSuggestedActionShareLocation to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[js.Any] = js.native
      }
      object RbmSuggestedActionShareLocation {
        
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionShareLocation")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new RbmSuggestedActionShareLocation instance using the specified properties.
          * @param [properties] Properties to set
          * @returns RbmSuggestedActionShareLocation instance
          */
        /* static member */
        @scala.inline
        def create(): RbmSuggestedActionShareLocation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[RbmSuggestedActionShareLocation]
        @scala.inline
        def create(properties: IRbmSuggestedActionShareLocation): RbmSuggestedActionShareLocation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedActionShareLocation]
        
        /**
          * Decodes a RbmSuggestedActionShareLocation message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns RbmSuggestedActionShareLocation
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @scala.inline
        def decode(reader: Reader): RbmSuggestedActionShareLocation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedActionShareLocation]
        @scala.inline
        def decode(reader: Reader, length: Double): RbmSuggestedActionShareLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RbmSuggestedActionShareLocation]
        @scala.inline
        def decode(reader: Uint8Array): RbmSuggestedActionShareLocation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedActionShareLocation]
        @scala.inline
        def decode(reader: Uint8Array, length: Double): RbmSuggestedActionShareLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RbmSuggestedActionShareLocation]
        
        /**
          * Decodes a RbmSuggestedActionShareLocation message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns RbmSuggestedActionShareLocation
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @scala.inline
        def decodeDelimited(reader: Reader): RbmSuggestedActionShareLocation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedActionShareLocation]
        @scala.inline
        def decodeDelimited(reader: Uint8Array): RbmSuggestedActionShareLocation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedActionShareLocation]
        
        /**
          * Encodes the specified RbmSuggestedActionShareLocation message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionShareLocation.verify|verify} messages.
          * @param message RbmSuggestedActionShareLocation message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @scala.inline
        def encode(message: IRbmSuggestedActionShareLocation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        @scala.inline
        def encode(message: IRbmSuggestedActionShareLocation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified RbmSuggestedActionShareLocation message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.RbmSuggestedActionShareLocation.verify|verify} messages.
          * @param message RbmSuggestedActionShareLocation message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @scala.inline
        def encodeDelimited(message: IRbmSuggestedActionShareLocation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        @scala.inline
        def encodeDelimited(message: IRbmSuggestedActionShareLocation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates a RbmSuggestedActionShareLocation message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns RbmSuggestedActionShareLocation
          */
        /* static member */
        @scala.inline
        def fromObject(`object`: StringDictionary[js.Any]): RbmSuggestedActionShareLocation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedActionShareLocation]
        
        /**
          * Creates a plain object from a RbmSuggestedActionShareLocation message. Also converts values to other types if specified.
          * @param message RbmSuggestedActionShareLocation
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @scala.inline
        def toObject(message: RbmSuggestedActionShareLocation): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
        @scala.inline
        def toObject(message: RbmSuggestedActionShareLocation, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
        
        /**
          * Verifies a RbmSuggestedActionShareLocation message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @scala.inline
        def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      /**
        * Creates a new RbmSuggestedAction instance using the specified properties.
        * @param [properties] Properties to set
        * @returns RbmSuggestedAction instance
        */
      /* static member */
      @scala.inline
      def create(): RbmSuggestedAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[RbmSuggestedAction]
      @scala.inline
      def create(properties: IRbmSuggestedAction): RbmSuggestedAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedAction]
      
      /**
        * Decodes a RbmSuggestedAction message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns RbmSuggestedAction
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): RbmSuggestedAction = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedAction]
      @scala.inline
      def decode(reader: Reader, length: Double): RbmSuggestedAction = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RbmSuggestedAction]
      @scala.inline
      def decode(reader: Uint8Array): RbmSuggestedAction = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedAction]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): RbmSuggestedAction = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RbmSuggestedAction]
      
      /**
        * Decodes a RbmSuggestedAction message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns RbmSuggestedAction
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): RbmSuggestedAction = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedAction]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): RbmSuggestedAction = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedAction]
      
      /**
        * Encodes the specified RbmSuggestedAction message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.verify|verify} messages.
        * @param message RbmSuggestedAction message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: IRbmSuggestedAction): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: IRbmSuggestedAction, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified RbmSuggestedAction message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.verify|verify} messages.
        * @param message RbmSuggestedAction message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: IRbmSuggestedAction): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: IRbmSuggestedAction, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a RbmSuggestedAction message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns RbmSuggestedAction
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): RbmSuggestedAction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedAction]
      
      /**
        * Creates a plain object from a RbmSuggestedAction message. Also converts values to other types if specified.
        * @param message RbmSuggestedAction
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: RbmSuggestedAction): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: RbmSuggestedAction, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a RbmSuggestedAction message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      
      /** Properties of a RbmSuggestedActionDial. */
      trait IRbmSuggestedActionDial extends StObject {
        
        /** RbmSuggestedActionDial phoneNumber */
        var phoneNumber: js.UndefOr[String | Null] = js.undefined
      }
      object IRbmSuggestedActionDial {
        
        @scala.inline
        def apply(): IRbmSuggestedActionDial = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IRbmSuggestedActionDial]
        }
        
        @scala.inline
        implicit class IRbmSuggestedActionDialMutableBuilder[Self <: IRbmSuggestedActionDial] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
          
          @scala.inline
          def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
        }
      }
      
      /** Properties of a RbmSuggestedActionOpenUri. */
      trait IRbmSuggestedActionOpenUri extends StObject {
        
        /** RbmSuggestedActionOpenUri uri */
        var uri: js.UndefOr[String | Null] = js.undefined
      }
      object IRbmSuggestedActionOpenUri {
        
        @scala.inline
        def apply(): IRbmSuggestedActionOpenUri = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IRbmSuggestedActionOpenUri]
        }
        
        @scala.inline
        implicit class IRbmSuggestedActionOpenUriMutableBuilder[Self <: IRbmSuggestedActionOpenUri] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUriNull: Self = StObject.set(x, "uri", null)
          
          @scala.inline
          def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
        }
      }
      
      /** Properties of a RbmSuggestedActionShareLocation. */
      trait IRbmSuggestedActionShareLocation extends StObject
    }
    
    /** Represents a RbmSuggestedReply. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedReply")
    @js.native
    /**
      * Constructs a new RbmSuggestedReply.
      * @param [properties] Properties to set
      */
    class RbmSuggestedReply ()
      extends StObject
         with IRbmSuggestedReply {
      def this(properties: IRbmSuggestedReply) = this()
      
      /** RbmSuggestedReply postbackData. */
      @JSName("postbackData")
      var postbackData_RbmSuggestedReply: String = js.native
      
      /** RbmSuggestedReply text. */
      @JSName("text")
      var text_RbmSuggestedReply: String = js.native
      
      /**
        * Converts this RbmSuggestedReply to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object RbmSuggestedReply {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedReply")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new RbmSuggestedReply instance using the specified properties.
        * @param [properties] Properties to set
        * @returns RbmSuggestedReply instance
        */
      /* static member */
      @scala.inline
      def create(): RbmSuggestedReply = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[RbmSuggestedReply]
      @scala.inline
      def create(properties: IRbmSuggestedReply): RbmSuggestedReply = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedReply]
      
      /**
        * Decodes a RbmSuggestedReply message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns RbmSuggestedReply
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): RbmSuggestedReply = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedReply]
      @scala.inline
      def decode(reader: Reader, length: Double): RbmSuggestedReply = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RbmSuggestedReply]
      @scala.inline
      def decode(reader: Uint8Array): RbmSuggestedReply = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedReply]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): RbmSuggestedReply = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RbmSuggestedReply]
      
      /**
        * Decodes a RbmSuggestedReply message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns RbmSuggestedReply
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): RbmSuggestedReply = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedReply]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): RbmSuggestedReply = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedReply]
      
      /**
        * Encodes the specified RbmSuggestedReply message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedReply.verify|verify} messages.
        * @param message RbmSuggestedReply message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: IRbmSuggestedReply): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: IRbmSuggestedReply, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified RbmSuggestedReply message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedReply.verify|verify} messages.
        * @param message RbmSuggestedReply message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: IRbmSuggestedReply): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: IRbmSuggestedReply, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a RbmSuggestedReply message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns RbmSuggestedReply
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): RbmSuggestedReply = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestedReply]
      
      /**
        * Creates a plain object from a RbmSuggestedReply message. Also converts values to other types if specified.
        * @param message RbmSuggestedReply
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: RbmSuggestedReply): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: RbmSuggestedReply, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a RbmSuggestedReply message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a RbmSuggestion. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestion")
    @js.native
    /**
      * Constructs a new RbmSuggestion.
      * @param [properties] Properties to set
      */
    class RbmSuggestion ()
      extends StObject
         with IRbmSuggestion {
      def this(properties: IRbmSuggestion) = this()
      
      /** RbmSuggestion suggestion. */
      var suggestion: js.UndefOr[reply | action] = js.native
      
      /**
        * Converts this RbmSuggestion to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object RbmSuggestion {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestion")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new RbmSuggestion instance using the specified properties.
        * @param [properties] Properties to set
        * @returns RbmSuggestion instance
        */
      /* static member */
      @scala.inline
      def create(): RbmSuggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[RbmSuggestion]
      @scala.inline
      def create(properties: IRbmSuggestion): RbmSuggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestion]
      
      /**
        * Decodes a RbmSuggestion message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns RbmSuggestion
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): RbmSuggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestion]
      @scala.inline
      def decode(reader: Reader, length: Double): RbmSuggestion = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RbmSuggestion]
      @scala.inline
      def decode(reader: Uint8Array): RbmSuggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestion]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): RbmSuggestion = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RbmSuggestion]
      
      /**
        * Decodes a RbmSuggestion message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns RbmSuggestion
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): RbmSuggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestion]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): RbmSuggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestion]
      
      /**
        * Encodes the specified RbmSuggestion message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestion.verify|verify} messages.
        * @param message RbmSuggestion message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: IRbmSuggestion): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: IRbmSuggestion, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified RbmSuggestion message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestion.verify|verify} messages.
        * @param message RbmSuggestion message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: IRbmSuggestion): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: IRbmSuggestion, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a RbmSuggestion message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns RbmSuggestion
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): RbmSuggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[RbmSuggestion]
      
      /**
        * Creates a plain object from a RbmSuggestion message. Also converts values to other types if specified.
        * @param message RbmSuggestion
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: RbmSuggestion): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: RbmSuggestion, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a RbmSuggestion message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a RbmText. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmText")
    @js.native
    /**
      * Constructs a new RbmText.
      * @param [properties] Properties to set
      */
    class RbmText ()
      extends StObject
         with IRbmText {
      def this(properties: IRbmText) = this()
      
      /** RbmText rbmSuggestion. */
      @JSName("rbmSuggestion")
      var rbmSuggestion_RbmText: js.Array[IRbmSuggestion] = js.native
      
      /** RbmText text. */
      @JSName("text")
      var text_RbmText: String = js.native
      
      /**
        * Converts this RbmText to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object RbmText {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmText")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new RbmText instance using the specified properties.
        * @param [properties] Properties to set
        * @returns RbmText instance
        */
      /* static member */
      @scala.inline
      def create(): RbmText = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[RbmText]
      @scala.inline
      def create(properties: IRbmText): RbmText = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[RbmText]
      
      /**
        * Decodes a RbmText message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns RbmText
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): RbmText = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmText]
      @scala.inline
      def decode(reader: Reader, length: Double): RbmText = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RbmText]
      @scala.inline
      def decode(reader: Uint8Array): RbmText = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmText]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): RbmText = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RbmText]
      
      /**
        * Decodes a RbmText message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns RbmText
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): RbmText = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmText]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): RbmText = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RbmText]
      
      /**
        * Encodes the specified RbmText message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmText.verify|verify} messages.
        * @param message RbmText message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: IRbmText): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: IRbmText, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified RbmText message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmText.verify|verify} messages.
        * @param message RbmText message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: IRbmText): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: IRbmText, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a RbmText message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns RbmText
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): RbmText = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[RbmText]
      
      /**
        * Creates a plain object from a RbmText message. Also converts values to other types if specified.
        * @param message RbmText
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: RbmText): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: RbmText, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a RbmText message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a SelectItemInfo. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.SelectItemInfo")
    @js.native
    /**
      * Constructs a new SelectItemInfo.
      * @param [properties] Properties to set
      */
    class SelectItemInfo ()
      extends StObject
         with ISelectItemInfo {
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
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.SelectItemInfo")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new SelectItemInfo instance using the specified properties.
        * @param [properties] Properties to set
        * @returns SelectItemInfo instance
        */
      /* static member */
      @scala.inline
      def create(): SelectItemInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SelectItemInfo]
      @scala.inline
      def create(properties: ISelectItemInfo): SelectItemInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SelectItemInfo]
      
      /**
        * Decodes a SelectItemInfo message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns SelectItemInfo
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): SelectItemInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SelectItemInfo]
      @scala.inline
      def decode(reader: Reader, length: Double): SelectItemInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SelectItemInfo]
      @scala.inline
      def decode(reader: Uint8Array): SelectItemInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SelectItemInfo]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): SelectItemInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SelectItemInfo]
      
      /**
        * Decodes a SelectItemInfo message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns SelectItemInfo
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): SelectItemInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SelectItemInfo]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): SelectItemInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SelectItemInfo]
      
      /**
        * Encodes the specified SelectItemInfo message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.SelectItemInfo.verify|verify} messages.
        * @param message SelectItemInfo message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: ISelectItemInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: ISelectItemInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified SelectItemInfo message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.SelectItemInfo.verify|verify} messages.
        * @param message SelectItemInfo message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: ISelectItemInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: ISelectItemInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a SelectItemInfo message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns SelectItemInfo
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): SelectItemInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SelectItemInfo]
      
      /**
        * Creates a plain object from a SelectItemInfo message. Also converts values to other types if specified.
        * @param message SelectItemInfo
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: SelectItemInfo): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: SelectItemInfo, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a SelectItemInfo message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a SimpleResponse. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.SimpleResponse")
    @js.native
    /**
      * Constructs a new SimpleResponse.
      * @param [properties] Properties to set
      */
    class SimpleResponse ()
      extends StObject
         with ISimpleResponse {
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
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.SimpleResponse")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new SimpleResponse instance using the specified properties.
        * @param [properties] Properties to set
        * @returns SimpleResponse instance
        */
      /* static member */
      @scala.inline
      def create(): SimpleResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SimpleResponse]
      @scala.inline
      def create(properties: ISimpleResponse): SimpleResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SimpleResponse]
      
      /**
        * Decodes a SimpleResponse message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns SimpleResponse
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): SimpleResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SimpleResponse]
      @scala.inline
      def decode(reader: Reader, length: Double): SimpleResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SimpleResponse]
      @scala.inline
      def decode(reader: Uint8Array): SimpleResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SimpleResponse]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): SimpleResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SimpleResponse]
      
      /**
        * Decodes a SimpleResponse message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns SimpleResponse
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): SimpleResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SimpleResponse]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): SimpleResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SimpleResponse]
      
      /**
        * Encodes the specified SimpleResponse message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.SimpleResponse.verify|verify} messages.
        * @param message SimpleResponse message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: ISimpleResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: ISimpleResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified SimpleResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.SimpleResponse.verify|verify} messages.
        * @param message SimpleResponse message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: ISimpleResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: ISimpleResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a SimpleResponse message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns SimpleResponse
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): SimpleResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SimpleResponse]
      
      /**
        * Creates a plain object from a SimpleResponse message. Also converts values to other types if specified.
        * @param message SimpleResponse
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: SimpleResponse): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: SimpleResponse, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a SimpleResponse message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a SimpleResponses. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.SimpleResponses")
    @js.native
    /**
      * Constructs a new SimpleResponses.
      * @param [properties] Properties to set
      */
    class SimpleResponses ()
      extends StObject
         with ISimpleResponses {
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
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.SimpleResponses")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new SimpleResponses instance using the specified properties.
        * @param [properties] Properties to set
        * @returns SimpleResponses instance
        */
      /* static member */
      @scala.inline
      def create(): SimpleResponses = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SimpleResponses]
      @scala.inline
      def create(properties: ISimpleResponses): SimpleResponses = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SimpleResponses]
      
      /**
        * Decodes a SimpleResponses message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns SimpleResponses
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): SimpleResponses = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SimpleResponses]
      @scala.inline
      def decode(reader: Reader, length: Double): SimpleResponses = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SimpleResponses]
      @scala.inline
      def decode(reader: Uint8Array): SimpleResponses = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SimpleResponses]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): SimpleResponses = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SimpleResponses]
      
      /**
        * Decodes a SimpleResponses message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns SimpleResponses
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): SimpleResponses = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SimpleResponses]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): SimpleResponses = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SimpleResponses]
      
      /**
        * Encodes the specified SimpleResponses message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.SimpleResponses.verify|verify} messages.
        * @param message SimpleResponses message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: ISimpleResponses): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: ISimpleResponses, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified SimpleResponses message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.SimpleResponses.verify|verify} messages.
        * @param message SimpleResponses message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: ISimpleResponses): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: ISimpleResponses, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a SimpleResponses message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns SimpleResponses
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): SimpleResponses = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SimpleResponses]
      
      /**
        * Creates a plain object from a SimpleResponses message. Also converts values to other types if specified.
        * @param message SimpleResponses
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: SimpleResponses): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: SimpleResponses, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a SimpleResponses message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a Suggestion. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.Suggestion")
    @js.native
    /**
      * Constructs a new Suggestion.
      * @param [properties] Properties to set
      */
    class Suggestion ()
      extends StObject
         with ISuggestion {
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
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.Suggestion")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Suggestion instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Suggestion instance
        */
      /* static member */
      @scala.inline
      def create(): Suggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Suggestion]
      @scala.inline
      def create(properties: ISuggestion): Suggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Suggestion]
      
      /**
        * Decodes a Suggestion message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Suggestion
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): Suggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Suggestion]
      @scala.inline
      def decode(reader: Reader, length: Double): Suggestion = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Suggestion]
      @scala.inline
      def decode(reader: Uint8Array): Suggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Suggestion]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): Suggestion = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Suggestion]
      
      /**
        * Decodes a Suggestion message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Suggestion
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): Suggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Suggestion]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): Suggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Suggestion]
      
      /**
        * Encodes the specified Suggestion message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.Suggestion.verify|verify} messages.
        * @param message Suggestion message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: ISuggestion): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: ISuggestion, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Suggestion message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.Suggestion.verify|verify} messages.
        * @param message Suggestion message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: ISuggestion): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: ISuggestion, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a Suggestion message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Suggestion
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): Suggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Suggestion]
      
      /**
        * Creates a plain object from a Suggestion message. Also converts values to other types if specified.
        * @param message Suggestion
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: Suggestion): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: Suggestion, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a Suggestion message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a Suggestions. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.Suggestions")
    @js.native
    /**
      * Constructs a new Suggestions.
      * @param [properties] Properties to set
      */
    class Suggestions ()
      extends StObject
         with ISuggestions {
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
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.Suggestions")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Suggestions instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Suggestions instance
        */
      /* static member */
      @scala.inline
      def create(): Suggestions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Suggestions]
      @scala.inline
      def create(properties: ISuggestions): Suggestions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Suggestions]
      
      /**
        * Decodes a Suggestions message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Suggestions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): Suggestions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Suggestions]
      @scala.inline
      def decode(reader: Reader, length: Double): Suggestions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Suggestions]
      @scala.inline
      def decode(reader: Uint8Array): Suggestions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Suggestions]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): Suggestions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Suggestions]
      
      /**
        * Decodes a Suggestions message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Suggestions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): Suggestions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Suggestions]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): Suggestions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Suggestions]
      
      /**
        * Encodes the specified Suggestions message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.Suggestions.verify|verify} messages.
        * @param message Suggestions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: ISuggestions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: ISuggestions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Suggestions message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.Suggestions.verify|verify} messages.
        * @param message Suggestions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: ISuggestions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: ISuggestions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a Suggestions message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Suggestions
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): Suggestions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Suggestions]
      
      /**
        * Creates a plain object from a Suggestions message. Also converts values to other types if specified.
        * @param message Suggestions
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: Suggestions): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: Suggestions, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a Suggestions message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a TableCard. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.TableCard")
    @js.native
    /**
      * Constructs a new TableCard.
      * @param [properties] Properties to set
      */
    class TableCard ()
      extends StObject
         with ITableCard {
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
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.TableCard")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new TableCard instance using the specified properties.
        * @param [properties] Properties to set
        * @returns TableCard instance
        */
      /* static member */
      @scala.inline
      def create(): TableCard = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TableCard]
      @scala.inline
      def create(properties: ITableCard): TableCard = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TableCard]
      
      /**
        * Decodes a TableCard message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns TableCard
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): TableCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCard]
      @scala.inline
      def decode(reader: Reader, length: Double): TableCard = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TableCard]
      @scala.inline
      def decode(reader: Uint8Array): TableCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCard]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): TableCard = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TableCard]
      
      /**
        * Decodes a TableCard message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns TableCard
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): TableCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCard]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): TableCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCard]
      
      /**
        * Encodes the specified TableCard message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.TableCard.verify|verify} messages.
        * @param message TableCard message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: ITableCard): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: ITableCard, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified TableCard message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.TableCard.verify|verify} messages.
        * @param message TableCard message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: ITableCard): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: ITableCard, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a TableCard message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns TableCard
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): TableCard = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TableCard]
      
      /**
        * Creates a plain object from a TableCard message. Also converts values to other types if specified.
        * @param message TableCard
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: TableCard): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: TableCard, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a TableCard message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a TableCardCell. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.TableCardCell")
    @js.native
    /**
      * Constructs a new TableCardCell.
      * @param [properties] Properties to set
      */
    class TableCardCell ()
      extends StObject
         with ITableCardCell {
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
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.TableCardCell")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new TableCardCell instance using the specified properties.
        * @param [properties] Properties to set
        * @returns TableCardCell instance
        */
      /* static member */
      @scala.inline
      def create(): TableCardCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TableCardCell]
      @scala.inline
      def create(properties: ITableCardCell): TableCardCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TableCardCell]
      
      /**
        * Decodes a TableCardCell message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns TableCardCell
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): TableCardCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCardCell]
      @scala.inline
      def decode(reader: Reader, length: Double): TableCardCell = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TableCardCell]
      @scala.inline
      def decode(reader: Uint8Array): TableCardCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCardCell]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): TableCardCell = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TableCardCell]
      
      /**
        * Decodes a TableCardCell message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns TableCardCell
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): TableCardCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCardCell]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): TableCardCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCardCell]
      
      /**
        * Encodes the specified TableCardCell message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.TableCardCell.verify|verify} messages.
        * @param message TableCardCell message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: ITableCardCell): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: ITableCardCell, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified TableCardCell message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.TableCardCell.verify|verify} messages.
        * @param message TableCardCell message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: ITableCardCell): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: ITableCardCell, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a TableCardCell message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns TableCardCell
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): TableCardCell = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TableCardCell]
      
      /**
        * Creates a plain object from a TableCardCell message. Also converts values to other types if specified.
        * @param message TableCardCell
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: TableCardCell): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: TableCardCell, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a TableCardCell message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a TableCardRow. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.TableCardRow")
    @js.native
    /**
      * Constructs a new TableCardRow.
      * @param [properties] Properties to set
      */
    class TableCardRow ()
      extends StObject
         with ITableCardRow {
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
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.TableCardRow")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new TableCardRow instance using the specified properties.
        * @param [properties] Properties to set
        * @returns TableCardRow instance
        */
      /* static member */
      @scala.inline
      def create(): TableCardRow = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TableCardRow]
      @scala.inline
      def create(properties: ITableCardRow): TableCardRow = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TableCardRow]
      
      /**
        * Decodes a TableCardRow message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns TableCardRow
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): TableCardRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCardRow]
      @scala.inline
      def decode(reader: Reader, length: Double): TableCardRow = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TableCardRow]
      @scala.inline
      def decode(reader: Uint8Array): TableCardRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCardRow]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): TableCardRow = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TableCardRow]
      
      /**
        * Decodes a TableCardRow message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns TableCardRow
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): TableCardRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCardRow]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): TableCardRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCardRow]
      
      /**
        * Encodes the specified TableCardRow message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.TableCardRow.verify|verify} messages.
        * @param message TableCardRow message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: ITableCardRow): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: ITableCardRow, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified TableCardRow message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.TableCardRow.verify|verify} messages.
        * @param message TableCardRow message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: ITableCardRow): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: ITableCardRow, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a TableCardRow message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns TableCardRow
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): TableCardRow = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TableCardRow]
      
      /**
        * Creates a plain object from a TableCardRow message. Also converts values to other types if specified.
        * @param message TableCardRow
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: TableCardRow): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: TableCardRow, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a TableCardRow message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a TelephonyPlayAudio. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.TelephonyPlayAudio")
    @js.native
    /**
      * Constructs a new TelephonyPlayAudio.
      * @param [properties] Properties to set
      */
    class TelephonyPlayAudio ()
      extends StObject
         with ITelephonyPlayAudio {
      def this(properties: ITelephonyPlayAudio) = this()
      
      /** TelephonyPlayAudio audioUri. */
      @JSName("audioUri")
      var audioUri_TelephonyPlayAudio: String = js.native
      
      /**
        * Converts this TelephonyPlayAudio to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object TelephonyPlayAudio {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.TelephonyPlayAudio")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new TelephonyPlayAudio instance using the specified properties.
        * @param [properties] Properties to set
        * @returns TelephonyPlayAudio instance
        */
      /* static member */
      @scala.inline
      def create(): TelephonyPlayAudio = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TelephonyPlayAudio]
      @scala.inline
      def create(properties: ITelephonyPlayAudio): TelephonyPlayAudio = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TelephonyPlayAudio]
      
      /**
        * Decodes a TelephonyPlayAudio message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns TelephonyPlayAudio
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): TelephonyPlayAudio = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TelephonyPlayAudio]
      @scala.inline
      def decode(reader: Reader, length: Double): TelephonyPlayAudio = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TelephonyPlayAudio]
      @scala.inline
      def decode(reader: Uint8Array): TelephonyPlayAudio = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TelephonyPlayAudio]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): TelephonyPlayAudio = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TelephonyPlayAudio]
      
      /**
        * Decodes a TelephonyPlayAudio message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns TelephonyPlayAudio
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): TelephonyPlayAudio = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TelephonyPlayAudio]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): TelephonyPlayAudio = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TelephonyPlayAudio]
      
      /**
        * Encodes the specified TelephonyPlayAudio message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.TelephonyPlayAudio.verify|verify} messages.
        * @param message TelephonyPlayAudio message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: ITelephonyPlayAudio): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: ITelephonyPlayAudio, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified TelephonyPlayAudio message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.TelephonyPlayAudio.verify|verify} messages.
        * @param message TelephonyPlayAudio message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: ITelephonyPlayAudio): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: ITelephonyPlayAudio, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a TelephonyPlayAudio message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns TelephonyPlayAudio
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): TelephonyPlayAudio = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TelephonyPlayAudio]
      
      /**
        * Creates a plain object from a TelephonyPlayAudio message. Also converts values to other types if specified.
        * @param message TelephonyPlayAudio
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: TelephonyPlayAudio): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: TelephonyPlayAudio, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a TelephonyPlayAudio message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a TelephonySynthesizeSpeech. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.TelephonySynthesizeSpeech")
    @js.native
    /**
      * Constructs a new TelephonySynthesizeSpeech.
      * @param [properties] Properties to set
      */
    class TelephonySynthesizeSpeech ()
      extends StObject
         with ITelephonySynthesizeSpeech {
      def this(properties: ITelephonySynthesizeSpeech) = this()
      
      /** TelephonySynthesizeSpeech source. */
      var source: js.UndefOr[text | ssml] = js.native
      
      /** TelephonySynthesizeSpeech ssml. */
      @JSName("ssml")
      var ssml_TelephonySynthesizeSpeech: String = js.native
      
      /** TelephonySynthesizeSpeech text. */
      @JSName("text")
      var text_TelephonySynthesizeSpeech: String = js.native
      
      /**
        * Converts this TelephonySynthesizeSpeech to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object TelephonySynthesizeSpeech {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.TelephonySynthesizeSpeech")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new TelephonySynthesizeSpeech instance using the specified properties.
        * @param [properties] Properties to set
        * @returns TelephonySynthesizeSpeech instance
        */
      /* static member */
      @scala.inline
      def create(): TelephonySynthesizeSpeech = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TelephonySynthesizeSpeech]
      @scala.inline
      def create(properties: ITelephonySynthesizeSpeech): TelephonySynthesizeSpeech = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TelephonySynthesizeSpeech]
      
      /**
        * Decodes a TelephonySynthesizeSpeech message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns TelephonySynthesizeSpeech
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): TelephonySynthesizeSpeech = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TelephonySynthesizeSpeech]
      @scala.inline
      def decode(reader: Reader, length: Double): TelephonySynthesizeSpeech = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TelephonySynthesizeSpeech]
      @scala.inline
      def decode(reader: Uint8Array): TelephonySynthesizeSpeech = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TelephonySynthesizeSpeech]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): TelephonySynthesizeSpeech = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TelephonySynthesizeSpeech]
      
      /**
        * Decodes a TelephonySynthesizeSpeech message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns TelephonySynthesizeSpeech
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): TelephonySynthesizeSpeech = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TelephonySynthesizeSpeech]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): TelephonySynthesizeSpeech = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TelephonySynthesizeSpeech]
      
      /**
        * Encodes the specified TelephonySynthesizeSpeech message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.TelephonySynthesizeSpeech.verify|verify} messages.
        * @param message TelephonySynthesizeSpeech message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: ITelephonySynthesizeSpeech): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: ITelephonySynthesizeSpeech, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified TelephonySynthesizeSpeech message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.TelephonySynthesizeSpeech.verify|verify} messages.
        * @param message TelephonySynthesizeSpeech message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: ITelephonySynthesizeSpeech): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: ITelephonySynthesizeSpeech, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a TelephonySynthesizeSpeech message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns TelephonySynthesizeSpeech
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): TelephonySynthesizeSpeech = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TelephonySynthesizeSpeech]
      
      /**
        * Creates a plain object from a TelephonySynthesizeSpeech message. Also converts values to other types if specified.
        * @param message TelephonySynthesizeSpeech
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: TelephonySynthesizeSpeech): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: TelephonySynthesizeSpeech, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a TelephonySynthesizeSpeech message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a TelephonyTransferCall. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.TelephonyTransferCall")
    @js.native
    /**
      * Constructs a new TelephonyTransferCall.
      * @param [properties] Properties to set
      */
    class TelephonyTransferCall ()
      extends StObject
         with ITelephonyTransferCall {
      def this(properties: ITelephonyTransferCall) = this()
      
      /** TelephonyTransferCall phoneNumber. */
      @JSName("phoneNumber")
      var phoneNumber_TelephonyTransferCall: String = js.native
      
      /**
        * Converts this TelephonyTransferCall to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object TelephonyTransferCall {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.TelephonyTransferCall")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new TelephonyTransferCall instance using the specified properties.
        * @param [properties] Properties to set
        * @returns TelephonyTransferCall instance
        */
      /* static member */
      @scala.inline
      def create(): TelephonyTransferCall = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TelephonyTransferCall]
      @scala.inline
      def create(properties: ITelephonyTransferCall): TelephonyTransferCall = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TelephonyTransferCall]
      
      /**
        * Decodes a TelephonyTransferCall message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns TelephonyTransferCall
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): TelephonyTransferCall = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TelephonyTransferCall]
      @scala.inline
      def decode(reader: Reader, length: Double): TelephonyTransferCall = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TelephonyTransferCall]
      @scala.inline
      def decode(reader: Uint8Array): TelephonyTransferCall = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TelephonyTransferCall]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): TelephonyTransferCall = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TelephonyTransferCall]
      
      /**
        * Decodes a TelephonyTransferCall message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns TelephonyTransferCall
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): TelephonyTransferCall = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TelephonyTransferCall]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): TelephonyTransferCall = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TelephonyTransferCall]
      
      /**
        * Encodes the specified TelephonyTransferCall message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.TelephonyTransferCall.verify|verify} messages.
        * @param message TelephonyTransferCall message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: ITelephonyTransferCall): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: ITelephonyTransferCall, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified TelephonyTransferCall message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.TelephonyTransferCall.verify|verify} messages.
        * @param message TelephonyTransferCall message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: ITelephonyTransferCall): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: ITelephonyTransferCall, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a TelephonyTransferCall message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns TelephonyTransferCall
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): TelephonyTransferCall = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TelephonyTransferCall]
      
      /**
        * Creates a plain object from a TelephonyTransferCall message. Also converts values to other types if specified.
        * @param message TelephonyTransferCall
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: TelephonyTransferCall): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: TelephonyTransferCall, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a TelephonyTransferCall message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a Text. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.Text")
    @js.native
    /**
      * Constructs a new Text.
      * @param [properties] Properties to set
      */
    class Text ()
      extends StObject
         with IText {
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
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.Text")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Text instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Text instance
        */
      /* static member */
      @scala.inline
      def create(): typings.std.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.std.Text]
      @scala.inline
      def create(properties: IText): typings.std.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.std.Text]
      
      /**
        * Decodes a Text message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Text
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): typings.std.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.std.Text]
      @scala.inline
      def decode(reader: Reader, length: Double): typings.std.Text = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.std.Text]
      @scala.inline
      def decode(reader: Uint8Array): typings.std.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.std.Text]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): typings.std.Text = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.std.Text]
      
      /**
        * Decodes a Text message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Text
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): typings.std.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.std.Text]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): typings.std.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.std.Text]
      
      /**
        * Encodes the specified Text message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.Text.verify|verify} messages.
        * @param message Text message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: IText): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: IText, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Text message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.Text.verify|verify} messages.
        * @param message Text message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: IText): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: IText, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a Text message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Text
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): typings.std.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.std.Text]
      
      /**
        * Creates a plain object from a Text message. Also converts values to other types if specified.
        * @param message Text
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: typings.std.Text): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: typings.std.Text, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a Text message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /**
      * Creates a new Message instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Message instance
      */
    /* static member */
    @scala.inline
    def create(): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Message]
    @scala.inline
    def create(properties: IMessage): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Message]
    
    /**
      * Decodes a Message message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Message
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Message]
    @scala.inline
    def decode(reader: Reader, length: Double): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Message]
    @scala.inline
    def decode(reader: Uint8Array): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Message]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Message]
    
    /**
      * Decodes a Message message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Message
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Message]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Message]
    
    /**
      * Encodes the specified Message message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.verify|verify} messages.
      * @param message Message message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IMessage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Message message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.verify|verify} messages.
      * @param message Message message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IMessage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Message message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Message
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Message]
    
    /**
      * Creates a plain object from a Message message. Also converts values to other types if specified.
      * @param message Message
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: Message): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(message: Message, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a Message message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    /** Properties of a BasicCard. */
    trait IBasicCard extends StObject {
      
      /** BasicCard buttons */
      var buttons: js.UndefOr[js.Array[IButton] | Null] = js.undefined
      
      /** BasicCard formattedText */
      var formattedText: js.UndefOr[String | Null] = js.undefined
      
      /** BasicCard image */
      var image: js.UndefOr[IImage | Null] = js.undefined
      
      /** BasicCard subtitle */
      var subtitle: js.UndefOr[String | Null] = js.undefined
      
      /** BasicCard title */
      var title: js.UndefOr[String | Null] = js.undefined
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
    trait IBrowseCarouselCard extends StObject {
      
      /** BrowseCarouselCard imageDisplayOptions */
      var imageDisplayOptions: js.UndefOr[
            ImageDisplayOptions | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions * / any */ String) | Null
          ] = js.undefined
      
      /** BrowseCarouselCard items */
      var items: js.UndefOr[js.Array[IBrowseCarouselCardItem] | Null] = js.undefined
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
          value: ImageDisplayOptions | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions * / any */ String)
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
    trait ICard extends StObject {
      
      /** Card buttons */
      var buttons: js.UndefOr[
            (js.Array[
              typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Card.IButton
            ]) | Null
          ] = js.undefined
      
      /** Card imageUri */
      var imageUri: js.UndefOr[String | Null] = js.undefined
      
      /** Card subtitle */
      var subtitle: js.UndefOr[String | Null] = js.undefined
      
      /** Card title */
      var title: js.UndefOr[String | Null] = js.undefined
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
        def setButtons(
          value: js.Array[
                  typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Card.IButton
                ]
        ): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButtonsNull: Self = StObject.set(x, "buttons", null)
        
        @scala.inline
        def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
        
        @scala.inline
        def setButtonsVarargs(value: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Card.IButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
        
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
    trait ICarouselSelect extends StObject {
      
      /** CarouselSelect items */
      var items: js.UndefOr[js.Array[IItem] | Null] = js.undefined
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
    trait IColumnProperties extends StObject {
      
      /** ColumnProperties header */
      var header: js.UndefOr[String | Null] = js.undefined
      
      /** ColumnProperties horizontalAlignment */
      var horizontalAlignment: js.UndefOr[
            HorizontalAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.ColumnProperties.HorizontalAlignment * / any */ String) | Null
          ] = js.undefined
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
          value: HorizontalAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.ColumnProperties.HorizontalAlignment * / any */ String)
        ): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHorizontalAlignmentNull: Self = StObject.set(x, "horizontalAlignment", null)
        
        @scala.inline
        def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
      }
    }
    
    /** Properties of an Image. */
    trait IImage extends StObject {
      
      /** Image accessibilityText */
      var accessibilityText: js.UndefOr[String | Null] = js.undefined
      
      /** Image imageUri */
      var imageUri: js.UndefOr[String | Null] = js.undefined
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
    trait ILinkOutSuggestion extends StObject {
      
      /** LinkOutSuggestion destinationName */
      var destinationName: js.UndefOr[String | Null] = js.undefined
      
      /** LinkOutSuggestion uri */
      var uri: js.UndefOr[String | Null] = js.undefined
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
    trait IListSelect extends StObject {
      
      /** ListSelect items */
      var items: js.UndefOr[
            (js.Array[
              typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ListSelect.IItem
            ]) | Null
          ] = js.undefined
      
      /** ListSelect subtitle */
      var subtitle: js.UndefOr[String | Null] = js.undefined
      
      /** ListSelect title */
      var title: js.UndefOr[String | Null] = js.undefined
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
                  typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ListSelect.IItem
                ]
        ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsNull: Self = StObject.set(x, "items", null)
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ListSelect.IItem*): Self = StObject.set(x, "items", js.Array(value :_*))
        
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
    trait IMediaContent extends StObject {
      
      /** MediaContent mediaObjects */
      var mediaObjects: js.UndefOr[js.Array[IResponseMediaObject] | Null] = js.undefined
      
      /** MediaContent mediaType */
      var mediaType: js.UndefOr[
            ResponseMediaType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.ResponseMediaType * / any */ String) | Null
          ] = js.undefined
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
          value: ResponseMediaType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.ResponseMediaType * / any */ String)
        ): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMediaTypeNull: Self = StObject.set(x, "mediaType", null)
        
        @scala.inline
        def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      }
    }
    
    /** Properties of a QuickReplies. */
    trait IQuickReplies extends StObject {
      
      /** QuickReplies quickReplies */
      var quickReplies: js.UndefOr[js.Array[String] | Null] = js.undefined
      
      /** QuickReplies title */
      var title: js.UndefOr[String | Null] = js.undefined
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
    
    /** Properties of a RbmCardContent. */
    trait IRbmCardContent extends StObject {
      
      /** RbmCardContent description */
      var description: js.UndefOr[String | Null] = js.undefined
      
      /** RbmCardContent media */
      var media: js.UndefOr[IRbmMedia | Null] = js.undefined
      
      /** RbmCardContent suggestions */
      var suggestions: js.UndefOr[js.Array[IRbmSuggestion] | Null] = js.undefined
      
      /** RbmCardContent title */
      var title: js.UndefOr[String | Null] = js.undefined
    }
    object IRbmCardContent {
      
      @scala.inline
      def apply(): IRbmCardContent = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IRbmCardContent]
      }
      
      @scala.inline
      implicit class IRbmCardContentMutableBuilder[Self <: IRbmCardContent] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionNull: Self = StObject.set(x, "description", null)
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setMedia(value: IRbmMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMediaNull: Self = StObject.set(x, "media", null)
        
        @scala.inline
        def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
        
        @scala.inline
        def setSuggestions(value: js.Array[IRbmSuggestion]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSuggestionsNull: Self = StObject.set(x, "suggestions", null)
        
        @scala.inline
        def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
        
        @scala.inline
        def setSuggestionsVarargs(value: IRbmSuggestion*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleNull: Self = StObject.set(x, "title", null)
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    /** Properties of a RbmCarouselCard. */
    trait IRbmCarouselCard extends StObject {
      
      /** RbmCarouselCard cardContents */
      var cardContents: js.UndefOr[js.Array[IRbmCardContent] | Null] = js.undefined
      
      /** RbmCarouselCard cardWidth */
      var cardWidth: js.UndefOr[
            CardWidth | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.RbmCarouselCard.CardWidth * / any */ String) | Null
          ] = js.undefined
    }
    object IRbmCarouselCard {
      
      @scala.inline
      def apply(): IRbmCarouselCard = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IRbmCarouselCard]
      }
      
      @scala.inline
      implicit class IRbmCarouselCardMutableBuilder[Self <: IRbmCarouselCard] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCardContents(value: js.Array[IRbmCardContent]): Self = StObject.set(x, "cardContents", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCardContentsNull: Self = StObject.set(x, "cardContents", null)
        
        @scala.inline
        def setCardContentsUndefined: Self = StObject.set(x, "cardContents", js.undefined)
        
        @scala.inline
        def setCardContentsVarargs(value: IRbmCardContent*): Self = StObject.set(x, "cardContents", js.Array(value :_*))
        
        @scala.inline
        def setCardWidth(
          value: CardWidth | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.RbmCarouselCard.CardWidth * / any */ String)
        ): Self = StObject.set(x, "cardWidth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCardWidthNull: Self = StObject.set(x, "cardWidth", null)
        
        @scala.inline
        def setCardWidthUndefined: Self = StObject.set(x, "cardWidth", js.undefined)
      }
    }
    
    /** Properties of a RbmStandaloneCard. */
    trait IRbmStandaloneCard extends StObject {
      
      /** RbmStandaloneCard cardContent */
      var cardContent: js.UndefOr[IRbmCardContent | Null] = js.undefined
      
      /** RbmStandaloneCard cardOrientation */
      var cardOrientation: js.UndefOr[
            CardOrientation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.CardOrientation * / any */ String) | Null
          ] = js.undefined
      
      /** RbmStandaloneCard thumbnailImageAlignment */
      var thumbnailImageAlignment: js.UndefOr[
            ThumbnailImageAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.ThumbnailImageAlignment * / any */ String) | Null
          ] = js.undefined
    }
    object IRbmStandaloneCard {
      
      @scala.inline
      def apply(): IRbmStandaloneCard = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IRbmStandaloneCard]
      }
      
      @scala.inline
      implicit class IRbmStandaloneCardMutableBuilder[Self <: IRbmStandaloneCard] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCardContent(value: IRbmCardContent): Self = StObject.set(x, "cardContent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCardContentNull: Self = StObject.set(x, "cardContent", null)
        
        @scala.inline
        def setCardContentUndefined: Self = StObject.set(x, "cardContent", js.undefined)
        
        @scala.inline
        def setCardOrientation(
          value: CardOrientation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.CardOrientation * / any */ String)
        ): Self = StObject.set(x, "cardOrientation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCardOrientationNull: Self = StObject.set(x, "cardOrientation", null)
        
        @scala.inline
        def setCardOrientationUndefined: Self = StObject.set(x, "cardOrientation", js.undefined)
        
        @scala.inline
        def setThumbnailImageAlignment(
          value: ThumbnailImageAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.ThumbnailImageAlignment * / any */ String)
        ): Self = StObject.set(x, "thumbnailImageAlignment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThumbnailImageAlignmentNull: Self = StObject.set(x, "thumbnailImageAlignment", null)
        
        @scala.inline
        def setThumbnailImageAlignmentUndefined: Self = StObject.set(x, "thumbnailImageAlignment", js.undefined)
      }
    }
    
    /** Properties of a RbmSuggestedAction. */
    trait IRbmSuggestedAction extends StObject {
      
      /** RbmSuggestedAction dial */
      var dial: js.UndefOr[IRbmSuggestedActionDial | Null] = js.undefined
      
      /** RbmSuggestedAction openUrl */
      var openUrl: js.UndefOr[IRbmSuggestedActionOpenUri | Null] = js.undefined
      
      /** RbmSuggestedAction postbackData */
      var postbackData: js.UndefOr[String | Null] = js.undefined
      
      /** RbmSuggestedAction shareLocation */
      var shareLocation: js.UndefOr[IRbmSuggestedActionShareLocation | Null] = js.undefined
      
      /** RbmSuggestedAction text */
      var text: js.UndefOr[String | Null] = js.undefined
    }
    object IRbmSuggestedAction {
      
      @scala.inline
      def apply(): IRbmSuggestedAction = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IRbmSuggestedAction]
      }
      
      @scala.inline
      implicit class IRbmSuggestedActionMutableBuilder[Self <: IRbmSuggestedAction] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDial(value: IRbmSuggestedActionDial): Self = StObject.set(x, "dial", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDialNull: Self = StObject.set(x, "dial", null)
        
        @scala.inline
        def setDialUndefined: Self = StObject.set(x, "dial", js.undefined)
        
        @scala.inline
        def setOpenUrl(value: IRbmSuggestedActionOpenUri): Self = StObject.set(x, "openUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOpenUrlNull: Self = StObject.set(x, "openUrl", null)
        
        @scala.inline
        def setOpenUrlUndefined: Self = StObject.set(x, "openUrl", js.undefined)
        
        @scala.inline
        def setPostbackData(value: String): Self = StObject.set(x, "postbackData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPostbackDataNull: Self = StObject.set(x, "postbackData", null)
        
        @scala.inline
        def setPostbackDataUndefined: Self = StObject.set(x, "postbackData", js.undefined)
        
        @scala.inline
        def setShareLocation(value: IRbmSuggestedActionShareLocation): Self = StObject.set(x, "shareLocation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShareLocationNull: Self = StObject.set(x, "shareLocation", null)
        
        @scala.inline
        def setShareLocationUndefined: Self = StObject.set(x, "shareLocation", js.undefined)
        
        @scala.inline
        def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextNull: Self = StObject.set(x, "text", null)
        
        @scala.inline
        def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    /** Properties of a RbmSuggestedReply. */
    trait IRbmSuggestedReply extends StObject {
      
      /** RbmSuggestedReply postbackData */
      var postbackData: js.UndefOr[String | Null] = js.undefined
      
      /** RbmSuggestedReply text */
      var text: js.UndefOr[String | Null] = js.undefined
    }
    object IRbmSuggestedReply {
      
      @scala.inline
      def apply(): IRbmSuggestedReply = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IRbmSuggestedReply]
      }
      
      @scala.inline
      implicit class IRbmSuggestedReplyMutableBuilder[Self <: IRbmSuggestedReply] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPostbackData(value: String): Self = StObject.set(x, "postbackData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPostbackDataNull: Self = StObject.set(x, "postbackData", null)
        
        @scala.inline
        def setPostbackDataUndefined: Self = StObject.set(x, "postbackData", js.undefined)
        
        @scala.inline
        def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextNull: Self = StObject.set(x, "text", null)
        
        @scala.inline
        def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    /** Properties of a RbmSuggestion. */
    trait IRbmSuggestion extends StObject {
      
      /** RbmSuggestion action */
      var action: js.UndefOr[IRbmSuggestedAction | Null] = js.undefined
      
      /** RbmSuggestion reply */
      var reply: js.UndefOr[IRbmSuggestedReply | Null] = js.undefined
    }
    object IRbmSuggestion {
      
      @scala.inline
      def apply(): IRbmSuggestion = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IRbmSuggestion]
      }
      
      @scala.inline
      implicit class IRbmSuggestionMutableBuilder[Self <: IRbmSuggestion] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAction(value: IRbmSuggestedAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActionNull: Self = StObject.set(x, "action", null)
        
        @scala.inline
        def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
        
        @scala.inline
        def setReply(value: IRbmSuggestedReply): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReplyNull: Self = StObject.set(x, "reply", null)
        
        @scala.inline
        def setReplyUndefined: Self = StObject.set(x, "reply", js.undefined)
      }
    }
    
    /** Properties of a RbmText. */
    trait IRbmText extends StObject {
      
      /** RbmText rbmSuggestion */
      var rbmSuggestion: js.UndefOr[js.Array[IRbmSuggestion] | Null] = js.undefined
      
      /** RbmText text */
      var text: js.UndefOr[String | Null] = js.undefined
    }
    object IRbmText {
      
      @scala.inline
      def apply(): IRbmText = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IRbmText]
      }
      
      @scala.inline
      implicit class IRbmTextMutableBuilder[Self <: IRbmText] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRbmSuggestion(value: js.Array[IRbmSuggestion]): Self = StObject.set(x, "rbmSuggestion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRbmSuggestionNull: Self = StObject.set(x, "rbmSuggestion", null)
        
        @scala.inline
        def setRbmSuggestionUndefined: Self = StObject.set(x, "rbmSuggestion", js.undefined)
        
        @scala.inline
        def setRbmSuggestionVarargs(value: IRbmSuggestion*): Self = StObject.set(x, "rbmSuggestion", js.Array(value :_*))
        
        @scala.inline
        def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextNull: Self = StObject.set(x, "text", null)
        
        @scala.inline
        def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    /** Properties of a SelectItemInfo. */
    trait ISelectItemInfo extends StObject {
      
      /** SelectItemInfo key */
      var key: js.UndefOr[String | Null] = js.undefined
      
      /** SelectItemInfo synonyms */
      var synonyms: js.UndefOr[js.Array[String] | Null] = js.undefined
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
    trait ISimpleResponse extends StObject {
      
      /** SimpleResponse displayText */
      var displayText: js.UndefOr[String | Null] = js.undefined
      
      /** SimpleResponse ssml */
      var ssml: js.UndefOr[String | Null] = js.undefined
      
      /** SimpleResponse textToSpeech */
      var textToSpeech: js.UndefOr[String | Null] = js.undefined
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
    trait ISimpleResponses extends StObject {
      
      /** SimpleResponses simpleResponses */
      var simpleResponses: js.UndefOr[js.Array[ISimpleResponse] | Null] = js.undefined
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
    trait ISuggestion extends StObject {
      
      /** Suggestion title */
      var title: js.UndefOr[String | Null] = js.undefined
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
    trait ISuggestions extends StObject {
      
      /** Suggestions suggestions */
      var suggestions: js.UndefOr[js.Array[ISuggestion] | Null] = js.undefined
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
    trait ITableCard extends StObject {
      
      /** TableCard buttons */
      var buttons: js.UndefOr[js.Array[IButton] | Null] = js.undefined
      
      /** TableCard columnProperties */
      var columnProperties: js.UndefOr[js.Array[IColumnProperties] | Null] = js.undefined
      
      /** TableCard image */
      var image: js.UndefOr[IImage | Null] = js.undefined
      
      /** TableCard rows */
      var rows: js.UndefOr[js.Array[ITableCardRow] | Null] = js.undefined
      
      /** TableCard subtitle */
      var subtitle: js.UndefOr[String | Null] = js.undefined
      
      /** TableCard title */
      var title: js.UndefOr[String | Null] = js.undefined
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
    trait ITableCardCell extends StObject {
      
      /** TableCardCell text */
      var text: js.UndefOr[String | Null] = js.undefined
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
    trait ITableCardRow extends StObject {
      
      /** TableCardRow cells */
      var cells: js.UndefOr[js.Array[ITableCardCell] | Null] = js.undefined
      
      /** TableCardRow dividerAfter */
      var dividerAfter: js.UndefOr[Boolean | Null] = js.undefined
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
    
    /** Properties of a TelephonyPlayAudio. */
    trait ITelephonyPlayAudio extends StObject {
      
      /** TelephonyPlayAudio audioUri */
      var audioUri: js.UndefOr[String | Null] = js.undefined
    }
    object ITelephonyPlayAudio {
      
      @scala.inline
      def apply(): ITelephonyPlayAudio = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ITelephonyPlayAudio]
      }
      
      @scala.inline
      implicit class ITelephonyPlayAudioMutableBuilder[Self <: ITelephonyPlayAudio] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAudioUri(value: String): Self = StObject.set(x, "audioUri", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAudioUriNull: Self = StObject.set(x, "audioUri", null)
        
        @scala.inline
        def setAudioUriUndefined: Self = StObject.set(x, "audioUri", js.undefined)
      }
    }
    
    /** Properties of a TelephonySynthesizeSpeech. */
    trait ITelephonySynthesizeSpeech extends StObject {
      
      /** TelephonySynthesizeSpeech ssml */
      var ssml: js.UndefOr[String | Null] = js.undefined
      
      /** TelephonySynthesizeSpeech text */
      var text: js.UndefOr[String | Null] = js.undefined
    }
    object ITelephonySynthesizeSpeech {
      
      @scala.inline
      def apply(): ITelephonySynthesizeSpeech = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ITelephonySynthesizeSpeech]
      }
      
      @scala.inline
      implicit class ITelephonySynthesizeSpeechMutableBuilder[Self <: ITelephonySynthesizeSpeech] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSsml(value: String): Self = StObject.set(x, "ssml", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSsmlNull: Self = StObject.set(x, "ssml", null)
        
        @scala.inline
        def setSsmlUndefined: Self = StObject.set(x, "ssml", js.undefined)
        
        @scala.inline
        def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextNull: Self = StObject.set(x, "text", null)
        
        @scala.inline
        def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    /** Properties of a TelephonyTransferCall. */
    trait ITelephonyTransferCall extends StObject {
      
      /** TelephonyTransferCall phoneNumber */
      var phoneNumber: js.UndefOr[String | Null] = js.undefined
    }
    object ITelephonyTransferCall {
      
      @scala.inline
      def apply(): ITelephonyTransferCall = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ITelephonyTransferCall]
      }
      
      @scala.inline
      implicit class ITelephonyTransferCallMutableBuilder[Self <: ITelephonyTransferCall] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
        
        @scala.inline
        def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      }
    }
    
    /** Properties of a Text. */
    trait IText extends StObject {
      
      /** Text text */
      var text: js.UndefOr[js.Array[String] | Null] = js.undefined
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
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Parameter")
  @js.native
  /**
    * Constructs a new Parameter.
    * @param [properties] Properties to set
    */
  class Parameter ()
    extends StObject
       with IParameter {
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
    
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Parameter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Parameter instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Parameter instance
      */
    /* static member */
    @scala.inline
    def create(): Parameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Parameter]
    @scala.inline
    def create(properties: IParameter): Parameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Parameter]
    
    /**
      * Decodes a Parameter message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Parameter
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): Parameter = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Parameter]
    @scala.inline
    def decode(reader: Reader, length: Double): Parameter = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Parameter]
    @scala.inline
    def decode(reader: Uint8Array): Parameter = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Parameter]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): Parameter = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Parameter]
    
    /**
      * Decodes a Parameter message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Parameter
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): Parameter = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Parameter]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): Parameter = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Parameter]
    
    /**
      * Encodes the specified Parameter message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Parameter.verify|verify} messages.
      * @param message Parameter message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IParameter): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IParameter, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Parameter message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Parameter.verify|verify} messages.
      * @param message Parameter message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IParameter): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IParameter, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Parameter message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Parameter
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): Parameter = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Parameter]
    
    /**
      * Creates a plain object from a Parameter message. Also converts values to other types if specified.
      * @param message Parameter
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: Parameter): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(message: Parameter, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a Parameter message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a TrainingPhrase. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase")
  @js.native
  /**
    * Constructs a new TrainingPhrase.
    * @param [properties] Properties to set
    */
  class TrainingPhrase ()
    extends StObject
       with ITrainingPhrase {
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
    var type_TrainingPhrase: Type | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Type * / any */ String) = js.native
  }
  object TrainingPhrase {
    
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase")
    @js.native
    val ^ : js.Any = js.native
    
    /** Represents a Part. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Part")
    @js.native
    /**
      * Constructs a new Part.
      * @param [properties] Properties to set
      */
    class Part ()
      extends StObject
         with IPart {
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
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Part")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Part instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Part instance
        */
      /* static member */
      @scala.inline
      def create(): Part = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Part]
      @scala.inline
      def create(properties: IPart): Part = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Part]
      
      /**
        * Decodes a Part message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Part
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decode(reader: Reader): Part = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Part]
      @scala.inline
      def decode(reader: Reader, length: Double): Part = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Part]
      @scala.inline
      def decode(reader: Uint8Array): Part = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Part]
      @scala.inline
      def decode(reader: Uint8Array, length: Double): Part = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Part]
      
      /**
        * Decodes a Part message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Part
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @scala.inline
      def decodeDelimited(reader: Reader): Part = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Part]
      @scala.inline
      def decodeDelimited(reader: Uint8Array): Part = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Part]
      
      /**
        * Encodes the specified Part message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Part.verify|verify} messages.
        * @param message Part message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encode(message: IPart): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encode(message: IPart, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Part message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Part.verify|verify} messages.
        * @param message Part message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @scala.inline
      def encodeDelimited(message: IPart): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      @scala.inline
      def encodeDelimited(message: IPart, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a Part message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Part
        */
      /* static member */
      @scala.inline
      def fromObject(`object`: StringDictionary[js.Any]): Part = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Part]
      
      /**
        * Creates a plain object from a Part message. Also converts values to other types if specified.
        * @param message Part
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @scala.inline
      def toObject(message: Part): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      @scala.inline
      def toObject(message: Part, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a Part message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @scala.inline
      def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    @js.native
    sealed trait Type extends StObject
    /** Type enum. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Type")
    @js.native
    object Type extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Type & Double] = js.native
      
      @js.native
      sealed trait EXAMPLE
        extends StObject
           with Type
      /* 1 */ val EXAMPLE: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Type.EXAMPLE & Double = js.native
      
      @js.native
      sealed trait TEMPLATE
        extends StObject
           with Type
      /* 2 */ val TEMPLATE: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Type.TEMPLATE & Double = js.native
      
      @js.native
      sealed trait TYPE_UNSPECIFIED
        extends StObject
           with Type
      /* 0 */ val TYPE_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Type.TYPE_UNSPECIFIED & Double = js.native
    }
    
    /**
      * Creates a new TrainingPhrase instance using the specified properties.
      * @param [properties] Properties to set
      * @returns TrainingPhrase instance
      */
    /* static member */
    @scala.inline
    def create(): TrainingPhrase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TrainingPhrase]
    @scala.inline
    def create(properties: ITrainingPhrase): TrainingPhrase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TrainingPhrase]
    
    /**
      * Decodes a TrainingPhrase message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns TrainingPhrase
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): TrainingPhrase = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TrainingPhrase]
    @scala.inline
    def decode(reader: Reader, length: Double): TrainingPhrase = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TrainingPhrase]
    @scala.inline
    def decode(reader: Uint8Array): TrainingPhrase = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TrainingPhrase]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): TrainingPhrase = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TrainingPhrase]
    
    /**
      * Decodes a TrainingPhrase message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns TrainingPhrase
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): TrainingPhrase = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TrainingPhrase]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): TrainingPhrase = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TrainingPhrase]
    
    /**
      * Encodes the specified TrainingPhrase message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.verify|verify} messages.
      * @param message TrainingPhrase message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: ITrainingPhrase): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: ITrainingPhrase, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified TrainingPhrase message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.verify|verify} messages.
      * @param message TrainingPhrase message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: ITrainingPhrase): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: ITrainingPhrase, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a TrainingPhrase message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns TrainingPhrase
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): TrainingPhrase = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TrainingPhrase]
    
    /**
      * Creates a plain object from a TrainingPhrase message. Also converts values to other types if specified.
      * @param message TrainingPhrase
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: TrainingPhrase): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(message: TrainingPhrase, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a TrainingPhrase message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    /** Properties of a Part. */
    trait IPart extends StObject {
      
      /** Part alias */
      var alias: js.UndefOr[String | Null] = js.undefined
      
      /** Part entityType */
      var entityType: js.UndefOr[String | Null] = js.undefined
      
      /** Part text */
      var text: js.UndefOr[String | Null] = js.undefined
      
      /** Part userDefined */
      var userDefined: js.UndefOr[Boolean | Null] = js.undefined
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
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.WebhookState")
  @js.native
  object WebhookState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WebhookState & Double] = js.native
    
    @js.native
    sealed trait WEBHOOK_STATE_ENABLED
      extends StObject
         with WebhookState
    /* 1 */ val WEBHOOK_STATE_ENABLED: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.WebhookState.WEBHOOK_STATE_ENABLED & Double = js.native
    
    @js.native
    sealed trait WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING
      extends StObject
         with WebhookState
    /* 2 */ val WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.WebhookState.WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING & Double = js.native
    
    @js.native
    sealed trait WEBHOOK_STATE_UNSPECIFIED
      extends StObject
         with WebhookState
    /* 0 */ val WEBHOOK_STATE_UNSPECIFIED: typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.WebhookState.WEBHOOK_STATE_UNSPECIFIED & Double = js.native
  }
  
  /**
    * Creates a new Intent instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Intent instance
    */
  /* static member */
  @scala.inline
  def create(): Intent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Intent]
  @scala.inline
  def create(properties: IIntent): Intent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Intent]
  
  /**
    * Decodes an Intent message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Intent
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): Intent = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Intent]
  @scala.inline
  def decode(reader: Reader, length: Double): Intent = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Intent]
  @scala.inline
  def decode(reader: Uint8Array): Intent = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Intent]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): Intent = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Intent]
  
  /**
    * Decodes an Intent message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Intent
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): Intent = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Intent]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): Intent = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Intent]
  
  /**
    * Encodes the specified Intent message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.verify|verify} messages.
    * @param message Intent message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IIntent): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IIntent, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Intent message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.verify|verify} messages.
    * @param message Intent message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IIntent): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IIntent, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an Intent message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Intent
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): Intent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Intent]
  
  /**
    * Creates a plain object from an Intent message. Also converts values to other types if specified.
    * @param message Intent
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: Intent): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: Intent, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies an Intent message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of a FollowupIntentInfo. */
  trait IFollowupIntentInfo extends StObject {
    
    /** FollowupIntentInfo followupIntentName */
    var followupIntentName: js.UndefOr[String | Null] = js.undefined
    
    /** FollowupIntentInfo parentFollowupIntentName */
    var parentFollowupIntentName: js.UndefOr[String | Null] = js.undefined
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
  trait IMessage extends StObject {
    
    /** Message basicCard */
    var basicCard: js.UndefOr[IBasicCard | Null] = js.undefined
    
    /** Message browseCarouselCard */
    var browseCarouselCard: js.UndefOr[IBrowseCarouselCard | Null] = js.undefined
    
    /** Message card */
    var card: js.UndefOr[ICard | Null] = js.undefined
    
    /** Message carouselSelect */
    var carouselSelect: js.UndefOr[ICarouselSelect | Null] = js.undefined
    
    /** Message image */
    var image: js.UndefOr[IImage | Null] = js.undefined
    
    /** Message linkOutSuggestion */
    var linkOutSuggestion: js.UndefOr[ILinkOutSuggestion | Null] = js.undefined
    
    /** Message listSelect */
    var listSelect: js.UndefOr[IListSelect | Null] = js.undefined
    
    /** Message mediaContent */
    var mediaContent: js.UndefOr[IMediaContent | Null] = js.undefined
    
    /** Message payload */
    var payload: js.UndefOr[IStruct | Null] = js.undefined
    
    /** Message platform */
    var platform: js.UndefOr[
        Platform | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.Platform * / any */ String) | Null
      ] = js.undefined
    
    /** Message quickReplies */
    var quickReplies: js.UndefOr[IQuickReplies | Null] = js.undefined
    
    /** Message rbmCarouselRichCard */
    var rbmCarouselRichCard: js.UndefOr[IRbmCarouselCard | Null] = js.undefined
    
    /** Message rbmStandaloneRichCard */
    var rbmStandaloneRichCard: js.UndefOr[IRbmStandaloneCard | Null] = js.undefined
    
    /** Message rbmText */
    var rbmText: js.UndefOr[IRbmText | Null] = js.undefined
    
    /** Message simpleResponses */
    var simpleResponses: js.UndefOr[ISimpleResponses | Null] = js.undefined
    
    /** Message suggestions */
    var suggestions: js.UndefOr[ISuggestions | Null] = js.undefined
    
    /** Message tableCard */
    var tableCard: js.UndefOr[ITableCard | Null] = js.undefined
    
    /** Message telephonyPlayAudio */
    var telephonyPlayAudio: js.UndefOr[ITelephonyPlayAudio | Null] = js.undefined
    
    /** Message telephonySynthesizeSpeech */
    var telephonySynthesizeSpeech: js.UndefOr[ITelephonySynthesizeSpeech | Null] = js.undefined
    
    /** Message telephonyTransferCall */
    var telephonyTransferCall: js.UndefOr[ITelephonyTransferCall | Null] = js.undefined
    
    /** Message text */
    var text: js.UndefOr[IText | Null] = js.undefined
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
        value: Platform | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.Platform * / any */ String)
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
      def setRbmCarouselRichCard(value: IRbmCarouselCard): Self = StObject.set(x, "rbmCarouselRichCard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRbmCarouselRichCardNull: Self = StObject.set(x, "rbmCarouselRichCard", null)
      
      @scala.inline
      def setRbmCarouselRichCardUndefined: Self = StObject.set(x, "rbmCarouselRichCard", js.undefined)
      
      @scala.inline
      def setRbmStandaloneRichCard(value: IRbmStandaloneCard): Self = StObject.set(x, "rbmStandaloneRichCard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRbmStandaloneRichCardNull: Self = StObject.set(x, "rbmStandaloneRichCard", null)
      
      @scala.inline
      def setRbmStandaloneRichCardUndefined: Self = StObject.set(x, "rbmStandaloneRichCard", js.undefined)
      
      @scala.inline
      def setRbmText(value: IRbmText): Self = StObject.set(x, "rbmText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRbmTextNull: Self = StObject.set(x, "rbmText", null)
      
      @scala.inline
      def setRbmTextUndefined: Self = StObject.set(x, "rbmText", js.undefined)
      
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
      def setTelephonyPlayAudio(value: ITelephonyPlayAudio): Self = StObject.set(x, "telephonyPlayAudio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTelephonyPlayAudioNull: Self = StObject.set(x, "telephonyPlayAudio", null)
      
      @scala.inline
      def setTelephonyPlayAudioUndefined: Self = StObject.set(x, "telephonyPlayAudio", js.undefined)
      
      @scala.inline
      def setTelephonySynthesizeSpeech(value: ITelephonySynthesizeSpeech): Self = StObject.set(x, "telephonySynthesizeSpeech", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTelephonySynthesizeSpeechNull: Self = StObject.set(x, "telephonySynthesizeSpeech", null)
      
      @scala.inline
      def setTelephonySynthesizeSpeechUndefined: Self = StObject.set(x, "telephonySynthesizeSpeech", js.undefined)
      
      @scala.inline
      def setTelephonyTransferCall(value: ITelephonyTransferCall): Self = StObject.set(x, "telephonyTransferCall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTelephonyTransferCallNull: Self = StObject.set(x, "telephonyTransferCall", null)
      
      @scala.inline
      def setTelephonyTransferCallUndefined: Self = StObject.set(x, "telephonyTransferCall", js.undefined)
      
      @scala.inline
      def setText(value: IText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextNull: Self = StObject.set(x, "text", null)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  /** Properties of a Parameter. */
  trait IParameter extends StObject {
    
    /** Parameter defaultValue */
    var defaultValue: js.UndefOr[String | Null] = js.undefined
    
    /** Parameter displayName */
    var displayName: js.UndefOr[String | Null] = js.undefined
    
    /** Parameter entityTypeDisplayName */
    var entityTypeDisplayName: js.UndefOr[String | Null] = js.undefined
    
    /** Parameter isList */
    var isList: js.UndefOr[Boolean | Null] = js.undefined
    
    /** Parameter mandatory */
    var mandatory: js.UndefOr[Boolean | Null] = js.undefined
    
    /** Parameter name */
    var name: js.UndefOr[String | Null] = js.undefined
    
    /** Parameter prompts */
    var prompts: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /** Parameter value */
    var value: js.UndefOr[String | Null] = js.undefined
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
  trait ITrainingPhrase extends StObject {
    
    /** TrainingPhrase name */
    var name: js.UndefOr[String | Null] = js.undefined
    
    /** TrainingPhrase parts */
    var parts: js.UndefOr[js.Array[IPart] | Null] = js.undefined
    
    /** TrainingPhrase timesAddedCount */
    var timesAddedCount: js.UndefOr[Double | Null] = js.undefined
    
    /** TrainingPhrase type */
    var `type`: js.UndefOr[
        Type | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Type * / any */ String) | Null
      ] = js.undefined
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
        value: Type | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Type * / any */ String)
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
