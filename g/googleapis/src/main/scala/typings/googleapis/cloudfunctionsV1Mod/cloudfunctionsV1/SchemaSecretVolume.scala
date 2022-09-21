package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecretVolume extends StObject {
  
  /**
    * The path within the container to mount the secret volume. For example, setting the mount_path as `/etc/secrets` would mount the secret value files under the `/etc/secrets` directory. This directory will also be completely shadowed and unavailable to mount any other secrets. Recommended mount paths: /etc/secrets Restricted mount paths: /cloudsql, /dev/log, /pod, /proc, /var/log
    */
  var mountPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Project identifier (preferrably project number but can also be the project ID) of the project that contains the secret. If not set, it will be populated with the function's project assuming that the secret exists in the same project as of the function.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the secret in secret manager (not the full resource name).
    */
  var secret: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of secret versions to mount for this secret. If empty, the `latest` version of the secret will be made available in a file named after the secret under the mount point.
    */
  var versions: js.UndefOr[js.Array[SchemaSecretVersion]] = js.undefined
}
object SchemaSecretVolume {
  
  inline def apply(): SchemaSecretVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecretVolume]
  }
  
  extension [Self <: SchemaSecretVolume](x: Self) {
    
    inline def setMountPath(value: String): Self = StObject.set(x, "mountPath", value.asInstanceOf[js.Any])
    
    inline def setMountPathNull: Self = StObject.set(x, "mountPath", null)
    
    inline def setMountPathUndefined: Self = StObject.set(x, "mountPath", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretNull: Self = StObject.set(x, "secret", null)
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setVersions(value: js.Array[SchemaSecretVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: SchemaSecretVersion*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
