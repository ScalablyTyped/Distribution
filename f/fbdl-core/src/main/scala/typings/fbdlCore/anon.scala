package typings.fbdlCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Angry extends StObject {
    
    var angry: Double
    
    var care: Double
    
    var haha: Double
    
    var like: Double
    
    var love: Double
    
    var sad: Double
    
    var total: Double
    
    var wow: Double
  }
  object Angry {
    
    inline def apply(
      angry: Double,
      care: Double,
      haha: Double,
      like: Double,
      love: Double,
      sad: Double,
      total: Double,
      wow: Double
    ): Angry = {
      val __obj = js.Dynamic.literal(angry = angry.asInstanceOf[js.Any], care = care.asInstanceOf[js.Any], haha = haha.asInstanceOf[js.Any], like = like.asInstanceOf[js.Any], love = love.asInstanceOf[js.Any], sad = sad.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], wow = wow.asInstanceOf[js.Any])
      __obj.asInstanceOf[Angry]
    }
    
    extension [Self <: Angry](x: Self) {
      
      inline def setAngry(value: Double): Self = StObject.set(x, "angry", value.asInstanceOf[js.Any])
      
      inline def setCare(value: Double): Self = StObject.set(x, "care", value.asInstanceOf[js.Any])
      
      inline def setHaha(value: Double): Self = StObject.set(x, "haha", value.asInstanceOf[js.Any])
      
      inline def setLike(value: Double): Self = StObject.set(x, "like", value.asInstanceOf[js.Any])
      
      inline def setLove(value: Double): Self = StObject.set(x, "love", value.asInstanceOf[js.Any])
      
      inline def setSad(value: Double): Self = StObject.set(x, "sad", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setWow(value: Double): Self = StObject.set(x, "wow", value.asInstanceOf[js.Any])
    }
  }
  
  trait Avatar extends StObject {
    
    var avatar: String
    
    var name: String
    
    var `type`: String
    
    var url: String
  }
  object Avatar {
    
    inline def apply(avatar: String, name: String, `type`: String, url: String): Avatar = {
      val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Avatar]
    }
    
    extension [Self <: Avatar](x: Self) {
      
      inline def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var `type`: String
    
    var url: String
  }
  object Name {
    
    inline def apply(name: String, `type`: String, url: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
