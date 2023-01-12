package typings.googleCloudTextToSpeech.anon

import typings.protobufjs.mod.Codegen
import typings.protobufjs.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofconverter extends StObject {
  
  /**
    * Generates a plain object to runtime message converter specific to the specified message type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  def fromObject(mtype: Type): Codegen
  
  /**
    * Generates a runtime message to plain object converter specific to the specified message type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  def toObject(mtype: Type): Codegen
}
object Typeofconverter {
  
  inline def apply(fromObject: Type => Codegen, toObject: Type => Codegen): Typeofconverter = {
    val __obj = js.Dynamic.literal(fromObject = js.Any.fromFunction1(fromObject), toObject = js.Any.fromFunction1(toObject))
    __obj.asInstanceOf[Typeofconverter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofconverter] (val x: Self) extends AnyVal {
    
    inline def setFromObject(value: Type => Codegen): Self = StObject.set(x, "fromObject", js.Any.fromFunction1(value))
    
    inline def setToObject(value: Type => Codegen): Self = StObject.set(x, "toObject", js.Any.fromFunction1(value))
  }
}
