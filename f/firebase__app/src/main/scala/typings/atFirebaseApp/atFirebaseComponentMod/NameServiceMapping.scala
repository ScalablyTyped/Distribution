package typings.atFirebaseApp.atFirebaseComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameServiceMapping extends js.Object {
  var `test-shell`: js.Promise[Unit]
  var vs1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VersionService */ js.Any
  var vs2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VersionService */ js.Any
}

object NameServiceMapping {
  @scala.inline
  def apply(
    `test-shell`: js.Promise[Unit],
    vs1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VersionService */ js.Any,
    vs2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VersionService */ js.Any
  ): NameServiceMapping = {
    val __obj = js.Dynamic.literal(vs1 = vs1.asInstanceOf[js.Any], vs2 = vs2.asInstanceOf[js.Any])
    __obj.updateDynamic("test-shell")(`test-shell`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameServiceMapping]
  }
}

