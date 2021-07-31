package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import typings.gatsbyPluginUtils.gatsbyPluginUtilsStrings.all
import typings.gatsbyPluginUtils.gatsbyPluginUtilsStrings.any
import typings.gatsbyPluginUtils.gatsbyPluginUtilsStrings.one
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod._Schema because Already inherited */ @js.native
trait AlternativesSchema
  extends StObject
     with AnySchema {
  
  /**
    * Adds a conditional alternative schema type, either based on another key value, or a schema peeking into the current value.
    */
  def conditional(ref: String, options: WhenOptions): this.type = js.native
  def conditional(ref: Reference, options: WhenOptions): this.type = js.native
  def conditional(ref: Schema, options: WhenSchemaOptions): this.type = js.native
  
  @JSName("match")
  def match_all(mode: all): this.type = js.native
  /**
    * Requires the validated value to match a specific set of the provided alternative.try() schemas.
    * Cannot be combined with `alternatives.conditional()`.
    */
  @JSName("match")
  def match_any(mode: any): this.type = js.native
  @JSName("match")
  def match_one(mode: one): this.type = js.native
  
  /**
    * Adds an alternative schema type for attempting to match against the validated value.
    */
  def `try`(types: SchemaLikeWithoutArray*): this.type = js.native
}
