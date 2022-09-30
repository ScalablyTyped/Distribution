package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpath extends StObject {
  
  /**
    * Tests if the specified path is absolute.
    * @param path Path to test
    * @returns `true` if path is absolute
    */
  def isAbsolute(path: String): Boolean = js.native
  
  /**
    * Normalizes the specified path.
    * @param path Path to normalize
    * @returns Normalized path
    */
  def normalize(path: String): String = js.native
  
  /**
    * Resolves the specified include path against the specified origin path.
    * @param originPath Path to the origin file
    * @param includePath Include path relative to origin path
    * @param [alreadyNormalized=false] `true` if both paths are already known to be normalized
    * @returns Path to the include file
    */
  def resolve(originPath: String, includePath: String): String = js.native
  def resolve(originPath: String, includePath: String, alreadyNormalized: Boolean): String = js.native
}
