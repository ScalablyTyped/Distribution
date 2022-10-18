package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Field. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.Field")
@js.native
/**
  * Constructs a new Field.
  * @param [properties] Properties to set
  */
open class Field ()
  extends StObject
     with IField {
  def this(properties: IField) = this()
  
  /** Field name. */
  @JSName("name")
  var name_Field: String = js.native
  
  /**
    * Converts this Field to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object Field {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.Field")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents an IndexConfig. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.Field.IndexConfig")
  @js.native
  /**
    * Constructs a new IndexConfig.
    * @param [properties] Properties to set
    */
  open class IndexConfig ()
    extends StObject
       with IIndexConfig {
    def this(properties: IIndexConfig) = this()
    
    /** IndexConfig ancestorField. */
    @JSName("ancestorField")
    var ancestorField_IndexConfig: String = js.native
    
    /** IndexConfig indexes. */
    @JSName("indexes")
    var indexes_IndexConfig: js.Array[IIndex] = js.native
    
    /** IndexConfig reverting. */
    @JSName("reverting")
    var reverting_IndexConfig: Boolean = js.native
    
    /**
      * Converts this IndexConfig to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /** IndexConfig usesAncestorConfig. */
    @JSName("usesAncestorConfig")
    var usesAncestorConfig_IndexConfig: Boolean = js.native
  }
  object IndexConfig {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.Field.IndexConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an IndexConfig message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns IndexConfig
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): IndexConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[IndexConfig]
    
    /**
      * Creates a plain object from an IndexConfig message. Also converts values to other types if specified.
      * @param message IndexConfig
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: IndexConfig): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: IndexConfig, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /**
    * Creates a Field message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Field
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Field]
  
  /**
    * Creates a plain object from a Field message. Also converts values to other types if specified.
    * @param message Field
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Field): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Field, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /** Properties of an IndexConfig. */
  trait IIndexConfig extends StObject {
    
    /** IndexConfig ancestorField */
    var ancestorField: js.UndefOr[String | Null] = js.undefined
    
    /** IndexConfig indexes */
    var indexes: js.UndefOr[js.Array[IIndex] | Null] = js.undefined
    
    /** IndexConfig reverting */
    var reverting: js.UndefOr[Boolean | Null] = js.undefined
    
    /** IndexConfig usesAncestorConfig */
    var usesAncestorConfig: js.UndefOr[Boolean | Null] = js.undefined
  }
  object IIndexConfig {
    
    inline def apply(): IIndexConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IIndexConfig]
    }
    
    extension [Self <: IIndexConfig](x: Self) {
      
      inline def setAncestorField(value: String): Self = StObject.set(x, "ancestorField", value.asInstanceOf[js.Any])
      
      inline def setAncestorFieldNull: Self = StObject.set(x, "ancestorField", null)
      
      inline def setAncestorFieldUndefined: Self = StObject.set(x, "ancestorField", js.undefined)
      
      inline def setIndexes(value: js.Array[IIndex]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
      
      inline def setIndexesNull: Self = StObject.set(x, "indexes", null)
      
      inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
      
      inline def setIndexesVarargs(value: IIndex*): Self = StObject.set(x, "indexes", js.Array(value*))
      
      inline def setReverting(value: Boolean): Self = StObject.set(x, "reverting", value.asInstanceOf[js.Any])
      
      inline def setRevertingNull: Self = StObject.set(x, "reverting", null)
      
      inline def setRevertingUndefined: Self = StObject.set(x, "reverting", js.undefined)
      
      inline def setUsesAncestorConfig(value: Boolean): Self = StObject.set(x, "usesAncestorConfig", value.asInstanceOf[js.Any])
      
      inline def setUsesAncestorConfigNull: Self = StObject.set(x, "usesAncestorConfig", null)
      
      inline def setUsesAncestorConfigUndefined: Self = StObject.set(x, "usesAncestorConfig", js.undefined)
    }
  }
}
