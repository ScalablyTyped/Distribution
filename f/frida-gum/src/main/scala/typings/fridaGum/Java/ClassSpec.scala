package typings.fridaGum.Java

import org.scalablytyped.runtime.StringDictionary
import typings.fridaGum.WrapperAlloc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassSpec extends js.Object {
  /**
    * Name and type of each field to expose.
    */
  var fields: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Interfaces implemented by this class.
    */
  var implements: js.UndefOr[js.Array[WrapperAlloc]] = js.undefined
  /**
    * Methods to implement. Use the special name `$init` to define one or more constructors.
    */
  var methods: js.UndefOr[
    StringDictionary[MethodImplementation[js.Object] | MethodSpec | js.Array[MethodSpec]]
  ] = js.undefined
  /**
    * Name of the class.
    */
  var name: String
  /**
    * Super-class. Omit to inherit from `java.lang.Object`.
    */
  var superClass: js.UndefOr[WrapperAlloc] = js.undefined
}

object ClassSpec {
  @scala.inline
  def apply(
    name: String,
    fields: StringDictionary[String] = null,
    implements: js.Array[WrapperAlloc] = null,
    methods: StringDictionary[MethodImplementation[js.Object] | MethodSpec | js.Array[MethodSpec]] = null,
    superClass: WrapperAlloc = null
  ): ClassSpec = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (implements != null) __obj.updateDynamic("implements")(implements.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (superClass != null) __obj.updateDynamic("superClass")(superClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassSpec]
  }
}

