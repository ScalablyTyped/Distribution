organization := "org.scalablytyped"
name := "firebase__messaging"
version := "0.12.4-2a3618"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.9.10-0aacb8",
  "org.scalablytyped" %%% "firebase__app-types" % "0.9.0-8ac2f2",
  "org.scalablytyped" %%% "firebase__component" % "0.6.4-b93592",
  "org.scalablytyped" %%% "firebase__logger" % "0.4.0-5ce190",
  "org.scalablytyped" %%% "firebase__util" % "1.9.3-ed4cef",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20230514Z-db3041",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-bc3c2e",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
