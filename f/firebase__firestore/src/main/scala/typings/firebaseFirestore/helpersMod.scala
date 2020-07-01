package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/test/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  def withTestCollection(
    fn: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.CollectionReference */ /* collRef */ js.Any, 
      Unit | js.Promise[Unit]
    ]
  ): js.Promise[Unit] = js.native
  def withTestCollectionAndInitialData(
    data: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentData */ _
    ],
    fn: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.CollectionReference */ /* collRef */ js.Any, 
      Unit | js.Promise[Unit]
    ]
  ): js.Promise[Unit] = js.native
  def withTestDb(
    fn: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FirebaseFirestore */ /* db */ js.Any, 
      Unit | js.Promise[Unit]
    ]
  ): js.Promise[Unit] = js.native
  def withTestDbSettings(
    projectId: String,
    settings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.Settings */ js.Any,
    fn: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FirebaseFirestore */ /* db */ js.Any, 
      Unit | js.Promise[Unit]
    ]
  ): js.Promise[Unit] = js.native
  def withTestDoc(
    fn: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference */ /* doc */ js.Any, 
      Unit | js.Promise[Unit]
    ]
  ): js.Promise[Unit] = js.native
  def withTestDocAndInitialData(
    data: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentData */ js.Any,
    fn: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference */ /* doc */ js.Any, 
      Unit | js.Promise[Unit]
    ]
  ): js.Promise[Unit] = js.native
}

