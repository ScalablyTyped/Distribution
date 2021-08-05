package typings.discordRpc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoThreshold extends StObject {
    
    var autoThreshold: Boolean
    
    var delay: Double
    
    var shortcut: js.Array[Code]
    
    var threshold: Double
  }
  object AutoThreshold {
    
    inline def apply(autoThreshold: Boolean, delay: Double, shortcut: js.Array[Code], threshold: Double): AutoThreshold = {
      val __obj = js.Dynamic.literal(autoThreshold = autoThreshold.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoThreshold]
    }
    
    extension [Self <: AutoThreshold](x: Self) {
      
      inline def setAutoThreshold(value: Boolean): Self = StObject.set(x, "autoThreshold", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setShortcut(value: js.Array[Code]): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
      
      inline def setShortcutVarargs(value: Code*): Self = StObject.set(x, "shortcut", js.Array(value :_*))
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    }
  }
  
  trait Avatar extends StObject {
    
    var avatar: String
    
    var discriminator: String
    
    var id: String
    
    var username: String
  }
  object Avatar {
    
    inline def apply(avatar: String, discriminator: String, id: String, username: String): Avatar = {
      val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], discriminator = discriminator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Avatar]
    }
    
    extension [Self <: Avatar](x: Self) {
      
      inline def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setDiscriminator(value: String): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait Capacity extends StObject {
    
    var capacity: Double
    
    var metadata: js.Any
    
    var owner: Id | String
    
    var `type`: String
  }
  object Capacity {
    
    inline def apply(capacity: Double, metadata: js.Any, owner: Id | String, `type`: String): Capacity = {
      val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Capacity]
    }
    
    extension [Self <: Capacity](x: Self) {
      
      inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setOwner(value: Id | String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Code extends StObject {
    
    var code: Double
    
    var name: String
    
    var `type`: Double
  }
  object Code {
    
    inline def apply(code: Double, name: String, `type`: Double): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Description extends StObject {
    
    var description: String
    
    var icon: String
    
    var id: String
    
    var name: String
    
    var rpc_origins: js.Array[String]
  }
  object Description {
    
    inline def apply(description: String, icon: String, id: String, name: String, rpc_origins: js.Array[String]): Description = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rpc_origins = rpc_origins.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    extension [Self <: Description](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRpc_origins(value: js.Array[String]): Self = StObject.set(x, "rpc_origins", value.asInstanceOf[js.Any])
      
      inline def setRpc_originsVarargs(value: String*): Self = StObject.set(x, "rpc_origins", js.Array(value :_*))
    }
  }
  
  trait Device extends StObject {
    
    var device: String
    
    var volume: Double
  }
  object Device {
    
    inline def apply(device: String, volume: Double): Device = {
      val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
      __obj.asInstanceOf[Device]
    }
    
    extension [Self <: Device](x: Self) {
      
      inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    }
  }
  
  trait Force extends StObject {
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Force {
    
    inline def apply(): Force = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Force]
    }
    
    extension [Self <: Force](x: Self) {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait Id extends StObject {
    
    var id: String
  }
  object Id {
    
    inline def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Left extends StObject {
    
    var left: Double
    
    var right: Double
  }
  object Left {
    
    inline def apply(left: Double, right: Double): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    extension [Self <: Left](x: Self) {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var url: String
  }
  object Name {
    
    inline def apply(name: String, url: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Timeout extends StObject {
    
    var force: Boolean
    
    var timeout: Double
  }
  object Timeout {
    
    inline def apply(force: Boolean, timeout: Double): Timeout = {
      val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timeout]
    }
    
    extension [Self <: Timeout](x: Self) {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
