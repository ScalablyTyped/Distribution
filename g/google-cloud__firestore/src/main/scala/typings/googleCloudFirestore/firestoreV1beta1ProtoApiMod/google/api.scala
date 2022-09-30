package typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.api.ResourceDescriptor.Style
import typings.googleCloudFirestore.googleCloudFirestoreStrings.custom
import typings.googleCloudFirestore.googleCloudFirestoreStrings.delete
import typings.googleCloudFirestore.googleCloudFirestoreStrings.get
import typings.googleCloudFirestore.googleCloudFirestoreStrings.patch
import typings.googleCloudFirestore.googleCloudFirestoreStrings.post
import typings.googleCloudFirestore.googleCloudFirestoreStrings.put
import typings.protobufjs.mod.IConversionOptions
import typings.std.History
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace api. */
object api {
  
  /** Represents a CustomHttpPattern. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.api.CustomHttpPattern")
  @js.native
  /**
    * Constructs a new CustomHttpPattern.
    * @param [properties] Properties to set
    */
  open class CustomHttpPattern ()
    extends StObject
       with ICustomHttpPattern {
    def this(properties: ICustomHttpPattern) = this()
    
    /** CustomHttpPattern kind. */
    @JSName("kind")
    var kind_CustomHttpPattern: String = js.native
    
    /** CustomHttpPattern path. */
    @JSName("path")
    var path_CustomHttpPattern: String = js.native
    
    /**
      * Converts this CustomHttpPattern to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object CustomHttpPattern {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.api.CustomHttpPattern")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a CustomHttpPattern message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns CustomHttpPattern
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): CustomHttpPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CustomHttpPattern]
    
    /**
      * Creates a plain object from a CustomHttpPattern message. Also converts values to other types if specified.
      * @param message CustomHttpPattern
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: CustomHttpPattern): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: CustomHttpPattern, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /** Represents a Http. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.api.Http")
  @js.native
  /**
    * Constructs a new Http.
    * @param [properties] Properties to set
    */
  open class Http ()
    extends StObject
       with IHttp {
    def this(properties: IHttp) = this()
    
    /** Http rules. */
    @JSName("rules")
    var rules_Http: js.Array[IHttpRule] = js.native
    
    /**
      * Converts this Http to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object Http {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.api.Http")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a Http message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Http
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): Http = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Http]
    
    /**
      * Creates a plain object from a Http message. Also converts values to other types if specified.
      * @param message Http
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Http): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Http, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /** Represents a HttpRule. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.api.HttpRule")
  @js.native
  /**
    * Constructs a new HttpRule.
    * @param [properties] Properties to set
    */
  open class HttpRule ()
    extends StObject
       with IHttpRule {
    def this(properties: IHttpRule) = this()
    
    /** HttpRule additionalBindings. */
    @JSName("additionalBindings")
    var additionalBindings_HttpRule: js.Array[IHttpRule] = js.native
    
    /** HttpRule body. */
    @JSName("body")
    var body_HttpRule: String = js.native
    
    /** HttpRule pattern. */
    var pattern: js.UndefOr[get | put | post | delete | patch | custom] = js.native
    
    /** HttpRule selector. */
    @JSName("selector")
    var selector_HttpRule: String = js.native
    
    /**
      * Converts this HttpRule to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object HttpRule {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.api.HttpRule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a HttpRule message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns HttpRule
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): HttpRule = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[HttpRule]
    
    /**
      * Creates a plain object from a HttpRule message. Also converts values to other types if specified.
      * @param message HttpRule
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: HttpRule): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: HttpRule, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /** Represents a ResourceDescriptor. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.api.ResourceDescriptor")
  @js.native
  /**
    * Constructs a new ResourceDescriptor.
    * @param [properties] Properties to set
    */
  open class ResourceDescriptor ()
    extends StObject
       with IResourceDescriptor {
    def this(properties: IResourceDescriptor) = this()
    
    /** ResourceDescriptor history. */
    @JSName("history")
    var history_ResourceDescriptor: History = js.native
    
    /** ResourceDescriptor nameField. */
    @JSName("nameField")
    var nameField_ResourceDescriptor: String = js.native
    
    /** ResourceDescriptor pattern. */
    @JSName("pattern")
    var pattern_ResourceDescriptor: js.Array[String] = js.native
    
    /** ResourceDescriptor plural. */
    @JSName("plural")
    var plural_ResourceDescriptor: String = js.native
    
    /** ResourceDescriptor singular. */
    @JSName("singular")
    var singular_ResourceDescriptor: String = js.native
    
    /** ResourceDescriptor style. */
    @JSName("style")
    var style_ResourceDescriptor: js.Array[Style] = js.native
    
    /**
      * Converts this ResourceDescriptor to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /** ResourceDescriptor type. */
    @JSName("type")
    var type_ResourceDescriptor: String = js.native
  }
  object ResourceDescriptor {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.api.ResourceDescriptor")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a ResourceDescriptor message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ResourceDescriptor
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): ResourceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ResourceDescriptor]
    
    /**
      * Creates a plain object from a ResourceDescriptor message. Also converts values to other types if specified.
      * @param message ResourceDescriptor
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: ResourceDescriptor): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: ResourceDescriptor, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /** History enum. */
    /* Rewritten from type alias, can be one of: 
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.HISTORY_UNSPECIFIED
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.ORIGINALLY_SINGLE_PATTERN
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.FUTURE_MULTI_PATTERN
    */
    trait History extends StObject
    object History {
      
      inline def FUTURE_MULTI_PATTERN: typings.googleCloudFirestore.googleCloudFirestoreStrings.FUTURE_MULTI_PATTERN = "FUTURE_MULTI_PATTERN".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.FUTURE_MULTI_PATTERN]
      
      inline def HISTORY_UNSPECIFIED: typings.googleCloudFirestore.googleCloudFirestoreStrings.HISTORY_UNSPECIFIED = "HISTORY_UNSPECIFIED".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.HISTORY_UNSPECIFIED]
      
      inline def ORIGINALLY_SINGLE_PATTERN: typings.googleCloudFirestore.googleCloudFirestoreStrings.ORIGINALLY_SINGLE_PATTERN = "ORIGINALLY_SINGLE_PATTERN".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.ORIGINALLY_SINGLE_PATTERN]
    }
    
    /** Style enum. */
    /* Rewritten from type alias, can be one of: 
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.STYLE_UNSPECIFIED
      - typings.googleCloudFirestore.googleCloudFirestoreStrings.DECLARATIVE_FRIENDLY
    */
    trait Style extends StObject
    object Style {
      
      inline def DECLARATIVE_FRIENDLY: typings.googleCloudFirestore.googleCloudFirestoreStrings.DECLARATIVE_FRIENDLY = "DECLARATIVE_FRIENDLY".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.DECLARATIVE_FRIENDLY]
      
      inline def STYLE_UNSPECIFIED: typings.googleCloudFirestore.googleCloudFirestoreStrings.STYLE_UNSPECIFIED = "STYLE_UNSPECIFIED".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.STYLE_UNSPECIFIED]
    }
  }
  
  /** Represents a ResourceReference. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.api.ResourceReference")
  @js.native
  /**
    * Constructs a new ResourceReference.
    * @param [properties] Properties to set
    */
  open class ResourceReference ()
    extends StObject
       with IResourceReference {
    def this(properties: IResourceReference) = this()
    
    /** ResourceReference childType. */
    @JSName("childType")
    var childType_ResourceReference: String = js.native
    
    /**
      * Converts this ResourceReference to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /** ResourceReference type. */
    @JSName("type")
    var type_ResourceReference: String = js.native
  }
  object ResourceReference {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.api.ResourceReference")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a ResourceReference message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ResourceReference
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): ResourceReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ResourceReference]
    
    /**
      * Creates a plain object from a ResourceReference message. Also converts values to other types if specified.
      * @param message ResourceReference
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: ResourceReference): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: ResourceReference, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /** FieldBehavior enum. */
  /* Rewritten from type alias, can be one of: 
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.FIELD_BEHAVIOR_UNSPECIFIED
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.OPTIONAL
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.REQUIRED
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.OUTPUT_ONLY
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.INPUT_ONLY
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.IMMUTABLE
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.UNORDERED_LIST
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.NON_EMPTY_DEFAULT
  */
  trait FieldBehavior extends StObject
  object FieldBehavior {
    
    inline def FIELD_BEHAVIOR_UNSPECIFIED: typings.googleCloudFirestore.googleCloudFirestoreStrings.FIELD_BEHAVIOR_UNSPECIFIED = "FIELD_BEHAVIOR_UNSPECIFIED".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.FIELD_BEHAVIOR_UNSPECIFIED]
    
    inline def IMMUTABLE: typings.googleCloudFirestore.googleCloudFirestoreStrings.IMMUTABLE = "IMMUTABLE".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.IMMUTABLE]
    
    inline def INPUT_ONLY: typings.googleCloudFirestore.googleCloudFirestoreStrings.INPUT_ONLY = "INPUT_ONLY".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.INPUT_ONLY]
    
    inline def NON_EMPTY_DEFAULT: typings.googleCloudFirestore.googleCloudFirestoreStrings.NON_EMPTY_DEFAULT = "NON_EMPTY_DEFAULT".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.NON_EMPTY_DEFAULT]
    
    inline def OPTIONAL: typings.googleCloudFirestore.googleCloudFirestoreStrings.OPTIONAL = "OPTIONAL".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.OPTIONAL]
    
    inline def OUTPUT_ONLY: typings.googleCloudFirestore.googleCloudFirestoreStrings.OUTPUT_ONLY = "OUTPUT_ONLY".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.OUTPUT_ONLY]
    
    inline def REQUIRED: typings.googleCloudFirestore.googleCloudFirestoreStrings.REQUIRED = "REQUIRED".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.REQUIRED]
    
    inline def UNORDERED_LIST: typings.googleCloudFirestore.googleCloudFirestoreStrings.UNORDERED_LIST = "UNORDERED_LIST".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.UNORDERED_LIST]
  }
  
  /** Properties of a CustomHttpPattern. */
  trait ICustomHttpPattern extends StObject {
    
    /** CustomHttpPattern kind */
    var kind: js.UndefOr[String | Null] = js.undefined
    
    /** CustomHttpPattern path */
    var path: js.UndefOr[String | Null] = js.undefined
  }
  object ICustomHttpPattern {
    
    inline def apply(): ICustomHttpPattern = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICustomHttpPattern]
    }
    
    extension [Self <: ICustomHttpPattern](x: Self) {
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindNull: Self = StObject.set(x, "kind", null)
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNull: Self = StObject.set(x, "path", null)
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  /** Properties of a Http. */
  trait IHttp extends StObject {
    
    /** Http rules */
    var rules: js.UndefOr[js.Array[IHttpRule] | Null] = js.undefined
  }
  object IHttp {
    
    inline def apply(): IHttp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHttp]
    }
    
    extension [Self <: IHttp](x: Self) {
      
      inline def setRules(value: js.Array[IHttpRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesNull: Self = StObject.set(x, "rules", null)
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: IHttpRule*): Self = StObject.set(x, "rules", js.Array(value*))
    }
  }
  
  /** Properties of a HttpRule. */
  trait IHttpRule extends StObject {
    
    /** HttpRule additionalBindings */
    var additionalBindings: js.UndefOr[js.Array[IHttpRule] | Null] = js.undefined
    
    /** HttpRule body */
    var body: js.UndefOr[String | Null] = js.undefined
    
    /** HttpRule custom */
    var custom: js.UndefOr[ICustomHttpPattern | Null] = js.undefined
    
    /** HttpRule delete */
    var delete: js.UndefOr[String | Null] = js.undefined
    
    /** HttpRule get */
    var get: js.UndefOr[String | Null] = js.undefined
    
    /** HttpRule patch */
    var patch: js.UndefOr[String | Null] = js.undefined
    
    /** HttpRule post */
    var post: js.UndefOr[String | Null] = js.undefined
    
    /** HttpRule put */
    var put: js.UndefOr[String | Null] = js.undefined
    
    /** HttpRule selector */
    var selector: js.UndefOr[String | Null] = js.undefined
  }
  object IHttpRule {
    
    inline def apply(): IHttpRule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHttpRule]
    }
    
    extension [Self <: IHttpRule](x: Self) {
      
      inline def setAdditionalBindings(value: js.Array[IHttpRule]): Self = StObject.set(x, "additionalBindings", value.asInstanceOf[js.Any])
      
      inline def setAdditionalBindingsNull: Self = StObject.set(x, "additionalBindings", null)
      
      inline def setAdditionalBindingsUndefined: Self = StObject.set(x, "additionalBindings", js.undefined)
      
      inline def setAdditionalBindingsVarargs(value: IHttpRule*): Self = StObject.set(x, "additionalBindings", js.Array(value*))
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCustom(value: ICustomHttpPattern): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomNull: Self = StObject.set(x, "custom", null)
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setDelete(value: String): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteNull: Self = StObject.set(x, "delete", null)
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      inline def setGet(value: String): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setGetNull: Self = StObject.set(x, "get", null)
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setPatch(value: String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setPatchNull: Self = StObject.set(x, "patch", null)
      
      inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      inline def setPost(value: String): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      inline def setPostNull: Self = StObject.set(x, "post", null)
      
      inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      inline def setPut(value: String): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
      
      inline def setPutNull: Self = StObject.set(x, "put", null)
      
      inline def setPutUndefined: Self = StObject.set(x, "put", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorNull: Self = StObject.set(x, "selector", null)
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    }
  }
  
  /** Properties of a ResourceDescriptor. */
  trait IResourceDescriptor extends StObject {
    
    /** ResourceDescriptor history */
    var history: js.UndefOr[History | Null] = js.undefined
    
    /** ResourceDescriptor nameField */
    var nameField: js.UndefOr[String | Null] = js.undefined
    
    /** ResourceDescriptor pattern */
    var pattern: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /** ResourceDescriptor plural */
    var plural: js.UndefOr[String | Null] = js.undefined
    
    /** ResourceDescriptor singular */
    var singular: js.UndefOr[String | Null] = js.undefined
    
    /** ResourceDescriptor style */
    var style: js.UndefOr[js.Array[Style] | Null] = js.undefined
    
    /** ResourceDescriptor type */
    var `type`: js.UndefOr[String | Null] = js.undefined
  }
  object IResourceDescriptor {
    
    inline def apply(): IResourceDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IResourceDescriptor]
    }
    
    extension [Self <: IResourceDescriptor](x: Self) {
      
      inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryNull: Self = StObject.set(x, "history", null)
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setNameField(value: String): Self = StObject.set(x, "nameField", value.asInstanceOf[js.Any])
      
      inline def setNameFieldNull: Self = StObject.set(x, "nameField", null)
      
      inline def setNameFieldUndefined: Self = StObject.set(x, "nameField", js.undefined)
      
      inline def setPattern(value: js.Array[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternNull: Self = StObject.set(x, "pattern", null)
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPatternVarargs(value: String*): Self = StObject.set(x, "pattern", js.Array(value*))
      
      inline def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
      
      inline def setPluralNull: Self = StObject.set(x, "plural", null)
      
      inline def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
      
      inline def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
      
      inline def setSingularNull: Self = StObject.set(x, "singular", null)
      
      inline def setSingularUndefined: Self = StObject.set(x, "singular", js.undefined)
      
      inline def setStyle(value: js.Array[Style]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /** Properties of a ResourceReference. */
  trait IResourceReference extends StObject {
    
    /** ResourceReference childType */
    var childType: js.UndefOr[String | Null] = js.undefined
    
    /** ResourceReference type */
    var `type`: js.UndefOr[String | Null] = js.undefined
  }
  object IResourceReference {
    
    inline def apply(): IResourceReference = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IResourceReference]
    }
    
    extension [Self <: IResourceReference](x: Self) {
      
      inline def setChildType(value: String): Self = StObject.set(x, "childType", value.asInstanceOf[js.Any])
      
      inline def setChildTypeNull: Self = StObject.set(x, "childType", null)
      
      inline def setChildTypeUndefined: Self = StObject.set(x, "childType", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
