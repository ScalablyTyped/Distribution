package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

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
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.IFollowupIntentInfo
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.IMessage
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.IParameter
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.ITrainingPhrase
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.IOpenUriAction
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.BasicCard.IButton
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.IOpenUrlAction
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.IBrowseCarouselCardItem
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.ImageDisplayOptions
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.IItem
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.HorizontalAlignment
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.IBasicCard
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.IBrowseCarouselCard
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ICard
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ICarouselSelect
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.IImage
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ILinkOutSuggestion
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.IListSelect
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.IMediaContent
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.IQuickReplies
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ISimpleResponses
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ISuggestions
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ITableCard
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.IText
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.MediaContent.IResponseMediaObject
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaType
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Platform
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.TrainingPhrase.IPart
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.TrainingPhrase.Type
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.WebhookState
import typings.dialogflow.protosProtosMod.google.protobuf.IStruct
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an Intent. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent")
@js.native
/**
  * Constructs a new Intent.
  * @param [properties] Properties to set
  */
open class Intent ()
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
  def toJSON(): StringDictionary[Any] = js.native
  
  /** Intent trainingPhrases. */
  @JSName("trainingPhrases")
  var trainingPhrases_Intent: js.Array[ITrainingPhrase] = js.native
  
  /** Intent webhookState. */
  @JSName("webhookState")
  var webhookState_Intent: WebhookState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.WebhookState * / any */ String) = js.native
}
object Intent {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a FollowupIntentInfo. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.FollowupIntentInfo")
  @js.native
  /**
    * Constructs a new FollowupIntentInfo.
    * @param [properties] Properties to set
    */
  open class FollowupIntentInfo ()
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
    def toJSON(): StringDictionary[Any] = js.native
  }
  object FollowupIntentInfo {
    
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.FollowupIntentInfo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new FollowupIntentInfo instance using the specified properties.
      * @param [properties] Properties to set
      * @returns FollowupIntentInfo instance
      */
    /* static member */
    inline def create(): FollowupIntentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[FollowupIntentInfo]
    inline def create(properties: IFollowupIntentInfo): FollowupIntentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[FollowupIntentInfo]
    
    inline def decode(reader: js.typedarray.Uint8Array): FollowupIntentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FollowupIntentInfo]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): FollowupIntentInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FollowupIntentInfo]
    /**
      * Decodes a FollowupIntentInfo message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns FollowupIntentInfo
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): FollowupIntentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FollowupIntentInfo]
    inline def decode(reader: Reader, length: Double): FollowupIntentInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FollowupIntentInfo]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): FollowupIntentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FollowupIntentInfo]
    /**
      * Decodes a FollowupIntentInfo message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns FollowupIntentInfo
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): FollowupIntentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FollowupIntentInfo]
    
    /**
      * Encodes the specified FollowupIntentInfo message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.FollowupIntentInfo.verify|verify} messages.
      * @param message FollowupIntentInfo message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IFollowupIntentInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IFollowupIntentInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified FollowupIntentInfo message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.FollowupIntentInfo.verify|verify} messages.
      * @param message FollowupIntentInfo message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IFollowupIntentInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IFollowupIntentInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a FollowupIntentInfo message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns FollowupIntentInfo
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): FollowupIntentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[FollowupIntentInfo]
    
    /**
      * Creates a plain object from a FollowupIntentInfo message. Also converts values to other types if specified.
      * @param message FollowupIntentInfo
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: FollowupIntentInfo): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: FollowupIntentInfo, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a FollowupIntentInfo message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a Message. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message")
  @js.native
  /**
    * Constructs a new Message.
    * @param [properties] Properties to set
    */
  open class Message ()
    extends StObject
       with IMessage {
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
    def toJSON(): StringDictionary[Any] = js.native
  }
  object Message {
    
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message")
    @js.native
    val ^ : js.Any = js.native
    
    /** Represents a BasicCard. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard")
    @js.native
    /**
      * Constructs a new BasicCard.
      * @param [properties] Properties to set
      */
    open class BasicCard ()
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
      def toJSON(): StringDictionary[Any] = js.native
    }
    object BasicCard {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard")
      @js.native
      val ^ : js.Any = js.native
      
      /** Represents a Button. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button")
      @js.native
      /**
        * Constructs a new Button.
        * @param [properties] Properties to set
        */
      open class Button ()
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
        def toJSON(): StringDictionary[Any] = js.native
      }
      object Button {
        
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button")
        @js.native
        val ^ : js.Any = js.native
        
        /** Represents an OpenUriAction. */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.OpenUriAction")
        @js.native
        /**
          * Constructs a new OpenUriAction.
          * @param [properties] Properties to set
          */
        open class OpenUriAction ()
          extends StObject
             with IOpenUriAction {
          def this(properties: IOpenUriAction) = this()
          
          /**
            * Converts this OpenUriAction to JSON.
            * @returns JSON object
            */
          def toJSON(): StringDictionary[Any] = js.native
          
          /** OpenUriAction uri. */
          @JSName("uri")
          var uri_OpenUriAction: String = js.native
        }
        object OpenUriAction {
          
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.OpenUriAction")
          @js.native
          val ^ : js.Any = js.native
          
          /**
            * Creates a new OpenUriAction instance using the specified properties.
            * @param [properties] Properties to set
            * @returns OpenUriAction instance
            */
          /* static member */
          inline def create(): OpenUriAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[OpenUriAction]
          inline def create(properties: IOpenUriAction): OpenUriAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[OpenUriAction]
          
          inline def decode(reader: js.typedarray.Uint8Array): OpenUriAction = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[OpenUriAction]
          inline def decode(reader: js.typedarray.Uint8Array, length: Double): OpenUriAction = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[OpenUriAction]
          /**
            * Decodes an OpenUriAction message from the specified reader or buffer.
            * @param reader Reader or buffer to decode from
            * @param [length] Message length if known beforehand
            * @returns OpenUriAction
            * @throws {Error} If the payload is not a reader or valid buffer
            * @throws {$protobuf.util.ProtocolError} If required fields are missing
            */
          /* static member */
          inline def decode(reader: Reader): OpenUriAction = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[OpenUriAction]
          inline def decode(reader: Reader, length: Double): OpenUriAction = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[OpenUriAction]
          
          inline def decodeDelimited(reader: js.typedarray.Uint8Array): OpenUriAction = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[OpenUriAction]
          /**
            * Decodes an OpenUriAction message from the specified reader or buffer, length delimited.
            * @param reader Reader or buffer to decode from
            * @returns OpenUriAction
            * @throws {Error} If the payload is not a reader or valid buffer
            * @throws {$protobuf.util.ProtocolError} If required fields are missing
            */
          /* static member */
          inline def decodeDelimited(reader: Reader): OpenUriAction = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[OpenUriAction]
          
          /**
            * Encodes the specified OpenUriAction message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.OpenUriAction.verify|verify} messages.
            * @param message OpenUriAction message or plain object to encode
            * @param [writer] Writer to encode to
            * @returns Writer
            */
          /* static member */
          inline def encode(message: IOpenUriAction): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
          inline def encode(message: IOpenUriAction, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
          
          /**
            * Encodes the specified OpenUriAction message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.OpenUriAction.verify|verify} messages.
            * @param message OpenUriAction message or plain object to encode
            * @param [writer] Writer to encode to
            * @returns Writer
            */
          /* static member */
          inline def encodeDelimited(message: IOpenUriAction): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
          inline def encodeDelimited(message: IOpenUriAction, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
          
          /**
            * Creates an OpenUriAction message from a plain object. Also converts values to their respective internal types.
            * @param object Plain object
            * @returns OpenUriAction
            */
          /* static member */
          inline def fromObject(`object`: StringDictionary[Any]): OpenUriAction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[OpenUriAction]
          
          /**
            * Creates a plain object from an OpenUriAction message. Also converts values to other types if specified.
            * @param message OpenUriAction
            * @param [options] Conversion options
            * @returns Plain object
            */
          /* static member */
          inline def toObject(message: OpenUriAction): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
          inline def toObject(message: OpenUriAction, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
          
          /**
            * Verifies an OpenUriAction message.
            * @param message Plain object to verify
            * @returns `null` if valid, otherwise the reason why it is not
            */
          /* static member */
          inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
        }
        
        /**
          * Creates a new Button instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Button instance
          */
        /* static member */
        inline def create(): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Button]
        inline def create(properties: IButton): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Button]
        
        inline def decode(reader: js.typedarray.Uint8Array): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Button]
        inline def decode(reader: js.typedarray.Uint8Array, length: Double): Button = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Button]
        /**
          * Decodes a Button message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Button
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Button]
        inline def decode(reader: Reader, length: Double): Button = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Button]
        
        inline def decodeDelimited(reader: js.typedarray.Uint8Array): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Button]
        /**
          * Decodes a Button message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Button
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Button]
        
        /**
          * Encodes the specified Button message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.verify|verify} messages.
          * @param message Button message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encode(message: IButton): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encode(message: IButton, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified Button message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button.verify|verify} messages.
          * @param message Button message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encodeDelimited(message: IButton): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encodeDelimited(message: IButton, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates a Button message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Button
          */
        /* static member */
        inline def fromObject(`object`: StringDictionary[Any]): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Button]
        
        /**
          * Creates a plain object from a Button message. Also converts values to other types if specified.
          * @param message Button
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(message: Button): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
        inline def toObject(message: Button, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
        
        /**
          * Verifies a Button message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
        
        /** Properties of an OpenUriAction. */
        trait IOpenUriAction extends StObject {
          
          /** OpenUriAction uri */
          var uri: js.UndefOr[String | Null] = js.undefined
        }
        object IOpenUriAction {
          
          inline def apply(): IOpenUriAction = {
            val __obj = js.Dynamic.literal()
            __obj.asInstanceOf[IOpenUriAction]
          }
          
          @scala.inline
          implicit open class MutableBuilder[Self <: IOpenUriAction] (val x: Self) extends AnyVal {
            
            inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
            
            inline def setUriNull: Self = StObject.set(x, "uri", null)
            
            inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
          }
        }
      }
      
      /**
        * Creates a new BasicCard instance using the specified properties.
        * @param [properties] Properties to set
        * @returns BasicCard instance
        */
      /* static member */
      inline def create(): BasicCard = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BasicCard]
      inline def create(properties: IBasicCard): BasicCard = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BasicCard]
      
      inline def decode(reader: js.typedarray.Uint8Array): BasicCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BasicCard]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): BasicCard = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BasicCard]
      /**
        * Decodes a BasicCard message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns BasicCard
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): BasicCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BasicCard]
      inline def decode(reader: Reader, length: Double): BasicCard = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BasicCard]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): BasicCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BasicCard]
      /**
        * Decodes a BasicCard message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns BasicCard
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): BasicCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BasicCard]
      
      /**
        * Encodes the specified BasicCard message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BasicCard.verify|verify} messages.
        * @param message BasicCard message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IBasicCard): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IBasicCard, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified BasicCard message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BasicCard.verify|verify} messages.
        * @param message BasicCard message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IBasicCard): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IBasicCard, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a BasicCard message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns BasicCard
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): BasicCard = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BasicCard]
      
      /**
        * Creates a plain object from a BasicCard message. Also converts values to other types if specified.
        * @param message BasicCard
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: BasicCard): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: BasicCard, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a BasicCard message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      
      /** Properties of a Button. */
      trait IButton extends StObject {
        
        /** Button openUriAction */
        var openUriAction: js.UndefOr[IOpenUriAction | Null] = js.undefined
        
        /** Button title */
        var title: js.UndefOr[String | Null] = js.undefined
      }
      object IButton {
        
        inline def apply(): IButton = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IButton]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: IButton] (val x: Self) extends AnyVal {
          
          inline def setOpenUriAction(value: IOpenUriAction): Self = StObject.set(x, "openUriAction", value.asInstanceOf[js.Any])
          
          inline def setOpenUriActionNull: Self = StObject.set(x, "openUriAction", null)
          
          inline def setOpenUriActionUndefined: Self = StObject.set(x, "openUriAction", js.undefined)
          
          inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          inline def setTitleNull: Self = StObject.set(x, "title", null)
          
          inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
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
    open class BrowseCarouselCard ()
      extends StObject
         with IBrowseCarouselCard {
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
      def toJSON(): StringDictionary[Any] = js.native
    }
    object BrowseCarouselCard {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard")
      @js.native
      val ^ : js.Any = js.native
      
      /** Represents a BrowseCarouselCardItem. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem")
      @js.native
      /**
        * Constructs a new BrowseCarouselCardItem.
        * @param [properties] Properties to set
        */
      open class BrowseCarouselCardItem ()
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
        def toJSON(): StringDictionary[Any] = js.native
      }
      object BrowseCarouselCardItem {
        
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem")
        @js.native
        val ^ : js.Any = js.native
        
        /** Represents an OpenUrlAction. */
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction")
        @js.native
        /**
          * Constructs a new OpenUrlAction.
          * @param [properties] Properties to set
          */
        open class OpenUrlAction ()
          extends StObject
             with IOpenUrlAction {
          def this(properties: IOpenUrlAction) = this()
          
          /**
            * Converts this OpenUrlAction to JSON.
            * @returns JSON object
            */
          def toJSON(): StringDictionary[Any] = js.native
          
          /** OpenUrlAction urlTypeHint. */
          @JSName("urlTypeHint")
          var urlTypeHint_OpenUrlAction: UrlTypeHint | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint * / any */ String) = js.native
          
          /** OpenUrlAction url. */
          @JSName("url")
          var url_OpenUrlAction: String = js.native
        }
        object OpenUrlAction {
          
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction")
          @js.native
          val ^ : js.Any = js.native
          
          @js.native
          sealed trait UrlTypeHint extends StObject
          /** UrlTypeHint enum. */
          @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint")
          @js.native
          object UrlTypeHint extends StObject {
            
            @JSBracketAccess
            def apply(value: Double): js.UndefOr[UrlTypeHint & Double] = js.native
            
            @js.native
            sealed trait AMP_ACTION
              extends StObject
                 with UrlTypeHint
            /* 1 */ val AMP_ACTION: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint.AMP_ACTION & Double = js.native
            
            @js.native
            sealed trait AMP_CONTENT
              extends StObject
                 with UrlTypeHint
            /* 2 */ val AMP_CONTENT: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint.AMP_CONTENT & Double = js.native
            
            @js.native
            sealed trait URL_TYPE_HINT_UNSPECIFIED
              extends StObject
                 with UrlTypeHint
            /* 0 */ val URL_TYPE_HINT_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint.URL_TYPE_HINT_UNSPECIFIED & Double = js.native
          }
          
          /**
            * Creates a new OpenUrlAction instance using the specified properties.
            * @param [properties] Properties to set
            * @returns OpenUrlAction instance
            */
          /* static member */
          inline def create(): OpenUrlAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[OpenUrlAction]
          inline def create(properties: IOpenUrlAction): OpenUrlAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[OpenUrlAction]
          
          inline def decode(reader: js.typedarray.Uint8Array): OpenUrlAction = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[OpenUrlAction]
          inline def decode(reader: js.typedarray.Uint8Array, length: Double): OpenUrlAction = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[OpenUrlAction]
          /**
            * Decodes an OpenUrlAction message from the specified reader or buffer.
            * @param reader Reader or buffer to decode from
            * @param [length] Message length if known beforehand
            * @returns OpenUrlAction
            * @throws {Error} If the payload is not a reader or valid buffer
            * @throws {$protobuf.util.ProtocolError} If required fields are missing
            */
          /* static member */
          inline def decode(reader: Reader): OpenUrlAction = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[OpenUrlAction]
          inline def decode(reader: Reader, length: Double): OpenUrlAction = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[OpenUrlAction]
          
          inline def decodeDelimited(reader: js.typedarray.Uint8Array): OpenUrlAction = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[OpenUrlAction]
          /**
            * Decodes an OpenUrlAction message from the specified reader or buffer, length delimited.
            * @param reader Reader or buffer to decode from
            * @returns OpenUrlAction
            * @throws {Error} If the payload is not a reader or valid buffer
            * @throws {$protobuf.util.ProtocolError} If required fields are missing
            */
          /* static member */
          inline def decodeDelimited(reader: Reader): OpenUrlAction = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[OpenUrlAction]
          
          /**
            * Encodes the specified OpenUrlAction message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.verify|verify} messages.
            * @param message OpenUrlAction message or plain object to encode
            * @param [writer] Writer to encode to
            * @returns Writer
            */
          /* static member */
          inline def encode(message: IOpenUrlAction): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
          inline def encode(message: IOpenUrlAction, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
          
          /**
            * Encodes the specified OpenUrlAction message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.verify|verify} messages.
            * @param message OpenUrlAction message or plain object to encode
            * @param [writer] Writer to encode to
            * @returns Writer
            */
          /* static member */
          inline def encodeDelimited(message: IOpenUrlAction): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
          inline def encodeDelimited(message: IOpenUrlAction, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
          
          /**
            * Creates an OpenUrlAction message from a plain object. Also converts values to their respective internal types.
            * @param object Plain object
            * @returns OpenUrlAction
            */
          /* static member */
          inline def fromObject(`object`: StringDictionary[Any]): OpenUrlAction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[OpenUrlAction]
          
          /**
            * Creates a plain object from an OpenUrlAction message. Also converts values to other types if specified.
            * @param message OpenUrlAction
            * @param [options] Conversion options
            * @returns Plain object
            */
          /* static member */
          inline def toObject(message: OpenUrlAction): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
          inline def toObject(message: OpenUrlAction, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
          
          /**
            * Verifies an OpenUrlAction message.
            * @param message Plain object to verify
            * @returns `null` if valid, otherwise the reason why it is not
            */
          /* static member */
          inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
        }
        
        /**
          * Creates a new BrowseCarouselCardItem instance using the specified properties.
          * @param [properties] Properties to set
          * @returns BrowseCarouselCardItem instance
          */
        /* static member */
        inline def create(): BrowseCarouselCardItem = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BrowseCarouselCardItem]
        inline def create(properties: IBrowseCarouselCardItem): BrowseCarouselCardItem = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCardItem]
        
        inline def decode(reader: js.typedarray.Uint8Array): BrowseCarouselCardItem = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCardItem]
        inline def decode(reader: js.typedarray.Uint8Array, length: Double): BrowseCarouselCardItem = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BrowseCarouselCardItem]
        /**
          * Decodes a BrowseCarouselCardItem message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns BrowseCarouselCardItem
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): BrowseCarouselCardItem = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCardItem]
        inline def decode(reader: Reader, length: Double): BrowseCarouselCardItem = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BrowseCarouselCardItem]
        
        inline def decodeDelimited(reader: js.typedarray.Uint8Array): BrowseCarouselCardItem = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCardItem]
        /**
          * Decodes a BrowseCarouselCardItem message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns BrowseCarouselCardItem
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): BrowseCarouselCardItem = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCardItem]
        
        /**
          * Encodes the specified BrowseCarouselCardItem message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.verify|verify} messages.
          * @param message BrowseCarouselCardItem message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encode(message: IBrowseCarouselCardItem): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encode(message: IBrowseCarouselCardItem, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified BrowseCarouselCardItem message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.verify|verify} messages.
          * @param message BrowseCarouselCardItem message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encodeDelimited(message: IBrowseCarouselCardItem): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encodeDelimited(message: IBrowseCarouselCardItem, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates a BrowseCarouselCardItem message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns BrowseCarouselCardItem
          */
        /* static member */
        inline def fromObject(`object`: StringDictionary[Any]): BrowseCarouselCardItem = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCardItem]
        
        /**
          * Creates a plain object from a BrowseCarouselCardItem message. Also converts values to other types if specified.
          * @param message BrowseCarouselCardItem
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(message: BrowseCarouselCardItem): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
        inline def toObject(message: BrowseCarouselCardItem, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
        
        /**
          * Verifies a BrowseCarouselCardItem message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
        
        /** Properties of an OpenUrlAction. */
        trait IOpenUrlAction extends StObject {
          
          /** OpenUrlAction url */
          var url: js.UndefOr[String | Null] = js.undefined
          
          /** OpenUrlAction urlTypeHint */
          var urlTypeHint: js.UndefOr[
                    UrlTypeHint | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint * / any */ String) | Null
                  ] = js.undefined
        }
        object IOpenUrlAction {
          
          inline def apply(): IOpenUrlAction = {
            val __obj = js.Dynamic.literal()
            __obj.asInstanceOf[IOpenUrlAction]
          }
          
          @scala.inline
          implicit open class MutableBuilder[Self <: IOpenUrlAction] (val x: Self) extends AnyVal {
            
            inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
            
            inline def setUrlNull: Self = StObject.set(x, "url", null)
            
            inline def setUrlTypeHint(
              value: UrlTypeHint | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint * / any */ String)
            ): Self = StObject.set(x, "urlTypeHint", value.asInstanceOf[js.Any])
            
            inline def setUrlTypeHintNull: Self = StObject.set(x, "urlTypeHint", null)
            
            inline def setUrlTypeHintUndefined: Self = StObject.set(x, "urlTypeHint", js.undefined)
            
            inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
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
        def apply(value: Double): js.UndefOr[ImageDisplayOptions & Double] = js.native
        
        @js.native
        sealed trait BLURRED_BACKGROUND
          extends StObject
             with ImageDisplayOptions
        /* 4 */ val BLURRED_BACKGROUND: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.BLURRED_BACKGROUND & Double = js.native
        
        @js.native
        sealed trait CROPPED
          extends StObject
             with ImageDisplayOptions
        /* 3 */ val CROPPED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.CROPPED & Double = js.native
        
        @js.native
        sealed trait GRAY
          extends StObject
             with ImageDisplayOptions
        /* 1 */ val GRAY: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.GRAY & Double = js.native
        
        @js.native
        sealed trait IMAGE_DISPLAY_OPTIONS_UNSPECIFIED
          extends StObject
             with ImageDisplayOptions
        /* 0 */ val IMAGE_DISPLAY_OPTIONS_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.IMAGE_DISPLAY_OPTIONS_UNSPECIFIED & Double = js.native
        
        @js.native
        sealed trait WHITE
          extends StObject
             with ImageDisplayOptions
        /* 2 */ val WHITE: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.WHITE & Double = js.native
      }
      
      /**
        * Creates a new BrowseCarouselCard instance using the specified properties.
        * @param [properties] Properties to set
        * @returns BrowseCarouselCard instance
        */
      /* static member */
      inline def create(): BrowseCarouselCard = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BrowseCarouselCard]
      inline def create(properties: IBrowseCarouselCard): BrowseCarouselCard = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCard]
      
      inline def decode(reader: js.typedarray.Uint8Array): BrowseCarouselCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCard]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): BrowseCarouselCard = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BrowseCarouselCard]
      /**
        * Decodes a BrowseCarouselCard message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns BrowseCarouselCard
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): BrowseCarouselCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCard]
      inline def decode(reader: Reader, length: Double): BrowseCarouselCard = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BrowseCarouselCard]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): BrowseCarouselCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCard]
      /**
        * Decodes a BrowseCarouselCard message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns BrowseCarouselCard
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): BrowseCarouselCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCard]
      
      /**
        * Encodes the specified BrowseCarouselCard message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.verify|verify} messages.
        * @param message BrowseCarouselCard message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IBrowseCarouselCard): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IBrowseCarouselCard, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified BrowseCarouselCard message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.verify|verify} messages.
        * @param message BrowseCarouselCard message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IBrowseCarouselCard): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IBrowseCarouselCard, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a BrowseCarouselCard message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns BrowseCarouselCard
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): BrowseCarouselCard = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BrowseCarouselCard]
      
      /**
        * Creates a plain object from a BrowseCarouselCard message. Also converts values to other types if specified.
        * @param message BrowseCarouselCard
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: BrowseCarouselCard): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: BrowseCarouselCard, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a BrowseCarouselCard message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      
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
        
        inline def apply(): IBrowseCarouselCardItem = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IBrowseCarouselCardItem]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: IBrowseCarouselCardItem] (val x: Self) extends AnyVal {
          
          inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
          
          inline def setDescriptionNull: Self = StObject.set(x, "description", null)
          
          inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
          
          inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
          
          inline def setFooterNull: Self = StObject.set(x, "footer", null)
          
          inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
          
          inline def setImage(value: IImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
          
          inline def setImageNull: Self = StObject.set(x, "image", null)
          
          inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
          
          inline def setOpenUriAction(value: IOpenUrlAction): Self = StObject.set(x, "openUriAction", value.asInstanceOf[js.Any])
          
          inline def setOpenUriActionNull: Self = StObject.set(x, "openUriAction", null)
          
          inline def setOpenUriActionUndefined: Self = StObject.set(x, "openUriAction", js.undefined)
          
          inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          inline def setTitleNull: Self = StObject.set(x, "title", null)
          
          inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
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
    open class Card ()
      extends StObject
         with ICard {
      def this(properties: ICard) = this()
      
      /** Card buttons. */
      @JSName("buttons")
      var buttons_Card: js.Array[
            typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton
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
      def toJSON(): StringDictionary[Any] = js.native
    }
    object Card {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card")
      @js.native
      val ^ : js.Any = js.native
      
      /** Represents a Button. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.Button")
      @js.native
      /**
        * Constructs a new Button.
        * @param [properties] Properties to set
        */
      open class Button ()
        extends StObject
           with typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton {
        def this(properties: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton) = this()
        
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
        def toJSON(): StringDictionary[Any] = js.native
      }
      object Button {
        
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card.Button")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new Button instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Button instance
          */
        /* static member */
        inline def create(): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Button]
        inline def create(
          properties: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton
        ): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Button]
        
        inline def decode(reader: js.typedarray.Uint8Array): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Button]
        inline def decode(reader: js.typedarray.Uint8Array, length: Double): Button = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Button]
        /**
          * Decodes a Button message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Button
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Button]
        inline def decode(reader: Reader, length: Double): Button = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Button]
        
        inline def decodeDelimited(reader: js.typedarray.Uint8Array): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Button]
        /**
          * Decodes a Button message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Button
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Button]
        
        /**
          * Encodes the specified Button message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Card.Button.verify|verify} messages.
          * @param message Button message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encode(message: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encode(
          message: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton,
          writer: Writer
        ): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified Button message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Card.Button.verify|verify} messages.
          * @param message Button message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encodeDelimited(message: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encodeDelimited(
          message: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton,
          writer: Writer
        ): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates a Button message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Button
          */
        /* static member */
        inline def fromObject(`object`: StringDictionary[Any]): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Button]
        
        /**
          * Creates a plain object from a Button message. Also converts values to other types if specified.
          * @param message Button
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(message: Button): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
        inline def toObject(message: Button, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
        
        /**
          * Verifies a Button message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      /**
        * Creates a new Card instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Card instance
        */
      /* static member */
      inline def create(): Card = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Card]
      inline def create(properties: ICard): Card = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Card]
      
      inline def decode(reader: js.typedarray.Uint8Array): Card = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Card]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): Card = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Card]
      /**
        * Decodes a Card message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Card
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): Card = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Card]
      inline def decode(reader: Reader, length: Double): Card = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Card]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): Card = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Card]
      /**
        * Decodes a Card message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Card
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): Card = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Card]
      
      /**
        * Encodes the specified Card message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Card.verify|verify} messages.
        * @param message Card message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: ICard): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: ICard, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Card message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Card.verify|verify} messages.
        * @param message Card message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: ICard): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: ICard, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a Card message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Card
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): Card = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Card]
      
      /**
        * Creates a plain object from a Card message. Also converts values to other types if specified.
        * @param message Card
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: Card): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: Card, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a Card message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      
      /** Properties of a Button. */
      trait IButton extends StObject {
        
        /** Button postback */
        var postback: js.UndefOr[String | Null] = js.undefined
        
        /** Button text */
        var text: js.UndefOr[String | Null] = js.undefined
      }
      object IButton {
        
        inline def apply(): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton] (val x: Self) extends AnyVal {
          
          inline def setPostback(value: String): Self = StObject.set(x, "postback", value.asInstanceOf[js.Any])
          
          inline def setPostbackNull: Self = StObject.set(x, "postback", null)
          
          inline def setPostbackUndefined: Self = StObject.set(x, "postback", js.undefined)
          
          inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
          
          inline def setTextNull: Self = StObject.set(x, "text", null)
          
          inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
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
    open class CarouselSelect ()
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
      def toJSON(): StringDictionary[Any] = js.native
    }
    object CarouselSelect {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect")
      @js.native
      val ^ : js.Any = js.native
      
      /** Represents an Item. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.Item")
      @js.native
      /**
        * Constructs a new Item.
        * @param [properties] Properties to set
        */
      open class Item ()
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
        def toJSON(): StringDictionary[Any] = js.native
      }
      object Item {
        
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.Item")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new Item instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Item instance
          */
        /* static member */
        inline def create(): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Item]
        inline def create(properties: IItem): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Item]
        
        inline def decode(reader: js.typedarray.Uint8Array): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Item]
        inline def decode(reader: js.typedarray.Uint8Array, length: Double): Item = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Item]
        /**
          * Decodes an Item message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Item
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Item]
        inline def decode(reader: Reader, length: Double): Item = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Item]
        
        inline def decodeDelimited(reader: js.typedarray.Uint8Array): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Item]
        /**
          * Decodes an Item message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Item
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Item]
        
        /**
          * Encodes the specified Item message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.Item.verify|verify} messages.
          * @param message Item message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encode(message: IItem): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encode(message: IItem, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified Item message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.Item.verify|verify} messages.
          * @param message Item message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encodeDelimited(message: IItem): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encodeDelimited(message: IItem, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates an Item message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Item
          */
        /* static member */
        inline def fromObject(`object`: StringDictionary[Any]): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Item]
        
        /**
          * Creates a plain object from an Item message. Also converts values to other types if specified.
          * @param message Item
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(message: Item): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
        inline def toObject(message: Item, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
        
        /**
          * Verifies an Item message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      /**
        * Creates a new CarouselSelect instance using the specified properties.
        * @param [properties] Properties to set
        * @returns CarouselSelect instance
        */
      /* static member */
      inline def create(): CarouselSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CarouselSelect]
      inline def create(properties: ICarouselSelect): CarouselSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CarouselSelect]
      
      inline def decode(reader: js.typedarray.Uint8Array): CarouselSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CarouselSelect]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): CarouselSelect = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CarouselSelect]
      /**
        * Decodes a CarouselSelect message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns CarouselSelect
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): CarouselSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CarouselSelect]
      inline def decode(reader: Reader, length: Double): CarouselSelect = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CarouselSelect]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): CarouselSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CarouselSelect]
      /**
        * Decodes a CarouselSelect message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns CarouselSelect
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): CarouselSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CarouselSelect]
      
      /**
        * Encodes the specified CarouselSelect message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.verify|verify} messages.
        * @param message CarouselSelect message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: ICarouselSelect): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: ICarouselSelect, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified CarouselSelect message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.verify|verify} messages.
        * @param message CarouselSelect message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: ICarouselSelect): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: ICarouselSelect, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a CarouselSelect message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns CarouselSelect
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): CarouselSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CarouselSelect]
      
      /**
        * Creates a plain object from a CarouselSelect message. Also converts values to other types if specified.
        * @param message CarouselSelect
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: CarouselSelect): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: CarouselSelect, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a CarouselSelect message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      
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
        
        inline def apply(): IItem = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IItem]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: IItem] (val x: Self) extends AnyVal {
          
          inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
          
          inline def setDescriptionNull: Self = StObject.set(x, "description", null)
          
          inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
          
          inline def setImage(value: IImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
          
          inline def setImageNull: Self = StObject.set(x, "image", null)
          
          inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
          
          inline def setInfo(value: ISelectItemInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
          
          inline def setInfoNull: Self = StObject.set(x, "info", null)
          
          inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
          
          inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          inline def setTitleNull: Self = StObject.set(x, "title", null)
          
          inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
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
    open class ColumnProperties ()
      extends StObject
         with IColumnProperties {
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
      def toJSON(): StringDictionary[Any] = js.native
    }
    object ColumnProperties {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ColumnProperties")
      @js.native
      val ^ : js.Any = js.native
      
      @js.native
      sealed trait HorizontalAlignment extends StObject
      /** HorizontalAlignment enum. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.HorizontalAlignment")
      @js.native
      object HorizontalAlignment extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[HorizontalAlignment & Double] = js.native
        
        @js.native
        sealed trait CENTER
          extends StObject
             with HorizontalAlignment
        /* 2 */ val CENTER: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.HorizontalAlignment.CENTER & Double = js.native
        
        @js.native
        sealed trait HORIZONTAL_ALIGNMENT_UNSPECIFIED
          extends StObject
             with HorizontalAlignment
        /* 0 */ val HORIZONTAL_ALIGNMENT_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.HorizontalAlignment.HORIZONTAL_ALIGNMENT_UNSPECIFIED & Double = js.native
        
        @js.native
        sealed trait LEADING
          extends StObject
             with HorizontalAlignment
        /* 1 */ val LEADING: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.HorizontalAlignment.LEADING & Double = js.native
        
        @js.native
        sealed trait TRAILING
          extends StObject
             with HorizontalAlignment
        /* 3 */ val TRAILING: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.HorizontalAlignment.TRAILING & Double = js.native
      }
      
      /**
        * Creates a new ColumnProperties instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ColumnProperties instance
        */
      /* static member */
      inline def create(): ColumnProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ColumnProperties]
      inline def create(properties: IColumnProperties): ColumnProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ColumnProperties]
      
      inline def decode(reader: js.typedarray.Uint8Array): ColumnProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ColumnProperties]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): ColumnProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ColumnProperties]
      /**
        * Decodes a ColumnProperties message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ColumnProperties
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): ColumnProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ColumnProperties]
      inline def decode(reader: Reader, length: Double): ColumnProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ColumnProperties]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): ColumnProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ColumnProperties]
      /**
        * Decodes a ColumnProperties message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ColumnProperties
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): ColumnProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ColumnProperties]
      
      /**
        * Encodes the specified ColumnProperties message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.verify|verify} messages.
        * @param message ColumnProperties message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IColumnProperties): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IColumnProperties, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified ColumnProperties message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.verify|verify} messages.
        * @param message ColumnProperties message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IColumnProperties): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IColumnProperties, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a ColumnProperties message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ColumnProperties
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): ColumnProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ColumnProperties]
      
      /**
        * Creates a plain object from a ColumnProperties message. Also converts values to other types if specified.
        * @param message ColumnProperties
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: ColumnProperties): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: ColumnProperties, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a ColumnProperties message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents an Image. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Image")
    @js.native
    /**
      * Constructs a new Image.
      * @param [properties] Properties to set
      */
    open class Image ()
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
      def toJSON(): StringDictionary[Any] = js.native
    }
    object Image {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Image")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Image instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Image instance
        */
      /* static member */
      inline def create(): Image = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Image]
      inline def create(properties: IImage): Image = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Image]
      
      inline def decode(reader: js.typedarray.Uint8Array): Image = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Image]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Image]
      /**
        * Decodes an Image message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Image
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): Image = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Image]
      inline def decode(reader: Reader, length: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Image]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): Image = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Image]
      /**
        * Decodes an Image message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Image
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): Image = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Image]
      
      /**
        * Encodes the specified Image message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Image.verify|verify} messages.
        * @param message Image message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IImage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IImage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Image message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Image.verify|verify} messages.
        * @param message Image message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IImage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IImage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates an Image message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Image
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): Image = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Image]
      
      /**
        * Creates a plain object from an Image message. Also converts values to other types if specified.
        * @param message Image
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: Image): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: Image, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies an Image message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a LinkOutSuggestion. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.LinkOutSuggestion")
    @js.native
    /**
      * Constructs a new LinkOutSuggestion.
      * @param [properties] Properties to set
      */
    open class LinkOutSuggestion ()
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
      def toJSON(): StringDictionary[Any] = js.native
      
      /** LinkOutSuggestion uri. */
      @JSName("uri")
      var uri_LinkOutSuggestion: String = js.native
    }
    object LinkOutSuggestion {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.LinkOutSuggestion")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new LinkOutSuggestion instance using the specified properties.
        * @param [properties] Properties to set
        * @returns LinkOutSuggestion instance
        */
      /* static member */
      inline def create(): LinkOutSuggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[LinkOutSuggestion]
      inline def create(properties: ILinkOutSuggestion): LinkOutSuggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[LinkOutSuggestion]
      
      inline def decode(reader: js.typedarray.Uint8Array): LinkOutSuggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[LinkOutSuggestion]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): LinkOutSuggestion = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[LinkOutSuggestion]
      /**
        * Decodes a LinkOutSuggestion message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns LinkOutSuggestion
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): LinkOutSuggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[LinkOutSuggestion]
      inline def decode(reader: Reader, length: Double): LinkOutSuggestion = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[LinkOutSuggestion]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): LinkOutSuggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[LinkOutSuggestion]
      /**
        * Decodes a LinkOutSuggestion message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns LinkOutSuggestion
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): LinkOutSuggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[LinkOutSuggestion]
      
      /**
        * Encodes the specified LinkOutSuggestion message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.LinkOutSuggestion.verify|verify} messages.
        * @param message LinkOutSuggestion message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: ILinkOutSuggestion): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: ILinkOutSuggestion, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified LinkOutSuggestion message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.LinkOutSuggestion.verify|verify} messages.
        * @param message LinkOutSuggestion message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: ILinkOutSuggestion): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: ILinkOutSuggestion, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a LinkOutSuggestion message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns LinkOutSuggestion
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): LinkOutSuggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[LinkOutSuggestion]
      
      /**
        * Creates a plain object from a LinkOutSuggestion message. Also converts values to other types if specified.
        * @param message LinkOutSuggestion
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: LinkOutSuggestion): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: LinkOutSuggestion, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a LinkOutSuggestion message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a ListSelect. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect")
    @js.native
    /**
      * Constructs a new ListSelect.
      * @param [properties] Properties to set
      */
    open class ListSelect ()
      extends StObject
         with IListSelect {
      def this(properties: IListSelect) = this()
      
      /** ListSelect items. */
      @JSName("items")
      var items_ListSelect: js.Array[
            typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem
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
      def toJSON(): StringDictionary[Any] = js.native
    }
    object ListSelect {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect")
      @js.native
      val ^ : js.Any = js.native
      
      /** Represents an Item. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.Item")
      @js.native
      /**
        * Constructs a new Item.
        * @param [properties] Properties to set
        */
      open class Item ()
        extends StObject
           with typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem {
        def this(properties: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem) = this()
        
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
        def toJSON(): StringDictionary[Any] = js.native
      }
      object Item {
        
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect.Item")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new Item instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Item instance
          */
        /* static member */
        inline def create(): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Item]
        inline def create(
          properties: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem
        ): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Item]
        
        inline def decode(reader: js.typedarray.Uint8Array): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Item]
        inline def decode(reader: js.typedarray.Uint8Array, length: Double): Item = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Item]
        /**
          * Decodes an Item message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Item
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Item]
        inline def decode(reader: Reader, length: Double): Item = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Item]
        
        inline def decodeDelimited(reader: js.typedarray.Uint8Array): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Item]
        /**
          * Decodes an Item message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Item
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Item]
        
        /**
          * Encodes the specified Item message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.ListSelect.Item.verify|verify} messages.
          * @param message Item message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encode(
          message: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem
        ): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encode(
          message: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem,
          writer: Writer
        ): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified Item message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.ListSelect.Item.verify|verify} messages.
          * @param message Item message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encodeDelimited(
          message: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem
        ): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encodeDelimited(
          message: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem,
          writer: Writer
        ): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates an Item message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Item
          */
        /* static member */
        inline def fromObject(`object`: StringDictionary[Any]): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Item]
        
        /**
          * Creates a plain object from an Item message. Also converts values to other types if specified.
          * @param message Item
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(message: Item): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
        inline def toObject(message: Item, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
        
        /**
          * Verifies an Item message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      /**
        * Creates a new ListSelect instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ListSelect instance
        */
      /* static member */
      inline def create(): ListSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListSelect]
      inline def create(properties: IListSelect): ListSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListSelect]
      
      inline def decode(reader: js.typedarray.Uint8Array): ListSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSelect]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListSelect = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListSelect]
      /**
        * Decodes a ListSelect message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ListSelect
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): ListSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSelect]
      inline def decode(reader: Reader, length: Double): ListSelect = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListSelect]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSelect]
      /**
        * Decodes a ListSelect message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ListSelect
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): ListSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListSelect]
      
      /**
        * Encodes the specified ListSelect message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.ListSelect.verify|verify} messages.
        * @param message ListSelect message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IListSelect): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IListSelect, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified ListSelect message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.ListSelect.verify|verify} messages.
        * @param message ListSelect message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IListSelect): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IListSelect, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a ListSelect message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ListSelect
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): ListSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListSelect]
      
      /**
        * Creates a plain object from a ListSelect message. Also converts values to other types if specified.
        * @param message ListSelect
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: ListSelect): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: ListSelect, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a ListSelect message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      
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
        
        inline def apply(): typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem] (val x: Self) extends AnyVal {
          
          inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
          
          inline def setDescriptionNull: Self = StObject.set(x, "description", null)
          
          inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
          
          inline def setImage(value: IImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
          
          inline def setImageNull: Self = StObject.set(x, "image", null)
          
          inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
          
          inline def setInfo(value: ISelectItemInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
          
          inline def setInfoNull: Self = StObject.set(x, "info", null)
          
          inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
          
          inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          inline def setTitleNull: Self = StObject.set(x, "title", null)
          
          inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
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
    open class MediaContent ()
      extends StObject
         with IMediaContent {
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
      def toJSON(): StringDictionary[Any] = js.native
    }
    object MediaContent {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent")
      @js.native
      val ^ : js.Any = js.native
      
      /** Represents a ResponseMediaObject. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaObject")
      @js.native
      /**
        * Constructs a new ResponseMediaObject.
        * @param [properties] Properties to set
        */
      open class ResponseMediaObject ()
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
        def toJSON(): StringDictionary[Any] = js.native
      }
      object ResponseMediaObject {
        
        @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaObject")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new ResponseMediaObject instance using the specified properties.
          * @param [properties] Properties to set
          * @returns ResponseMediaObject instance
          */
        /* static member */
        inline def create(): ResponseMediaObject = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ResponseMediaObject]
        inline def create(properties: IResponseMediaObject): ResponseMediaObject = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ResponseMediaObject]
        
        inline def decode(reader: js.typedarray.Uint8Array): ResponseMediaObject = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ResponseMediaObject]
        inline def decode(reader: js.typedarray.Uint8Array, length: Double): ResponseMediaObject = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ResponseMediaObject]
        /**
          * Decodes a ResponseMediaObject message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns ResponseMediaObject
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): ResponseMediaObject = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ResponseMediaObject]
        inline def decode(reader: Reader, length: Double): ResponseMediaObject = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ResponseMediaObject]
        
        inline def decodeDelimited(reader: js.typedarray.Uint8Array): ResponseMediaObject = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ResponseMediaObject]
        /**
          * Decodes a ResponseMediaObject message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns ResponseMediaObject
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): ResponseMediaObject = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ResponseMediaObject]
        
        /**
          * Encodes the specified ResponseMediaObject message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaObject.verify|verify} messages.
          * @param message ResponseMediaObject message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encode(message: IResponseMediaObject): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encode(message: IResponseMediaObject, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified ResponseMediaObject message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaObject.verify|verify} messages.
          * @param message ResponseMediaObject message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encodeDelimited(message: IResponseMediaObject): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encodeDelimited(message: IResponseMediaObject, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates a ResponseMediaObject message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns ResponseMediaObject
          */
        /* static member */
        inline def fromObject(`object`: StringDictionary[Any]): ResponseMediaObject = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ResponseMediaObject]
        
        /**
          * Creates a plain object from a ResponseMediaObject message. Also converts values to other types if specified.
          * @param message ResponseMediaObject
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(message: ResponseMediaObject): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
        inline def toObject(message: ResponseMediaObject, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
        
        /**
          * Verifies a ResponseMediaObject message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      @js.native
      sealed trait ResponseMediaType extends StObject
      /** ResponseMediaType enum. */
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaType")
      @js.native
      object ResponseMediaType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[ResponseMediaType & Double] = js.native
        
        @js.native
        sealed trait AUDIO
          extends StObject
             with ResponseMediaType
        /* 1 */ val AUDIO: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaType.AUDIO & Double = js.native
        
        @js.native
        sealed trait RESPONSE_MEDIA_TYPE_UNSPECIFIED
          extends StObject
             with ResponseMediaType
        /* 0 */ val RESPONSE_MEDIA_TYPE_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaType.RESPONSE_MEDIA_TYPE_UNSPECIFIED & Double = js.native
      }
      
      /**
        * Creates a new MediaContent instance using the specified properties.
        * @param [properties] Properties to set
        * @returns MediaContent instance
        */
      /* static member */
      inline def create(): MediaContent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[MediaContent]
      inline def create(properties: IMediaContent): MediaContent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[MediaContent]
      
      inline def decode(reader: js.typedarray.Uint8Array): MediaContent = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[MediaContent]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): MediaContent = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[MediaContent]
      /**
        * Decodes a MediaContent message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns MediaContent
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): MediaContent = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[MediaContent]
      inline def decode(reader: Reader, length: Double): MediaContent = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[MediaContent]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): MediaContent = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[MediaContent]
      /**
        * Decodes a MediaContent message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns MediaContent
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): MediaContent = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[MediaContent]
      
      /**
        * Encodes the specified MediaContent message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.MediaContent.verify|verify} messages.
        * @param message MediaContent message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IMediaContent): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IMediaContent, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified MediaContent message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.MediaContent.verify|verify} messages.
        * @param message MediaContent message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IMediaContent): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IMediaContent, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a MediaContent message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns MediaContent
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): MediaContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[MediaContent]
      
      /**
        * Creates a plain object from a MediaContent message. Also converts values to other types if specified.
        * @param message MediaContent
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: MediaContent): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: MediaContent, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a MediaContent message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      
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
        
        inline def apply(): IResponseMediaObject = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IResponseMediaObject]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: IResponseMediaObject] (val x: Self) extends AnyVal {
          
          inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
          
          inline def setContentUrlNull: Self = StObject.set(x, "contentUrl", null)
          
          inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
          
          inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
          
          inline def setDescriptionNull: Self = StObject.set(x, "description", null)
          
          inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
          
          inline def setIcon(value: IImage): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
          
          inline def setIconNull: Self = StObject.set(x, "icon", null)
          
          inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
          
          inline def setLargeImage(value: IImage): Self = StObject.set(x, "largeImage", value.asInstanceOf[js.Any])
          
          inline def setLargeImageNull: Self = StObject.set(x, "largeImage", null)
          
          inline def setLargeImageUndefined: Self = StObject.set(x, "largeImage", js.undefined)
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameNull: Self = StObject.set(x, "name", null)
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
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
      def apply(value: Double): js.UndefOr[Platform & Double] = js.native
      
      @js.native
      sealed trait ACTIONS_ON_GOOGLE
        extends StObject
           with Platform
      /* 8 */ val ACTIONS_ON_GOOGLE: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Platform.ACTIONS_ON_GOOGLE & Double = js.native
      
      @js.native
      sealed trait FACEBOOK
        extends StObject
           with Platform
      /* 1 */ val FACEBOOK: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Platform.FACEBOOK & Double = js.native
      
      @js.native
      sealed trait GOOGLE_HANGOUTS
        extends StObject
           with Platform
      /* 11 */ val GOOGLE_HANGOUTS: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Platform.GOOGLE_HANGOUTS & Double = js.native
      
      @js.native
      sealed trait KIK
        extends StObject
           with Platform
      /* 4 */ val KIK: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Platform.KIK & Double = js.native
      
      @js.native
      sealed trait LINE
        extends StObject
           with Platform
      /* 6 */ val LINE: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Platform.LINE & Double = js.native
      
      @js.native
      sealed trait PLATFORM_UNSPECIFIED
        extends StObject
           with Platform
      /* 0 */ val PLATFORM_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Platform.PLATFORM_UNSPECIFIED & Double = js.native
      
      @js.native
      sealed trait SKYPE
        extends StObject
           with Platform
      /* 5 */ val SKYPE: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Platform.SKYPE & Double = js.native
      
      @js.native
      sealed trait SLACK
        extends StObject
           with Platform
      /* 2 */ val SLACK: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Platform.SLACK & Double = js.native
      
      @js.native
      sealed trait TELEGRAM
        extends StObject
           with Platform
      /* 3 */ val TELEGRAM: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Platform.TELEGRAM & Double = js.native
      
      @js.native
      sealed trait VIBER
        extends StObject
           with Platform
      /* 7 */ val VIBER: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Platform.VIBER & Double = js.native
    }
    
    /** Represents a QuickReplies. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.QuickReplies")
    @js.native
    /**
      * Constructs a new QuickReplies.
      * @param [properties] Properties to set
      */
    open class QuickReplies ()
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
      def toJSON(): StringDictionary[Any] = js.native
    }
    object QuickReplies {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.QuickReplies")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new QuickReplies instance using the specified properties.
        * @param [properties] Properties to set
        * @returns QuickReplies instance
        */
      /* static member */
      inline def create(): QuickReplies = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[QuickReplies]
      inline def create(properties: IQuickReplies): QuickReplies = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[QuickReplies]
      
      inline def decode(reader: js.typedarray.Uint8Array): QuickReplies = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[QuickReplies]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): QuickReplies = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[QuickReplies]
      /**
        * Decodes a QuickReplies message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns QuickReplies
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): QuickReplies = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[QuickReplies]
      inline def decode(reader: Reader, length: Double): QuickReplies = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[QuickReplies]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): QuickReplies = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[QuickReplies]
      /**
        * Decodes a QuickReplies message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns QuickReplies
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): QuickReplies = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[QuickReplies]
      
      /**
        * Encodes the specified QuickReplies message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.QuickReplies.verify|verify} messages.
        * @param message QuickReplies message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IQuickReplies): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IQuickReplies, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified QuickReplies message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.QuickReplies.verify|verify} messages.
        * @param message QuickReplies message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IQuickReplies): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IQuickReplies, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a QuickReplies message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns QuickReplies
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): QuickReplies = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[QuickReplies]
      
      /**
        * Creates a plain object from a QuickReplies message. Also converts values to other types if specified.
        * @param message QuickReplies
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: QuickReplies): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: QuickReplies, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a QuickReplies message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a SelectItemInfo. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SelectItemInfo")
    @js.native
    /**
      * Constructs a new SelectItemInfo.
      * @param [properties] Properties to set
      */
    open class SelectItemInfo ()
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
      def toJSON(): StringDictionary[Any] = js.native
    }
    object SelectItemInfo {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SelectItemInfo")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new SelectItemInfo instance using the specified properties.
        * @param [properties] Properties to set
        * @returns SelectItemInfo instance
        */
      /* static member */
      inline def create(): SelectItemInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SelectItemInfo]
      inline def create(properties: ISelectItemInfo): SelectItemInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SelectItemInfo]
      
      inline def decode(reader: js.typedarray.Uint8Array): SelectItemInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SelectItemInfo]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): SelectItemInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SelectItemInfo]
      /**
        * Decodes a SelectItemInfo message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns SelectItemInfo
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): SelectItemInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SelectItemInfo]
      inline def decode(reader: Reader, length: Double): SelectItemInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SelectItemInfo]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): SelectItemInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SelectItemInfo]
      /**
        * Decodes a SelectItemInfo message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns SelectItemInfo
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): SelectItemInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SelectItemInfo]
      
      /**
        * Encodes the specified SelectItemInfo message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.SelectItemInfo.verify|verify} messages.
        * @param message SelectItemInfo message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: ISelectItemInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: ISelectItemInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified SelectItemInfo message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.SelectItemInfo.verify|verify} messages.
        * @param message SelectItemInfo message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: ISelectItemInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: ISelectItemInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a SelectItemInfo message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns SelectItemInfo
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): SelectItemInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SelectItemInfo]
      
      /**
        * Creates a plain object from a SelectItemInfo message. Also converts values to other types if specified.
        * @param message SelectItemInfo
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: SelectItemInfo): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: SelectItemInfo, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a SelectItemInfo message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a SimpleResponse. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponse")
    @js.native
    /**
      * Constructs a new SimpleResponse.
      * @param [properties] Properties to set
      */
    open class SimpleResponse ()
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
      def toJSON(): StringDictionary[Any] = js.native
    }
    object SimpleResponse {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponse")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new SimpleResponse instance using the specified properties.
        * @param [properties] Properties to set
        * @returns SimpleResponse instance
        */
      /* static member */
      inline def create(): SimpleResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SimpleResponse]
      inline def create(properties: ISimpleResponse): SimpleResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SimpleResponse]
      
      inline def decode(reader: js.typedarray.Uint8Array): SimpleResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SimpleResponse]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): SimpleResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SimpleResponse]
      /**
        * Decodes a SimpleResponse message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns SimpleResponse
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): SimpleResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SimpleResponse]
      inline def decode(reader: Reader, length: Double): SimpleResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SimpleResponse]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): SimpleResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SimpleResponse]
      /**
        * Decodes a SimpleResponse message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns SimpleResponse
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): SimpleResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SimpleResponse]
      
      /**
        * Encodes the specified SimpleResponse message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.SimpleResponse.verify|verify} messages.
        * @param message SimpleResponse message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: ISimpleResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: ISimpleResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified SimpleResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.SimpleResponse.verify|verify} messages.
        * @param message SimpleResponse message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: ISimpleResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: ISimpleResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a SimpleResponse message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns SimpleResponse
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): SimpleResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SimpleResponse]
      
      /**
        * Creates a plain object from a SimpleResponse message. Also converts values to other types if specified.
        * @param message SimpleResponse
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: SimpleResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: SimpleResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a SimpleResponse message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a SimpleResponses. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponses")
    @js.native
    /**
      * Constructs a new SimpleResponses.
      * @param [properties] Properties to set
      */
    open class SimpleResponses ()
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
      def toJSON(): StringDictionary[Any] = js.native
    }
    object SimpleResponses {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.SimpleResponses")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new SimpleResponses instance using the specified properties.
        * @param [properties] Properties to set
        * @returns SimpleResponses instance
        */
      /* static member */
      inline def create(): SimpleResponses = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SimpleResponses]
      inline def create(properties: ISimpleResponses): SimpleResponses = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SimpleResponses]
      
      inline def decode(reader: js.typedarray.Uint8Array): SimpleResponses = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SimpleResponses]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): SimpleResponses = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SimpleResponses]
      /**
        * Decodes a SimpleResponses message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns SimpleResponses
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): SimpleResponses = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SimpleResponses]
      inline def decode(reader: Reader, length: Double): SimpleResponses = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SimpleResponses]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): SimpleResponses = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SimpleResponses]
      /**
        * Decodes a SimpleResponses message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns SimpleResponses
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): SimpleResponses = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SimpleResponses]
      
      /**
        * Encodes the specified SimpleResponses message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.SimpleResponses.verify|verify} messages.
        * @param message SimpleResponses message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: ISimpleResponses): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: ISimpleResponses, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified SimpleResponses message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.SimpleResponses.verify|verify} messages.
        * @param message SimpleResponses message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: ISimpleResponses): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: ISimpleResponses, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a SimpleResponses message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns SimpleResponses
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): SimpleResponses = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SimpleResponses]
      
      /**
        * Creates a plain object from a SimpleResponses message. Also converts values to other types if specified.
        * @param message SimpleResponses
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: SimpleResponses): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: SimpleResponses, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a SimpleResponses message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a Suggestion. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestion")
    @js.native
    /**
      * Constructs a new Suggestion.
      * @param [properties] Properties to set
      */
    open class Suggestion ()
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
      def toJSON(): StringDictionary[Any] = js.native
    }
    object Suggestion {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestion")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Suggestion instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Suggestion instance
        */
      /* static member */
      inline def create(): Suggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Suggestion]
      inline def create(properties: ISuggestion): Suggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Suggestion]
      
      inline def decode(reader: js.typedarray.Uint8Array): Suggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Suggestion]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): Suggestion = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Suggestion]
      /**
        * Decodes a Suggestion message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Suggestion
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): Suggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Suggestion]
      inline def decode(reader: Reader, length: Double): Suggestion = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Suggestion]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): Suggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Suggestion]
      /**
        * Decodes a Suggestion message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Suggestion
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): Suggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Suggestion]
      
      /**
        * Encodes the specified Suggestion message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Suggestion.verify|verify} messages.
        * @param message Suggestion message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: ISuggestion): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: ISuggestion, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Suggestion message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Suggestion.verify|verify} messages.
        * @param message Suggestion message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: ISuggestion): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: ISuggestion, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a Suggestion message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Suggestion
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): Suggestion = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Suggestion]
      
      /**
        * Creates a plain object from a Suggestion message. Also converts values to other types if specified.
        * @param message Suggestion
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: Suggestion): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: Suggestion, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a Suggestion message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a Suggestions. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestions")
    @js.native
    /**
      * Constructs a new Suggestions.
      * @param [properties] Properties to set
      */
    open class Suggestions ()
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
      def toJSON(): StringDictionary[Any] = js.native
    }
    object Suggestions {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Suggestions")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Suggestions instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Suggestions instance
        */
      /* static member */
      inline def create(): Suggestions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Suggestions]
      inline def create(properties: ISuggestions): Suggestions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Suggestions]
      
      inline def decode(reader: js.typedarray.Uint8Array): Suggestions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Suggestions]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): Suggestions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Suggestions]
      /**
        * Decodes a Suggestions message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Suggestions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): Suggestions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Suggestions]
      inline def decode(reader: Reader, length: Double): Suggestions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Suggestions]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): Suggestions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Suggestions]
      /**
        * Decodes a Suggestions message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Suggestions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): Suggestions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Suggestions]
      
      /**
        * Encodes the specified Suggestions message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Suggestions.verify|verify} messages.
        * @param message Suggestions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: ISuggestions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: ISuggestions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Suggestions message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Suggestions.verify|verify} messages.
        * @param message Suggestions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: ISuggestions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: ISuggestions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a Suggestions message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Suggestions
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): Suggestions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Suggestions]
      
      /**
        * Creates a plain object from a Suggestions message. Also converts values to other types if specified.
        * @param message Suggestions
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: Suggestions): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: Suggestions, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a Suggestions message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a TableCard. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCard")
    @js.native
    /**
      * Constructs a new TableCard.
      * @param [properties] Properties to set
      */
    open class TableCard ()
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
      def toJSON(): StringDictionary[Any] = js.native
    }
    object TableCard {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCard")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new TableCard instance using the specified properties.
        * @param [properties] Properties to set
        * @returns TableCard instance
        */
      /* static member */
      inline def create(): TableCard = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TableCard]
      inline def create(properties: ITableCard): TableCard = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TableCard]
      
      inline def decode(reader: js.typedarray.Uint8Array): TableCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCard]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): TableCard = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TableCard]
      /**
        * Decodes a TableCard message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns TableCard
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): TableCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCard]
      inline def decode(reader: Reader, length: Double): TableCard = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TableCard]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): TableCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCard]
      /**
        * Decodes a TableCard message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns TableCard
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): TableCard = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCard]
      
      /**
        * Encodes the specified TableCard message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.TableCard.verify|verify} messages.
        * @param message TableCard message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: ITableCard): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: ITableCard, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified TableCard message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.TableCard.verify|verify} messages.
        * @param message TableCard message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: ITableCard): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: ITableCard, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a TableCard message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns TableCard
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): TableCard = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TableCard]
      
      /**
        * Creates a plain object from a TableCard message. Also converts values to other types if specified.
        * @param message TableCard
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: TableCard): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: TableCard, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a TableCard message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a TableCardCell. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardCell")
    @js.native
    /**
      * Constructs a new TableCardCell.
      * @param [properties] Properties to set
      */
    open class TableCardCell ()
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
      def toJSON(): StringDictionary[Any] = js.native
    }
    object TableCardCell {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardCell")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new TableCardCell instance using the specified properties.
        * @param [properties] Properties to set
        * @returns TableCardCell instance
        */
      /* static member */
      inline def create(): TableCardCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TableCardCell]
      inline def create(properties: ITableCardCell): TableCardCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TableCardCell]
      
      inline def decode(reader: js.typedarray.Uint8Array): TableCardCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCardCell]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): TableCardCell = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TableCardCell]
      /**
        * Decodes a TableCardCell message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns TableCardCell
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): TableCardCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCardCell]
      inline def decode(reader: Reader, length: Double): TableCardCell = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TableCardCell]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): TableCardCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCardCell]
      /**
        * Decodes a TableCardCell message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns TableCardCell
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): TableCardCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCardCell]
      
      /**
        * Encodes the specified TableCardCell message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.TableCardCell.verify|verify} messages.
        * @param message TableCardCell message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: ITableCardCell): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: ITableCardCell, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified TableCardCell message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.TableCardCell.verify|verify} messages.
        * @param message TableCardCell message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: ITableCardCell): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: ITableCardCell, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a TableCardCell message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns TableCardCell
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): TableCardCell = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TableCardCell]
      
      /**
        * Creates a plain object from a TableCardCell message. Also converts values to other types if specified.
        * @param message TableCardCell
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: TableCardCell): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: TableCardCell, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a TableCardCell message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a TableCardRow. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardRow")
    @js.native
    /**
      * Constructs a new TableCardRow.
      * @param [properties] Properties to set
      */
    open class TableCardRow ()
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
      def toJSON(): StringDictionary[Any] = js.native
    }
    object TableCardRow {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.TableCardRow")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new TableCardRow instance using the specified properties.
        * @param [properties] Properties to set
        * @returns TableCardRow instance
        */
      /* static member */
      inline def create(): TableCardRow = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TableCardRow]
      inline def create(properties: ITableCardRow): TableCardRow = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TableCardRow]
      
      inline def decode(reader: js.typedarray.Uint8Array): TableCardRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCardRow]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): TableCardRow = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TableCardRow]
      /**
        * Decodes a TableCardRow message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns TableCardRow
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): TableCardRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCardRow]
      inline def decode(reader: Reader, length: Double): TableCardRow = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TableCardRow]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): TableCardRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCardRow]
      /**
        * Decodes a TableCardRow message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns TableCardRow
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): TableCardRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TableCardRow]
      
      /**
        * Encodes the specified TableCardRow message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.TableCardRow.verify|verify} messages.
        * @param message TableCardRow message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: ITableCardRow): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: ITableCardRow, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified TableCardRow message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.TableCardRow.verify|verify} messages.
        * @param message TableCardRow message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: ITableCardRow): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: ITableCardRow, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a TableCardRow message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns TableCardRow
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): TableCardRow = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TableCardRow]
      
      /**
        * Creates a plain object from a TableCardRow message. Also converts values to other types if specified.
        * @param message TableCardRow
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: TableCardRow): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: TableCardRow, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a TableCardRow message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a Text. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Text")
    @js.native
    /**
      * Constructs a new Text.
      * @param [properties] Properties to set
      */
    open class Text ()
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
      def toJSON(): StringDictionary[Any] = js.native
    }
    object Text {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Text")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Text instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Text instance
        */
      /* static member */
      inline def create(): typings.std.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.std.Text]
      inline def create(properties: IText): typings.std.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.std.Text]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.std.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.std.Text]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.std.Text = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.std.Text]
      /**
        * Decodes a Text message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Text
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.std.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.std.Text]
      inline def decode(reader: Reader, length: Double): typings.std.Text = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.std.Text]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.std.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.std.Text]
      /**
        * Decodes a Text message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Text
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.std.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.std.Text]
      
      /**
        * Encodes the specified Text message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Text.verify|verify} messages.
        * @param message Text message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IText): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IText, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Text message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Text.verify|verify} messages.
        * @param message Text message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IText): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IText, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a Text message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Text
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.std.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.std.Text]
      
      /**
        * Creates a plain object from a Text message. Also converts values to other types if specified.
        * @param message Text
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.std.Text): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: typings.std.Text, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a Text message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /**
      * Creates a new Message instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Message instance
      */
    /* static member */
    inline def create(): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Message]
    inline def create(properties: IMessage): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Message]
    
    inline def decode(reader: js.typedarray.Uint8Array): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Message]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Message]
    /**
      * Decodes a Message message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Message
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Message]
    inline def decode(reader: Reader, length: Double): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Message]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Message]
    /**
      * Decodes a Message message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Message
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Message]
    
    /**
      * Encodes the specified Message message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.verify|verify} messages.
      * @param message Message message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IMessage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Message message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.verify|verify} messages.
      * @param message Message message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IMessage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Message message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Message
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Message]
    
    /**
      * Creates a plain object from a Message message. Also converts values to other types if specified.
      * @param message Message
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Message): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Message, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Message message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
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
      
      inline def apply(): IBasicCard = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IBasicCard]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IBasicCard] (val x: Self) extends AnyVal {
        
        inline def setButtons(value: js.Array[IButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
        
        inline def setButtonsNull: Self = StObject.set(x, "buttons", null)
        
        inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
        
        inline def setButtonsVarargs(value: IButton*): Self = StObject.set(x, "buttons", js.Array(value*))
        
        inline def setFormattedText(value: String): Self = StObject.set(x, "formattedText", value.asInstanceOf[js.Any])
        
        inline def setFormattedTextNull: Self = StObject.set(x, "formattedText", null)
        
        inline def setFormattedTextUndefined: Self = StObject.set(x, "formattedText", js.undefined)
        
        inline def setImage(value: IImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        inline def setImageNull: Self = StObject.set(x, "image", null)
        
        inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
        
        inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
        
        inline def setSubtitleNull: Self = StObject.set(x, "subtitle", null)
        
        inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleNull: Self = StObject.set(x, "title", null)
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    /** Properties of a BrowseCarouselCard. */
    trait IBrowseCarouselCard extends StObject {
      
      /** BrowseCarouselCard imageDisplayOptions */
      var imageDisplayOptions: js.UndefOr[
            ImageDisplayOptions | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.ImageDisplayOptions * / any */ String) | Null
          ] = js.undefined
      
      /** BrowseCarouselCard items */
      var items: js.UndefOr[js.Array[IBrowseCarouselCardItem] | Null] = js.undefined
    }
    object IBrowseCarouselCard {
      
      inline def apply(): IBrowseCarouselCard = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IBrowseCarouselCard]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IBrowseCarouselCard] (val x: Self) extends AnyVal {
        
        inline def setImageDisplayOptions(
          value: ImageDisplayOptions | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.ImageDisplayOptions * / any */ String)
        ): Self = StObject.set(x, "imageDisplayOptions", value.asInstanceOf[js.Any])
        
        inline def setImageDisplayOptionsNull: Self = StObject.set(x, "imageDisplayOptions", null)
        
        inline def setImageDisplayOptionsUndefined: Self = StObject.set(x, "imageDisplayOptions", js.undefined)
        
        inline def setItems(value: js.Array[IBrowseCarouselCardItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsNull: Self = StObject.set(x, "items", null)
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: IBrowseCarouselCardItem*): Self = StObject.set(x, "items", js.Array(value*))
      }
    }
    
    /** Properties of a Card. */
    trait ICard extends StObject {
      
      /** Card buttons */
      var buttons: js.UndefOr[
            (js.Array[
              typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton
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
      
      inline def apply(): ICard = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ICard]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ICard] (val x: Self) extends AnyVal {
        
        inline def setButtons(
          value: js.Array[
                  typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton
                ]
        ): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
        
        inline def setButtonsNull: Self = StObject.set(x, "buttons", null)
        
        inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
        
        inline def setButtonsVarargs(value: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton*): Self = StObject.set(x, "buttons", js.Array(value*))
        
        inline def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
        
        inline def setImageUriNull: Self = StObject.set(x, "imageUri", null)
        
        inline def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
        
        inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
        
        inline def setSubtitleNull: Self = StObject.set(x, "subtitle", null)
        
        inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleNull: Self = StObject.set(x, "title", null)
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    /** Properties of a CarouselSelect. */
    trait ICarouselSelect extends StObject {
      
      /** CarouselSelect items */
      var items: js.UndefOr[js.Array[IItem] | Null] = js.undefined
    }
    object ICarouselSelect {
      
      inline def apply(): ICarouselSelect = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ICarouselSelect]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ICarouselSelect] (val x: Self) extends AnyVal {
        
        inline def setItems(value: js.Array[IItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsNull: Self = StObject.set(x, "items", null)
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: IItem*): Self = StObject.set(x, "items", js.Array(value*))
      }
    }
    
    /** Properties of a ColumnProperties. */
    trait IColumnProperties extends StObject {
      
      /** ColumnProperties header */
      var header: js.UndefOr[String | Null] = js.undefined
      
      /** ColumnProperties horizontalAlignment */
      var horizontalAlignment: js.UndefOr[
            HorizontalAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.HorizontalAlignment * / any */ String) | Null
          ] = js.undefined
    }
    object IColumnProperties {
      
      inline def apply(): IColumnProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IColumnProperties]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IColumnProperties] (val x: Self) extends AnyVal {
        
        inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
        
        inline def setHeaderNull: Self = StObject.set(x, "header", null)
        
        inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
        
        inline def setHorizontalAlignment(
          value: HorizontalAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.ColumnProperties.HorizontalAlignment * / any */ String)
        ): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
        
        inline def setHorizontalAlignmentNull: Self = StObject.set(x, "horizontalAlignment", null)
        
        inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
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
      
      inline def apply(): IImage = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IImage]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IImage] (val x: Self) extends AnyVal {
        
        inline def setAccessibilityText(value: String): Self = StObject.set(x, "accessibilityText", value.asInstanceOf[js.Any])
        
        inline def setAccessibilityTextNull: Self = StObject.set(x, "accessibilityText", null)
        
        inline def setAccessibilityTextUndefined: Self = StObject.set(x, "accessibilityText", js.undefined)
        
        inline def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
        
        inline def setImageUriNull: Self = StObject.set(x, "imageUri", null)
        
        inline def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
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
      
      inline def apply(): ILinkOutSuggestion = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ILinkOutSuggestion]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ILinkOutSuggestion] (val x: Self) extends AnyVal {
        
        inline def setDestinationName(value: String): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
        
        inline def setDestinationNameNull: Self = StObject.set(x, "destinationName", null)
        
        inline def setDestinationNameUndefined: Self = StObject.set(x, "destinationName", js.undefined)
        
        inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
        
        inline def setUriNull: Self = StObject.set(x, "uri", null)
        
        inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      }
    }
    
    /** Properties of a ListSelect. */
    trait IListSelect extends StObject {
      
      /** ListSelect items */
      var items: js.UndefOr[
            (js.Array[
              typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem
            ]) | Null
          ] = js.undefined
      
      /** ListSelect subtitle */
      var subtitle: js.UndefOr[String | Null] = js.undefined
      
      /** ListSelect title */
      var title: js.UndefOr[String | Null] = js.undefined
    }
    object IListSelect {
      
      inline def apply(): IListSelect = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IListSelect]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IListSelect] (val x: Self) extends AnyVal {
        
        inline def setItems(
          value: js.Array[
                  typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem
                ]
        ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsNull: Self = StObject.set(x, "items", null)
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(
          value: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem*
        ): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
        
        inline def setSubtitleNull: Self = StObject.set(x, "subtitle", null)
        
        inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleNull: Self = StObject.set(x, "title", null)
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    /** Properties of a MediaContent. */
    trait IMediaContent extends StObject {
      
      /** MediaContent mediaObjects */
      var mediaObjects: js.UndefOr[js.Array[IResponseMediaObject] | Null] = js.undefined
      
      /** MediaContent mediaType */
      var mediaType: js.UndefOr[
            ResponseMediaType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaType * / any */ String) | Null
          ] = js.undefined
    }
    object IMediaContent {
      
      inline def apply(): IMediaContent = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IMediaContent]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IMediaContent] (val x: Self) extends AnyVal {
        
        inline def setMediaObjects(value: js.Array[IResponseMediaObject]): Self = StObject.set(x, "mediaObjects", value.asInstanceOf[js.Any])
        
        inline def setMediaObjectsNull: Self = StObject.set(x, "mediaObjects", null)
        
        inline def setMediaObjectsUndefined: Self = StObject.set(x, "mediaObjects", js.undefined)
        
        inline def setMediaObjectsVarargs(value: IResponseMediaObject*): Self = StObject.set(x, "mediaObjects", js.Array(value*))
        
        inline def setMediaType(
          value: ResponseMediaType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.MediaContent.ResponseMediaType * / any */ String)
        ): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
        
        inline def setMediaTypeNull: Self = StObject.set(x, "mediaType", null)
        
        inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
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
      
      inline def apply(): IQuickReplies = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IQuickReplies]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IQuickReplies] (val x: Self) extends AnyVal {
        
        inline def setQuickReplies(value: js.Array[String]): Self = StObject.set(x, "quickReplies", value.asInstanceOf[js.Any])
        
        inline def setQuickRepliesNull: Self = StObject.set(x, "quickReplies", null)
        
        inline def setQuickRepliesUndefined: Self = StObject.set(x, "quickReplies", js.undefined)
        
        inline def setQuickRepliesVarargs(value: String*): Self = StObject.set(x, "quickReplies", js.Array(value*))
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleNull: Self = StObject.set(x, "title", null)
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
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
      
      inline def apply(): ISelectItemInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ISelectItemInfo]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ISelectItemInfo] (val x: Self) extends AnyVal {
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyNull: Self = StObject.set(x, "key", null)
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setSynonyms(value: js.Array[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
        
        inline def setSynonymsNull: Self = StObject.set(x, "synonyms", null)
        
        inline def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
        
        inline def setSynonymsVarargs(value: String*): Self = StObject.set(x, "synonyms", js.Array(value*))
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
      
      inline def apply(): ISimpleResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ISimpleResponse]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ISimpleResponse] (val x: Self) extends AnyVal {
        
        inline def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
        
        inline def setDisplayTextNull: Self = StObject.set(x, "displayText", null)
        
        inline def setDisplayTextUndefined: Self = StObject.set(x, "displayText", js.undefined)
        
        inline def setSsml(value: String): Self = StObject.set(x, "ssml", value.asInstanceOf[js.Any])
        
        inline def setSsmlNull: Self = StObject.set(x, "ssml", null)
        
        inline def setSsmlUndefined: Self = StObject.set(x, "ssml", js.undefined)
        
        inline def setTextToSpeech(value: String): Self = StObject.set(x, "textToSpeech", value.asInstanceOf[js.Any])
        
        inline def setTextToSpeechNull: Self = StObject.set(x, "textToSpeech", null)
        
        inline def setTextToSpeechUndefined: Self = StObject.set(x, "textToSpeech", js.undefined)
      }
    }
    
    /** Properties of a SimpleResponses. */
    trait ISimpleResponses extends StObject {
      
      /** SimpleResponses simpleResponses */
      var simpleResponses: js.UndefOr[js.Array[ISimpleResponse] | Null] = js.undefined
    }
    object ISimpleResponses {
      
      inline def apply(): ISimpleResponses = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ISimpleResponses]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ISimpleResponses] (val x: Self) extends AnyVal {
        
        inline def setSimpleResponses(value: js.Array[ISimpleResponse]): Self = StObject.set(x, "simpleResponses", value.asInstanceOf[js.Any])
        
        inline def setSimpleResponsesNull: Self = StObject.set(x, "simpleResponses", null)
        
        inline def setSimpleResponsesUndefined: Self = StObject.set(x, "simpleResponses", js.undefined)
        
        inline def setSimpleResponsesVarargs(value: ISimpleResponse*): Self = StObject.set(x, "simpleResponses", js.Array(value*))
      }
    }
    
    /** Properties of a Suggestion. */
    trait ISuggestion extends StObject {
      
      /** Suggestion title */
      var title: js.UndefOr[String | Null] = js.undefined
    }
    object ISuggestion {
      
      inline def apply(): ISuggestion = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ISuggestion]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ISuggestion] (val x: Self) extends AnyVal {
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleNull: Self = StObject.set(x, "title", null)
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    /** Properties of a Suggestions. */
    trait ISuggestions extends StObject {
      
      /** Suggestions suggestions */
      var suggestions: js.UndefOr[js.Array[ISuggestion] | Null] = js.undefined
    }
    object ISuggestions {
      
      inline def apply(): ISuggestions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ISuggestions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ISuggestions] (val x: Self) extends AnyVal {
        
        inline def setSuggestions(value: js.Array[ISuggestion]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
        
        inline def setSuggestionsNull: Self = StObject.set(x, "suggestions", null)
        
        inline def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
        
        inline def setSuggestionsVarargs(value: ISuggestion*): Self = StObject.set(x, "suggestions", js.Array(value*))
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
      
      inline def apply(): ITableCard = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ITableCard]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ITableCard] (val x: Self) extends AnyVal {
        
        inline def setButtons(value: js.Array[IButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
        
        inline def setButtonsNull: Self = StObject.set(x, "buttons", null)
        
        inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
        
        inline def setButtonsVarargs(value: IButton*): Self = StObject.set(x, "buttons", js.Array(value*))
        
        inline def setColumnProperties(value: js.Array[IColumnProperties]): Self = StObject.set(x, "columnProperties", value.asInstanceOf[js.Any])
        
        inline def setColumnPropertiesNull: Self = StObject.set(x, "columnProperties", null)
        
        inline def setColumnPropertiesUndefined: Self = StObject.set(x, "columnProperties", js.undefined)
        
        inline def setColumnPropertiesVarargs(value: IColumnProperties*): Self = StObject.set(x, "columnProperties", js.Array(value*))
        
        inline def setImage(value: IImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        inline def setImageNull: Self = StObject.set(x, "image", null)
        
        inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
        
        inline def setRows(value: js.Array[ITableCardRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        inline def setRowsNull: Self = StObject.set(x, "rows", null)
        
        inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        inline def setRowsVarargs(value: ITableCardRow*): Self = StObject.set(x, "rows", js.Array(value*))
        
        inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
        
        inline def setSubtitleNull: Self = StObject.set(x, "subtitle", null)
        
        inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleNull: Self = StObject.set(x, "title", null)
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    /** Properties of a TableCardCell. */
    trait ITableCardCell extends StObject {
      
      /** TableCardCell text */
      var text: js.UndefOr[String | Null] = js.undefined
    }
    object ITableCardCell {
      
      inline def apply(): ITableCardCell = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ITableCardCell]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ITableCardCell] (val x: Self) extends AnyVal {
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextNull: Self = StObject.set(x, "text", null)
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
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
      
      inline def apply(): ITableCardRow = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ITableCardRow]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ITableCardRow] (val x: Self) extends AnyVal {
        
        inline def setCells(value: js.Array[ITableCardCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
        
        inline def setCellsNull: Self = StObject.set(x, "cells", null)
        
        inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
        
        inline def setCellsVarargs(value: ITableCardCell*): Self = StObject.set(x, "cells", js.Array(value*))
        
        inline def setDividerAfter(value: Boolean): Self = StObject.set(x, "dividerAfter", value.asInstanceOf[js.Any])
        
        inline def setDividerAfterNull: Self = StObject.set(x, "dividerAfter", null)
        
        inline def setDividerAfterUndefined: Self = StObject.set(x, "dividerAfter", js.undefined)
      }
    }
    
    /** Properties of a Text. */
    trait IText extends StObject {
      
      /** Text text */
      var text: js.UndefOr[js.Array[String] | Null] = js.undefined
    }
    object IText {
      
      inline def apply(): IText = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IText]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IText] (val x: Self) extends AnyVal {
        
        inline def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextNull: Self = StObject.set(x, "text", null)
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
        
        inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
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
  open class Parameter ()
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
    def toJSON(): StringDictionary[Any] = js.native
    
    /** Parameter value. */
    @JSName("value")
    var value_Parameter: String = js.native
  }
  object Parameter {
    
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Parameter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Parameter instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Parameter instance
      */
    /* static member */
    inline def create(): Parameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Parameter]
    inline def create(properties: IParameter): Parameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Parameter]
    
    inline def decode(reader: js.typedarray.Uint8Array): Parameter = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Parameter]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Parameter = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Parameter]
    /**
      * Decodes a Parameter message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Parameter
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Parameter = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Parameter]
    inline def decode(reader: Reader, length: Double): Parameter = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Parameter]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Parameter = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Parameter]
    /**
      * Decodes a Parameter message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Parameter
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Parameter = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Parameter]
    
    /**
      * Encodes the specified Parameter message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Parameter.verify|verify} messages.
      * @param message Parameter message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IParameter): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IParameter, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Parameter message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Parameter.verify|verify} messages.
      * @param message Parameter message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IParameter): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IParameter, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Parameter message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Parameter
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): Parameter = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Parameter]
    
    /**
      * Creates a plain object from a Parameter message. Also converts values to other types if specified.
      * @param message Parameter
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Parameter): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Parameter, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Parameter message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a TrainingPhrase. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase")
  @js.native
  /**
    * Constructs a new TrainingPhrase.
    * @param [properties] Properties to set
    */
  open class TrainingPhrase ()
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
    def toJSON(): StringDictionary[Any] = js.native
    
    /** TrainingPhrase type. */
    @JSName("type")
    var type_TrainingPhrase: Type | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.TrainingPhrase.Type * / any */ String) = js.native
  }
  object TrainingPhrase {
    
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase")
    @js.native
    val ^ : js.Any = js.native
    
    /** Represents a Part. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.Part")
    @js.native
    /**
      * Constructs a new Part.
      * @param [properties] Properties to set
      */
    open class Part ()
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
      def toJSON(): StringDictionary[Any] = js.native
      
      /** Part userDefined. */
      @JSName("userDefined")
      var userDefined_Part: Boolean = js.native
    }
    object Part {
      
      @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.Part")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Part instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Part instance
        */
      /* static member */
      inline def create(): Part = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Part]
      inline def create(properties: IPart): Part = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Part]
      
      inline def decode(reader: js.typedarray.Uint8Array): Part = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Part]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): Part = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Part]
      /**
        * Decodes a Part message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Part
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): Part = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Part]
      inline def decode(reader: Reader, length: Double): Part = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Part]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): Part = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Part]
      /**
        * Decodes a Part message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Part
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): Part = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Part]
      
      /**
        * Encodes the specified Part message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.TrainingPhrase.Part.verify|verify} messages.
        * @param message Part message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IPart): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IPart, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Part message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.TrainingPhrase.Part.verify|verify} messages.
        * @param message Part message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IPart): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IPart, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a Part message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Part
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): Part = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Part]
      
      /**
        * Creates a plain object from a Part message. Also converts values to other types if specified.
        * @param message Part
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: Part): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: Part, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a Part message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    @js.native
    sealed trait Type extends StObject
    /** Type enum. */
    @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.TrainingPhrase.Type")
    @js.native
    object Type extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Type & Double] = js.native
      
      @js.native
      sealed trait EXAMPLE
        extends StObject
           with Type
      /* 1 */ val EXAMPLE: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.TrainingPhrase.Type.EXAMPLE & Double = js.native
      
      @js.native
      sealed trait TEMPLATE
        extends StObject
           with Type
      /* 2 */ val TEMPLATE: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.TrainingPhrase.Type.TEMPLATE & Double = js.native
      
      @js.native
      sealed trait TYPE_UNSPECIFIED
        extends StObject
           with Type
      /* 0 */ val TYPE_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.TrainingPhrase.Type.TYPE_UNSPECIFIED & Double = js.native
    }
    
    /**
      * Creates a new TrainingPhrase instance using the specified properties.
      * @param [properties] Properties to set
      * @returns TrainingPhrase instance
      */
    /* static member */
    inline def create(): TrainingPhrase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TrainingPhrase]
    inline def create(properties: ITrainingPhrase): TrainingPhrase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TrainingPhrase]
    
    inline def decode(reader: js.typedarray.Uint8Array): TrainingPhrase = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TrainingPhrase]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): TrainingPhrase = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TrainingPhrase]
    /**
      * Decodes a TrainingPhrase message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns TrainingPhrase
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): TrainingPhrase = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TrainingPhrase]
    inline def decode(reader: Reader, length: Double): TrainingPhrase = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TrainingPhrase]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): TrainingPhrase = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TrainingPhrase]
    /**
      * Decodes a TrainingPhrase message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns TrainingPhrase
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): TrainingPhrase = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TrainingPhrase]
    
    /**
      * Encodes the specified TrainingPhrase message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.TrainingPhrase.verify|verify} messages.
      * @param message TrainingPhrase message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: ITrainingPhrase): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: ITrainingPhrase, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified TrainingPhrase message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.TrainingPhrase.verify|verify} messages.
      * @param message TrainingPhrase message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: ITrainingPhrase): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: ITrainingPhrase, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a TrainingPhrase message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns TrainingPhrase
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): TrainingPhrase = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TrainingPhrase]
    
    /**
      * Creates a plain object from a TrainingPhrase message. Also converts values to other types if specified.
      * @param message TrainingPhrase
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: TrainingPhrase): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: TrainingPhrase, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a TrainingPhrase message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
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
      
      inline def apply(): IPart = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IPart]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IPart] (val x: Self) extends AnyVal {
        
        inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
        
        inline def setAliasNull: Self = StObject.set(x, "alias", null)
        
        inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
        
        inline def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
        
        inline def setEntityTypeNull: Self = StObject.set(x, "entityType", null)
        
        inline def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextNull: Self = StObject.set(x, "text", null)
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
        
        inline def setUserDefined(value: Boolean): Self = StObject.set(x, "userDefined", value.asInstanceOf[js.Any])
        
        inline def setUserDefinedNull: Self = StObject.set(x, "userDefined", null)
        
        inline def setUserDefinedUndefined: Self = StObject.set(x, "userDefined", js.undefined)
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
    def apply(value: Double): js.UndefOr[WebhookState & Double] = js.native
    
    @js.native
    sealed trait WEBHOOK_STATE_ENABLED
      extends StObject
         with WebhookState
    /* 1 */ val WEBHOOK_STATE_ENABLED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.WebhookState.WEBHOOK_STATE_ENABLED & Double = js.native
    
    @js.native
    sealed trait WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING
      extends StObject
         with WebhookState
    /* 2 */ val WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.WebhookState.WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING & Double = js.native
    
    @js.native
    sealed trait WEBHOOK_STATE_UNSPECIFIED
      extends StObject
         with WebhookState
    /* 0 */ val WEBHOOK_STATE_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.WebhookState.WEBHOOK_STATE_UNSPECIFIED & Double = js.native
  }
  
  /**
    * Creates a new Intent instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Intent instance
    */
  /* static member */
  inline def create(): Intent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Intent]
  inline def create(properties: IIntent): Intent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Intent]
  
  inline def decode(reader: js.typedarray.Uint8Array): Intent = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Intent]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): Intent = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Intent]
  /**
    * Decodes an Intent message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Intent
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): Intent = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Intent]
  inline def decode(reader: Reader, length: Double): Intent = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Intent]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): Intent = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Intent]
  /**
    * Decodes an Intent message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Intent
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): Intent = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Intent]
  
  /**
    * Encodes the specified Intent message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.verify|verify} messages.
    * @param message Intent message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IIntent): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IIntent, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Intent message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.verify|verify} messages.
    * @param message Intent message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IIntent): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IIntent, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an Intent message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Intent
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Intent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Intent]
  
  /**
    * Creates a plain object from an Intent message. Also converts values to other types if specified.
    * @param message Intent
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Intent): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Intent, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an Intent message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of a FollowupIntentInfo. */
  trait IFollowupIntentInfo extends StObject {
    
    /** FollowupIntentInfo followupIntentName */
    var followupIntentName: js.UndefOr[String | Null] = js.undefined
    
    /** FollowupIntentInfo parentFollowupIntentName */
    var parentFollowupIntentName: js.UndefOr[String | Null] = js.undefined
  }
  object IFollowupIntentInfo {
    
    inline def apply(): IFollowupIntentInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFollowupIntentInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFollowupIntentInfo] (val x: Self) extends AnyVal {
      
      inline def setFollowupIntentName(value: String): Self = StObject.set(x, "followupIntentName", value.asInstanceOf[js.Any])
      
      inline def setFollowupIntentNameNull: Self = StObject.set(x, "followupIntentName", null)
      
      inline def setFollowupIntentNameUndefined: Self = StObject.set(x, "followupIntentName", js.undefined)
      
      inline def setParentFollowupIntentName(value: String): Self = StObject.set(x, "parentFollowupIntentName", value.asInstanceOf[js.Any])
      
      inline def setParentFollowupIntentNameNull: Self = StObject.set(x, "parentFollowupIntentName", null)
      
      inline def setParentFollowupIntentNameUndefined: Self = StObject.set(x, "parentFollowupIntentName", js.undefined)
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
        Platform | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.Platform * / any */ String) | Null
      ] = js.undefined
    
    /** Message quickReplies */
    var quickReplies: js.UndefOr[IQuickReplies | Null] = js.undefined
    
    /** Message simpleResponses */
    var simpleResponses: js.UndefOr[ISimpleResponses | Null] = js.undefined
    
    /** Message suggestions */
    var suggestions: js.UndefOr[ISuggestions | Null] = js.undefined
    
    /** Message tableCard */
    var tableCard: js.UndefOr[ITableCard | Null] = js.undefined
    
    /** Message text */
    var text: js.UndefOr[IText | Null] = js.undefined
  }
  object IMessage {
    
    inline def apply(): IMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMessage] (val x: Self) extends AnyVal {
      
      inline def setBasicCard(value: IBasicCard): Self = StObject.set(x, "basicCard", value.asInstanceOf[js.Any])
      
      inline def setBasicCardNull: Self = StObject.set(x, "basicCard", null)
      
      inline def setBasicCardUndefined: Self = StObject.set(x, "basicCard", js.undefined)
      
      inline def setBrowseCarouselCard(value: IBrowseCarouselCard): Self = StObject.set(x, "browseCarouselCard", value.asInstanceOf[js.Any])
      
      inline def setBrowseCarouselCardNull: Self = StObject.set(x, "browseCarouselCard", null)
      
      inline def setBrowseCarouselCardUndefined: Self = StObject.set(x, "browseCarouselCard", js.undefined)
      
      inline def setCard(value: ICard): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      inline def setCardNull: Self = StObject.set(x, "card", null)
      
      inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
      
      inline def setCarouselSelect(value: ICarouselSelect): Self = StObject.set(x, "carouselSelect", value.asInstanceOf[js.Any])
      
      inline def setCarouselSelectNull: Self = StObject.set(x, "carouselSelect", null)
      
      inline def setCarouselSelectUndefined: Self = StObject.set(x, "carouselSelect", js.undefined)
      
      inline def setImage(value: IImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setLinkOutSuggestion(value: ILinkOutSuggestion): Self = StObject.set(x, "linkOutSuggestion", value.asInstanceOf[js.Any])
      
      inline def setLinkOutSuggestionNull: Self = StObject.set(x, "linkOutSuggestion", null)
      
      inline def setLinkOutSuggestionUndefined: Self = StObject.set(x, "linkOutSuggestion", js.undefined)
      
      inline def setListSelect(value: IListSelect): Self = StObject.set(x, "listSelect", value.asInstanceOf[js.Any])
      
      inline def setListSelectNull: Self = StObject.set(x, "listSelect", null)
      
      inline def setListSelectUndefined: Self = StObject.set(x, "listSelect", js.undefined)
      
      inline def setMediaContent(value: IMediaContent): Self = StObject.set(x, "mediaContent", value.asInstanceOf[js.Any])
      
      inline def setMediaContentNull: Self = StObject.set(x, "mediaContent", null)
      
      inline def setMediaContentUndefined: Self = StObject.set(x, "mediaContent", js.undefined)
      
      inline def setPayload(value: IStruct): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadNull: Self = StObject.set(x, "payload", null)
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setPlatform(
        value: Platform | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.Platform * / any */ String)
      ): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformNull: Self = StObject.set(x, "platform", null)
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setQuickReplies(value: IQuickReplies): Self = StObject.set(x, "quickReplies", value.asInstanceOf[js.Any])
      
      inline def setQuickRepliesNull: Self = StObject.set(x, "quickReplies", null)
      
      inline def setQuickRepliesUndefined: Self = StObject.set(x, "quickReplies", js.undefined)
      
      inline def setSimpleResponses(value: ISimpleResponses): Self = StObject.set(x, "simpleResponses", value.asInstanceOf[js.Any])
      
      inline def setSimpleResponsesNull: Self = StObject.set(x, "simpleResponses", null)
      
      inline def setSimpleResponsesUndefined: Self = StObject.set(x, "simpleResponses", js.undefined)
      
      inline def setSuggestions(value: ISuggestions): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
      
      inline def setSuggestionsNull: Self = StObject.set(x, "suggestions", null)
      
      inline def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
      
      inline def setTableCard(value: ITableCard): Self = StObject.set(x, "tableCard", value.asInstanceOf[js.Any])
      
      inline def setTableCardNull: Self = StObject.set(x, "tableCard", null)
      
      inline def setTableCardUndefined: Self = StObject.set(x, "tableCard", js.undefined)
      
      inline def setText(value: IText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextNull: Self = StObject.set(x, "text", null)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
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
    
    inline def apply(): IParameter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IParameter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IParameter] (val x: Self) extends AnyVal {
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEntityTypeDisplayName(value: String): Self = StObject.set(x, "entityTypeDisplayName", value.asInstanceOf[js.Any])
      
      inline def setEntityTypeDisplayNameNull: Self = StObject.set(x, "entityTypeDisplayName", null)
      
      inline def setEntityTypeDisplayNameUndefined: Self = StObject.set(x, "entityTypeDisplayName", js.undefined)
      
      inline def setIsList(value: Boolean): Self = StObject.set(x, "isList", value.asInstanceOf[js.Any])
      
      inline def setIsListNull: Self = StObject.set(x, "isList", null)
      
      inline def setIsListUndefined: Self = StObject.set(x, "isList", js.undefined)
      
      inline def setMandatory(value: Boolean): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
      
      inline def setMandatoryNull: Self = StObject.set(x, "mandatory", null)
      
      inline def setMandatoryUndefined: Self = StObject.set(x, "mandatory", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPrompts(value: js.Array[String]): Self = StObject.set(x, "prompts", value.asInstanceOf[js.Any])
      
      inline def setPromptsNull: Self = StObject.set(x, "prompts", null)
      
      inline def setPromptsUndefined: Self = StObject.set(x, "prompts", js.undefined)
      
      inline def setPromptsVarargs(value: String*): Self = StObject.set(x, "prompts", js.Array(value*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
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
        Type | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.TrainingPhrase.Type * / any */ String) | Null
      ] = js.undefined
  }
  object ITrainingPhrase {
    
    inline def apply(): ITrainingPhrase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITrainingPhrase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITrainingPhrase] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParts(value: js.Array[IPart]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsNull: Self = StObject.set(x, "parts", null)
      
      inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
      
      inline def setPartsVarargs(value: IPart*): Self = StObject.set(x, "parts", js.Array(value*))
      
      inline def setTimesAddedCount(value: Double): Self = StObject.set(x, "timesAddedCount", value.asInstanceOf[js.Any])
      
      inline def setTimesAddedCountNull: Self = StObject.set(x, "timesAddedCount", null)
      
      inline def setTimesAddedCountUndefined: Self = StObject.set(x, "timesAddedCount", js.undefined)
      
      inline def setType(
        value: Type | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.TrainingPhrase.Type * / any */ String)
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
