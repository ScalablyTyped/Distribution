package typings.expressDashOpenapi.expressDashOpenapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object OpenApi {
  import org.scalablytyped.runtime.StringDictionary

  type DefinitionsObject = StringDictionary[SchemaObject]
  type ExampleObject = StringDictionary[js.Any]
  type HeaderObject = ItemsObject
  type HeadersObject = StringDictionary[HeaderObject]
  type MimeTypes = js.Array[String]
  type Parameters = js.Array[ReferenceObject | Parameter]
  type ParametersDefinitionsObject = StringDictionary[ParameterObject]
  type PathsObject = StringDictionary[PathItemObject | js.Any]
  type ResponsesDefinitionsObject = StringDictionary[ResponseObject]
  type ScopesObject = StringDictionary[js.Any]
  type SecurityDefinitionsObject = StringDictionary[SecuritySchemeObject]
  type SecurityRequirementObject = StringDictionary[js.Array[String]]
}
