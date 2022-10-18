package typings.dnsOverHttpResolver

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsMod {
  
  @JSImport("dns-over-http-resolver/dist/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildResource(serverResolver: String, hostname: String, recordType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildResource")(serverResolver.asInstanceOf[js.Any], hostname.asInstanceOf[js.Any], recordType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getCacheKey(hostname: String, recordType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCacheKey")(hostname.asInstanceOf[js.Any], recordType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def request(resource: String, signal: AbortSignal): js.Promise[DNSJSON] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(resource.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DNSJSON]]
  
  trait Answer extends StObject {
    
    var TTL: Double
    
    var data: String
    
    var name: String
    
    var `type`: Double
  }
  object Answer {
    
    inline def apply(TTL: Double, data: String, name: String, `type`: Double): Answer = {
      val __obj = js.Dynamic.literal(TTL = TTL.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Answer]
    }
    
    extension [Self <: Answer](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTTL(value: Double): Self = StObject.set(x, "TTL", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DNSJSON extends StObject {
    
    var Answer: js.Array[typings.dnsOverHttpResolver.distSrcUtilsMod.Answer]
    
    var Question: js.Array[typings.dnsOverHttpResolver.distSrcUtilsMod.Question]
  }
  object DNSJSON {
    
    inline def apply(Answer: js.Array[Answer], Question: js.Array[Question]): DNSJSON = {
      val __obj = js.Dynamic.literal(Answer = Answer.asInstanceOf[js.Any], Question = Question.asInstanceOf[js.Any])
      __obj.asInstanceOf[DNSJSON]
    }
    
    extension [Self <: DNSJSON](x: Self) {
      
      inline def setAnswer(value: js.Array[Answer]): Self = StObject.set(x, "Answer", value.asInstanceOf[js.Any])
      
      inline def setAnswerVarargs(value: Answer*): Self = StObject.set(x, "Answer", js.Array(value*))
      
      inline def setQuestion(value: js.Array[Question]): Self = StObject.set(x, "Question", value.asInstanceOf[js.Any])
      
      inline def setQuestionVarargs(value: Question*): Self = StObject.set(x, "Question", js.Array(value*))
    }
  }
  
  trait Question extends StObject {
    
    var name: String
    
    var `type`: Double
  }
  object Question {
    
    inline def apply(name: String, `type`: Double): Question = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Question]
    }
    
    extension [Self <: Question](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
