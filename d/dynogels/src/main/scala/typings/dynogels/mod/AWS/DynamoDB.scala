package typings.dynogels.mod.AWS

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.converterMod.Converter.ConverterOptions
import typings.awsSdk.documentClientMod.DocumentClient.DocumentClientOptions
import typings.awsSdk.dynamodbMod.AttributeMap
import typings.awsSdk.dynamodbMod.AttributeValue
import typings.awsSdk.dynamodbMod.ClientConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dynogels", "AWS.DynamoDB")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class DynamoDB ()
  extends typings.awsSdk.mod.DynamoDB {
  def this(options: ClientConfiguration) = this()
}
object DynamoDB {
  
  @JSImport("dynogels", "AWS.DynamoDB.Converter")
  @js.native
  class Converter ()
    extends typings.awsSdk.mod.DynamoDB.Converter
  /* static members */
  object Converter {
    
    @JSImport("dynogels", "AWS.DynamoDB.Converter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def input(data: js.Any): AttributeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(data.asInstanceOf[js.Any]).asInstanceOf[AttributeValue]
    inline def input(data: js.Any, options: ConverterOptions): AttributeValue = (^.asInstanceOf[js.Dynamic].applyDynamic("input")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AttributeValue]
    
    inline def marshall(data: StringDictionary[js.Any]): AttributeMap = ^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any]).asInstanceOf[AttributeMap]
    inline def marshall(data: StringDictionary[js.Any], options: ConverterOptions): AttributeMap = (^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AttributeMap]
    
    inline def output(data: AttributeValue): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("output")(data.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def output(data: AttributeValue, options: ConverterOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("output")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def unmarshall(data: AttributeMap): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("unmarshall")(data.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    inline def unmarshall(data: AttributeMap, options: ConverterOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("unmarshall")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  }
  
  @JSImport("dynogels", "AWS.DynamoDB.DocumentClient")
  @js.native
  /**
    * Creates a DynamoDB document client with a set of configuration options.
    */
  class DocumentClient ()
    extends typings.awsSdk.mod.DynamoDB.DocumentClient {
    def this(options: DocumentClientOptions & ClientConfiguration) = this()
  }
}
