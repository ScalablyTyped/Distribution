package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BasicType = scala.Boolean | scala.Double | java.lang.String | js.Array[js.Any] | js.Object | scala.Null

type CoerceFunction = js.Function2[
/* value */ js.Any, 
/* helpers */ typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.CustomHelpers[js.Any], 
typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.CoerceResult]

type ComparatorFunction = js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Boolean]

type CustomValidator[V] = js.Function2[
/* value */ V, 
/* helpers */ typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.CustomHelpers[js.Any], 
V]

type ExtensionBoundSchema = typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.Schema & typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.SchemaInternals

type ExtensionFactory = js.Function1[
/* joi */ typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.PluginOptionsSchemaJoi, 
typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.Extension]

type ExternalValidationFunction = js.Function1[/* value */ js.Any, js.Any]

type LanguageMessages = typings.std.Record[java.lang.String, java.lang.String]

/* Rewritten from type alias, can be one of: 
  - typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.AnySchema
  - typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.ArraySchema
  - typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.AlternativesSchema
  - typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.BinarySchema
  - typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.BooleanSchema
  - typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.DateSchema
  - typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.FunctionSchema
  - typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.NumberSchema
  - typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.ObjectSchema[js.Any]
  - typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.StringSchema
  - typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.LinkSchema
  - typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.SymbolSchema
*/
type Schema = typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod._Schema | typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.ObjectSchema[js.Any]

type SchemaFunction = js.Function1[
/* schema */ typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.Schema, 
typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.Schema]

type SchemaLike = typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.SchemaLikeWithoutArray | js.Object

type SchemaLikeWithoutArray = java.lang.String | scala.Double | scala.Boolean | scala.Null | typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.Schema | typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.SchemaMap[js.Any]

type SchemaMap[TSchema] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ key in keyof TSchema ]:? gatsby-plugin-utils.gatsby-plugin-utils/dist/utils/plugin-options-schema-joi-type.SchemaLike | std.Array<gatsby-plugin-utils.gatsby-plugin-utils/dist/utils/plugin-options-schema-joi-type.SchemaLike>}
  */ typings.gatsbyPluginUtils.gatsbyPluginUtilsStrings.SchemaMap & org.scalablytyped.runtime.TopLevel[js.Any]

type ValidationErrorFunction = js.Function1[
/* errors */ js.Array[typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.ErrorReport], 
java.lang.String | typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.ValidationErrorItem | typings.std.Error]
