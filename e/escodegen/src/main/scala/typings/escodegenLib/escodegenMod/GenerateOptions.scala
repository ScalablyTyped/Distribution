package typings
package escodegenLib.escodegenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GenerateOptions extends js.Object {
  /**
       * If comments are attached to AST, escodegen is going to emit comments to output code. Default is false.
       */
  var comment: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Recognize DirectiveStatement and distinguish it from ExpressionStatement. Default: false
       */
  var directive: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If file is provided, it will be used as file property of generated source map.
       */
  var file: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The format options
       */
  var format: js.UndefOr[FormatOptions] = js.undefined
  var moz: js.UndefOr[MozillaOptions] = js.undefined
  /**
       * Mozilla Parser API compatible parse function, e.g., the parse function exported by esprima. If it is provided, generator tries to use the 'raw' representation. See esprima raw information. Default is null.
       */
  var parse: js.UndefOr[js.Function] = js.undefined
  var sourceCode: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optionally option.sourceContent string can be passed (which represents original source of the file, for example it could be a source of coffeescript from which JS is being generated), if provided generated source map will have original source embedded in it.
       */
  var sourceContent: js.UndefOr[java.lang.String] = js.undefined
  /**
       * sourceMap is the source maps's source filename, that's a name that will show up in the browser debugger for the generated source (if source-maps is enabled).
       * If a non-empty string value is provided, generate a source map.
       */
  var sourceMap: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optionally option.sourceMapRoot can be provided, in which case option.sourceMap will be treated as relative to it. For more information about source map itself, see source map library document, V3 draft and HTML5Rocks introduction. Default is undefined
       * sourceMapRoot is the source root for the source map (see the Mozilla documentation). If sourceMapWithCode is truthy, an object is returned from generate() of the form: { code: .. , map: .. }. If file is provided, it will be used as file property of generated source map.
       */
  var sourceMapRoot: js.UndefOr[java.lang.String] = js.undefined
  /**
       * . If sourceMapWithCode is true generator returns output hash, where output.map is a source-map representation, which can be serialized as output.map.toString(). output.code is a string with generated JS code (note that it's not going to have //@ sourceMappingURL comment in it).
       */
  var sourceMapWithCode: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Providing verbatim code generation option to Expression nodes.
       * verbatim option is provided by user as string. When generating Expression code,
       * looking up node[option.verbatim] value and dump it instead of normal code generation.
       *
       * @example
       *
       */
  var verbatim: js.UndefOr[java.lang.String] = js.undefined
}

