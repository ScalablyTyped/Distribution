package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassSpec[D, T, S] extends js.Object {
  /**
    * Methods to implement.
    */
  var methods: js.UndefOr[
    StringDictionary[
      (UserMethodImplementation[D, T, S]) | (MethodSpec[UserMethodImplementation[D, T, S]])
    ]
  ] = js.native
  /**
    * Name of the class.
    *
    * Omit this if you don’t care about the globally visible name and would like the runtime to auto-generate one
    * for you.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Protocols this class conforms to.
    */
  var protocols: js.UndefOr[js.Array[Protocol]] = js.native
  /**
    * Super-class, or `null` to create a new root class. Omit to inherit from `NSObject`.
    */
  var `super`: js.UndefOr[Object | Null] = js.native
}

object ClassSpec {
  @scala.inline
  def apply[D, T, S](): ClassSpec[D, T, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassSpec[D, T, S]]
  }
  @scala.inline
  implicit class ClassSpecOps[Self <: ClassSpec[_, _, _], D, T, S] (val x: Self with (ClassSpec[D, T, S])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMethods(
      value: StringDictionary[
          (UserMethodImplementation[D, T, S]) | (MethodSpec[UserMethodImplementation[D, T, S]])
        ]
    ): Self = this.set("methods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProtocolsVarargs(value: Protocol*): Self = this.set("protocols", js.Array(value :_*))
    @scala.inline
    def setProtocols(value: js.Array[Protocol]): Self = this.set("protocols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocols: Self = this.set("protocols", js.undefined)
    @scala.inline
    def setSuper(value: Object): Self = this.set("super", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuper: Self = this.set("super", js.undefined)
    @scala.inline
    def setSuperNull: Self = this.set("super", null)
  }
  
}

