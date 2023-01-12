package typings.dnsPacket.mod

import typings.dnsPacket.dnsPacketStrings.query
import typings.dnsPacket.dnsPacketStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Packet extends StObject {
  
  var additionals: js.UndefOr[js.Array[Answer]] = js.undefined
  
  var answers: js.UndefOr[js.Array[Answer]] = js.undefined
  
  var authorities: js.UndefOr[js.Array[Answer]] = js.undefined
  
  /**
    * A bit-mask combination of zero or more of:
    * {@link AUTHORITATIVE_ANSWER},
    * {@link TRUNCATED_RESPONSE},
    * {@link RECURSION_DESIRED},
    * {@link RECURSION_AVAILABLE},
    * {@link AUTHENTIC_DATA},
    * {@link CHECKING_DISABLED}.
    */
  var flags: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[Double] = js.undefined
  
  var questions: js.UndefOr[js.Array[Question]] = js.undefined
  
  /**
    * Whether the packet is a query or a response. This field may be
    * omitted if it is clear from the context of usage what type of packet
    * it is.
    */
  var `type`: js.UndefOr[query | response] = js.undefined
}
object Packet {
  
  inline def apply(): Packet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Packet] (val x: Self) extends AnyVal {
    
    inline def setAdditionals(value: js.Array[Answer]): Self = StObject.set(x, "additionals", value.asInstanceOf[js.Any])
    
    inline def setAdditionalsUndefined: Self = StObject.set(x, "additionals", js.undefined)
    
    inline def setAdditionalsVarargs(value: Answer*): Self = StObject.set(x, "additionals", js.Array(value*))
    
    inline def setAnswers(value: js.Array[Answer]): Self = StObject.set(x, "answers", value.asInstanceOf[js.Any])
    
    inline def setAnswersUndefined: Self = StObject.set(x, "answers", js.undefined)
    
    inline def setAnswersVarargs(value: Answer*): Self = StObject.set(x, "answers", js.Array(value*))
    
    inline def setAuthorities(value: js.Array[Answer]): Self = StObject.set(x, "authorities", value.asInstanceOf[js.Any])
    
    inline def setAuthoritiesUndefined: Self = StObject.set(x, "authorities", js.undefined)
    
    inline def setAuthoritiesVarargs(value: Answer*): Self = StObject.set(x, "authorities", js.Array(value*))
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setQuestions(value: js.Array[Question]): Self = StObject.set(x, "questions", value.asInstanceOf[js.Any])
    
    inline def setQuestionsUndefined: Self = StObject.set(x, "questions", js.undefined)
    
    inline def setQuestionsVarargs(value: Question*): Self = StObject.set(x, "questions", js.Array(value*))
    
    inline def setType(value: query | response): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
