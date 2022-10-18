package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.protobuf.SourceCodeInfo.ILocation
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SourceCodeInfo. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.SourceCodeInfo")
@js.native
/**
  * Constructs a new SourceCodeInfo.
  * @param [properties] Properties to set
  */
open class SourceCodeInfo ()
  extends StObject
     with ISourceCodeInfo {
  def this(properties: ISourceCodeInfo) = this()
  
  /** SourceCodeInfo location. */
  @JSName("location")
  var location_SourceCodeInfo: js.Array[ILocation] = js.native
  
  /**
    * Converts this SourceCodeInfo to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
}
object SourceCodeInfo {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.SourceCodeInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a Location. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.SourceCodeInfo.Location")
  @js.native
  /**
    * Constructs a new Location.
    * @param [properties] Properties to set
    */
  open class Location ()
    extends StObject
       with ILocation {
    def this(properties: ILocation) = this()
    
    /** Location leadingComments. */
    @JSName("leadingComments")
    var leadingComments_Location: String = js.native
    
    /** Location leadingDetachedComments. */
    @JSName("leadingDetachedComments")
    var leadingDetachedComments_Location: js.Array[String] = js.native
    
    /** Location path. */
    @JSName("path")
    var path_Location: js.Array[Double] = js.native
    
    /** Location span. */
    @JSName("span")
    var span_Location: js.Array[Double] = js.native
    
    /**
      * Converts this Location to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[scala.Any] = js.native
    
    /** Location trailingComments. */
    @JSName("trailingComments")
    var trailingComments_Location: String = js.native
  }
  object Location {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.SourceCodeInfo.Location")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a Location message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Location
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[scala.Any]): typings.std.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.std.Location]
    
    /**
      * Creates a plain object from a Location message. Also converts values to other types if specified.
      * @param message Location
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.std.Location): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
    inline def toObject(message: typings.std.Location, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
  }
  
  /**
    * Creates a SourceCodeInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SourceCodeInfo
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): SourceCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SourceCodeInfo]
  
  /**
    * Creates a plain object from a SourceCodeInfo message. Also converts values to other types if specified.
    * @param message SourceCodeInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: SourceCodeInfo): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: SourceCodeInfo, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
  
  /** Properties of a Location. */
  trait ILocation extends StObject {
    
    /** Location leadingComments */
    var leadingComments: js.UndefOr[String | Null] = js.undefined
    
    /** Location leadingDetachedComments */
    var leadingDetachedComments: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /** Location path */
    var path: js.UndefOr[js.Array[Double] | Null] = js.undefined
    
    /** Location span */
    var span: js.UndefOr[js.Array[Double] | Null] = js.undefined
    
    /** Location trailingComments */
    var trailingComments: js.UndefOr[String | Null] = js.undefined
  }
  object ILocation {
    
    inline def apply(): ILocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILocation]
    }
    
    extension [Self <: ILocation](x: Self) {
      
      inline def setLeadingComments(value: String): Self = StObject.set(x, "leadingComments", value.asInstanceOf[js.Any])
      
      inline def setLeadingCommentsNull: Self = StObject.set(x, "leadingComments", null)
      
      inline def setLeadingCommentsUndefined: Self = StObject.set(x, "leadingComments", js.undefined)
      
      inline def setLeadingDetachedComments(value: js.Array[String]): Self = StObject.set(x, "leadingDetachedComments", value.asInstanceOf[js.Any])
      
      inline def setLeadingDetachedCommentsNull: Self = StObject.set(x, "leadingDetachedComments", null)
      
      inline def setLeadingDetachedCommentsUndefined: Self = StObject.set(x, "leadingDetachedComments", js.undefined)
      
      inline def setLeadingDetachedCommentsVarargs(value: String*): Self = StObject.set(x, "leadingDetachedComments", js.Array(value*))
      
      inline def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNull: Self = StObject.set(x, "path", null)
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setSpan(value: js.Array[Double]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setSpanNull: Self = StObject.set(x, "span", null)
      
      inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      inline def setSpanVarargs(value: Double*): Self = StObject.set(x, "span", js.Array(value*))
      
      inline def setTrailingComments(value: String): Self = StObject.set(x, "trailingComments", value.asInstanceOf[js.Any])
      
      inline def setTrailingCommentsNull: Self = StObject.set(x, "trailingComments", null)
      
      inline def setTrailingCommentsUndefined: Self = StObject.set(x, "trailingComments", js.undefined)
    }
  }
}
