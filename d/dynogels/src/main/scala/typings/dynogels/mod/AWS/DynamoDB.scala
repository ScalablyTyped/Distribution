package typings.dynogels.mod.AWS

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.clientsDynamodbMod.AttributeMap
import typings.awsSdk.clientsDynamodbMod.AttributeValue
import typings.awsSdk.clientsDynamodbMod.ClientConfiguration
import typings.awsSdk.libDynamodbConverterMod.Converter.ConverterOptions
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.DocumentClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dynogels", "AWS.DynamoDB")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
open class DynamoDB ()
  extends typings.awsSdk.mod.DynamoDB {
  def this(options: ClientConfiguration) = this()
}
object DynamoDB {
  
  @JSImport("dynogels", "AWS.DynamoDB.Converter")
  @js.native
  open class Converter ()
    extends typings.awsSdk.mod.DynamoDB.Converter
  /* static members */
  object Converter {
    
    @JSImport("dynogels", "AWS.DynamoDB.Converter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def input(data: Any): AttributeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(data.asInstanceOf[js.Any]).asInstanceOf[AttributeValue]
    inline def input(data: Any, options: ConverterOptions): AttributeValue = (^.asInstanceOf[js.Dynamic].applyDynamic("input")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AttributeValue]
    
    inline def marshall(data: StringDictionary[Any]): AttributeMap = ^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any]).asInstanceOf[AttributeMap]
    inline def marshall(data: StringDictionary[Any], options: ConverterOptions): AttributeMap = (^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AttributeMap]
    
    inline def output(data: AttributeValue): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("output")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def output(data: AttributeValue, options: ConverterOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("output")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def unmarshall(data: AttributeMap): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("unmarshall")(data.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def unmarshall(data: AttributeMap, options: ConverterOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("unmarshall")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  @JSImport("dynogels", "AWS.DynamoDB.DocumentClient")
  @js.native
  /**
    * Creates a DynamoDB document client with a set of configuration options.
    */
  open class DocumentClient ()
    extends typings.awsSdk.mod.DynamoDB.DocumentClient {
    def this(options: DocumentClientOptions & ClientConfiguration) = this()
  }
}
