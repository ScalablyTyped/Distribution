package typings.forestExpressSequelize.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sequelize.mod.Sequelize
import typings.sequelize.mod.SequelizeStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LianaOptions extends StObject {
  
  var authSecret: String
  
  var configDir: js.UndefOr[String] = js.undefined
  
  var connections: StringDictionary[Sequelize]
  
  var envSecret: String
  
  var excludedModels: js.UndefOr[js.Array[String]] = js.undefined
  
  var includedModels: js.UndefOr[js.Array[String]] = js.undefined
  
  var objectMapping: SequelizeStatic
}
object LianaOptions {
  
  inline def apply(
    authSecret: String,
    connections: StringDictionary[Sequelize],
    envSecret: String,
    objectMapping: SequelizeStatic
  ): LianaOptions = {
    val __obj = js.Dynamic.literal(authSecret = authSecret.asInstanceOf[js.Any], connections = connections.asInstanceOf[js.Any], envSecret = envSecret.asInstanceOf[js.Any], objectMapping = objectMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[LianaOptions]
  }
  
  extension [Self <: LianaOptions](x: Self) {
    
    inline def setAuthSecret(value: String): Self = StObject.set(x, "authSecret", value.asInstanceOf[js.Any])
    
    inline def setConfigDir(value: String): Self = StObject.set(x, "configDir", value.asInstanceOf[js.Any])
    
    inline def setConfigDirUndefined: Self = StObject.set(x, "configDir", js.undefined)
    
    inline def setConnections(value: StringDictionary[Sequelize]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    inline def setEnvSecret(value: String): Self = StObject.set(x, "envSecret", value.asInstanceOf[js.Any])
    
    inline def setExcludedModels(value: js.Array[String]): Self = StObject.set(x, "excludedModels", value.asInstanceOf[js.Any])
    
    inline def setExcludedModelsUndefined: Self = StObject.set(x, "excludedModels", js.undefined)
    
    inline def setExcludedModelsVarargs(value: String*): Self = StObject.set(x, "excludedModels", js.Array(value*))
    
    inline def setIncludedModels(value: js.Array[String]): Self = StObject.set(x, "includedModels", value.asInstanceOf[js.Any])
    
    inline def setIncludedModelsUndefined: Self = StObject.set(x, "includedModels", js.undefined)
    
    inline def setIncludedModelsVarargs(value: String*): Self = StObject.set(x, "includedModels", js.Array(value*))
    
    inline def setObjectMapping(value: SequelizeStatic): Self = StObject.set(x, "objectMapping", value.asInstanceOf[js.Any])
  }
}
