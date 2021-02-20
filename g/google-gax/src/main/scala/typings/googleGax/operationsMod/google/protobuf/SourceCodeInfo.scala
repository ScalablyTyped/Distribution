package typings.googleGax.operationsMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.protobuf.SourceCodeInfo.ILocation
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SourceCodeInfo. */
@JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo")
@js.native
/**
  * Constructs a new SourceCodeInfo.
  * @param [properties] Properties to set
  */
class SourceCodeInfo () extends ISourceCodeInfo {
  def this(properties: ISourceCodeInfo) = this()
  
  /** SourceCodeInfo location. */
  @JSName("location")
  var location_SourceCodeInfo: js.Array[ILocation] = js.native
  
  /**
    * Converts this SourceCodeInfo to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object SourceCodeInfo {
  
  /** Represents a Location. */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.Location")
  @js.native
  /**
    * Constructs a new Location.
    * @param [properties] Properties to set
    */
  class Location () extends ILocation {
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
    def toJSON(): StringDictionary[js.Any] = js.native
    
    /** Location trailingComments. */
    @JSName("trailingComments")
    var trailingComments_Location: String = js.native
  }
  object Location {
    
    /**
      * Creates a new Location instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Location instance
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.Location.create")
    @js.native
    def create(): typings.std.Location = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.Location.create")
    @js.native
    def create(properties: ILocation): typings.std.Location = js.native
    
    /**
      * Decodes a Location message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.Location.decode")
    @js.native
    def decode(reader: Reader): typings.std.Location = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.Location.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.std.Location = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.Location.decode")
    @js.native
    def decode(reader: Uint8Array): typings.std.Location = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.Location.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.std.Location = js.native
    
    /**
      * Decodes a Location message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.Location.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.std.Location = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.Location.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.std.Location = js.native
    
    /**
      * Encodes the specified Location message. Does not implicitly {@link google.protobuf.SourceCodeInfo.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.Location.encode")
    @js.native
    def encode(message: ILocation): Writer = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.Location.encode")
    @js.native
    def encode(message: ILocation, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Location message, length delimited. Does not implicitly {@link google.protobuf.SourceCodeInfo.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.Location.encodeDelimited")
    @js.native
    def encodeDelimited(message: ILocation): Writer = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.Location.encodeDelimited")
    @js.native
    def encodeDelimited(message: ILocation, writer: Writer): Writer = js.native
    
    /**
      * Creates a Location message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Location
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.Location.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.std.Location = js.native
    
    /**
      * Creates a plain object from a Location message. Also converts values to other types if specified.
      * @param message Location
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.Location.toObject")
    @js.native
    def toObject(message: typings.std.Location): StringDictionary[js.Any] = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.Location.toObject")
    @js.native
    def toObject(message: typings.std.Location, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Location message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.Location.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new SourceCodeInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SourceCodeInfo instance
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.create")
  @js.native
  def create(): SourceCodeInfo = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.create")
  @js.native
  def create(properties: ISourceCodeInfo): SourceCodeInfo = js.native
  
  /**
    * Decodes a SourceCodeInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SourceCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.decode")
  @js.native
  def decode(reader: Reader): SourceCodeInfo = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.decode")
  @js.native
  def decode(reader: Reader, length: Double): SourceCodeInfo = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.decode")
  @js.native
  def decode(reader: Uint8Array): SourceCodeInfo = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): SourceCodeInfo = js.native
  
  /**
    * Decodes a SourceCodeInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SourceCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): SourceCodeInfo = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): SourceCodeInfo = js.native
  
  /**
    * Encodes the specified SourceCodeInfo message. Does not implicitly {@link google.protobuf.SourceCodeInfo.verify|verify} messages.
    * @param message SourceCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.encode")
  @js.native
  def encode(message: ISourceCodeInfo): Writer = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.encode")
  @js.native
  def encode(message: ISourceCodeInfo, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SourceCodeInfo message, length delimited. Does not implicitly {@link google.protobuf.SourceCodeInfo.verify|verify} messages.
    * @param message SourceCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISourceCodeInfo): Writer = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISourceCodeInfo, writer: Writer): Writer = js.native
  
  /**
    * Creates a SourceCodeInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SourceCodeInfo
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): SourceCodeInfo = js.native
  
  /**
    * Creates a plain object from a SourceCodeInfo message. Also converts values to other types if specified.
    * @param message SourceCodeInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.toObject")
  @js.native
  def toObject(message: SourceCodeInfo): StringDictionary[js.Any] = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.toObject")
  @js.native
  def toObject(message: SourceCodeInfo, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SourceCodeInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.SourceCodeInfo.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Properties of a Location. */
  @js.native
  trait ILocation extends StObject {
    
    /** Location leadingComments */
    var leadingComments: js.UndefOr[String | Null] = js.native
    
    /** Location leadingDetachedComments */
    var leadingDetachedComments: js.UndefOr[js.Array[String] | Null] = js.native
    
    /** Location path */
    var path: js.UndefOr[js.Array[Double] | Null] = js.native
    
    /** Location span */
    var span: js.UndefOr[js.Array[Double] | Null] = js.native
    
    /** Location trailingComments */
    var trailingComments: js.UndefOr[String | Null] = js.native
  }
  object ILocation {
    
    @scala.inline
    def apply(): ILocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILocation]
    }
    
    @scala.inline
    implicit class ILocationMutableBuilder[Self <: ILocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeadingComments(value: String): Self = StObject.set(x, "leadingComments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingCommentsNull: Self = StObject.set(x, "leadingComments", null)
      
      @scala.inline
      def setLeadingCommentsUndefined: Self = StObject.set(x, "leadingComments", js.undefined)
      
      @scala.inline
      def setLeadingDetachedComments(value: js.Array[String]): Self = StObject.set(x, "leadingDetachedComments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingDetachedCommentsNull: Self = StObject.set(x, "leadingDetachedComments", null)
      
      @scala.inline
      def setLeadingDetachedCommentsUndefined: Self = StObject.set(x, "leadingDetachedComments", js.undefined)
      
      @scala.inline
      def setLeadingDetachedCommentsVarargs(value: String*): Self = StObject.set(x, "leadingDetachedComments", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathNull: Self = StObject.set(x, "path", null)
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setSpan(value: js.Array[Double]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanNull: Self = StObject.set(x, "span", null)
      
      @scala.inline
      def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      @scala.inline
      def setSpanVarargs(value: Double*): Self = StObject.set(x, "span", js.Array(value :_*))
      
      @scala.inline
      def setTrailingComments(value: String): Self = StObject.set(x, "trailingComments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingCommentsNull: Self = StObject.set(x, "trailingComments", null)
      
      @scala.inline
      def setTrailingCommentsUndefined: Self = StObject.set(x, "trailingComments", js.undefined)
    }
  }
}
