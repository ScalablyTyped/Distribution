package typings.gatsbyCli

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginAddUtilsMod {
  
  @JSImport("gatsby-cli/lib/handlers/plugin-add-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def GatsbyPluginCreate(hasRootNameOptionsKey: IGatsbyPluginCreateInput): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("GatsbyPluginCreate")(hasRootNameOptionsKey.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def NPMPackageCreate(hasRootName: IPackageCreateInput): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("NPMPackageCreate")(hasRootName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait IGatsbyPluginCreateInput extends StObject {
    
    var key: String
    
    var name: String
    
    var options: js.UndefOr[Record[String, Any]] = js.undefined
    
    var root: String
  }
  object IGatsbyPluginCreateInput {
    
    inline def apply(key: String, name: String, root: String): IGatsbyPluginCreateInput = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGatsbyPluginCreateInput]
    }
    
    extension [Self <: IGatsbyPluginCreateInput](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Record[String, Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPackageCreateInput extends StObject {
    
    var name: String
    
    var root: String
  }
  object IPackageCreateInput {
    
    inline def apply(name: String, root: String): IPackageCreateInput = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPackageCreateInput]
    }
    
    extension [Self <: IPackageCreateInput](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
