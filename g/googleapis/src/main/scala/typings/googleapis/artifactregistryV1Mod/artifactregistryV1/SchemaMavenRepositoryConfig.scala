package typings.googleapis.artifactregistryV1Mod.artifactregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMavenRepositoryConfig extends StObject {
  
  /**
    * The repository with this flag will allow publishing the same snapshot versions.
    */
  var allowSnapshotOverwrites: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Version policy defines the versions that the registry will accept.
    */
  var versionPolicy: js.UndefOr[String | Null] = js.undefined
}
object SchemaMavenRepositoryConfig {
  
  inline def apply(): SchemaMavenRepositoryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMavenRepositoryConfig]
  }
  
  extension [Self <: SchemaMavenRepositoryConfig](x: Self) {
    
    inline def setAllowSnapshotOverwrites(value: Boolean): Self = StObject.set(x, "allowSnapshotOverwrites", value.asInstanceOf[js.Any])
    
    inline def setAllowSnapshotOverwritesNull: Self = StObject.set(x, "allowSnapshotOverwrites", null)
    
    inline def setAllowSnapshotOverwritesUndefined: Self = StObject.set(x, "allowSnapshotOverwrites", js.undefined)
    
    inline def setVersionPolicy(value: String): Self = StObject.set(x, "versionPolicy", value.asInstanceOf[js.Any])
    
    inline def setVersionPolicyNull: Self = StObject.set(x, "versionPolicy", null)
    
    inline def setVersionPolicyUndefined: Self = StObject.set(x, "versionPolicy", js.undefined)
  }
}
