organization := "org.scalablytyped"
name := "firebase__firestore-compat"
version := "0.3.9-be5e98"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.9.10-0aacb8",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.2.0-34a08c",
  "org.scalablytyped" %%% "firebase__app-types" % "0.9.0-8ac2f2",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.2.1-1c5f49",
  "org.scalablytyped" %%% "firebase__component" % "0.6.4-b93592",
  "org.scalablytyped" %%% "firebase__firestore" % "3.12.0-b834eb",
  "org.scalablytyped" %%% "firebase__firestore-types" % "2.5.1-daeacb",
  "org.scalablytyped" %%% "firebase__logger" % "0.4.0-5ce190",
  "org.scalablytyped" %%% "firebase__util" % "1.9.3-ed4cef",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.8.14-57be43",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.7-8bbfd9",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "protobufjs" % "7.2.3-99c136",
  "org.scalablytyped" %%% "rollup" % "3.21.7-e69163",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "typescript" % "5.0.4-f7d5cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
