package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Volume describes a Docker container volume which is mounted into build
  * steps in order to persist files across build step execution.
  */
trait SchemaVolume extends StObject {
  
  /**
    * Name of the volume to mount.  Volume names must be unique per build step
    * and must be valid names for Docker volumes. Each named volume must be
    * used by at least two build steps.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Path at which to mount the volume.  Paths must be absolute and cannot
    * conflict with other volume paths on the same build step or with certain
    * reserved volume paths.
    */
  var path: js.UndefOr[String] = js.undefined
}
object SchemaVolume {
  
  @scala.inline
  def apply(): SchemaVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVolume]
  }
  
  @scala.inline
  implicit class SchemaVolumeMutableBuilder[Self <: SchemaVolume] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
