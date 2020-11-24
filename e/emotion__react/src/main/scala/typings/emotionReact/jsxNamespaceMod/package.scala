package typings.emotionReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object jsxNamespaceMod {
  
  // unpack all here to avoid infinite self-referencing when defining our own JSX namespace
  type ReactJSXElement = typings.react.mod.global.JSX.Element
  
  type ReactJSXElementAttributesProperty = typings.react.mod.global.JSX.ElementAttributesProperty
  
  type ReactJSXElementChildrenAttribute = typings.react.mod.global.JSX.ElementChildrenAttribute
  
  type ReactJSXElementClass = typings.react.mod.global.JSX.ElementClass
  
  type ReactJSXIntrinsicAttributes = typings.react.mod.global.JSX.IntrinsicAttributes
  
  type ReactJSXIntrinsicClassAttributes[T] = typings.react.mod.global.JSX.IntrinsicClassAttributes[T]
  
  type ReactJSXIntrinsicElements = typings.react.mod.global.JSX.IntrinsicElements
  
  type ReactJSXLibraryManagedAttributes[C, P] = typings.react.mod.global.JSX.LibraryManagedAttributes[C, P]
  
  type WithConditionalCSSProp[P] = P | (P with typings.emotionReact.anon.Css)
}
